package typings.jwtDashThen.jwtDashThenMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-then", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sign(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def verify(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  def verify(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
}

