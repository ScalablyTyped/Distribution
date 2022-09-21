package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpHeaderOption extends StObject {
  
  /**
    * The name of the header.
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the header to add.
    */
  var headerValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
    */
  var replace: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHttpHeaderOption {
  
  inline def apply(): SchemaHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderOption]
  }
  
  extension [Self <: SchemaHttpHeaderOption](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueNull: Self = StObject.set(x, "headerValue", null)
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceNull: Self = StObject.set(x, "replace", null)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
