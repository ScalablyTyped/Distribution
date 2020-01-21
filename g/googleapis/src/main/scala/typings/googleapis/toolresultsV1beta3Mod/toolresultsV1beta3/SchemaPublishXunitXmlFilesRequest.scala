package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for StepService.PublishXunitXmlFiles.
  */
@js.native
trait SchemaPublishXunitXmlFilesRequest extends js.Object {
  /**
    * URI of the Xunit XML files to publish.  The maximum size of the file this
    * reference is pointing to is 50MB.  Required.
    */
  var xunitXmlFiles: js.UndefOr[js.Array[SchemaFileReference]] = js.native
}

object SchemaPublishXunitXmlFilesRequest {
  @scala.inline
  def apply(xunitXmlFiles: js.Array[SchemaFileReference] = null): SchemaPublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (xunitXmlFiles != null) __obj.updateDynamic("xunitXmlFiles")(xunitXmlFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishXunitXmlFilesRequest]
  }
}

