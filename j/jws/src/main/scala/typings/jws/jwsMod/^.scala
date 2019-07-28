package typings.jws.jwsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSign(options: SignOptions): SignStream = js.native
  def createVerify(): VerifyStream = js.native
  def createVerify(options: VerifyOptions): VerifyStream = js.native
  def decode(signature: String): Signature = js.native
  def sign(options: SignOptions): String = js.native
  def verify(signature: String, algorithm: Algorithm, secretOrKey: String): Boolean = js.native
  def verify(signature: String, algorithm: Algorithm, secretOrKey: Buffer): Boolean = js.native
}

