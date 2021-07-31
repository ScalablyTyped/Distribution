package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOrdersResponse extends StObject {
  
  /**
    * The list of matching proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.undefined
}
object SchemaGetOrdersResponse {
  
  @scala.inline
  def apply(): SchemaGetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrdersResponse]
  }
  
  @scala.inline
  implicit class SchemaGetOrdersResponseMutableBuilder[Self <: SchemaGetOrdersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposals(value: js.Array[SchemaProposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: SchemaProposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
