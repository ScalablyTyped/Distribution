package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorrection extends StObject {
  
  /**
    * The contexts for the correction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.undefined
  
  /**
    * Additional details about what was corrected.
    */
  var details: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The type of correction that was applied to the creative.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCorrection {
  
  inline def apply(): SchemaCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorrection]
  }
  
  extension [Self <: SchemaCorrection](x: Self) {
    
    inline def setContexts(value: js.Array[SchemaServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: SchemaServingContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
