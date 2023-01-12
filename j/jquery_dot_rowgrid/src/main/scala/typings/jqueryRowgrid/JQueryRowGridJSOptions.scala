package typings.jqueryRowgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryRowGridJSOptions extends StObject {
  
  var itemSelector: String
  
  var maxMargin: js.UndefOr[Double] = js.undefined
  
  var minMargin: js.UndefOr[Double] = js.undefined
}
object JQueryRowGridJSOptions {
  
  inline def apply(itemSelector: String): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryRowGridJSOptions] (val x: Self) extends AnyVal {
    
    inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    inline def setMaxMargin(value: Double): Self = StObject.set(x, "maxMargin", value.asInstanceOf[js.Any])
    
    inline def setMaxMarginUndefined: Self = StObject.set(x, "maxMargin", js.undefined)
    
    inline def setMinMargin(value: Double): Self = StObject.set(x, "minMargin", value.asInstanceOf[js.Any])
    
    inline def setMinMarginUndefined: Self = StObject.set(x, "minMargin", js.undefined)
  }
}
