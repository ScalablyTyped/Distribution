package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TooltipOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Tooltip extends StObject {
  
  /**
    * Hide tooltip.
    */
  def close(): Unit = js.native
  
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean = js.native
  
  /**
    * If tooltip is open.
    */
  var isOpen: Boolean = js.native
  
  /**
    * Show tooltip.
    */
  def open(): Unit = js.native
}
object Tooltip {
  
  @scala.inline
  def apply(close: () => Unit, isHovered: Boolean, isOpen: Boolean, open: () => Unit): Tooltip = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isHovered = isHovered.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
