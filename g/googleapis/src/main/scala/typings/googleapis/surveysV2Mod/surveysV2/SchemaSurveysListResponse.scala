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
  def apply(
    pageInfo: SchemaPageInfo = null,
    requestId: String = null,
    resources: js.Array[SchemaSurvey] = null,
    tokenPagination: SchemaTokenPagination = null
  ): SchemaSurveysListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSurveysListResponse]
  }
}

