package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupDetails extends StObject {
  
  /** The name of the relationship column associated with the lookup. */
  var relationshipColumn: js.UndefOr[String] = js.undefined
  
  /** The id of the relationship column. */
  var relationshipColumnId: js.UndefOr[String] = js.undefined
}
object LookupDetails {
  
  @scala.inline
  def apply(): LookupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDetails]
  }
  
  @scala.inline
  implicit class LookupDetailsMutableBuilder[Self <: LookupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationshipColumn(value: String): Self = StObject.set(x, "relationshipColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipColumnId(value: String): Self = StObject.set(x, "relationshipColumnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipColumnIdUndefined: Self = StObject.set(x, "relationshipColumnId", js.undefined)
    
    @scala.inline
    def setRelationshipColumnUndefined: Self = StObject.set(x, "relationshipColumn", js.undefined)
  }
}
