package typings.koaDashJoiDashRouter

import org.scalablytyped.runtime.StringDictionary
import typings.coDashBody.coDashBodyMod.Options
import typings.joi.joiMod.SchemaLike
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod.OutputValidation
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterStrings.form
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterStrings.json
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterStrings.multipart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyContinueOnError extends js.Object {
  var body: js.UndefOr[SchemaLike] = js.undefined
  var continueOnError: js.UndefOr[Boolean] = js.undefined
  var failure: js.UndefOr[Double] = js.undefined
  var formOptions: js.UndefOr[Options] = js.undefined
  var header: js.UndefOr[SchemaLike] = js.undefined
  var jsonOptions: js.UndefOr[Options] = js.undefined
  var maxBody: js.UndefOr[Double] = js.undefined
  var multipartOptions: js.UndefOr[Options] = js.undefined
  var output: js.UndefOr[StringDictionary[OutputValidation]] = js.undefined
  var params: js.UndefOr[SchemaLike] = js.undefined
  var query: js.UndefOr[SchemaLike] = js.undefined
  var `type`: js.UndefOr[form | json | multipart] = js.undefined
}

object Anon_BodyContinueOnError {
  @scala.inline
  def apply(
    body: SchemaLike = null,
    continueOnError: js.UndefOr[Boolean] = js.undefined,
    failure: Int | Double = null,
    formOptions: Options = null,
    header: SchemaLike = null,
    jsonOptions: Options = null,
    maxBody: Int | Double = null,
    multipartOptions: Options = null,
    output: StringDictionary[OutputValidation] = null,
    params: SchemaLike = null,
    query: SchemaLike = null,
    `type`: form | json | multipart = null
  ): Anon_BodyContinueOnError = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnError)) __obj.updateDynamic("continueOnError")(continueOnError.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (formOptions != null) __obj.updateDynamic("formOptions")(formOptions.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jsonOptions != null) __obj.updateDynamic("jsonOptions")(jsonOptions.asInstanceOf[js.Any])
    if (maxBody != null) __obj.updateDynamic("maxBody")(maxBody.asInstanceOf[js.Any])
    if (multipartOptions != null) __obj.updateDynamic("multipartOptions")(multipartOptions.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyContinueOnError]
  }
}

