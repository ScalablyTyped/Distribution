package typings.iron.ironMod

import typings.iron.Anon_Data
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val algorithms: Algorithms = js.native
  val defaults: SealOptions = js.native
  val macFormatVersion: String = js.native
  val macPrefix: String = js.native
  def decrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Buffer] = js.native
  def encrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Anon_Data] = js.native
  def generateKey(password: String, options: GenerateKeyOptions): js.Promise[Key] = js.native
  def hmacWithPassword(password: String, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = js.native
  def seal(obj: js.Object, password: String, options: SealOptions): js.Promise[String] = js.native
  def unseal(data: String, password: String, options: SealOptions): js.Promise[js.Object] = js.native
}

