package typings.jsonwebtokenDashPromisified.jsonwebtokenDashPromisifiedMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: String): Null | StringDictionary[js.Any] | String = js.native
  def decode(token: String, options: DecodeOptions): Null | StringDictionary[js.Any] | String = js.native
  def sign(payload: String, secretOrPrivateKey: Secret): String = js.native
  def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  def signAsync(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def signAsync(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def signAsync(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  def signAsync(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  def verify(token: String, secretOrPublicKey: String): js.Object | String = js.native
  def verify(token: String, secretOrPublicKey: String, callback: VerifyCallback): Unit = js.native
  def verify(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Object | String = js.native
  def verify(token: String, secretOrPublicKey: String, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  def verify(token: String, secretOrPublicKey: Buffer): js.Object | String = js.native
  def verify(token: String, secretOrPublicKey: Buffer, callback: VerifyCallback): Unit = js.native
  def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Object | String = js.native
  def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  def verifyAsync(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  def verifyAsync(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  def verifyAsync(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
  def verifyAsync(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  @JSName("verify")
  def verify_Unit(token: String, secretOrPublicKey: String): Unit = js.native
  @JSName("verify")
  def verify_Unit(token: String, secretOrPublicKey: String, options: VerifyOptions): Unit = js.native
  @JSName("verify")
  def verify_Unit(token: String, secretOrPublicKey: Buffer): Unit = js.native
  @JSName("verify")
  def verify_Unit(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): Unit = js.native
}

