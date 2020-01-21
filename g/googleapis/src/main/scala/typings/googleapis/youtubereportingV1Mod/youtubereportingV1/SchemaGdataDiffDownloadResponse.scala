package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffDownloadResponse extends js.Object {
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}

object SchemaGdataDiffDownloadResponse {
  @scala.inline
  def apply(objectLocation: SchemaGdataCompositeMedia = null): SchemaGdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    if (objectLocation != null) __obj.updateDynamic("objectLocation")(objectLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataDiffDownloadResponse]
  }
}

