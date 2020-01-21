package typings.hibp.mod

import typings.hibp.AnonApiKey
import typings.hibp.AnonApiKeyBaseUrl
import typings.hibp.AnonApiKeyBaseUrlDomain
import typings.hibp.AnonBaseUrl
import typings.hibp.AnonBaseUrlDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIBP extends js.Object {
  @JSName("breach")
  var breach_Original: js.Function2[
    /* breachName */ String, 
    /* options */ js.UndefOr[AnonBaseUrl], 
    js.Promise[Breach_ | Null]
  ] = js.native
  @JSName("breachedAccount")
  var breachedAccount_Original: js.Function2[
    /* account */ String, 
    /* options */ js.UndefOr[AnonApiKey], 
    js.Promise[js.Array[Breach_] | Null]
  ] = js.native
  @JSName("breaches")
  var breaches_Original: js.Function1[/* options */ js.UndefOr[AnonBaseUrlDomain], js.Promise[js.Array[Breach_]]] = js.native
  @JSName("dataClasses")
  var dataClasses_Original: js.Function1[/* options */ js.UndefOr[AnonBaseUrl], js.Promise[js.Array[String] | Null]] = js.native
  @JSName("pasteAccount")
  var pasteAccount_Original: js.Function2[
    /* email */ String, 
    /* options */ js.UndefOr[AnonApiKeyBaseUrl], 
    js.Promise[js.Array[Paste] | Null]
  ] = js.native
  @JSName("pwnedPasswordRange")
  var pwnedPasswordRange_Original: js.Function2[
    /* prefix */ String, 
    /* options */ js.UndefOr[AnonBaseUrl], 
    js.Promise[js.Array[PwnedPasswordSuffix]]
  ] = js.native
  @JSName("pwnedPassword")
  var pwnedPassword_Original: js.Function2[/* password */ String, /* options */ js.UndefOr[AnonBaseUrl], js.Promise[Double]] = js.native
  @JSName("search")
  var search_Original: js.Function2[
    /* account */ String, 
    /* breachOptions */ js.UndefOr[AnonApiKeyBaseUrlDomain], 
    js.Promise[SearchResults]
  ] = js.native
  def breach(breachName: String): js.Promise[Breach_ | Null] = js.native
  def breach(breachName: String, options: AnonBaseUrl): js.Promise[Breach_ | Null] = js.native
  def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = js.native
  def breachedAccount(account: String, options: AnonApiKey): js.Promise[js.Array[Breach_] | Null] = js.native
  def breaches(): js.Promise[js.Array[Breach_]] = js.native
  def breaches(options: AnonBaseUrlDomain): js.Promise[js.Array[Breach_]] = js.native
  def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
  def dataClasses(options: AnonBaseUrl): js.Promise[js.Array[String] | Null] = js.native
  def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def pasteAccount(email: String, options: AnonApiKeyBaseUrl): js.Promise[js.Array[Paste] | Null] = js.native
  def pwnedPassword(password: String): js.Promise[Double] = js.native
  def pwnedPassword(password: String, options: AnonBaseUrl): js.Promise[Double] = js.native
  def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: String, options: AnonBaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def search(account: String): js.Promise[SearchResults] = js.native
  def search(account: String, breachOptions: AnonApiKeyBaseUrlDomain): js.Promise[SearchResults] = js.native
}

