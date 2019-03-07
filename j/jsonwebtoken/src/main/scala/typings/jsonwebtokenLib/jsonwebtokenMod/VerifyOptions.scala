package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var audience: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var clockTimestamp: js.UndefOr[scala.Double] = js.undefined
  var clockTolerance: js.UndefOr[scala.Double] = js.undefined
  var ignoreExpiration: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreNotBefore: js.UndefOr[scala.Boolean] = js.undefined
  var issuer: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var jwtid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    * Max age of token
    */
  var maxAge: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    algorithms: js.Array[java.lang.String] = null,
    audience: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    clockTimestamp: scala.Int | scala.Double = null,
    clockTolerance: scala.Int | scala.Double = null,
    ignoreExpiration: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreNotBefore: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String | js.Array[java.lang.String] = null,
    jwtid: java.lang.String = null,
    maxAge: java.lang.String = null,
    subject: java.lang.String = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clockTimestamp != null) __obj.updateDynamic("clockTimestamp")(clockTimestamp.asInstanceOf[js.Any])
    if (clockTolerance != null) __obj.updateDynamic("clockTolerance")(clockTolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExpiration)) __obj.updateDynamic("ignoreExpiration")(ignoreExpiration)
    if (!js.isUndefined(ignoreNotBefore)) __obj.updateDynamic("ignoreNotBefore")(ignoreNotBefore)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwtid != null) __obj.updateDynamic("jwtid")(jwtid)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[VerifyOptions]
  }
}

