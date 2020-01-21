package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadRequest extends js.Object {
  /**
    * gdata
    */
  var checksumsInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffUploadRequest {
  @scala.inline
  def apply(
    checksumsInfo: SchemaGdataCompositeMedia = null,
    objectInfo: SchemaGdataCompositeMedia = null,
    objectVersion: String = null
  ): SchemaGdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    if (checksumsInfo != null) __obj.updateDynamic("checksumsInfo")(checksumsInfo.asInstanceOf[js.Any])
    if (objectInfo != null) __obj.updateDynamic("objectInfo")(objectInfo.asInstanceOf[js.Any])
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataDiffUploadRequest]
  }
}

