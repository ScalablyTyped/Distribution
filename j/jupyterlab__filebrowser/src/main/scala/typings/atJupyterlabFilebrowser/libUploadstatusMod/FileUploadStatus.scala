package typings.atJupyterlabFilebrowser.libUploadstatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomRenderer
import typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatusNs.IOptions
import typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatusNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus")
@js.native
class FileUploadStatus protected () extends VDomRenderer[Model] {
  /**
    * Construct a new FileUpload status item.
    */
  def this(opts: IOptions) = this()
  var _onBrowserChange: js.Any = js.native
  var _tracker: js.Any = js.native
}

