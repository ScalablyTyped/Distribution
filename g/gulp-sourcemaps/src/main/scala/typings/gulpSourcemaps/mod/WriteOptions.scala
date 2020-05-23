package typings.gulpSourcemaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var addComment: js.UndefOr[Boolean] = js.undefined
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[Boolean | CloneOptions] = js.undefined
  var includeContent: js.UndefOr[Boolean] = js.undefined
  var sourceMappingURLPrefix: js.UndefOr[String | WriteMapper] = js.undefined
  var sourceRoot: js.UndefOr[String | WriteMapper] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    addComment: js.UndefOr[Boolean] = js.undefined,
    clone: Boolean | CloneOptions = null,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    sourceMappingURLPrefix: String | WriteMapper = null,
    sourceRoot: String | WriteMapper = null
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addComment)) __obj.updateDynamic("addComment")(addComment.get.asInstanceOf[js.Any])
    if (clone != null) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.get.asInstanceOf[js.Any])
    if (sourceMappingURLPrefix != null) __obj.updateDynamic("sourceMappingURLPrefix")(sourceMappingURLPrefix.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

