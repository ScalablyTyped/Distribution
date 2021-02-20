package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableOptions extends DroppableEvents {
  
  var accept: js.UndefOr[js.Any] = js.native
  
  var activeClass: js.UndefOr[String] = js.native
  
  var addClasses: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var greedy: js.UndefOr[Boolean] = js.native
  
  var hoverClass: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var tolerance: js.UndefOr[String] = js.native
}
object DroppableOptions {
  
  @scala.inline
  def apply(): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableOptions]
  }
  
  @scala.inline
  implicit class DroppableOptionsMutableBuilder[Self <: DroppableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: js.Any): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    @scala.inline
    def setAddClasses(value: Boolean): Self = StObject.set(x, "addClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddClassesUndefined: Self = StObject.set(x, "addClasses", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
