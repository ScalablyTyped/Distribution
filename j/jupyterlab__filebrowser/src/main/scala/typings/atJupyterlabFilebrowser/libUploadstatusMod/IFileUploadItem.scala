package typings.atJupyterlabFilebrowser.libUploadstatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an item that is being uploaded to
  * the file system.
  */
trait IFileUploadItem extends js.Object {
  /**
    * Whether the upload is complete.
    */
  var complete: Boolean
  /**
    * The path on the filesystem that is being uploaded to.
    */
  var path: String
  /**
    * The upload progress fraction.
    */
  var progress: Double
}

object IFileUploadItem {
  @scala.inline
  def apply(complete: Boolean, path: String, progress: Double): IFileUploadItem = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileUploadItem]
  }
}

