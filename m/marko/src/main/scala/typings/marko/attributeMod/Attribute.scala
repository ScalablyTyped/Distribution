package typings.marko.attributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var allowExpressions: Boolean
  var autocomplete: Boolean
  var defaultValue: String
  var deprecated: js.Any
  var dynamicAttribute: Boolean
  var enum: js.Any
  var filePath: String
  var html: Boolean
  var ignore: Boolean
  var key: String
  var name: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[js.Any] = js.undefined
  var preserveName: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var removeDashes: Boolean
  var required: Boolean
  var setContextFlag: String
  var setFlag: String | Null
  var targetProperty: String | Null
  var `type`: String | Null
}

object Attribute {
  @scala.inline
  def apply(
    allowExpressions: Boolean,
    autocomplete: Boolean,
    defaultValue: String,
    deprecated: js.Any,
    dynamicAttribute: Boolean,
    enum: js.Any,
    filePath: String,
    html: Boolean,
    ignore: Boolean,
    key: String,
    removeDashes: Boolean,
    required: Boolean,
    setContextFlag: String,
    name: String = null,
    pattern: js.Any = null,
    preserveName: String = null,
    ref: String = null,
    setFlag: String = null,
    targetProperty: String = null,
    `type`: String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(allowExpressions = allowExpressions.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], dynamicAttribute = dynamicAttribute.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], removeDashes = removeDashes.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setContextFlag = setContextFlag.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (preserveName != null) __obj.updateDynamic("preserveName")(preserveName.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (setFlag != null) __obj.updateDynamic("setFlag")(setFlag.asInstanceOf[js.Any])
    if (targetProperty != null) __obj.updateDynamic("targetProperty")(targetProperty.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

