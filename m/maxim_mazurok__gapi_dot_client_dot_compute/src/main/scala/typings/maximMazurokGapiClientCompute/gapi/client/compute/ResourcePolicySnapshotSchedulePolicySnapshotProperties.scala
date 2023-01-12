package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicySnapshotSchedulePolicySnapshotProperties extends StObject {
  
  /** Chain name that the snapshot is created in. */
  var chainName: js.UndefOr[String] = js.undefined
  
  /** Indication to perform a 'guest aware' snapshot. */
  var guestFlush: js.UndefOr[Boolean] = js.undefined
  
  /** Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional). */
  var storageLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object ResourcePolicySnapshotSchedulePolicySnapshotProperties {
  
  inline def apply(): ResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicySnapshotSchedulePolicySnapshotProperties] (val x: Self) extends AnyVal {
    
    inline def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    inline def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    inline def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    inline def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    inline def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value*))
  }
}
