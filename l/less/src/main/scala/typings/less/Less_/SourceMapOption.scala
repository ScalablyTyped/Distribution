package typings.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOption extends js.Object {
  var outputSourceFiles: js.UndefOr[Boolean] = js.undefined
  var sourceMapBasepath: js.UndefOr[String] = js.undefined
  var sourceMapFileInline: js.UndefOr[Boolean] = js.undefined
  var sourceMapRootpath: js.UndefOr[String] = js.undefined
  var sourceMapURL: js.UndefOr[String] = js.undefined
}

object SourceMapOption {
  @scala.inline
  def apply(
    outputSourceFiles: js.UndefOr[Boolean] = js.undefined,
    sourceMapBasepath: String = null,
    sourceMapFileInline: js.UndefOr[Boolean] = js.undefined,
    sourceMapRootpath: String = null,
    sourceMapURL: String = null
  ): SourceMapOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputSourceFiles)) __obj.updateDynamic("outputSourceFiles")(outputSourceFiles.asInstanceOf[js.Any])
    if (sourceMapBasepath != null) __obj.updateDynamic("sourceMapBasepath")(sourceMapBasepath.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapFileInline)) __obj.updateDynamic("sourceMapFileInline")(sourceMapFileInline.asInstanceOf[js.Any])
    if (sourceMapRootpath != null) __obj.updateDynamic("sourceMapRootpath")(sourceMapRootpath.asInstanceOf[js.Any])
    if (sourceMapURL != null) __obj.updateDynamic("sourceMapURL")(sourceMapURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOption]
  }
}

