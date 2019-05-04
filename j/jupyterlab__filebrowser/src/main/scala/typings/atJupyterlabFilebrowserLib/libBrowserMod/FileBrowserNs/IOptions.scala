package typings
package atJupyterlabFilebrowserLib.libBrowserMod.FileBrowserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser widget.
  */
trait IOptions extends js.Object {
  /**
    * The command registry for use with the file browser.
    */
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * The widget/DOM id of the file browser.
    */
  var id: java.lang.String
  /**
    * A file browser model instance.
    */
  var model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel
  /**
    * An optional renderer for the directory listing area.
    *
    * The default is a shared instance of `DirListing.Renderer`.
    */
  var renderer: js.UndefOr[atJupyterlabFilebrowserLib.libListingMod.DirListingNs.IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    id: java.lang.String,
    model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel,
    renderer: atJupyterlabFilebrowserLib.libListingMod.DirListingNs.IRenderer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands, id = id, model = model)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IOptions]
  }
}

