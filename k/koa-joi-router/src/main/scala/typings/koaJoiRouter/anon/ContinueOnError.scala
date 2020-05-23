package typings.koaJoiRouter.anon

import org.scalablytyped.runtime.StringDictionary
import typings.coBody.mod.Options
import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.koaJoiRouterStrings.form
import typings.koaJoiRouter.koaJoiRouterStrings.json
import typings.koaJoiRouter.koaJoiRouterStrings.multipart
import typings.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueOnError extends js.Object {
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

object ContinueOnError {
  @scala.inline
  def apply(
    body: js.UndefOr[Null | SchemaLike] = js.undefined,
    continueOnError: js.UndefOr[Boolean] = js.undefined,
    failure: js.UndefOr[Double] = js.undefined,
    formOptions: Options = null,
    header: js.UndefOr[Null | SchemaLike] = js.undefined,
    jsonOptions: Options = null,
    maxBody: js.UndefOr[Double] = js.undefined,
    multipartOptions: Options = null,
    output: StringDictionary[OutputValidation] = null,
    params: js.UndefOr[Null | SchemaLike] = js.undefined,
    query: js.UndefOr[Null | SchemaLike] = js.undefined,
    `type`: form | json | multipart = null
  ): ContinueOnError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnError)) __obj.updateDynamic("continueOnError")(continueOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failure)) __obj.updateDynamic("failure")(failure.get.asInstanceOf[js.Any])
    if (formOptions != null) __obj.updateDynamic("formOptions")(formOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jsonOptions != null) __obj.updateDynamic("jsonOptions")(jsonOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBody)) __obj.updateDynamic("maxBody")(maxBody.get.asInstanceOf[js.Any])
    if (multipartOptions != null) __obj.updateDynamic("multipartOptions")(multipartOptions.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueOnError]
  }
}

