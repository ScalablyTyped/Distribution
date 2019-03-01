package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOption extends js.Object {
  var outputSourceFiles: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMapBasepath: js.UndefOr[java.lang.String] = js.undefined
  var sourceMapFileInline: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMapRootpath: js.UndefOr[java.lang.String] = js.undefined
  var sourceMapURL: js.UndefOr[java.lang.String] = js.undefined
}

object SourceMapOption {
  @scala.inline
  def apply(
    outputSourceFiles: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapBasepath: java.lang.String = null,
    sourceMapFileInline: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapRootpath: java.lang.String = null,
    sourceMapURL: java.lang.String = null
  ): SourceMapOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputSourceFiles)) __obj.updateDynamic("outputSourceFiles")(outputSourceFiles)
    if (sourceMapBasepath != null) __obj.updateDynamic("sourceMapBasepath")(sourceMapBasepath)
    if (!js.isUndefined(sourceMapFileInline)) __obj.updateDynamic("sourceMapFileInline")(sourceMapFileInline)
    if (sourceMapRootpath != null) __obj.updateDynamic("sourceMapRootpath")(sourceMapRootpath)
    if (sourceMapURL != null) __obj.updateDynamic("sourceMapURL")(sourceMapURL)
    __obj.asInstanceOf[SourceMapOption]
  }
}

