package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusCondition extends StObject {
  
  /**
    * Canonical code of the condition.
    */
  var canonicalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatusCondition {
  
  inline def apply(): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCondition]
  }
  
  extension [Self <: SchemaStatusCondition](x: Self) {
    
    inline def setCanonicalCode(value: String): Self = StObject.set(x, "canonicalCode", value.asInstanceOf[js.Any])
    
    inline def setCanonicalCodeNull: Self = StObject.set(x, "canonicalCode", null)
    
    inline def setCanonicalCodeUndefined: Self = StObject.set(x, "canonicalCode", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
