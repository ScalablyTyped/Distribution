package typings.htmlValidator.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicOptions extends StObject {
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var isFragment: js.UndefOr[Boolean] = js.undefined
  
  var isLocal: js.UndefOr[Boolean] = js.undefined
  
  var validator: js.UndefOr[String | js.Object] = js.undefined
}
object BasicOptions {
  
  inline def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  
  extension [Self <: BasicOptions](x: Self) {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
    
    inline def setIsFragmentUndefined: Self = StObject.set(x, "isFragment", js.undefined)
    
    inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    inline def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    inline def setValidator(value: String | js.Object): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
