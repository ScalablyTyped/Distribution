package typings.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownToDraftOptions extends js.Object {
  var blockEntities: js.UndefOr[BlockEntitiesParam] = js.undefined
  var blockStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  var blockTypes: js.UndefOr[BlockTypesParam] = js.undefined
  var remarkableOptions: js.UndefOr[StringDictionary[Boolean | js.Object]] = js.undefined
  var remarkablePlugins: js.UndefOr[js.Array[_]] = js.undefined
  var remarkablePreset: js.UndefOr[String] = js.undefined
}

object MarkdownToDraftOptions {
  @scala.inline
  def apply(
    blockEntities: BlockEntitiesParam = null,
    blockStyles: StringDictionary[String] = null,
    blockTypes: BlockTypesParam = null,
    remarkableOptions: StringDictionary[Boolean | js.Object] = null,
    remarkablePlugins: js.Array[_] = null,
    remarkablePreset: String = null
  ): MarkdownToDraftOptions = {
    val __obj = js.Dynamic.literal()
    if (blockEntities != null) __obj.updateDynamic("blockEntities")(blockEntities.asInstanceOf[js.Any])
    if (blockStyles != null) __obj.updateDynamic("blockStyles")(blockStyles.asInstanceOf[js.Any])
    if (blockTypes != null) __obj.updateDynamic("blockTypes")(blockTypes.asInstanceOf[js.Any])
    if (remarkableOptions != null) __obj.updateDynamic("remarkableOptions")(remarkableOptions.asInstanceOf[js.Any])
    if (remarkablePlugins != null) __obj.updateDynamic("remarkablePlugins")(remarkablePlugins.asInstanceOf[js.Any])
    if (remarkablePreset != null) __obj.updateDynamic("remarkablePreset")(remarkablePreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownToDraftOptions]
  }
}

