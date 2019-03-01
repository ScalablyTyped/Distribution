package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyContinueOnError extends js.Object {
  var body: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
  var continueOnError: js.UndefOr[scala.Boolean] = js.undefined
  var failure: js.UndefOr[scala.Double] = js.undefined
  var formOptions: js.UndefOr[coDashBodyLib.coDashBodyMod.CoBodyNs.Options] = js.undefined
  var header: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
  var jsonOptions: js.UndefOr[coDashBodyLib.coDashBodyMod.CoBodyNs.Options] = js.undefined
  var maxBody: js.UndefOr[scala.Double] = js.undefined
  var multipartOptions: js.UndefOr[coDashBodyLib.coDashBodyMod.CoBodyNs.Options] = js.undefined
  var output: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs.OutputValidation]
  ] = js.undefined
  var params: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
  var query: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
  var `type`: js.UndefOr[
    koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.form | koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.json | koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.multipart
  ] = js.undefined
}

object Anon_BodyContinueOnError {
  @scala.inline
  def apply(
    body: joiLib.joiMod.SchemaLike = null,
    continueOnError: js.UndefOr[scala.Boolean] = js.undefined,
    failure: scala.Int | scala.Double = null,
    formOptions: coDashBodyLib.coDashBodyMod.CoBodyNs.Options = null,
    header: joiLib.joiMod.SchemaLike = null,
    jsonOptions: coDashBodyLib.coDashBodyMod.CoBodyNs.Options = null,
    maxBody: scala.Int | scala.Double = null,
    multipartOptions: coDashBodyLib.coDashBodyMod.CoBodyNs.Options = null,
    output: org.scalablytyped.runtime.StringDictionary[koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs.OutputValidation] = null,
    params: joiLib.joiMod.SchemaLike = null,
    query: joiLib.joiMod.SchemaLike = null,
    `type`: koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.form | koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.json | koaDashJoiDashRouterLib.koaDashJoiDashRouterLibStrings.multipart = null
  ): Anon_BodyContinueOnError = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnError)) __obj.updateDynamic("continueOnError")(continueOnError)
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (formOptions != null) __obj.updateDynamic("formOptions")(formOptions)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jsonOptions != null) __obj.updateDynamic("jsonOptions")(jsonOptions)
    if (maxBody != null) __obj.updateDynamic("maxBody")(maxBody.asInstanceOf[js.Any])
    if (multipartOptions != null) __obj.updateDynamic("multipartOptions")(multipartOptions)
    if (output != null) __obj.updateDynamic("output")(output)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyContinueOnError]
  }
}

