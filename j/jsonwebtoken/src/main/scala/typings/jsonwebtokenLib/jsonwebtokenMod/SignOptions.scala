package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Signature algorithm. Could be one of these values :
    * - HS256:    HMAC using SHA-256 hash algorithm (default)
    * - HS384:    HMAC using SHA-384 hash algorithm
    * - HS512:    HMAC using SHA-512 hash algorithm
    * - RS256:    RSASSA using SHA-256 hash algorithm
    * - RS384:    RSASSA using SHA-384 hash algorithm
    * - RS512:    RSASSA using SHA-512 hash algorithm
    * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
    * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
    * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
    * - none:     No digital signature or MAC value included
    */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var audience: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var expiresIn: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var jwtid: js.UndefOr[java.lang.String] = js.undefined
  var keyid: js.UndefOr[java.lang.String] = js.undefined
  var noTimestamp: js.UndefOr[scala.Boolean] = js.undefined
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var notBefore: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    audience: java.lang.String | js.Array[java.lang.String] = null,
    encoding: java.lang.String = null,
    expiresIn: java.lang.String | scala.Double = null,
    header: js.Object = null,
    issuer: java.lang.String = null,
    jwtid: java.lang.String = null,
    keyid: java.lang.String = null,
    noTimestamp: js.UndefOr[scala.Boolean] = js.undefined,
    notBefore: java.lang.String | scala.Double = null,
    subject: java.lang.String = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (jwtid != null) __obj.updateDynamic("jwtid")(jwtid)
    if (keyid != null) __obj.updateDynamic("keyid")(keyid)
    if (!js.isUndefined(noTimestamp)) __obj.updateDynamic("noTimestamp")(noTimestamp)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[SignOptions]
  }
}

