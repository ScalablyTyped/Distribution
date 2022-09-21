package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentInstanceFilter extends StObject {
  
  /**
    * Target all VMs in the project. If true, no other criteria is permitted.
    */
  var all: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
    */
  var exclusionLabels: js.UndefOr[js.Array[SchemaOSPolicyAssignmentLabelSet]] = js.undefined
  
  /**
    * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
    */
  var inclusionLabels: js.UndefOr[js.Array[SchemaOSPolicyAssignmentLabelSet]] = js.undefined
  
  /**
    * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
    */
  var inventories: js.UndefOr[js.Array[SchemaOSPolicyAssignmentInstanceFilterInventory]] = js.undefined
}
object SchemaOSPolicyAssignmentInstanceFilter {
  
  inline def apply(): SchemaOSPolicyAssignmentInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentInstanceFilter]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentInstanceFilter](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllNull: Self = StObject.set(x, "all", null)
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setExclusionLabels(value: js.Array[SchemaOSPolicyAssignmentLabelSet]): Self = StObject.set(x, "exclusionLabels", value.asInstanceOf[js.Any])
    
    inline def setExclusionLabelsUndefined: Self = StObject.set(x, "exclusionLabels", js.undefined)
    
    inline def setExclusionLabelsVarargs(value: SchemaOSPolicyAssignmentLabelSet*): Self = StObject.set(x, "exclusionLabels", js.Array(value*))
    
    inline def setInclusionLabels(value: js.Array[SchemaOSPolicyAssignmentLabelSet]): Self = StObject.set(x, "inclusionLabels", value.asInstanceOf[js.Any])
    
    inline def setInclusionLabelsUndefined: Self = StObject.set(x, "inclusionLabels", js.undefined)
    
    inline def setInclusionLabelsVarargs(value: SchemaOSPolicyAssignmentLabelSet*): Self = StObject.set(x, "inclusionLabels", js.Array(value*))
    
    inline def setInventories(value: js.Array[SchemaOSPolicyAssignmentInstanceFilterInventory]): Self = StObject.set(x, "inventories", value.asInstanceOf[js.Any])
    
    inline def setInventoriesUndefined: Self = StObject.set(x, "inventories", js.undefined)
    
    inline def setInventoriesVarargs(value: SchemaOSPolicyAssignmentInstanceFilterInventory*): Self = StObject.set(x, "inventories", js.Array(value*))
  }
}
