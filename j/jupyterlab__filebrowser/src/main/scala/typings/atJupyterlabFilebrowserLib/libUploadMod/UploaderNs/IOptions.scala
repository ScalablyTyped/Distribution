package typings
package atJupyterlabFilebrowserLib.libUploadMod.UploaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an uploader.
  */
trait IOptions extends js.Object {
  /**
    * A file browser fileBrowserModel instance.
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

