package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceInstanceParams extends js.Object {
  
  /**
    * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks,
    * they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
    */
  var diskConfigs: js.UndefOr[js.Array[DiskInstantiationConfig]] = js.native
}
object SourceInstanceParams {
  
  @scala.inline
  def apply(): SourceInstanceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInstanceParams]
  }
  
  @scala.inline
  implicit class SourceInstanceParamsOps[Self <: SourceInstanceParams] (val x: Self) extends AnyVal {
    
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
    def setDiskConfigsVarargs(value: DiskInstantiationConfig*): Self = this.set("diskConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDiskConfigs(value: js.Array[DiskInstantiationConfig]): Self = this.set("diskConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskConfigs: Self = this.set("diskConfigs", js.undefined)
  }
}
