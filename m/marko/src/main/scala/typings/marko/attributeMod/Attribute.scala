package typings.marko.attributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  var allowExpressions: Boolean = js.native
  var autocomplete: Boolean = js.native
  var defaultValue: String = js.native
  var deprecated: js.Any = js.native
  var dynamicAttribute: Boolean = js.native
  var enum: js.Any = js.native
  var filePath: String = js.native
  var html: Boolean = js.native
  var ignore: Boolean = js.native
  var key: String = js.native
  var name: js.UndefOr[String] = js.native
  var pattern: js.UndefOr[js.Any] = js.native
  var preserveName: js.UndefOr[String] = js.native
  var ref: js.UndefOr[String] = js.native
  var removeDashes: Boolean = js.native
  var required: Boolean = js.native
  var setContextFlag: String = js.native
  var setFlag: String | Null = js.native
  var targetProperty: String | Null = js.native
  var `type`: String | Null = js.native
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
    setContextFlag: String
  ): Attribute = {
    val __obj = js.Dynamic.literal(allowExpressions = allowExpressions.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], dynamicAttribute = dynamicAttribute.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], removeDashes = removeDashes.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setContextFlag = setContextFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
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
    def setAllowExpressions(value: Boolean): Self = this.set("allowExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecated(value: js.Any): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicAttribute(value: Boolean): Self = this.set("dynamicAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnum(value: js.Any): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveDashes(value: Boolean): Self = this.set("removeDashes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetContextFlag(value: String): Self = this.set("setContextFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPattern(value: js.Any): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPreserveName(value: String): Self = this.set("preserveName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveName: Self = this.set("preserveName", js.undefined)
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setSetFlag(value: String): Self = this.set("setFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFlagNull: Self = this.set("setFlag", null)
    @scala.inline
    def setTargetProperty(value: String): Self = this.set("targetProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPropertyNull: Self = this.set("targetProperty", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

