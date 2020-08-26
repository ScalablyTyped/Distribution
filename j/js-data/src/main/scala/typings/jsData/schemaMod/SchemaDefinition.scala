package typings.jsData.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinition extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var additionalProperties: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var `extends`: js.UndefOr[SchemaDefinition | Schema] = js.native
  var items: js.UndefOr[SchemaDefinition | Schema] = js.native
  var properties: js.UndefOr[StringDictionary[PropertyDefinition | js.Any]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var track: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDefinition {
  @scala.inline
  def apply(): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefinition]
  }
  @scala.inline
  implicit class SchemaDefinitionOps[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
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
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: js.Any): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtends(value: SchemaDefinition | Schema): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setItems(value: SchemaDefinition | Schema): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[PropertyDefinition | js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

