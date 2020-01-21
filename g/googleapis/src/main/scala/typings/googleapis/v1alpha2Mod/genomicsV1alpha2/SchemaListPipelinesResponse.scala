package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of ListPipelines. Contains at most `pageSize` pipelines. If it
  * contains `pageSize` pipelines, and more pipelines exist, then
  * `nextPageToken` will be populated and should be used as the `pageToken`
  * argument to a subsequent ListPipelines request.
  */
@js.native
trait SchemaListPipelinesResponse extends js.Object {
  /**
    * The token to use to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The matched pipelines.
    */
  var pipelines: js.UndefOr[js.Array[SchemaPipeline]] = js.native
}

object SchemaListPipelinesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, pipelines: js.Array[SchemaPipeline] = null): SchemaListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pipelines != null) __obj.updateDynamic("pipelines")(pipelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPipelinesResponse]
  }
}

