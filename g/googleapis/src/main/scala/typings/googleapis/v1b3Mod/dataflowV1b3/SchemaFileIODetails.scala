package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a File connector used by the job.
  */
@js.native
trait SchemaFileIODetails extends js.Object {
  /**
    * File Pattern used to access files by the connector.
    */
  var filePattern: js.UndefOr[String] = js.native
}

object SchemaFileIODetails {
  @scala.inline
  def apply(filePattern: String = null): SchemaFileIODetails = {
    val __obj = js.Dynamic.literal()
    if (filePattern != null) __obj.updateDynamic("filePattern")(filePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileIODetails]
  }
}

