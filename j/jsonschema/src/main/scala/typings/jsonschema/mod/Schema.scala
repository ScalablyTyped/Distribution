package typings.jsonschema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema extends js.Object {
  
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  
  var additionalItems: js.UndefOr[Boolean | Schema] = js.native
  
  var additionalProperties: js.UndefOr[Boolean | Schema] = js.native
  
  var allOf: js.UndefOr[js.Array[Schema]] = js.native
  
  var anyOf: js.UndefOr[js.Array[Schema]] = js.native
  
  var const: js.UndefOr[js.Any] = js.native
  
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.native
  
  var dependencies: js.UndefOr[StringDictionary[Schema | js.Array[String]]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var `else`: js.UndefOr[Schema] = js.native
  
  var enum: js.UndefOr[js.Array[_]] = js.native
  
  var exclusiveMaximum: js.UndefOr[Double | Boolean] = js.native
  
  var exclusiveMinimum: js.UndefOr[Double | Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `if`: js.UndefOr[Schema] = js.native
  
  var items: js.UndefOr[Schema | js.Array[Schema]] = js.native
  
  var maxItems: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var maxProperties: js.UndefOr[Double] = js.native
  
  var maximum: js.UndefOr[Double] = js.native
  
  var minItems: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var minProperties: js.UndefOr[Double] = js.native
  
  var minimum: js.UndefOr[Double] = js.native
  
  var multipleOf: js.UndefOr[Double] = js.native
  
  var not: js.UndefOr[Schema] = js.native
  
  var oneOf: js.UndefOr[js.Array[Schema]] = js.native
  
  var pattern: js.UndefOr[String | RegExp] = js.native
  
  var patternProperties: js.UndefOr[StringDictionary[Schema]] = js.native
  
  var properties: js.UndefOr[StringDictionary[Schema]] = js.native
  
  var required: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  var `then`: js.UndefOr[Schema] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var uniqueItems: js.UndefOr[Boolean] = js.native
}
object Schema {
  
  @scala.inline
  def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    
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
    def set$id(value: String): Self = this.set("$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$id: Self = this.set("$id", js.undefined)
    
    @scala.inline
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    
    @scala.inline
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    
    @scala.inline
    def setAdditionalItems(value: Boolean | Schema): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: Boolean | Schema): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: Schema*): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(value: js.Array[Schema]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: Schema*): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[Schema]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    
    @scala.inline
    def setConst(value: js.Any): Self = this.set("const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConst: Self = this.set("const", js.undefined)
    
    @scala.inline
    def setDefinitions(value: StringDictionary[Schema]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[Schema | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setElse(value: Schema): Self = this.set("else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setExclusiveMaximum(value: Double | Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Double | Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIf(value: Schema): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Schema*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: Schema | js.Array[Schema]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxProperties(value: Double): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProperties: Self = this.set("maxProperties", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinProperties(value: Double): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProperties: Self = this.set("minProperties", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMultipleOf(value: Double): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleOf: Self = this.set("multipleOf", js.undefined)
    
    @scala.inline
    def setNot(value: Schema): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: Schema*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: js.Array[Schema]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    
    @scala.inline
    def setPattern(value: String | RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternProperties(value: StringDictionary[Schema]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[Schema]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String] | Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setThen(value: Schema): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
}
