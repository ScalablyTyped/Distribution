package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SidenavOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Sidenav extends js.Object {
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean
  /**
    * Describes open/close state of Sidenav
    */
  var isOpen: Boolean
  /**
    * Closes Sidenav
    */
  def close(): Unit
  /**
    * Opens Sidenav
    */
  def open(): Unit
}

object Sidenav {
  @scala.inline
  def apply(close: () => Unit, isDragged: Boolean, isFixed: Boolean, isOpen: Boolean, open: () => Unit): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Sidenav]
  }
}

