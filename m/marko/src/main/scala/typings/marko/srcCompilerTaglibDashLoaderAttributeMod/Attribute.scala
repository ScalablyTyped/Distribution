package typings.marko.srcCompilerTaglibDashLoaderAttributeMod

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
    val __obj = js.Dynamic.literal(allowExpressions = allowExpressions, autocomplete = autocomplete, defaultValue = defaultValue, deprecated = deprecated, dynamicAttribute = dynamicAttribute, enum = enum, filePath = filePath, html = html, ignore = ignore, key = key, removeDashes = removeDashes, required = required, setContextFlag = setContextFlag)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (preserveName != null) __obj.updateDynamic("preserveName")(preserveName)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (setFlag != null) __obj.updateDynamic("setFlag")(setFlag)
    if (targetProperty != null) __obj.updateDynamic("targetProperty")(targetProperty)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Attribute]
  }
}

