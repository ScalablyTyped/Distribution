package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The reason and details for a disapproval.
  */
trait SchemaDisapproval extends StObject {
  
  /**
    * Additional details about the reason for disapproval.
    */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The categorized reason for disapproval.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaDisapproval {
  
  inline def apply(): SchemaDisapproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisapproval]
  }
  
  extension [Self <: SchemaDisapproval](x: Self) {
    
    inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
