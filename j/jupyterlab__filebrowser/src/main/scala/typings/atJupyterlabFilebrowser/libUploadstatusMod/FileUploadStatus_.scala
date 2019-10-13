package typings.atJupyterlabFilebrowser.libUploadstatusMod

import typings.atJupyterlabApputils.libVdomMod.VDomRenderer
import typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.IOptions
import typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus")
@js.native
class FileUploadStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct a new FileUpload status item.
    */
  def this(opts: IOptions) = this()
  var _onBrowserChange: js.Any = js.native
  var _tracker: js.Any = js.native
}

