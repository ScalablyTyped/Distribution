package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsOptionsObject extends StObject {
  
  /**
    * ClassName of the element for a binding.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Last event to be fired after last step event.
    */
  var end: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Initial event, fired on a button click.
    */
  var init: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Event fired on first click on a chart.
    */
  var start: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Last event to be fired after last step event. Array of step events to be
    * called sequentially after each user click.
    */
  var steps: js.UndefOr[js.Array[js.Function]] = js.undefined
}
object NavigationBindingsOptionsObject {
  
  inline def apply(): NavigationBindingsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptionsObject]
  }
  
  extension [Self <: NavigationBindingsOptionsObject](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEnd(value: js.Function): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setStart(value: js.Function): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setSteps(value: js.Array[js.Function]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: js.Function*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
