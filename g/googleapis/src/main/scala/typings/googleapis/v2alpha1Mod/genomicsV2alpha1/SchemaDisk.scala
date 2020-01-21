package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a disk that can be attached to a VM.  See
  * https://cloud.google.com/compute/docs/disks/performance for more
  * information about disk type, size, and performance considerations.
  */
@js.native
trait SchemaDisk extends js.Object {
  /**
    * A user-supplied name for the disk. Used when mounting the disk into
    * actions. The name must contain only upper and lowercase alphanumeric
    * characters and hypens and cannot start with a hypen.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a
    * default is chosen to ensure reasonable I/O performance.  If the disk type
    * is specified as `local-ssd`, multiple local drives are automatically
    * combined to provide the requested size. Note, however, that each physical
    * SSD is 375GB in size, and no more than 8 drives can be attached to a
    * single instance.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * An optional image to put on the disk before attaching it to the VM.
    */
  var sourceImage: js.UndefOr[String] = js.native
  /**
    * The Compute Engine disk type. If unspecified, `pd-standard` is used.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDisk {
  @scala.inline
  def apply(
    name: String = null,
    sizeGb: Int | Double = null,
    sourceImage: String = null,
    `type`: String = null
  ): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisk]
  }
}

