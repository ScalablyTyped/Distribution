package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBase[TOptions] extends StObject {
  
  /**
    * The DOM element the plugin was initialized with
    */
  var el: Element
  
  /**
    * The options the instance was initialized with
    */
  var options: TOptions
}
object ComponentBase {
  
  inline def apply[TOptions](el: Element, options: TOptions): ComponentBase[TOptions] = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentBase[TOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentBase[?], TOptions] (val x: Self & ComponentBase[TOptions]) extends AnyVal {
    
    inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
