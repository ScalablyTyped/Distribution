package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataObjectId extends js.Object {
  /**
    * gdata
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectName: js.UndefOr[String] = js.native
}

object SchemaGdataObjectId {
  @scala.inline
  def apply(bucketName: String = null, generation: String = null, objectName: String = null): SchemaGdataObjectId = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (objectName != null) __obj.updateDynamic("objectName")(objectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataObjectId]
  }
}

