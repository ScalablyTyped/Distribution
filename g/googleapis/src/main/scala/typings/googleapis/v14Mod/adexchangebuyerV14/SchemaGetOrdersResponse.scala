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
  
  inline def apply(): SchemaGetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrdersResponse]
  }
  
  extension [Self <: SchemaGetOrdersResponse](x: Self) {
    
    inline def setProposals(value: js.Array[SchemaProposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: SchemaProposal*): Self = StObject.set(x, "proposals", js.Array(value*))
  }
}
