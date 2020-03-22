package typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus

import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabFilebrowser.mod.FileBrowserModel
import typings.jupyterlabFilebrowser.uploadstatusMod.IFileUploadItem
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
  def browserModel(): js.Any = js.native
  def browserModel(browserModel: FileBrowserModel): js.Any = js.native
  /**
    * The current file browser model.
    */
  @JSName("browserModel")
  def browserModel_Union(): FileBrowserModel | Null = js.native
  /**
    * The currently uploading items.
    */
  def items(): js.Array[IFileUploadItem] = js.native
}

