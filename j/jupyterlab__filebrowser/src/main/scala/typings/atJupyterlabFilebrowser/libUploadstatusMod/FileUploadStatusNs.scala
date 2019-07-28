package typings.atJupyterlabFilebrowser.libUploadstatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabFilebrowser.libMod.FileBrowser
import typings.atJupyterlabFilebrowser.libMod.FileBrowserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus")
@js.native
object FileUploadStatusNs extends js.Object {
  /**
    * Options for creating the upload status item.
    */
  trait IOptions extends js.Object {
    /**
      * The application file browser tracker.
      */
    val tracker: WidgetTracker[FileBrowser]
  }
  
  /**
    * The VDomModel for the FileUpload renderer.
    */
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
  
}

