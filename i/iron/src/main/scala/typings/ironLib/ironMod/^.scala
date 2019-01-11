package typings
package ironLib.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val algorithms: ironLib.ironMod.Algorithms = js.native
  val defaults: ironLib.ironMod.SealOptions = js.native
  val macFormatVersion: java.lang.String = js.native
  val macPrefix: java.lang.String = js.native
  def decrypt(password: java.lang.String, options: ironLib.ironMod.GenerateKeyOptions, data: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def encrypt(password: java.lang.String, options: ironLib.ironMod.GenerateKeyOptions, data: java.lang.String): js.Promise[ironLib.Anon_Data] = js.native
  def generateKey(password: java.lang.String, options: ironLib.ironMod.GenerateKeyOptions): js.Promise[ironLib.ironMod.Key] = js.native
  def hmacWithPassword(password: java.lang.String, options: ironLib.ironMod.GenerateKeyOptions, data: java.lang.String): js.Promise[ironLib.ironMod.HMacResult] = js.native
  def seal(obj: js.Object, password: java.lang.String, options: ironLib.ironMod.SealOptions): js.Promise[java.lang.String] = js.native
  def unseal(data: java.lang.String, password: java.lang.String, options: ironLib.ironMod.SealOptions): js.Promise[js.Object] = js.native
}

