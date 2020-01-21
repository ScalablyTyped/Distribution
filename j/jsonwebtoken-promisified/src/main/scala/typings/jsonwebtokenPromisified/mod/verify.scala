package typings.jsonwebtokenPromisified.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "verify")
@js.native
object verify extends js.Object {
  def apply(token: String, secretOrPublicKey: String): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: String, callback: VerifyCallback): Unit = js.native
  def apply(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: String, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  def apply(token: String, secretOrPublicKey: Buffer): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: Buffer, callback: VerifyCallback): Unit = js.native
  def apply(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: Buffer, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
}

