package typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs

import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a bread crumb widget.
  */
trait IOptions extends js.Object {
  /**
    * A file browser model instance.
    */
  var model: FileBrowserModel
}

object IOptions {
  @scala.inline
  def apply(model: FileBrowserModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

