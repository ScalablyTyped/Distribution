package typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabFilebrowser.atJupyterlabFilebrowserMod.FileBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating the upload status item.
  */
trait IOptions extends js.Object {
  /**
    * The application file browser tracker.
    */
  val tracker: WidgetTracker[FileBrowser]
}

object IOptions {
  @scala.inline
  def apply(tracker: WidgetTracker[FileBrowser]): IOptions = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

