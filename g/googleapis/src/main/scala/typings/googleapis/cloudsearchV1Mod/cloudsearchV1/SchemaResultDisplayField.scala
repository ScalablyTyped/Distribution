package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultDisplayField extends StObject {
  
  /**
    * The display label for the property.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operator name of the property.
    */
  var operatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name value pair for the property.
    */
  var property: js.UndefOr[SchemaNamedProperty] = js.undefined
}
object SchemaResultDisplayField {
  
  inline def apply(): SchemaResultDisplayField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayField]
  }
  
  extension [Self <: SchemaResultDisplayField](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setProperty(value: SchemaNamedProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
