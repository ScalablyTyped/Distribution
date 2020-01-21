package typings.jose.mod.JWT

import typings.jose.mod.JWTProfiles
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  var clockTolerance: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[komplet] = js.undefined
  var crit: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreExp: js.UndefOr[Boolean] = js.undefined
  var ignoreIat: js.UndefOr[Boolean] = js.undefined
  var ignoreNbf: js.UndefOr[Boolean] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var jti: js.UndefOr[String] = js.undefined
  var maxAuthAge: js.UndefOr[String] = js.undefined
  var maxTokenAge: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[Date] = js.undefined
  var profile: js.UndefOr[JWTProfiles] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply[komplet](
    algorithms: js.Array[String] = null,
    audience: String | js.Array[String] = null,
    clockTolerance: String = null,
    complete: komplet = null,
    crit: js.Array[String] = null,
    ignoreExp: js.UndefOr[Boolean] = js.undefined,
    ignoreIat: js.UndefOr[Boolean] = js.undefined,
    ignoreNbf: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    jti: String = null,
    maxAuthAge: String = null,
    maxTokenAge: String = null,
    nonce: String = null,
    now: Date = null,
    profile: JWTProfiles = null,
    subject: String = null
  ): VerifyOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clockTolerance != null) __obj.updateDynamic("clockTolerance")(clockTolerance.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (crit != null) __obj.updateDynamic("crit")(crit.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExp)) __obj.updateDynamic("ignoreExp")(ignoreExp.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIat)) __obj.updateDynamic("ignoreIat")(ignoreIat.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNbf)) __obj.updateDynamic("ignoreNbf")(ignoreNbf.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jti != null) __obj.updateDynamic("jti")(jti.asInstanceOf[js.Any])
    if (maxAuthAge != null) __obj.updateDynamic("maxAuthAge")(maxAuthAge.asInstanceOf[js.Any])
    if (maxTokenAge != null) __obj.updateDynamic("maxTokenAge")(maxTokenAge.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions[komplet]]
  }
}

