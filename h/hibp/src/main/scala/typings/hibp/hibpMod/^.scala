package typings.hibp.hibpMod

import typings.hibp.Anon_BaseUrl
import typings.hibp.Anon_BaseUrlDomain
import typings.hibp.Anon_BaseUrlDomainTruncate
import typings.hibp.Anon_BaseUrlDomainUserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def breach(breachName: String): js.Promise[Breach | Null] = js.native
  def breach(breachName: String, options: Anon_BaseUrl): js.Promise[Breach | Null] = js.native
  def breachedAccount(account: String): js.Promise[js.Array[Breach] | Null] = js.native
  def breachedAccount(account: String, options: Anon_BaseUrlDomain): js.Promise[js.Array[Breach] | Null] = js.native
  def breaches(): js.Promise[js.Array[Breach]] = js.native
  def breaches(options: Anon_BaseUrlDomainUserAgent): js.Promise[js.Array[Breach]] = js.native
  def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
  def dataClasses(options: Anon_BaseUrl): js.Promise[js.Array[String] | Null] = js.native
  def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def pasteAccount(email: String, options: Anon_BaseUrl): js.Promise[js.Array[Paste] | Null] = js.native
  def pwnedPassword(password: String): js.Promise[Double] = js.native
  def pwnedPassword(password: String, options: Anon_BaseUrl): js.Promise[Double] = js.native
  def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: String, options: Anon_BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def search(account: String): js.Promise[SearchResults] = js.native
  def search(account: String, breachOptions: Anon_BaseUrlDomainTruncate): js.Promise[SearchResults] = js.native
}

