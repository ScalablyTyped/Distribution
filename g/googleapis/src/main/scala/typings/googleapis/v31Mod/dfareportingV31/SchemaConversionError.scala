package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The error code and description for a conversion that failed to insert or
  * update.
  */
trait SchemaConversionError extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionError&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the error.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaConversionError {
  
  inline def apply(): SchemaConversionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionError]
  }
  
  extension [Self <: SchemaConversionError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
