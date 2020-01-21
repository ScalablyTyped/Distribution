package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadResponse extends js.Object {
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var originalObject: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}

object SchemaGdataDiffUploadResponse {
  @scala.inline
  def apply(objectVersion: String = null, originalObject: SchemaGdataCompositeMedia = null): SchemaGdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataDiffUploadResponse]
  }
}

