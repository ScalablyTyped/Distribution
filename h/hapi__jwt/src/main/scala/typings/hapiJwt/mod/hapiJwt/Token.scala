package typings.hapiJwt.mod.hapiJwt

import typings.hapiJwt.anon.Generate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends StObject {
  
  /**
    * Returns an object of a decoded token in the format of artifacts. This does not verify the token, it only decodes it.
    *
    * @param token string of encoded token.
    * @param options optional configuration object.
    */
  def decode(token: String): Artifacts | scala.Nothing = js.native
  def decode(token: String, options: DecodeOptions): Artifacts | scala.Nothing = js.native
  
  /**
    * Generates a token as a string.
    *
    * @param payload object of decoded token in artifacts format.
    * @param secret object, string or buffer that creates signature.
    * @param options optional configuration object.
    */
  def generate(payload: Payload, secret: Secret): String = js.native
  def generate(payload: Payload, secret: Secret, options: GenerateOptions): String = js.native
  
  var signature: Generate = js.native
  
  /**
    * A function that will complete if verification passes or throw an error if verification fails.
    *
    * @param artifacts object of decoded token in artifacts format.
    * @param secret object, string or buffer that creates signature.
    * @param options optional configuration object.
    */
  def verify(artifacts: Artifacts, secret: Secret): Unit | scala.Nothing = js.native
  def verify(artifacts: Artifacts, secret: Secret, options: VerifyTokenOptions): Unit | scala.Nothing = js.native
  
  /**
    * A function that will complete if payload verification passes or throw an error if payload verification fails. This does not do verification on the signature.
    *
    * @param artifacts object of decoded token in artifacts format..
    * @param options optional configuration object.
    */
  def verifyPayload(artifacts: Artifacts): Unit | scala.Nothing = js.native
  def verifyPayload(artifacts: Artifacts, options: VerifyTokenOptions): Unit | scala.Nothing = js.native
  
  /**
    * A function that will complete if the signature is valid or throw an error if invalid. This does not do verification on the payload.
    * An expired token will not throw an error if the signature is valid.
    *
    * @param artifacts object of decoded token in artifacts format.
    * @param raw object of decoded token in raw format.
    * @param secret object, string or buffer that creates signature.
    */
  def verifySignature(artifacts: Artifacts, secret: Secret): Unit | scala.Nothing = js.native
  
  /**
    * A function that will complete if iat and exp verification pass and throw an error if verification fails. This is a subset of verifyPayload for only iat and exp.
    *
    * @param artifacts object of decoded token in artifacts format.
    * @param options optional configuration object.
    * @param nowSec integer that represents the current time in JavaScript epoch format (with msecs). When evaluated the msecs are truncated, not rounded.
    */
  def verifyTime(artifacts: Artifacts): Unit | scala.Nothing = js.native
  def verifyTime(artifacts: Artifacts, options: Unit, nowSec: Double): Unit | scala.Nothing = js.native
  def verifyTime(artifacts: Artifacts, options: TimeOptions): Unit | scala.Nothing = js.native
  def verifyTime(artifacts: Artifacts, options: TimeOptions, nowSec: Double): Unit | scala.Nothing = js.native
}
