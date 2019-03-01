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

object RootFileInfo {
  @scala.inline
  def apply(
    currentDirectory: java.lang.String,
    entryPath: java.lang.String,
    filename: java.lang.String,
    reference: scala.Boolean,
    relativeUrls: scala.Boolean,
    rootFilename: java.lang.String,
    rootpath: java.lang.String,
    rewriteUrls: js.UndefOr[scala.Boolean] = js.undefined
  ): RootFileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentDirectory")(currentDirectory)
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("reference")(reference)
    __obj.updateDynamic("relativeUrls")(relativeUrls)
    __obj.updateDynamic("rootFilename")(rootFilename)
    __obj.updateDynamic("rootpath")(rootpath)
    if (!js.isUndefined(rewriteUrls)) __obj.updateDynamic("rewriteUrls")(rewriteUrls)
    __obj.asInstanceOf[RootFileInfo]
  }
}

