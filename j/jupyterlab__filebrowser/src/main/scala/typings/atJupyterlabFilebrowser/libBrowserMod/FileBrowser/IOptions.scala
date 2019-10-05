package typings.atJupyterlabFilebrowser.libBrowserMod.FileBrowser

import typings.atJupyterlabFilebrowser.libListingMod.DirListing.IRenderer
import typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser widget.
  */
trait IOptions extends js.Object {
  /**
    * The widget/DOM id of the file browser.
    */
  var id: String
  /**
    * A file browser model instance.
    */
  var model: FileBrowserModel
  /**
    * An optional renderer for the directory listing area.
    *
    * The default is a shared instance of `DirListing.Renderer`.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(id: String, model: FileBrowserModel, renderer: IRenderer = null): IOptions = {
    val __obj = js.Dynamic.literal(id = id, model = model)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IOptions]
  }
}

