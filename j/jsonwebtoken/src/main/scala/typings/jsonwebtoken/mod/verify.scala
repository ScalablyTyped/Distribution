package typings.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", "verify")
@js.native
object verify extends js.Object {
  def apply(token: String, secretOrPublicKey: GetPublicKeyOrSecret): Unit = js.native
  def apply(token: String, secretOrPublicKey: GetPublicKeyOrSecret, callback: VerifyCallback): Unit = js.native
  def apply(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): Unit = js.native
  def apply(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: VerifyOptions,
    callback: VerifyCallback
  ): Unit = js.native
  def apply(token: String, secretOrPublicKey: Secret): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: Secret, callback: VerifyCallback): Unit = js.native
  def apply(token: String, secretOrPublicKey: Secret, options: VerifyOptions): js.Object | String = js.native
  def apply(token: String, secretOrPublicKey: Secret, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
}

