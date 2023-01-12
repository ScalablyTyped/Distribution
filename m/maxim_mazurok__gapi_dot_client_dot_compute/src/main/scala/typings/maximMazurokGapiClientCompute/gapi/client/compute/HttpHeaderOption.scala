package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpHeaderOption extends StObject {
  
  /** The name of the header. */
  var headerName: js.UndefOr[String] = js.undefined
  
  /** The value of the header to add. */
  var headerValue: js.UndefOr[String] = js.undefined
  
  /**
    * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header.
    * The default value is false.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
}
object HttpHeaderOption {
  
  inline def apply(): HttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeaderOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpHeaderOption] (val x: Self) extends AnyVal {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
