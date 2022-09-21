package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelationshipDetails extends StObject {
  
  /**
    * The name of the table this relationship is linked to.
    */
  var linkedTable: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelationshipDetails {
  
  inline def apply(): SchemaRelationshipDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipDetails]
  }
  
  extension [Self <: SchemaRelationshipDetails](x: Self) {
    
    inline def setLinkedTable(value: String): Self = StObject.set(x, "linkedTable", value.asInstanceOf[js.Any])
    
    inline def setLinkedTableNull: Self = StObject.set(x, "linkedTable", null)
    
    inline def setLinkedTableUndefined: Self = StObject.set(x, "linkedTable", js.undefined)
  }
}
