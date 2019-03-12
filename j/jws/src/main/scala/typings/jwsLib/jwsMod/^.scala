package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSign(options: SignOptions): SignStream = js.native
  def createVerify(): VerifyStream = js.native
  def createVerify(options: VerifyOptions): VerifyStream = js.native
  def decode(signature: java.lang.String): Signature = js.native
  def sign(options: SignOptions): java.lang.String = js.native
  def verify(signature: java.lang.String, algorithm: Algorithm, secretOrKey: java.lang.String): scala.Boolean = js.native
  def verify(signature: java.lang.String, algorithm: Algorithm, secretOrKey: nodeLib.Buffer): scala.Boolean = js.native
}

