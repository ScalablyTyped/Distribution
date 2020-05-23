package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPreset extends Options {
  var preset: Preset
}

object CustomPreset {
  @scala.inline
  def apply(
    preset: Preset,
    compareAttributesAsJSON: js.Array[_] = null,
    ignoreAttributes: js.Array[String] = null,
    ignoreComments: js.UndefOr[Boolean] = js.undefined,
    ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.undefined,
    ignoreEndTags: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespaces: js.UndefOr[Boolean] = js.undefined
  ): CustomPreset = {
    val __obj = js.Dynamic.literal(preset = preset.asInstanceOf[js.Any])
    if (compareAttributesAsJSON != null) __obj.updateDynamic("compareAttributesAsJSON")(compareAttributesAsJSON.asInstanceOf[js.Any])
    if (ignoreAttributes != null) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComments)) __obj.updateDynamic("ignoreComments")(ignoreComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDuplicateAttributes)) __obj.updateDynamic("ignoreDuplicateAttributes")(ignoreDuplicateAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEndTags)) __obj.updateDynamic("ignoreEndTags")(ignoreEndTags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespaces)) __obj.updateDynamic("ignoreWhitespaces")(ignoreWhitespaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreset]
  }
}

