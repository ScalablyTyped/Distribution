package typings.iconvLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var addBOM: js.UndefOr[Boolean] = js.undefined
  
  var defaultEncoding: js.UndefOr[String] = js.undefined
  
  var stripBOM: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAddBOM(value: Boolean): Self = StObject.set(x, "addBOM", value.asInstanceOf[js.Any])
    
    inline def setAddBOMUndefined: Self = StObject.set(x, "addBOM", js.undefined)
    
    inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    inline def setStripBOM(value: Boolean): Self = StObject.set(x, "stripBOM", value.asInstanceOf[js.Any])
    
    inline def setStripBOMUndefined: Self = StObject.set(x, "stripBOM", js.undefined)
  }
}
