package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDroppedLabels extends StObject {
  
  /**
    * Map from label to its value, for all labels dropped in any aggregation.
    */
  var label: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaDroppedLabels {
  
  inline def apply(): SchemaDroppedLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDroppedLabels]
  }
  
  extension [Self <: SchemaDroppedLabels](x: Self) {
    
    inline def setLabel(value: StringDictionary[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
