package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipDetails extends StObject {
  
  /** The name of the table this relationship is linked to. */
  var linkedTable: js.UndefOr[String] = js.undefined
}
object RelationshipDetails {
  
  inline def apply(): RelationshipDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipDetails] (val x: Self) extends AnyVal {
    
    inline def setLinkedTable(value: String): Self = StObject.set(x, "linkedTable", value.asInstanceOf[js.Any])
    
    inline def setLinkedTableUndefined: Self = StObject.set(x, "linkedTable", js.undefined)
  }
}
