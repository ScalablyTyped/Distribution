package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/less/less.js/blob/master/lib/less/import-manager.js#L10
trait RootFileInfo extends js.Object {
  /** path to the current file, absolute */
  var currentDirectory: java.lang.String
  /** absolute path to the entry file */
  var entryPath: java.lang.String
  /** full resolved filename of current file */
  var filename: java.lang.String
  /** whether the file should not be output and only output parts that are referenced */
  var reference: scala.Boolean
  var relativeUrls: scala.Boolean
  /** whether to adjust URL's to be relative */
  var rewriteUrls: js.UndefOr[scala.Boolean] = js.undefined
  /** filename of the base file */
  var rootFilename: java.lang.String
  /** path to append to normal URLs for this node */
  var rootpath: java.lang.String
}

