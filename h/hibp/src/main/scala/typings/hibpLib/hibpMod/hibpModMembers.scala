package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", JSImport.Namespace)
@js.native
object hibpModMembers extends js.Object {
  def breach(breachName: java.lang.String): stdLib.Promise[Breach] = js.native
  def breachedAccount(account: java.lang.String): stdLib.Promise[js.Array[Breach]] = js.native
  def breachedAccount(account: java.lang.String, options: BreachOptions): stdLib.Promise[js.Array[Breach]] = js.native
  def breaches(): stdLib.Promise[js.Array[Breach]] = js.native
  def breaches(options: hibpLib.Anon_Domain): stdLib.Promise[js.Array[Breach]] = js.native
  def dataClasses(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def pasteAccount(email: java.lang.String): stdLib.Promise[js.Array[Paste]] = js.native
  def pwnedPassword(password: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def pwnedPasswordRange(prefix: java.lang.String): stdLib.Promise[js.Array[Range]] = js.native
  def search(account: java.lang.String): stdLib.Promise[hibpLib.Anon_Breaches] = js.native
  def search(account: java.lang.String, options: BreachOptions): stdLib.Promise[hibpLib.Anon_Breaches] = js.native
}

