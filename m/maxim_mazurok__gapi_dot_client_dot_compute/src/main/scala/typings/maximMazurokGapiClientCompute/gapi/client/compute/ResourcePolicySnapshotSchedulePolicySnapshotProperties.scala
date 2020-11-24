package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicySnapshotSchedulePolicySnapshotProperties extends js.Object {
  
  /** Chain name that the snapshot is created in. */
  var chainName: js.UndefOr[String] = js.native
  
  /** Indication to perform a 'guest aware' snapshot. */
  var guestFlush: js.UndefOr[Boolean] = js.native
  
  /** Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.ResourcePolicySnapshotSchedulePolicySnapshotProperties with TopLevel[js.Any]
  ] = js.native
  
  /** Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional). */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}
object ResourcePolicySnapshotSchedulePolicySnapshotProperties {
  
  @scala.inline
  def apply(): ResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
  
  @scala.inline
  implicit class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesOps[Self <: ResourcePolicySnapshotSchedulePolicySnapshotProperties] (val x: Self) extends AnyVal {
    
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
    def setChainName(value: String): Self = this.set("chainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainName: Self = this.set("chainName", js.undefined)
    
    @scala.inline
    def setGuestFlush(value: Boolean): Self = this.set("guestFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestFlush: Self = this.set("guestFlush", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.ResourcePolicySnapshotSchedulePolicySnapshotProperties with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = this.set("storageLocations", js.Array(value :_*))
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = this.set("storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocations: Self = this.set("storageLocations", js.undefined)
  }
}
