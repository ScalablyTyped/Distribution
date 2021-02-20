package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicySnapshotSchedulePolicySnapshotProperties extends StObject {
  
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
  implicit class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesMutableBuilder[Self <: ResourcePolicySnapshotSchedulePolicySnapshotProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    @scala.inline
    def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.ResourcePolicySnapshotSchedulePolicySnapshotProperties with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value :_*))
  }
}
