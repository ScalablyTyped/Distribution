package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServingRestriction extends StObject {
  
  /**
    * The contexts for the restriction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.undefined
  
  /**
    * Disapproval bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method.
    */
  var disapproval: js.UndefOr[SchemaDisapproval] = js.undefined
  
  /**
    * Any disapprovals bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method. Deprecated; please use disapproval field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[SchemaDisapproval]] = js.undefined
  
  /**
    * The status of the creative in this context (for example, it has been explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaServingRestriction {
  
  inline def apply(): SchemaServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingRestriction]
  }
  
  extension [Self <: SchemaServingRestriction](x: Self) {
    
    inline def setContexts(value: js.Array[SchemaServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: SchemaServingContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDisapproval(value: SchemaDisapproval): Self = StObject.set(x, "disapproval", value.asInstanceOf[js.Any])
    
    inline def setDisapprovalReasons(value: js.Array[SchemaDisapproval]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    inline def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    inline def setDisapprovalReasonsVarargs(value: SchemaDisapproval*): Self = StObject.set(x, "disapprovalReasons", js.Array(value*))
    
    inline def setDisapprovalUndefined: Self = StObject.set(x, "disapproval", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
