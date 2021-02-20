package typings.jqueryRowgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryRowGridJSOptions extends StObject {
  
  var itemSelector: String = js.native
  
  var maxMargin: js.UndefOr[Double] = js.native
  
  var minMargin: js.UndefOr[Double] = js.native
}
object JQueryRowGridJSOptions {
  
  @scala.inline
  def apply(itemSelector: String): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
  
  @scala.inline
  implicit class JQueryRowGridJSOptionsMutableBuilder[Self <: JQueryRowGridJSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMargin(value: Double): Self = StObject.set(x, "maxMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMarginUndefined: Self = StObject.set(x, "maxMargin", js.undefined)
    
    @scala.inline
    def setMinMargin(value: Double): Self = StObject.set(x, "minMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMarginUndefined: Self = StObject.set(x, "minMargin", js.undefined)
  }
}
