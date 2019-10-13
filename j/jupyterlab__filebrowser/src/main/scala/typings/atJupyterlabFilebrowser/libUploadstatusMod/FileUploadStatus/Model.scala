package typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus

import typings.atJupyterlabApputils.libVdomMod.VDomModel
import typings.atJupyterlabFilebrowser.libMod.FileBrowserModel
import typings.atJupyterlabFilebrowser.libUploadstatusMod.IFileUploadItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The VDomModel for the FileUpload renderer.
  */
@JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus.Model")
@js.native
class Model () extends VDomModel {
  /**
    * Construct a new model.
    */
  def this(browserModel: FileBrowserModel) = this()
  var _browserModel: js.Any = js.native
  var _items: js.Any = js.native
  /**
    * Handle an uploadChanged event in the filebrowser model.
    */
  var _uploadChanged: js.Any = js.native
  /**
    * The current file browser model.
    */
  var browserModel: FileBrowserModel | Null = js.native
  /**
    * The currently uploading items.
    */
  val items: js.Array[IFileUploadItem] = js.native
}

