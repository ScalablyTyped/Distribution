package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the config of disk options for a group of VM instances.
  */
@js.native
trait SchemaDiskConfig extends js.Object {
  /**
    * Optional. Size in GB of the boot disk (default is 500GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Optional. Type of the boot disk (default is &quot;pd-standard&quot;).
    * Valid values: &quot;pd-ssd&quot; (Persistent Disk Solid State Drive) or
    * &quot;pd-standard&quot; (Persistent Disk Hard Disk Drive).
    */
  var bootDiskType: js.UndefOr[String] = js.native
  /**
    * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs
    * are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one
    * or more SSDs are attached, this runtime bulk data is spread across them,
    * and the boot disk contains only basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[Double] = js.native
}

object SchemaDiskConfig {
  @scala.inline
  def apply(
    bootDiskSizeGb: js.UndefOr[Double] = js.undefined,
    bootDiskType: String = null,
    numLocalSsds: js.UndefOr[Double] = js.undefined
  ): SchemaDiskConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bootDiskSizeGb)) __obj.updateDynamic("bootDiskSizeGb")(bootDiskSizeGb.get.asInstanceOf[js.Any])
    if (bootDiskType != null) __obj.updateDynamic("bootDiskType")(bootDiskType.asInstanceOf[js.Any])
    if (!js.isUndefined(numLocalSsds)) __obj.updateDynamic("numLocalSsds")(numLocalSsds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskConfig]
  }
}

