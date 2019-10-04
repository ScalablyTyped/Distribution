package typings.hibp.hibpMod

import typings.hibp.Anon_ApiKey
import typings.hibp.Anon_ApiKeyBaseUrl
import typings.hibp.Anon_ApiKeyBaseUrlDomain
import typings.hibp.Anon_BaseUrl
import typings.hibp.Anon_BaseUrlDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIBP extends js.Object {
  @JSName("breach")
  var breach_Original: js.Function2[
    /* breachName */ String, 
    /* options */ js.UndefOr[Anon_BaseUrl], 
    js.Promise[Breach | Null]
  ] = js.native
  @JSName("breachedAccount")
  var breachedAccount_Original: js.Function2[
    /* account */ String, 
    /* options */ js.UndefOr[Anon_ApiKey], 
    js.Promise[js.Array[Breach] | Null]
  ] = js.native
  @JSName("breaches")
  var breaches_Original: js.Function1[/* options */ js.UndefOr[Anon_BaseUrlDomain], js.Promise[js.Array[Breach]]] = js.native
  @JSName("dataClasses")
  var dataClasses_Original: js.Function1[/* options */ js.UndefOr[Anon_BaseUrl], js.Promise[js.Array[String] | Null]] = js.native
  @JSName("pasteAccount")
  var pasteAccount_Original: js.Function2[
    /* email */ String, 
    /* options */ js.UndefOr[Anon_ApiKeyBaseUrl], 
    js.Promise[js.Array[Paste] | Null]
  ] = js.native
  @JSName("pwnedPasswordRange")
  var pwnedPasswordRange_Original: js.Function2[
    /* prefix */ String, 
    /* options */ js.UndefOr[Anon_BaseUrl], 
    js.Promise[js.Array[PwnedPasswordSuffix]]
  ] = js.native
  @JSName("pwnedPassword")
  var pwnedPassword_Original: js.Function2[/* password */ String, /* options */ js.UndefOr[Anon_BaseUrl], js.Promise[Double]] = js.native
  @JSName("search")
  var search_Original: js.Function2[
    /* account */ String, 
    /* breachOptions */ js.UndefOr[Anon_ApiKeyBaseUrlDomain], 
    js.Promise[SearchResults]
  ] = js.native
  def breach(breachName: String): js.Promise[Breach | Null] = js.native
  def breach(breachName: String, options: Anon_BaseUrl): js.Promise[Breach | Null] = js.native
  def breachedAccount(account: String): js.Promise[js.Array[Breach] | Null] = js.native
  def breachedAccount(account: String, options: Anon_ApiKey): js.Promise[js.Array[Breach] | Null] = js.native
  def breaches(): js.Promise[js.Array[Breach]] = js.native
  def breaches(options: Anon_BaseUrlDomain): js.Promise[js.Array[Breach]] = js.native
  def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
  def dataClasses(options: Anon_BaseUrl): js.Promise[js.Array[String] | Null] = js.native
  def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def pasteAccount(email: String, options: Anon_ApiKeyBaseUrl): js.Promise[js.Array[Paste] | Null] = js.native
  def pwnedPassword(password: String): js.Promise[Double] = js.native
  def pwnedPassword(password: String, options: Anon_BaseUrl): js.Promise[Double] = js.native
  def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: String, options: Anon_BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def search(account: String): js.Promise[SearchResults] = js.native
  def search(account: String, breachOptions: Anon_ApiKeyBaseUrlDomain): js.Promise[SearchResults] = js.native
}

