package typings
package jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", JSImport.Namespace)
@js.native
object jsonwebtokenDashPromisifiedModMembers extends js.Object {
  def decode(token: java.lang.String): scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def decode(token: java.lang.String, options: DecodeOptions): scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def sign(payload: java.lang.String, secretOrPrivateKey: Secret): java.lang.String = js.native
  def sign(payload: java.lang.String, secretOrPrivateKey: Secret, callback: SignCallback): scala.Unit = js.native
  def sign(payload: java.lang.String, secretOrPrivateKey: Secret, options: SignOptions): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: Secret,
    options: SignOptions,
    callback: SignCallback
  ): scala.Unit = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): java.lang.String = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): scala.Unit = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): java.lang.String = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): scala.Unit = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret): java.lang.String = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret, callback: SignCallback): scala.Unit = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret, options: SignOptions): java.lang.String = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): scala.Unit = js.native
  def signAsync(payload: java.lang.String, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def signAsync(payload: java.lang.String, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def signAsync(payload: nodeLib.Buffer, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def signAsync(payload: nodeLib.Buffer, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String): js.Object | java.lang.String = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String, callback: VerifyCallback): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String, options: VerifyOptions): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: VerifyOptions,
    callback: VerifyCallback
  ): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): js.Object | java.lang.String = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer, callback: VerifyCallback): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer, options: VerifyOptions): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: VerifyOptions,
    callback: VerifyCallback
  ): scala.Unit = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: java.lang.String): stdLib.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: java.lang.String, options: VerifyOptions): stdLib.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): stdLib.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer, options: VerifyOptions): stdLib.Promise[js.Object | java.lang.String] = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: java.lang.String): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: java.lang.String, options: VerifyOptions): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer, options: VerifyOptions): scala.Unit = js.native
}

