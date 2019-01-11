package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSign(options: jwsLib.jwsMod.SignOptions): jwsLib.jwsMod.SignStream = js.native
  def createVerify(): jwsLib.jwsMod.VerifyStream = js.native
  def createVerify(options: jwsLib.jwsMod.VerifyOptions): jwsLib.jwsMod.VerifyStream = js.native
  def decode(signature: java.lang.String): jwsLib.jwsMod.Signature = js.native
  def sign(options: jwsLib.jwsMod.SignOptions): java.lang.String = js.native
  def verify(signature: java.lang.String, algorithm: jwsLib.jwsMod.Algorithm, secretOrKey: java.lang.String): scala.Boolean = js.native
  def verify(signature: java.lang.String, algorithm: jwsLib.jwsMod.Algorithm, secretOrKey: nodeLib.Buffer): scala.Boolean = js.native
}

