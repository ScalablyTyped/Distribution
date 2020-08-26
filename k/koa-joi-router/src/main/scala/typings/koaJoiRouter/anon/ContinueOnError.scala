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

@js.native
trait ContinueOnError extends js.Object {
  var body: js.UndefOr[SchemaLike] = js.native
  var continueOnError: js.UndefOr[Boolean] = js.native
  var failure: js.UndefOr[Double] = js.native
  var formOptions: js.UndefOr[Options] = js.native
  var header: js.UndefOr[SchemaLike] = js.native
  var jsonOptions: js.UndefOr[Options] = js.native
  var maxBody: js.UndefOr[Double] = js.native
  var multipartOptions: js.UndefOr[Options] = js.native
  var output: js.UndefOr[StringDictionary[OutputValidation]] = js.native
  var params: js.UndefOr[SchemaLike] = js.native
  var query: js.UndefOr[SchemaLike] = js.native
  var `type`: js.UndefOr[form | json | multipart] = js.native
}

object ContinueOnError {
  @scala.inline
  def apply(): ContinueOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueOnError]
  }
  @scala.inline
  implicit class ContinueOnErrorOps[Self <: ContinueOnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: SchemaLike): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueOnError: Self = this.set("continueOnError", js.undefined)
    @scala.inline
    def setFailure(value: Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    @scala.inline
    def setFormOptions(value: Options): Self = this.set("formOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormOptions: Self = this.set("formOptions", js.undefined)
    @scala.inline
    def setHeader(value: SchemaLike): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setJsonOptions(value: Options): Self = this.set("jsonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonOptions: Self = this.set("jsonOptions", js.undefined)
    @scala.inline
    def setMaxBody(value: Double): Self = this.set("maxBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBody: Self = this.set("maxBody", js.undefined)
    @scala.inline
    def setMultipartOptions(value: Options): Self = this.set("multipartOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipartOptions: Self = this.set("multipartOptions", js.undefined)
    @scala.inline
    def setOutput(value: StringDictionary[OutputValidation]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setParams(value: SchemaLike): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
    @scala.inline
    def setQuery(value: SchemaLike): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setType(value: form | json | multipart): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

