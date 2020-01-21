package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListAcceleratorTypes.
  */
@js.native
trait SchemaListAcceleratorTypesResponse extends js.Object {
  /**
    * The listed nodes.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.native
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAcceleratorTypesResponse {
  @scala.inline
  def apply(acceleratorTypes: js.Array[SchemaAcceleratorType] = null, nextPageToken: String = null): SchemaListAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAcceleratorTypesResponse]
  }
}

