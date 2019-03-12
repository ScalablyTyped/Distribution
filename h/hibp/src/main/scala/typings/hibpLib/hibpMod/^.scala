package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def breach(breachName: java.lang.String): js.Promise[Breach | scala.Null] = js.native
  def breach(breachName: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[Breach | scala.Null] = js.native
  def breachedAccount(account: java.lang.String): js.Promise[js.Array[Breach] | scala.Null] = js.native
  def breachedAccount(account: java.lang.String, options: hibpLib.Anon_BaseUrlDomain): js.Promise[js.Array[Breach] | scala.Null] = js.native
  def breaches(): js.Promise[js.Array[Breach]] = js.native
  def breaches(options: hibpLib.Anon_BaseUrlDomainUserAgent): js.Promise[js.Array[Breach]] = js.native
  def dataClasses(): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def dataClasses(options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def pasteAccount(email: java.lang.String): js.Promise[js.Array[Paste] | scala.Null] = js.native
  def pasteAccount(email: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[Paste] | scala.Null] = js.native
  def pwnedPassword(password: java.lang.String): js.Promise[scala.Double] = js.native
  def pwnedPassword(password: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[scala.Double] = js.native
  def pwnedPasswordRange(prefix: java.lang.String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def search(account: java.lang.String): js.Promise[SearchResults] = js.native
  def search(account: java.lang.String, breachOptions: hibpLib.Anon_BaseUrlDomainTruncate): js.Promise[SearchResults] = js.native
}

