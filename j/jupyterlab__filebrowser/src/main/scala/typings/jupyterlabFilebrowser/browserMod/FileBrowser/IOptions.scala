package typings.jupyterlabFilebrowser.browserMod.FileBrowser

import typings.jupyterlabFilebrowser.listingMod.DirListing.IRenderer
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

