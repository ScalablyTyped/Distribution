package typings
package gulpDashSourcemapsLib.gulpDashSourcemapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var addComment: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[scala.Boolean | CloneOptions] = js.undefined
  var includeContent: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMappingURLPrefix: js.UndefOr[java.lang.String | WriteMapper] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String | WriteMapper] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    addComment: js.UndefOr[scala.Boolean] = js.undefined,
    clone: scala.Boolean | CloneOptions = null,
    includeContent: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMappingURLPrefix: java.lang.String | WriteMapper = null,
    sourceRoot: java.lang.String | WriteMapper = null
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addComment)) __obj.updateDynamic("addComment")(addComment)
    if (clone != null) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent)
    if (sourceMappingURLPrefix != null) __obj.updateDynamic("sourceMappingURLPrefix")(sourceMappingURLPrefix.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

