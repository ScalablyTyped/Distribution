package typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a TabSpace status item.
  */
trait IOptions extends js.Object {
  /**
    * A menu to open when clicking on the status item. This should allow
    * the user to make a different selection about tabs/spaces.
    */
  var menu: Menu
}

object IOptions {
  @scala.inline
  def apply(menu: Menu): IOptions = {
    val __obj = js.Dynamic.literal(menu = menu)
  
    __obj.asInstanceOf[IOptions]
  }
}

