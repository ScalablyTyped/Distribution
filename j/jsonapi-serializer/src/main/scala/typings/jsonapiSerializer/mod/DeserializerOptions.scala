package typings.jsonapiSerializer.mod

import typings.jsonapiSerializer.jsonapiSerializerStrings.CamelCase
import typings.jsonapiSerializer.jsonapiSerializerStrings.`dash-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`kebab-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`lisp-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`spinal-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.camelCase_
import typings.jsonapiSerializer.jsonapiSerializerStrings.snake_case
import typings.jsonapiSerializer.jsonapiSerializerStrings.underscore_case
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[String] = js.native
  var keyForAttribute: js.UndefOr[
    `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
  ] = js.native
  var pluralizeType: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[Transform] = js.native
  var typeAsAttribute: js.UndefOr[Boolean] = js.native
}

object DeserializerOptions {
  @scala.inline
  def apply(): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializerOptions]
  }
  @scala.inline
  implicit class DeserializerOptionsOps[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = this.set("keyForAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyForAttribute(
      value: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
    ): Self = this.set("keyForAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyForAttribute: Self = this.set("keyForAttribute", js.undefined)
    @scala.inline
    def setPluralizeType(value: Boolean): Self = this.set("pluralizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluralizeType: Self = this.set("pluralizeType", js.undefined)
    @scala.inline
    def setTransform(value: /* record */ js.Any => js.Any): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTypeAsAttribute(value: Boolean): Self = this.set("typeAsAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAsAttribute: Self = this.set("typeAsAttribute", js.undefined)
  }
  
}

