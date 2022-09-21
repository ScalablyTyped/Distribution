package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContextValue extends StObject {
  
  /**
    * The label for the context value. e.g. "latency".
    */
  var label: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The severity of this context.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit of the context value.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value for the context.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaContextValue {
  
  inline def apply(): SchemaContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextValue]
  }
  
  extension [Self <: SchemaContextValue](x: Self) {
    
    inline def setLabel(value: SchemaLocalizedString): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
