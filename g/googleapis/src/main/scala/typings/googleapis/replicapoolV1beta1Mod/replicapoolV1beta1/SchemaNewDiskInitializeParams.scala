package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialization parameters for creating a new disk.
  */
@js.native
trait SchemaNewDiskInitializeParams extends js.Object {
  /**
    * The size of the created disk in gigabytes.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Name of the disk type resource describing which disk type to use to
    * create the disk. For example &#39;pd-ssd&#39; or &#39;pd-standard&#39;.
    * Default is &#39;pd-standard&#39;
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * The name or fully-qualified URL of a source image to use to create this
    * disk. If you provide a name of the source image, Replica Pool will look
    * for an image with that name in your project. If you are specifying an
    * image provided by Compute Engine, you will need to provide the full URL
    * with the correct project, such as:
    * http://www.googleapis.com/compute/v1/projects/debian-cloud/
    * global/images/debian-wheezy-7-vYYYYMMDD
    */
  var sourceImage: js.UndefOr[String] = js.native
}

object SchemaNewDiskInitializeParams {
  @scala.inline
  def apply(diskSizeGb: String = null, diskType: String = null, sourceImage: String = null): SchemaNewDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (diskType != null) __obj.updateDynamic("diskType")(diskType.asInstanceOf[js.Any])
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNewDiskInitializeParams]
  }
}

