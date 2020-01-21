package typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React state for collapsible section component.
  */
trait IState extends js.Object {
  /**
    * Whether the section is expanded or collapsed.
    */
  var isOpen: Boolean
}

object IState {
  @scala.inline
  def apply(isOpen: Boolean): IState = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IState]
  }
}

