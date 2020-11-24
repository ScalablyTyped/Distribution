package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SidenavOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Sidenav extends js.Object {
  
  /**
    * Closes Sidenav
    */
  def close(): Unit = js.native
  
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean = js.native
  
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean = js.native
  
  /**
    * Describes open/close state of Sidenav
    */
  var isOpen: Boolean = js.native
  
  /**
    * Opens Sidenav
    */
  def open(): Unit = js.native
}
object Sidenav {
  
  @scala.inline
  def apply(close: () => Unit, isDragged: Boolean, isFixed: Boolean, isOpen: Boolean, open: () => Unit): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Sidenav]
  }
  
  @scala.inline
  implicit class SidenavOps[Self <: Sidenav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDragged(value: Boolean): Self = this.set("isDragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = this.set("isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
}
