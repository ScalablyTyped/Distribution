package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomFloodlightVariable extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customFloodlightVariable".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of custom floodlight variable to supply a value for. These map to the "u[1-20]=" in the tags.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the custom floodlight variable. The length of string must not exceed 100 characters.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomFloodlightVariable {
  
  inline def apply(): SchemaCustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFloodlightVariable]
  }
  
  extension [Self <: SchemaCustomFloodlightVariable](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
