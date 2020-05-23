package typings.hapiJoi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description
  extends /* key */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var example: js.UndefOr[js.Array[_]] = js.undefined
  var flags: js.UndefOr[js.Object] = js.undefined
  var invalids: js.UndefOr[js.Array[_]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[js.Array[_]] = js.undefined
  var notes: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[ValidationOptions] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[Types | String] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var valids: js.UndefOr[js.Array[_]] = js.undefined
}

object Description {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null,
    example: js.Array[_] = null,
    flags: js.Object = null,
    invalids: js.Array[_] = null,
    label: String = null,
    meta: js.Array[_] = null,
    notes: js.Array[String] = null,
    options: ValidationOptions = null,
    tags: js.Array[String] = null,
    `type`: Types | String = null,
    unit: String = null,
    valids: js.Array[_] = null
  ): Description = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (invalids != null) __obj.updateDynamic("invalids")(invalids.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (valids != null) __obj.updateDynamic("valids")(valids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

