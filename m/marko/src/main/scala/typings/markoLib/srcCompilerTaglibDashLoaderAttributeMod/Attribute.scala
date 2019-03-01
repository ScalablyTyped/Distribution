package typings
package markoLib.srcCompilerTaglibDashLoaderAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var allowExpressions: scala.Boolean
  var autocomplete: scala.Boolean
  var defaultValue: java.lang.String
  var deprecated: js.Any
  var dynamicAttribute: scala.Boolean
  var enum: js.Any
  var filePath: java.lang.String
  var html: scala.Boolean
  var ignore: scala.Boolean
  var key: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pattern: js.UndefOr[js.Any] = js.undefined
  var preserveName: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var removeDashes: scala.Boolean
  var required: scala.Boolean
  var setContextFlag: java.lang.String
  var setFlag: java.lang.String | scala.Null
  var targetProperty: java.lang.String | scala.Null
  var `type`: java.lang.String | scala.Null
}

object Attribute {
  @scala.inline
  def apply(
    allowExpressions: scala.Boolean,
    autocomplete: scala.Boolean,
    defaultValue: java.lang.String,
    deprecated: js.Any,
    dynamicAttribute: scala.Boolean,
    enum: js.Any,
    filePath: java.lang.String,
    html: scala.Boolean,
    ignore: scala.Boolean,
    key: java.lang.String,
    removeDashes: scala.Boolean,
    required: scala.Boolean,
    setContextFlag: java.lang.String,
    name: java.lang.String = null,
    pattern: js.Any = null,
    preserveName: java.lang.String = null,
    ref: java.lang.String = null,
    setFlag: java.lang.String = null,
    targetProperty: java.lang.String = null,
    `type`: java.lang.String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowExpressions")(allowExpressions)
    __obj.updateDynamic("autocomplete")(autocomplete)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("deprecated")(deprecated)
    __obj.updateDynamic("dynamicAttribute")(dynamicAttribute)
    __obj.updateDynamic("enum")(enum)
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("ignore")(ignore)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("removeDashes")(removeDashes)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("setContextFlag")(setContextFlag)
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

