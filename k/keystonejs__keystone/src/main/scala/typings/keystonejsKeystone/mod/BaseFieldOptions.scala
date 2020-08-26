package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFieldOptions
  extends AllFieldsOptions[js.Any] {
  var access: js.UndefOr[Access] = js.native
  var defaultValue: js.UndefOr[Boolean | DefaultValueFunction] = js.native
  var hooks: js.UndefOr[Hooks] = js.native
  var isRequired: js.UndefOr[Boolean] = js.native
  var isUnique: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var schemaDoc: js.UndefOr[String] = js.native
  var `type`: FieldType = js.native
}

object BaseFieldOptions {
  @scala.inline
  def apply(`type`: FieldType): BaseFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldOptions]
  }
  @scala.inline
  implicit class BaseFieldOptionsOps[Self <: BaseFieldOptions] (val x: Self) extends AnyVal {
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
    def setType(value: FieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("access", js.Any.fromFunction1(value))
    @scala.inline
    def setAccess(value: Access): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setDefaultValueFunction0(value: () => js.Any): Self = this.set("defaultValue", js.Any.fromFunction0(value))
    @scala.inline
    def setDefaultValue(value: Boolean | DefaultValueFunction): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setHooks(value: Hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    @scala.inline
    def setIsUnique(value: Boolean): Self = this.set("isUnique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUnique: Self = this.set("isUnique", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSchemaDoc(value: String): Self = this.set("schemaDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDoc: Self = this.set("schemaDoc", js.undefined)
  }
  
}

