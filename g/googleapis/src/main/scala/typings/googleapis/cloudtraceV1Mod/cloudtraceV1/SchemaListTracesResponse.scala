package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for the `ListTraces` method.
  */
@js.native
trait SchemaListTracesResponse extends js.Object {
  /**
    * If defined, indicates that there are more traces that match the request
    * and that this value should be passed to the next request to continue
    * retrieving additional traces.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of trace records as specified by the view parameter.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
}

object SchemaListTracesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, traces: js.Array[SchemaTrace] = null): SchemaListTracesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (traces != null) __obj.updateDynamic("traces")(traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTracesResponse]
  }
}

