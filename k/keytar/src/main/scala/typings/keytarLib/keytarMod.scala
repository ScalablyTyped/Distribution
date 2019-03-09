package typings
package keytarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keytar", JSImport.Namespace)
@js.native
object keytarMod extends js.Object {
  def deletePassword(service: java.lang.String, account: java.lang.String): js.Promise[scala.Boolean] = js.native
  def findCredentials(service: java.lang.String): js.Promise[js.Array[keytarLib.Anon_Account]] = js.native
  def findPassword(service: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def getPassword(service: java.lang.String, account: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def setPassword(service: java.lang.String, account: java.lang.String, password: java.lang.String): js.Promise[scala.Unit] = js.native
}

