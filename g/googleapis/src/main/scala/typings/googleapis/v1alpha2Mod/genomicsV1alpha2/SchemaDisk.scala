package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Compute Engine disk resource specification.
  */
@js.native
trait SchemaDisk extends js.Object {
  /**
    * Deprecated. Disks created by the Pipelines API will be deleted at the end
    * of the pipeline run, regardless of what this field is set to.
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * Required at create time and cannot be overridden at run time. Specifies
    * the path in the docker container where files on this disk should be
    * located. For example, if `mountPoint` is `/mnt/disk`, and the parameter
    * has `localPath` `inputs/file.txt`, the docker container can access the
    * data at `/mnt/disk/inputs/file.txt`.
    */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    * Required. The name of the disk that can be used in the pipeline
    * parameters. Must be 1 - 63 characters. The name &quot;boot&quot; is
    * reserved for system use.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies how a sourced-base persistent disk will be mounted. See
    * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances
    * for more details. Can only be set at create time.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * The size of the disk. Defaults to 500 (GB). This field is not applicable
    * for local SSD.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * The full or partial URL of the persistent disk to attach. See
    * https://cloud.google.com/compute/docs/reference/latest/instances#resource
    * and
    * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots
    * for more details.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Required. The type of the disk to create.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDisk {
  @scala.inline
  def apply(
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    mountPoint: String = null,
    name: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    sizeGb: js.UndefOr[Double] = js.undefined,
    source: String = null,
    `type`: String = null
  ): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (mountPoint != null) __obj.updateDynamic("mountPoint")(mountPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeGb)) __obj.updateDynamic("sizeGb")(sizeGb.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisk]
  }
}

