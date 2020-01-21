package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffChecksumsResponse extends js.Object {
  /**
    * gdata
    */
  var checksumsLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffChecksumsResponse {
  @scala.inline
  def apply(
    checksumsLocation: SchemaGdataCompositeMedia = null,
    chunkSizeBytes: String = null,
    objectLocation: SchemaGdataCompositeMedia = null,
    objectSizeBytes: String = null,
    objectVersion: String = null
  ): SchemaGdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    if (checksumsLocation != null) __obj.updateDynamic("checksumsLocation")(checksumsLocation.asInstanceOf[js.Any])
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (objectLocation != null) __obj.updateDynamic("objectLocation")(objectLocation.asInstanceOf[js.Any])
    if (objectSizeBytes != null) __obj.updateDynamic("objectSizeBytes")(objectSizeBytes.asInstanceOf[js.Any])
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataDiffChecksumsResponse]
  }
}

