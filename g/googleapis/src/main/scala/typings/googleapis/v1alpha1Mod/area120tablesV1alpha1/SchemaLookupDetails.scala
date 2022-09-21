package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupDetails extends StObject {
  
  /**
    * The name of the relationship column associated with the lookup.
    */
  var relationshipColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the relationship column.
    */
  var relationshipColumnId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLookupDetails {
  
  inline def apply(): SchemaLookupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupDetails]
  }
  
  extension [Self <: SchemaLookupDetails](x: Self) {
    
    inline def setRelationshipColumn(value: String): Self = StObject.set(x, "relationshipColumn", value.asInstanceOf[js.Any])
    
    inline def setRelationshipColumnId(value: String): Self = StObject.set(x, "relationshipColumnId", value.asInstanceOf[js.Any])
    
    inline def setRelationshipColumnIdNull: Self = StObject.set(x, "relationshipColumnId", null)
    
    inline def setRelationshipColumnIdUndefined: Self = StObject.set(x, "relationshipColumnId", js.undefined)
    
    inline def setRelationshipColumnNull: Self = StObject.set(x, "relationshipColumn", null)
    
    inline def setRelationshipColumnUndefined: Self = StObject.set(x, "relationshipColumn", js.undefined)
  }
}
