package typings.atJupyterlabFilebrowser.libUploadMod.Uploader

import typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel
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
  var model: FileBrowserModel
}

object IOptions {
  @scala.inline
  def apply(model: FileBrowserModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

