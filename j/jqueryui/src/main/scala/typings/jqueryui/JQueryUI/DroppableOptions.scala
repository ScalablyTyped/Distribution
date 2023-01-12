package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableOptions
  extends StObject
     with DroppableEvents {
  
  var accept: js.UndefOr[Any] = js.undefined
  
  var activeClass: js.UndefOr[String] = js.undefined
  
  var addClasses: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var greedy: js.UndefOr[Boolean] = js.undefined
  
  var hoverClass: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var tolerance: js.UndefOr[String] = js.undefined
}
object DroppableOptions {
  
  inline def apply(): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableOptions] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: Any): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    inline def setAddClasses(value: Boolean): Self = StObject.set(x, "addClasses", value.asInstanceOf[js.Any])
    
    inline def setAddClassesUndefined: Self = StObject.set(x, "addClasses", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
    
    inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
