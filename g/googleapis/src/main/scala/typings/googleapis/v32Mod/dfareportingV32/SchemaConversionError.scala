package typings.googleapis.v32Mod.dfareportingV32

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
  
  @scala.inline
  def apply(): SchemaConversionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionError]
  }
  
  @scala.inline
  implicit class SchemaConversionErrorMutableBuilder[Self <: SchemaConversionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
