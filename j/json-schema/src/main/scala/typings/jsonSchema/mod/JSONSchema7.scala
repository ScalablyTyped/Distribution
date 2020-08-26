package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema7 extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema7Version] = js.native
  var additionalItems: js.UndefOr[JSONSchema7Definition] = js.native
  var additionalProperties: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.7
    */
  var allOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var const: js.UndefOr[JSONSchema7Type] = js.native
  var contains: js.UndefOr[JSONSchema7] = js.native
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[String] = js.native
  var default: js.UndefOr[JSONSchema7Type] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchema7Definition | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  var `else`: js.UndefOr[JSONSchema7Definition] = js.native
  var enum: js.UndefOr[js.Array[JSONSchema7Type]] = js.native
  var examples: js.UndefOr[JSONSchema7Type] = js.native
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchema7Definition | js.Array[JSONSchema7Definition]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchema7Definition] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var properties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var propertyNames: js.UndefOr[JSONSchema7Definition] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var `then`: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchema7TypeName | js.Array[JSONSchema7TypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
  var writeOnly: js.UndefOr[Boolean] = js.native
}

object JSONSchema7 {
  @scala.inline
  def apply(): JSONSchema7 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema7]
  }
  @scala.inline
  implicit class JSONSchema7Ops[Self <: JSONSchema7] (val x: Self) extends AnyVal {
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
    def set$comment(value: String): Self = this.set("$comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$comment: Self = this.set("$comment", js.undefined)
    @scala.inline
    def set$id(value: String): Self = this.set("$id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$id: Self = this.set("$id", js.undefined)
    @scala.inline
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def set$schema(value: JSONSchema7Version): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalItems(value: JSONSchema7Definition): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: JSONSchema7Definition): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAllOfVarargs(value: JSONSchema7Definition*): Self = this.set("allOf", js.Array(value :_*))
    @scala.inline
    def setAllOf(value: js.Array[JSONSchema7Definition]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    @scala.inline
    def setAnyOfVarargs(value: JSONSchema7Definition*): Self = this.set("anyOf", js.Array(value :_*))
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchema7Definition]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    @scala.inline
    def setConst(value: JSONSchema7Type): Self = this.set("const", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConst: Self = this.set("const", js.undefined)
    @scala.inline
    def setConstNull: Self = this.set("const", null)
    @scala.inline
    def setContains(value: JSONSchema7): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setContentMediaType(value: String): Self = this.set("contentMediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMediaType: Self = this.set("contentMediaType", js.undefined)
    @scala.inline
    def setDefault(value: JSONSchema7Type): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchema7Definition]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDependencies(value: StringDictionary[JSONSchema7Definition | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setElse(value: JSONSchema7Definition): Self = this.set("else", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    @scala.inline
    def setEnumVarargs(value: JSONSchema7Type*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[JSONSchema7Type]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExamples(value: JSONSchema7Type): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setExamplesNull: Self = this.set("examples", null)
    @scala.inline
    def setExclusiveMaximum(value: Double): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Double): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIf(value: JSONSchema7Definition): Self = this.set("if", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    @scala.inline
    def setItemsVarargs(value: JSONSchema7Definition*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: JSONSchema7Definition | js.Array[JSONSchema7Definition]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    def setNot(value: JSONSchema7Definition): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOneOfVarargs(value: JSONSchema7Definition*): Self = this.set("oneOf", js.Array(value :_*))
    @scala.inline
    def setOneOf(value: js.Array[JSONSchema7Definition]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchema7Definition]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchema7Definition]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setPropertyNames(value: JSONSchema7Definition): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyNames: Self = this.set("propertyNames", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setThen(value: JSONSchema7Definition): Self = this.set("then", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTypeVarargs(value: JSONSchema7TypeName*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: JSONSchema7TypeName | js.Array[JSONSchema7TypeName]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
    @scala.inline
    def setWriteOnly(value: Boolean): Self = this.set("writeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteOnly: Self = this.set("writeOnly", js.undefined)
  }
  
}

