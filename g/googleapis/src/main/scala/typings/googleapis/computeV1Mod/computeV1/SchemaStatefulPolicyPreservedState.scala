package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicyPreservedState extends StObject {
  
  /**
    * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice] | Null] = js.undefined
}
object SchemaStatefulPolicyPreservedState {
  
  inline def apply(): SchemaStatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedState]
  }
  
  extension [Self <: SchemaStatefulPolicyPreservedState](x: Self) {
    
    inline def setDisks(value: StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksNull: Self = StObject.set(x, "disks", null)
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
  }
}
