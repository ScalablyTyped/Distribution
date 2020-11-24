package typings.hibp.mod

import typings.hibp.anon.ApiKey
import typings.hibp.anon.BaseUrl
import typings.hibp.anon.Domain
import typings.hibp.anon.Truncate
import typings.hibp.anon.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HIBP extends js.Object {
  
  def breach(breachName: String): js.Promise[Breach_ | Null] = js.native
  def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = js.native
  @JSName("breach")
  var breach_Original: js.Function2[
    /* breachName */ String, 
    /* options */ js.UndefOr[BaseUrl], 
    js.Promise[Breach_ | Null]
  ] = js.native
  
  def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = js.native
  def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = js.native
  @JSName("breachedAccount")
  var breachedAccount_Original: js.Function2[
    /* account */ String, 
    /* options */ js.UndefOr[ApiKey], 
    js.Promise[js.Array[Breach_] | Null]
  ] = js.native
  
  def breaches(): js.Promise[js.Array[Breach_]] = js.native
  def breaches(options: Domain): js.Promise[js.Array[Breach_]] = js.native
  @JSName("breaches")
  var breaches_Original: js.Function1[/* options */ js.UndefOr[Domain], js.Promise[js.Array[Breach_]]] = js.native
  
  def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
  def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null] = js.native
  @JSName("dataClasses")
  var dataClasses_Original: js.Function1[/* options */ js.UndefOr[BaseUrl], js.Promise[js.Array[String] | Null]] = js.native
  
  def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = js.native
  @JSName("pasteAccount")
  var pasteAccount_Original: js.Function2[
    /* email */ String, 
    /* options */ js.UndefOr[UserAgent], 
    js.Promise[js.Array[Paste] | Null]
  ] = js.native
  
  def pwnedPassword(password: String): js.Promise[Double] = js.native
  def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double] = js.native
  
  def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  @JSName("pwnedPasswordRange")
  var pwnedPasswordRange_Original: js.Function2[
    /* prefix */ String, 
    /* options */ js.UndefOr[BaseUrl], 
    js.Promise[js.Array[PwnedPasswordSuffix]]
  ] = js.native
  
  @JSName("pwnedPassword")
  var pwnedPassword_Original: js.Function2[/* password */ String, /* options */ js.UndefOr[BaseUrl], js.Promise[Double]] = js.native
  
  def search(account: String): js.Promise[SearchResults] = js.native
  def search(account: String, breachOptions: Truncate): js.Promise[SearchResults] = js.native
  @JSName("search")
  var search_Original: js.Function2[
    /* account */ String, 
    /* breachOptions */ js.UndefOr[Truncate], 
    js.Promise[SearchResults]
  ] = js.native
}
