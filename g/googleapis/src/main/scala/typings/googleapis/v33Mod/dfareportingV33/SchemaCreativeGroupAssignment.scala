package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeGroupAssignment extends StObject {
  
  /**
    * ID of the creative group to be assigned.
    */
  var creativeGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative group number of the creative group assignment.
    */
  var creativeGroupNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeGroupAssignment {
  
  inline def apply(): SchemaCreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupAssignment]
  }
  
  extension [Self <: SchemaCreativeGroupAssignment](x: Self) {
    
    inline def setCreativeGroupId(value: String): Self = StObject.set(x, "creativeGroupId", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupIdNull: Self = StObject.set(x, "creativeGroupId", null)
    
    inline def setCreativeGroupIdUndefined: Self = StObject.set(x, "creativeGroupId", js.undefined)
    
    inline def setCreativeGroupNumber(value: String): Self = StObject.set(x, "creativeGroupNumber", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupNumberNull: Self = StObject.set(x, "creativeGroupNumber", null)
    
    inline def setCreativeGroupNumberUndefined: Self = StObject.set(x, "creativeGroupNumber", js.undefined)
  }
}
