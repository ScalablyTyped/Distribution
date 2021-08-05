package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateOrdersRequest extends StObject {
  
  /**
    * The list of proposals to create.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.undefined
  
  /**
    * Web property id of the seller creating these orders
    */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object SchemaCreateOrdersRequest {
  
  inline def apply(): SchemaCreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOrdersRequest]
  }
  
  extension [Self <: SchemaCreateOrdersRequest](x: Self) {
    
    inline def setProposals(value: js.Array[SchemaProposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: SchemaProposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
