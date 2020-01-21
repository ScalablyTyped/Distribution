package typings.jwtThen.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-then", "sign")
@js.native
object sign extends js.Object {
  def apply(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def apply(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
}

