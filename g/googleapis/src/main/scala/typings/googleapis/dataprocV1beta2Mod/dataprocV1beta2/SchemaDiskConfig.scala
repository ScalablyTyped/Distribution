package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaDiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskConfig]
  }
  
  @scala.inline
  implicit class SchemaDiskConfigOps[Self <: SchemaDiskConfig] (val x: Self) extends AnyVal {
    
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
    def setBootDiskSizeGb(value: Double): Self = this.set("bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskSizeGb: Self = this.set("bootDiskSizeGb", js.undefined)
    
    @scala.inline
    def setBootDiskType(value: String): Self = this.set("bootDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskType: Self = this.set("bootDiskType", js.undefined)
    
    @scala.inline
    def setNumLocalSsds(value: Double): Self = this.set("numLocalSsds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumLocalSsds: Self = this.set("numLocalSsds", js.undefined)
  }
}
