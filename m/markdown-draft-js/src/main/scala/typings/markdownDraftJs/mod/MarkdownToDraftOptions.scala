package typings.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownToDraftOptions extends js.Object {
  var blockEntities: js.UndefOr[BlockEntitiesParam] = js.native
  var blockStyles: js.UndefOr[StringDictionary[String]] = js.native
  var blockTypes: js.UndefOr[BlockTypesParam] = js.native
  var remarkableOptions: js.UndefOr[StringDictionary[Boolean | js.Object]] = js.native
  var remarkablePlugins: js.UndefOr[js.Array[_]] = js.native
  var remarkablePreset: js.UndefOr[String] = js.native
}

object MarkdownToDraftOptions {
  @scala.inline
  def apply(): MarkdownToDraftOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownToDraftOptions]
  }
  @scala.inline
  implicit class MarkdownToDraftOptionsOps[Self <: MarkdownToDraftOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockEntities(value: BlockEntitiesParam): Self = this.set("blockEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockEntities: Self = this.set("blockEntities", js.undefined)
    @scala.inline
    def setBlockStyles(value: StringDictionary[String]): Self = this.set("blockStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockStyles: Self = this.set("blockStyles", js.undefined)
    @scala.inline
    def setBlockTypes(value: BlockTypesParam): Self = this.set("blockTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockTypes: Self = this.set("blockTypes", js.undefined)
    @scala.inline
    def setRemarkableOptions(value: StringDictionary[Boolean | js.Object]): Self = this.set("remarkableOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarkableOptions: Self = this.set("remarkableOptions", js.undefined)
    @scala.inline
    def setRemarkablePluginsVarargs(value: js.Any*): Self = this.set("remarkablePlugins", js.Array(value :_*))
    @scala.inline
    def setRemarkablePlugins(value: js.Array[_]): Self = this.set("remarkablePlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarkablePlugins: Self = this.set("remarkablePlugins", js.undefined)
    @scala.inline
    def setRemarkablePreset(value: String): Self = this.set("remarkablePreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarkablePreset: Self = this.set("remarkablePreset", js.undefined)
  }
  
}

