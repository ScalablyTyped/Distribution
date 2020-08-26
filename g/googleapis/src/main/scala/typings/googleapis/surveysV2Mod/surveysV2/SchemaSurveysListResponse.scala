package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSurveysListResponse extends js.Object {
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * An individual survey resource.
    */
  var resources: js.UndefOr[js.Array[SchemaSurvey]] = js.native
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}

object SchemaSurveysListResponse {
  @scala.inline
  def apply(): SchemaSurveysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysListResponse]
  }
  @scala.inline
  implicit class SchemaSurveysListResponseOps[Self <: SchemaSurveysListResponse] (val x: Self) extends AnyVal {
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
    def setPageInfo(value: SchemaPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: SchemaSurvey*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[SchemaSurvey]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
  
}

