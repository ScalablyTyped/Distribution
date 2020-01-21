package typings.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/less/less.js/blob/master/lib/less/import-manager.js#L10
trait RootFileInfo extends js.Object {
  /** path to the current file, absolute */
  var currentDirectory: String
  /** absolute path to the entry file */
  var entryPath: String
  /** full resolved filename of current file */
  var filename: String
  /** whether the file should not be output and only output parts that are referenced */
  var reference: Boolean
  var relativeUrls: Boolean
  /** whether to adjust URL's to be relative */
  var rewriteUrls: js.UndefOr[Boolean] = js.undefined
  /** filename of the base file */
  var rootFilename: String
  /** path to append to normal URLs for this node */
  var rootpath: String
}

object RootFileInfo {
  @scala.inline
  def apply(
    currentDirectory: String,
    entryPath: String,
    filename: String,
    reference: Boolean,
    relativeUrls: Boolean,
    rootFilename: String,
    rootpath: String,
    rewriteUrls: js.UndefOr[Boolean] = js.undefined
  ): RootFileInfo = {
    val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relativeUrls = relativeUrls.asInstanceOf[js.Any], rootFilename = rootFilename.asInstanceOf[js.Any], rootpath = rootpath.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteUrls)) __obj.updateDynamic("rewriteUrls")(rewriteUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootFileInfo]
  }
}

