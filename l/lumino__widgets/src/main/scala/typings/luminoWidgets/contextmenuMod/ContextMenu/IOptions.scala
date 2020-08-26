package typings.luminoWidgets.contextmenuMod.ContextMenu

import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.menuMod.Menu.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a context menu.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The command registry to use with the context menu.
    */
  var commands: CommandRegistry = js.native
  /**
    * A custom renderer for use with the context menu.
    */
  var renderer: js.UndefOr[IRenderer] = js.native
}

object IOptions {
  @scala.inline
  def apply(commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setCommands(value: CommandRegistry): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
  
}

