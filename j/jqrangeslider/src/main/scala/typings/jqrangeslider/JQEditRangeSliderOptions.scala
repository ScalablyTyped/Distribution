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
  
  @scala.inline
  def apply(): JQEditRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQEditRangeSliderOptions]
  }
  
  @scala.inline
  implicit class JQEditRangeSliderOptionsMutableBuilder[Self <: JQEditRangeSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
