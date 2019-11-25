package typings.jsonwebtoken.jsonwebtokenMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var audience: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  var clockTimestamp: js.UndefOr[Double] = js.undefined
  var clockTolerance: js.UndefOr[Double] = js.undefined
  var complete: js.UndefOr[Boolean] = js.undefined
  var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
  var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
  var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
  var jwtid: js.UndefOr[String] = js.undefined
  /**
    * @deprecated
    * Max age of token
    */
  var maxAge: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    audience: String | RegExp | (js.Array[String | RegExp]) = null,
    clockTimestamp: Int | Double = null,
    clockTolerance: Int | Double = null,
    complete: js.UndefOr[Boolean] = js.undefined,
    ignoreExpiration: js.UndefOr[Boolean] = js.undefined,
    ignoreNotBefore: js.UndefOr[Boolean] = js.undefined,
    issuer: String | js.Array[String] = null,
    jwtid: String = null,
    maxAge: String = null,
    nonce: String = null,
    subject: String = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clockTimestamp != null) __obj.updateDynamic("clockTimestamp")(clockTimestamp.asInstanceOf[js.Any])
    if (clockTolerance != null) __obj.updateDynamic("clockTolerance")(clockTolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExpiration)) __obj.updateDynamic("ignoreExpiration")(ignoreExpiration.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNotBefore)) __obj.updateDynamic("ignoreNotBefore")(ignoreNotBefore.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwtid != null) __obj.updateDynamic("jwtid")(jwtid.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

