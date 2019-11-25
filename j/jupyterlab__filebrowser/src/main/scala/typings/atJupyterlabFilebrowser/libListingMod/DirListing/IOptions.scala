package typings.atJupyterlabFilebrowser.libListingMod.DirListing

import typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser directory listing.
  */
trait IOptions extends js.Object {
  /**
    * A file browser model instance.
    */
  var model: FileBrowserModel
  /**
    * A renderer for file items.
    *
    * The default is a shared `Renderer` instance.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(model: FileBrowserModel, renderer: IRenderer = null): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

