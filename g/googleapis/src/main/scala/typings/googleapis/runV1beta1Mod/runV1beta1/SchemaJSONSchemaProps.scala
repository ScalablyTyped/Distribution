package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJSONSchemaProps extends StObject {
  
  var default: js.UndefOr[SchemaJSON] = js.undefined
  
  var additionalItems: js.UndefOr[SchemaJSONSchemaPropsOrBool] = js.undefined
  
  var additionalProperties: js.UndefOr[SchemaJSONSchemaPropsOrBool] = js.undefined
  
  var allOf: js.UndefOr[js.Array[SchemaJSONSchemaProps]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[SchemaJSONSchemaProps]] = js.undefined
  
  var definitions: js.UndefOr[StringDictionary[SchemaJSONSchemaProps] | Null] = js.undefined
  
  var dependencies: js.UndefOr[StringDictionary[SchemaJSONSchemaPropsOrStringArray] | Null] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var example: js.UndefOr[SchemaJSON] = js.undefined
  
  var exclusiveMaximum: js.UndefOr[Boolean | Null] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[Boolean | Null] = js.undefined
  
  var externalDocs: js.UndefOr[SchemaExternalDocumentation] = js.undefined
  
  var format: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var items: js.UndefOr[SchemaJSONSchemaPropsOrArray] = js.undefined
  
  var maxItems: js.UndefOr[String | Null] = js.undefined
  
  var maxLength: js.UndefOr[String | Null] = js.undefined
  
  var maxProperties: js.UndefOr[String | Null] = js.undefined
  
  var maximum: js.UndefOr[Double | Null] = js.undefined
  
  var minItems: js.UndefOr[String | Null] = js.undefined
  
  var minLength: js.UndefOr[String | Null] = js.undefined
  
  var minProperties: js.UndefOr[String | Null] = js.undefined
  
  var minimum: js.UndefOr[Double | Null] = js.undefined
  
  var multipleOf: js.UndefOr[Double | Null] = js.undefined
  
  var not: js.UndefOr[SchemaJSONSchemaProps] = js.undefined
  
  var oneOf: js.UndefOr[js.Array[SchemaJSONSchemaProps]] = js.undefined
  
  var pattern: js.UndefOr[String | Null] = js.undefined
  
  var patternProperties: js.UndefOr[StringDictionary[SchemaJSONSchemaProps] | Null] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[SchemaJSONSchemaProps] | Null] = js.undefined
  
  var ref: js.UndefOr[String | Null] = js.undefined
  
  var required: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var schema: js.UndefOr[String | Null] = js.undefined
  
  var title: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  var uniqueItems: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaJSONSchemaProps {
  
  inline def apply(): SchemaJSONSchemaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJSONSchemaProps]
  }
  
  extension [Self <: SchemaJSONSchemaProps](x: Self) {
    
    inline def setAdditionalItems(value: SchemaJSONSchemaPropsOrBool): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
    
    inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
    
    inline def setAdditionalProperties(value: SchemaJSONSchemaPropsOrBool): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setAllOf(value: js.Array[SchemaJSONSchemaProps]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    inline def setAllOfVarargs(value: SchemaJSONSchemaProps*): Self = StObject.set(x, "allOf", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[SchemaJSONSchemaProps]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: SchemaJSONSchemaProps*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setDefault(value: SchemaJSON): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefinitions(value: StringDictionary[SchemaJSONSchemaProps]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsNull: Self = StObject.set(x, "definitions", null)
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDependencies(value: StringDictionary[SchemaJSONSchemaPropsOrStringArray]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumNull: Self = StObject.set(x, "enum", null)
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setExample(value: SchemaJSON): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumNull: Self = StObject.set(x, "exclusiveMaximum", null)
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumNull: Self = StObject.set(x, "exclusiveMinimum", null)
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    inline def setExternalDocs(value: SchemaExternalDocumentation): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: SchemaJSONSchemaPropsOrArray): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsNull: Self = StObject.set(x, "maxItems", null)
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxProperties(value: String): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesNull: Self = StObject.set(x, "maxProperties", null)
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinItems(value: String): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsNull: Self = StObject.set(x, "minItems", null)
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setMinLength(value: String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthNull: Self = StObject.set(x, "minLength", null)
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinProperties(value: String): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesNull: Self = StObject.set(x, "minProperties", null)
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfNull: Self = StObject.set(x, "multipleOf", null)
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    inline def setNot(value: SchemaJSONSchemaProps): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOneOf(value: js.Array[SchemaJSONSchemaProps]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: SchemaJSONSchemaProps*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternProperties(value: StringDictionary[SchemaJSONSchemaProps]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    inline def setPatternPropertiesNull: Self = StObject.set(x, "patternProperties", null)
    
    inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setProperties(value: StringDictionary[SchemaJSONSchemaProps]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsNull: Self = StObject.set(x, "uniqueItems", null)
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
