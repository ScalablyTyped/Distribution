package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQEditRangeSliderOptions
  extends StObject
     with JQNumericRangeSliderOptions {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object JQEditRangeSliderOptions {
  
  inline def apply(): JQEditRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQEditRangeSliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQEditRangeSliderOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
