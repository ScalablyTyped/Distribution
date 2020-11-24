package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends js.Object {
  
  /** Number of CPU cores needed. */
  var cpu: js.UndefOr[Double] = js.native
  
  /** Disk size (GB) needed. */
  var diskGb: js.UndefOr[Double] = js.native
  
  /** The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk */
  var kmsKeyReference: js.UndefOr[String] = js.native
  
  /** Memory (GB) needed. */
  var memoryGb: js.UndefOr[Double] = js.native
  
  /** User specified volumes. */
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
}
object Resources {
  
  @scala.inline
  def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setDiskGb(value: Double): Self = this.set("diskGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskGb: Self = this.set("diskGb", js.undefined)
    
    @scala.inline
    def setKmsKeyReference(value: String): Self = this.set("kmsKeyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyReference: Self = this.set("kmsKeyReference", js.undefined)
    
    @scala.inline
    def setMemoryGb(value: Double): Self = this.set("memoryGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryGb: Self = this.set("memoryGb", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
}
