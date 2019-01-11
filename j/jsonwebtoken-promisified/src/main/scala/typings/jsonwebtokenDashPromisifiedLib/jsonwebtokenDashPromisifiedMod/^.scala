package typings
package jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: java.lang.String): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def decode(
    token: java.lang.String,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.DecodeOptions
  ): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): java.lang.String = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): java.lang.String = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignCallback
  ): scala.Unit = js.native
  def signAsync(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): js.Promise[java.lang.String] = js.native
  def signAsync(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def signAsync(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): js.Promise[java.lang.String] = js.native
  def signAsync(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def signAsync(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret
  ): js.Promise[java.lang.String] = js.native
  def signAsync(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.Secret,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions,
    callback: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyCallback
  ): scala.Unit = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: java.lang.String): js.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): js.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): js.Promise[js.Object | java.lang.String] = js.native
  def verifyAsync(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): js.Promise[js.Object | java.lang.String] = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: java.lang.String): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod.VerifyOptions
  ): scala.Unit = js.native
}

