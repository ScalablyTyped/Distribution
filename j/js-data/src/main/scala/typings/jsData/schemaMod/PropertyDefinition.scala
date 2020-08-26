package typings.jsData.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyDefinition extends js.Object {
  var additionalProperties: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  var `extends`: js.UndefOr[Schema] = js.native
  var get: js.UndefOr[js.Function] = js.native
  var indexed: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[PropertyDefinition] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[StringDictionary[PropertyDefinition]] = js.native
  var required: js.UndefOr[js.Array[String] | Boolean] = js.native
  var track: js.UndefOr[Boolean] = js.native
  var `type`: String | js.Array[String] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object PropertyDefinition {
  @scala.inline
  def apply(`type`: String | js.Array[String]): PropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDefinition]
  }
  @scala.inline
  implicit class PropertyDefinitionOps[Self <: PropertyDefinition] (val x: Self) extends AnyVal {
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
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setExtends(value: Schema): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setGet(value: js.Function): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setIndexed(value: Boolean): Self = this.set("indexed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    @scala.inline
    def setItems(value: PropertyDefinition): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[PropertyDefinition]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String] | Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
  
}

