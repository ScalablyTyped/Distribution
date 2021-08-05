package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The original conversion that was inserted or updated and whether there were
  * any errors.
  */
trait SchemaConversionStatus extends StObject {
  
  /**
    * The original conversion that was inserted or updated.
    */
  var conversion: js.UndefOr[SchemaConversion] = js.undefined
  
  /**
    * A list of errors related to this conversion.
    */
  var errors: js.UndefOr[js.Array[SchemaConversionError]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaConversionStatus {
  
  inline def apply(): SchemaConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionStatus]
  }
  
  extension [Self <: SchemaConversionStatus](x: Self) {
    
    inline def setConversion(value: SchemaConversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaConversionError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaConversionError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
