package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListMonitoredResourceDescriptors.
  */
@js.native
trait SchemaListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of resource descriptors.
    */
  var resourceDescriptors: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.native
}

object SchemaListMonitoredResourceDescriptorsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    resourceDescriptors: js.Array[SchemaMonitoredResourceDescriptor] = null
  ): SchemaListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resourceDescriptors != null) __obj.updateDynamic("resourceDescriptors")(resourceDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListMonitoredResourceDescriptorsResponse]
  }
}

