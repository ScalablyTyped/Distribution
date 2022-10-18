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
  
  extension [Self <: ComponentBase[?], TOptions](x: Self & ComponentBase[TOptions]) {
    
    inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
