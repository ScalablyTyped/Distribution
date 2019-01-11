package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: java.lang.String): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def decode(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.DecodeOptions): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def sign(payload: java.lang.String, secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(payload: js.Object, secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret): java.lang.String = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret): java.lang.String = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): java.lang.String = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: jsonwebtokenLib.jsonwebtokenMod.GetPublicKeyOrSecret): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: jsonwebtokenLib.jsonwebtokenMod.GetPublicKeyOrSecret,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: jsonwebtokenLib.jsonwebtokenMod.GetPublicKeyOrSecret,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: jsonwebtokenLib.jsonwebtokenMod.GetPublicKeyOrSecret,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: java.lang.String): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(
    token: java.lang.String,
    secretOrPublicKey: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(
    token: java.lang.String,
    secretOrPublicKey: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): scala.Unit = js.native
}

