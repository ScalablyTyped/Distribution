package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties extends StObject {
  
  /**
    * Chain name that the snapshot is created in.
    */
  var chainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indication to perform a 'guest aware' snapshot.
    */
  var guestFlush: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties {
  
  inline def apply(): SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
  
  extension [Self <: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties](x: Self) {
    
    inline def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    inline def setChainNameNull: Self = StObject.set(x, "chainName", null)
    
    inline def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    inline def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    inline def setGuestFlushNull: Self = StObject.set(x, "guestFlush", null)
    
    inline def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationsNull: Self = StObject.set(x, "storageLocations", null)
    
    inline def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    inline def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value*))
  }
}
