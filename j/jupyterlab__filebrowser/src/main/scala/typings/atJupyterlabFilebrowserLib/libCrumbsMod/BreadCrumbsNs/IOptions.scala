package typings
package atJupyterlabFilebrowserLib.libCrumbsMod.BreadCrumbsNs

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
  var model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel
}

object IOptions {
  @scala.inline
  def apply(model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model)
  
    __obj.asInstanceOf[IOptions]
  }
}

