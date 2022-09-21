package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudienceSegment extends StObject {
  
  /**
    * Weight allocated to this segment. The weight assigned will be understood in proportion to the weights assigned to other segments in the same segment group. Acceptable values are 1 to 1000, inclusive.
    */
  var allocation: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * ID of this audience segment. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this audience segment. This is a required field and must be less than 65 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudienceSegment {
  
  inline def apply(): SchemaAudienceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceSegment]
  }
  
  extension [Self <: SchemaAudienceSegment](x: Self) {
    
    inline def setAllocation(value: Double): Self = StObject.set(x, "allocation", value.asInstanceOf[js.Any])
    
    inline def setAllocationNull: Self = StObject.set(x, "allocation", null)
    
    inline def setAllocationUndefined: Self = StObject.set(x, "allocation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
