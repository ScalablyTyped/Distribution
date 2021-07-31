package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateOrdersResponse extends StObject {
  
  /**
    * The list of proposals successfully created.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.undefined
}
object SchemaCreateOrdersResponse {
  
  @scala.inline
  def apply(): SchemaCreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOrdersResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateOrdersResponseMutableBuilder[Self <: SchemaCreateOrdersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposals(value: js.Array[SchemaProposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: SchemaProposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
