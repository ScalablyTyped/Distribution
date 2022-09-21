package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentLabelSet extends StObject {
  
  /**
    * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaOSPolicyAssignmentLabelSet {
  
  inline def apply(): SchemaOSPolicyAssignmentLabelSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentLabelSet]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentLabelSet](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
