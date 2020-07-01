package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TooltipOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Tooltip extends js.Object {
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean
  /**
    * If tooltip is open.
    */
  var isOpen: Boolean
  /**
    * Hide tooltip.
    */
  def close(): Unit
  /**
    * Show tooltip.
    */
  def open(): Unit
}

object Tooltip {
  @scala.inline
  def apply(close: () => Unit, isHovered: Boolean, isOpen: Boolean, open: () => Unit): Tooltip = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isHovered = isHovered.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Tooltip]
  }
}

