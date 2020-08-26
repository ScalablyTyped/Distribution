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
  def apply(): SchemaNewDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDiskInitializeParams]
  }
  @scala.inline
  implicit class SchemaNewDiskInitializeParamsOps[Self <: SchemaNewDiskInitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    @scala.inline
    def setSourceImage(value: String): Self = this.set("sourceImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceImage: Self = this.set("sourceImage", js.undefined)
  }
  
}

