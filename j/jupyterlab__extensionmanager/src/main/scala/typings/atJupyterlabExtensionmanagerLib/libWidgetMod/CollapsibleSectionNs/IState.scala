package typings
package atJupyterlabExtensionmanagerLib.libWidgetMod.CollapsibleSectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React state for collapsible section component.
  */
trait IState extends js.Object {
  /**
    * Whther the section is collapsed or not.
    */
  var collapsed: scala.Boolean
}

object IState {
  @scala.inline
  def apply(collapsed: scala.Boolean): IState = {
    val __obj = js.Dynamic.literal(collapsed = collapsed)
  
    __obj.asInstanceOf[IState]
  }
}

