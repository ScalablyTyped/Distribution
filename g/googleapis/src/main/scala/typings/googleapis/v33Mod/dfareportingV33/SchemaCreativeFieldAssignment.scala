package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeFieldAssignment extends StObject {
  
  /**
    * ID of the creative field.
    */
  var creativeFieldId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the creative field value.
    */
  var creativeFieldValueId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeFieldAssignment {
  
  inline def apply(): SchemaCreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldAssignment]
  }
  
  extension [Self <: SchemaCreativeFieldAssignment](x: Self) {
    
    inline def setCreativeFieldId(value: String): Self = StObject.set(x, "creativeFieldId", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldIdNull: Self = StObject.set(x, "creativeFieldId", null)
    
    inline def setCreativeFieldIdUndefined: Self = StObject.set(x, "creativeFieldId", js.undefined)
    
    inline def setCreativeFieldValueId(value: String): Self = StObject.set(x, "creativeFieldValueId", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldValueIdNull: Self = StObject.set(x, "creativeFieldValueId", null)
    
    inline def setCreativeFieldValueIdUndefined: Self = StObject.set(x, "creativeFieldValueId", js.undefined)
  }
}
