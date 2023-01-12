package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToCssOptions extends StObject {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[Boolean] = js.undefined
  
  var indent: js.UndefOr[Double] = js.undefined
}
object ToCssOptions {
  
  inline def apply(): ToCssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToCssOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToCssOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
  }
}
