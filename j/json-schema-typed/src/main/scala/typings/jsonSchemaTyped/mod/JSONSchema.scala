package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`date-time`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`full-date`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`full-time`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`idn-email`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`idn-hostname`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`iri-reference`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`json-pointer-uri-fragment`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`json-pointer`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`relative-json-pointer`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`uri-reference`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.`uri-template`
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.date
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.email
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.hostname
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.ipv4
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.ipv6
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.iri
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.regex
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.time
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.uri
import typings.jsonSchemaTyped.jsonSchemaTypedStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONSchema extends js.Object {
  
  /**
    * This keyword is reserved for comments from schema authors to readers or
    * maintainers of the schema. The value of this keyword MUST be a string.
    * Implementations MUST NOT present this string to end users. Tools for
    * editing schemas SHOULD support displaying and editing this keyword.
    *
    * The value of this keyword MAY be used in debug or error output which is
    * intended for developers making use of schemas. Schema vocabularies SHOULD
    * allow "$comment" within any object containing vocabulary keywords.
    *
    * Implementations MAY assume "$comment" is allowed unless the vocabulary
    * specifically forbids it. Vocabularies MUST NOT specify any effect of
    * "$comment" beyond what is described in this specification. Tools that
    * translate other media types or programming languages to and from
    * application/schema+json MAY choose to convert that media type or
    * programming language's native comments to or from "$comment" values.
    *
    * The behavior of such translation when both native comments and "$comment"
    * properties are present is implementation-dependent. Implementations SHOULD
    * treat "$comment" identically to an unknown extension keyword.
    *
    * They MAY strip "$comment" values at any point during processing. In
    * particular, this allows for shortening schemas when the size of deployed
    * schemas is a concern. Implementations MUST NOT take any other action based
    * on the presence, absence, or contents of "$comment" properties.
    */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  
  /**
    * The "$id" keyword defines a URI for the schema, and the base URI that other
    * URI references within the schema are resolved against. A subschema's "$id"
    * is resolved against the base URI of its parent schema. If no parent sets an
    * explicit base with "$id", the base URI is that of the entire document, as
    * determined per [RFC 3986 section 5][RFC3986].
    *
    * If present, the value for this keyword MUST be a string, and MUST represent
    * a valid [URI-reference][RFC3986]. This value SHOULD be normalized, and
    * SHOULD NOT be an empty fragment <#> or an empty string <>.
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-core.html#RFC3986
    */
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  
  /**
    * The "$ref" keyword is used to reference a schema, and provides the ability
    * to validate recursive structures through self-reference.
    *
    * An object schema with a "$ref" property MUST be interpreted as a "$ref"
    * reference. The value of the "$ref" property MUST be a URI Reference.
    * Resolved against the current URI base, it identifies the URI of a schema to
    * use. All other properties in a "$ref" object MUST be ignored.
    *
    * The URI is not a network locator, only an identifier. A schema need not be
    * downloadable from the address if it is a network-addressable URL, and
    * implementations SHOULD NOT assume they should perform a network operation
    * when they encounter a network-addressable URI.
    *
    * A schema MUST NOT be run into an infinite loop against a schema. For
    * example, if two schemas "#alice" and "#bob" both have an "allOf" property
    * that refers to the other, a naive validator might get stuck in an infinite
    * recursive loop trying to validate the instance. Schemas SHOULD NOT make use
    * of infinite recursive nesting like this; the behavior is undefined.
    */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  /**
    * The "$schema" keyword is both used as a JSON Schema version identifier and
    * the location of a resource which is itself a JSON Schema, which describes
    * any schema written for this particular version.
    *
    * The value of this keyword MUST be a [URI][RFC3986] (containing a scheme)
    * and this URI MUST be normalized. The current schema MUST be valid against
    * the meta-schema identified by this URI.
    *
    * If this URI identifies a retrievable resource, that resource SHOULD be of
    * media type "application/schema+json".
    *
    * The "$schema" keyword SHOULD be used in a root schema. It MUST NOT appear
    * in subschemas.
    *
    * Values for this property are defined in other documents and by other
    * parties. JSON Schema implementations SHOULD implement support for current
    * and previous published drafts of JSON Schema vocabularies as deemed
    * reasonable.
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-core.html#RFC3986
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  
  /**
    * The value of "additionalItems" MUST be a valid JSON Schema.
    *
    * This keyword determines how child instances validate for arrays, and does
    * not directly validate the immediate instance itself.
    *
    * If "items" is an array of schemas, validation succeeds if every instance
    * element at a position greater than the size of "items" validates against
    * "additionalItems".
    *
    * Otherwise, "additionalItems" MUST be ignored, as the "items" schema
    * (possibly the default value of an empty schema) is applied to all elements.
    *
    * Omitting this keyword has the same behavior as an empty schema.
    */
  var additionalItems: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * The value of "additionalProperties" MUST be a valid JSON Schema.
    *
    * This keyword determines how child instances validate for objects, and does
    * not directly validate the immediate instance itself.
    *
    * Validation with "additionalProperties" applies only to the child values of
    * instance names that do not match any names in "properties", and do not
    * match any regular expression in "patternProperties".
    *
    * For all such properties, validation succeeds if the child instance
    * validates against the "additionalProperties" schema.
    *
    * Omitting this keyword has the same behavior as an empty schema.
    */
  var additionalProperties: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * This keyword's value MUST be a non-empty array. Each item of the array MUST
    * be a valid JSON Schema.
    *
    * An instance validates successfully against this keyword if it validates
    * successfully against all schemas defined by this keyword's value.
    */
  var allOf: js.UndefOr[js.Array[JSONSchema | Boolean]] = js.native
  
  /**
    * This keyword's value MUST be a non-empty array. Each item of the array MUST
    * be a valid JSON Schema.
    *
    * An instance validates successfully against this keyword if it validates
    * successfully against at least one schema defined by this keyword's value.
    */
  var anyOf: js.UndefOr[js.Array[JSONSchema | Boolean]] = js.native
  
  /**
    * The value of this keyword MAY be of any type, including null.
    *
    * An instance validates successfully against this keyword if its value is
    * equal to the value of the keyword.
    */
  var const: js.UndefOr[js.Any] = js.native
  
  /**
    * The value of this keyword MUST be a valid JSON Schema.
    *
    * An array instance is valid against "contains" if at least one of its
    * elements is valid against the given schema.
    */
  var contains: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * If the instance value is a string, this property defines that the string
    * SHOULD be interpreted as binary data and decoded using the encoding named
    * by this property. [RFC 2045, Sec 6.1][RFC2045] lists the possible values for
    * this property.
    *
    * The value of this property SHOULD be ignored if the instance described is
    * not a string.
    *
    * [RFC2045]: https://tools.ietf.org/html/rfc2045#section-6.1
    */
  var contentEncoding: js.UndefOr[JSONSchemaContentEncodingName | JSONSchemaContentEncoding] = js.native
  
  /**
    * The value of this property must be a media type, as defined by
    * [RFC 2046][RFC2046]. This property defines the media type of instances
    * which this schema defines.
    *
    * The value of this property SHOULD be ignored if the instance described is
    * not a string.
    *
    * If the "contentEncoding" property is not present, but the instance value is
    * a string, then the value of this property SHOULD specify a text document
    * type, and the character set SHOULD be the character set into which the
    * JSON string value was decoded (for which the default is Unicode).
    *
    * [RFC2046]: https://tools.ietf.org/html/rfc2046
    */
  var contentMediaType: js.UndefOr[String] = js.native
  
  /**
    * There are no restrictions placed on the value of this keyword. When
    * multiple occurrences of this keyword are applicable to a single
    * sub-instance, implementations SHOULD remove duplicates.
    *
    * This keyword can be used to supply a default JSON value associated with a
    * particular schema. It is RECOMMENDED that a default value be valid against
    * the associated schema.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * The "definitions" keywords provides a standardized location for schema
    * authors to inline re-usable JSON Schemas into a more general schema. The
    * keyword does not directly affect the validation result.
    *
    * This keyword's value MUST be an object. Each member value of this object
    * MUST be a valid JSON Schema.
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema | Boolean]] = js.native
  
  /**
    * This keyword specifies rules that are evaluated if the instance is an
    * object and contains a certain property.
    *
    * This keyword's value MUST be an object. Each property specifies a
    * dependency. Each dependency value MUST be an array or a valid JSON Schema.
    *
    * If the dependency value is a subschema, and the dependency key is a
    * property in the instance, the entire instance must validate against the
    * dependency value.
    *
    * If the dependency value is an array, each element in the array, if any,
    * MUST be a string, and MUST be unique. If the dependency key is a property
    * in the instance, each of the items in the dependency value must be a
    * property that exists in the instance.
    *
    * Omitting this keyword has the same behavior as an empty object.
    */
  var dependencies: js.UndefOr[(StringDictionary[JSONSchema | Boolean | js.Array[String]]) | js.Array[String]] = js.native
  
  /**
    * Can be used to decorate a user interface with explanation or information
    * about the data produced.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This keyword's value MUST be a valid JSON Schema.
    *
    * When "if" is present, and the instance fails to validate against its
    * subschema, then validation succeeds against this keyword if the instance
    * successfully validates against this keyword's subschema.
    *
    * This keyword has no effect when "if" is absent, or when the instance
    * successfully validates against its subschema. Implementations MUST NOT
    * evaluate the instance against this keyword, for either validation or
    * annotation collection purposes, in such cases.
    */
  var `else`: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * The value of this keyword MUST be an array. This array SHOULD have at least
    * one element. Elements in the array SHOULD be unique.
    *
    * An instance validates successfully against this keyword if its value is
    * equal to one of the elements in this keyword's array value.
    *
    * Elements in the array might be of any value, including null.
    */
  var enum: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The value of this keyword MUST be an array. There are no restrictions
    * placed on the values within the array. When multiple occurrences of this
    * keyword are applicable to a single sub-instance, implementations MUST
    * provide a flat array of all values rather than an array of arrays.
    *
    * This keyword can be used to provide sample JSON values associated with a
    * particular schema, for the purpose of illustrating usage. It is RECOMMENDED
    * that these values be valid against the associated schema.
    *
    * Implementations MAY use the value(s) of "default", if present, as an
    * additional example. If "examples" is absent, "default" MAY still be used in
    * this manner.
    */
  var examples: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The value of "exclusiveMaximum" MUST be number, representing an exclusive
    * upper limit for a numeric instance.
    *
    * If the instance is a number, then the instance is valid only if it has a
    * value strictly less than (not equal to) "exclusiveMaximum".
    */
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  
  /**
    * The value of "exclusiveMinimum" MUST be number, representing an exclusive
    * lower limit for a numeric instance.
    *
    * If the instance is a number, then the instance is valid only if it has a
    * value strictly greater than (not equal to) "exclusiveMinimum".
    */
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  
  /**
    * The "format" keyword functions as both an [annotation][annotation] and as
    * an [assertion][assertion]. While no special effort is required to implement
    * it as an annotation conveying semantic meaning, implementing validation is
    * non-trivial.
    *
    * Implementations MAY support the "format" keyword as a validation assertion.
    * Should they choose to do so:
    *
    *  - they SHOULD implement validation for attributes defined below;
    *  - they SHOULD offer an option to disable validation for this keyword.
    *
    * Implementations MAY add custom format attributes. Save for agreement
    * between parties, schema authors SHALL NOT expect a peer implementation to
    * support this keyword and/or custom format attributes.
    *
    * [annotation]: http://json-schema.org/latest/json-schema-validation.html#annotations
    * [assertion]: http://json-schema.org/latest/json-schema-validation.html#assertions
    */
  var format: js.UndefOr[
    JSONSchemaFormat | date | `date-time` | email | `full-date` | `full-time` | hostname | `idn-email` | `idn-hostname` | ipv4 | ipv6 | iri | `iri-reference` | `json-pointer` | `json-pointer-uri-fragment` | regex | `relative-json-pointer` | time | uri | `uri-reference` | `uri-template` | uuid
  ] = js.native
  
  /**
    * This keyword's value MUST be a valid JSON Schema.
    *
    * This validation outcome of this keyword's subschema has no direct effect on
    * the overall validation result. Rather, it controls which of the "then" or
    * "else" keywords are evaluated.
    *
    * Instances that successfully validate against this keyword's subschema MUST
    * also be valid against the subschema value of the "then" keyword, if
    * present.
    *
    * Instances that fail to validate against this keyword's subschema MUST also
    * be valid against the subschema value of the "else" keyword, if present.
    *
    * If [annotations][annotations] are being collected, they are collected from
    * this keyword's subschema in the usual way, including when the keyword is
    * present without either "then" or "else".
    *
    * [annotations]: http://json-schema.org/latest/json-schema-validation.html#annotations
    */
  var `if`: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * The value of "items" MUST be either a valid JSON Schema or an array of
    * valid JSON Schemas.
    *
    * This keyword determines how child instances validate for arrays, and does
    * not directly validate the immediate instance itself.
    *
    * If "items" is a schema, validation succeeds if all elements in the array
    * successfully validate against that schema.
    *
    * If "items" is an array of schemas, validation succeeds if each element of
    * the instance validates against the schema at the same position, if any.
    *
    * Omitting this keyword has the same behavior as an empty schema.
    */
  var items: js.UndefOr[JSONSchema | Boolean | (js.Array[JSONSchema | Boolean])] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * An array instance is valid against "maxItems" if its size is less than, or
    * equal to, the value of this keyword.
    */
  var maxItems: js.UndefOr[Double] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * A string instance is valid against this keyword if its length is less than,
    * or equal to, the value of this keyword.
    *
    * The length of a string instance is defined as the number of its characters
    * as defined by [RFC 7159][RFC7159].
    *
    * [RFC7159]: http://json-schema.org/latest/json-schema-validation.html#RFC7159
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * An object instance is valid against "maxProperties" if its number of
    * properties is less than, or equal to, the value of this keyword.
    */
  var maxProperties: js.UndefOr[Double] = js.native
  
  /**
    * The value of "maximum" MUST be a number, representing an inclusive upper
    * limit for a numeric instance.
    *
    * If the instance is a number, then this keyword validates only if the
    * instance is less than or exactly equal to "maximum".
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * An array instance is valid against "minItems" if its size is greater than,
    * or equal to, the value of this keyword.
    *
    * Omitting this keyword has the same behavior as a value of 0.
    */
  var minItems: js.UndefOr[Double] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * A string instance is valid against this keyword if its length is greater
    * than, or equal to, the value of this keyword.
    *
    * The length of a string instance is defined as the number of its characters
    * as defined by [RFC 7159][RFC7159].
    *
    * Omitting this keyword has the same behavior as a value of 0.
    *
    * [RFC7159]: http://json-schema.org/latest/json-schema-validation.html#RFC7159
    */
  var minLength: js.UndefOr[Double] = js.native
  
  /**
    * The value of this keyword MUST be a non-negative integer.
    *
    * An object instance is valid against "minProperties" if its number of
    * properties is greater than, or equal to, the value of this keyword.
    *
    * Omitting this keyword has the same behavior as a value of 0.
    */
  var minProperties: js.UndefOr[Double] = js.native
  
  /**
    * The value of "minimum" MUST be a number, representing an inclusive lower
    * limit for a numeric instance.
    *
    * If the instance is a number, then this keyword validates only if the
    * instance is greater than or exactly equal to "minimum".
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /**
    * The value of "multipleOf" MUST be a number, strictly greater than 0.
    *
    * A numeric instance is valid only if division by this keyword's value
    * results in an integer.
    */
  var multipleOf: js.UndefOr[Double] = js.native
  
  /**
    * This keyword's value MUST be a valid JSON Schema.
    *
    * An instance is valid against this keyword if it fails to validate
    * successfully against the schema defined by this keyword.
    */
  var not: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * This keyword's value MUST be a non-empty array. Each item of the array MUST
    * be a valid JSON Schema.
    *
    * An instance validates successfully against this keyword if it validates
    * successfully against exactly one schema defined by this keyword's value.
    */
  var oneOf: js.UndefOr[js.Array[JSONSchema | Boolean]] = js.native
  
  /**
    * The value of this keyword MUST be a string. This string SHOULD be a valid
    * regular expression, according to the ECMA 262 regular expression dialect.
    *
    * A string instance is considered valid if the regular expression matches the
    * instance successfully. Recall: regular expressions are not implicitly
    * anchored.
    */
  var pattern: js.UndefOr[String] = js.native
  
  /**
    * The value of "patternProperties" MUST be an object. Each property name of
    * this object SHOULD be a valid regular expression, according to the ECMA 262
    * regular expression dialect. Each property value of this object MUST be a
    * valid JSON Schema.
    *
    * This keyword determines how child instances validate for objects, and does
    * not directly validate the immediate instance itself. Validation of the
    * primitive instance type against this keyword always succeeds.
    *
    * Validation succeeds if, for each instance name that matches any regular
    * expressions that appear as a property name in this keyword's value, the
    * child instance for that name successfully validates against each schema
    * that corresponds to a matching regular expression.
    *
    * Omitting this keyword has the same behavior as an empty object.
    */
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema | Boolean]] = js.native
  
  /**
    * The value of "properties" MUST be an object. Each value of this object MUST
    * be a valid JSON Schema.
    *
    * This keyword determines how child instances validate for objects, and does
    * not directly validate the immediate instance itself.
    *
    * Validation succeeds if, for each name that appears in both the instance and
    * as a name within this keyword's value, the child instance for that name
    * successfully validates against the corresponding schema.
    *
    * Omitting this keyword has the same behavior as an empty object.
    */
  var properties: js.UndefOr[StringDictionary[JSONSchema | Boolean]] = js.native
  
  /**
    * The value of "propertyNames" MUST be a valid JSON Schema.
    *
    * If the instance is an object, this keyword validates if every property name
    * in the instance validates against the provided schema. Note the property
    * name that the schema is testing will always be a string.
    *
    * Omitting this keyword has the same behavior as an empty schema.
    */
  var propertyNames: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * The value of this keywords MUST be a boolean. When multiple occurrences of
    * this keyword are applicable to a single sub-instance, the resulting value
    * MUST be true if any occurrence specifies a true value, and MUST be false
    * otherwise.
    *
    * If "readOnly" has a value of boolean true, it indicates that the value of
    * the instance is managed exclusively by the owning authority, and attempts
    * by an application to modify the value of this property are expected to be
    * ignored or rejected by that owning authority.
    *
    * An instance document that is marked as "readOnly for the entire document
    * MAY be ignored if sent to the owning authority, or MAY result in an error,
    * at the authority's discretion.
    *
    * For example, "readOnly" would be used to mark a database-generated serial
    * number as read-only.
    *
    * This keywords can be used to assist in user interface instance generation.
    *
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of this keyword MUST be an array. Elements of this array, if any,
    * MUST be strings, and MUST be unique.
    *
    * An object instance is valid against this keyword if every item in the array
    * is the name of a property in the instance.
    *
    * Omitting this keyword has the same behavior as an empty array.
    *
    * @default []
    */
  var required: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This keyword's value MUST be a valid JSON Schema.
    *
    * When "if" is present, and the instance successfully validates against its
    * subschema, then validation succeeds against this keyword if the instance
    * also successfully validates against this keyword's subschema.
    *
    * This keyword has no effect when "if" is absent, or when the instance fails
    * to validate against its subschema. Implementations MUST NOT evaluate the
    * instance against this keyword, for either validation or annotation
    * collection purposes, in such cases.
    */
  var `then`: js.UndefOr[JSONSchema | Boolean] = js.native
  
  /**
    * Can be used to decorate a user interface with a short label about the data
    * produced.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The value of this keyword MUST be either a string or an array. If it is an
    * array, elements of the array MUST be strings and MUST be unique.
    *
    * String values MUST be one of the six primitive types ("null", "boolean",
    * "object", "array", "number", or "string"), or "integer" which matches any
    * number with a zero fractional part.
    *
    * An instance validates if and only if the instance is in any of the sets
    * listed for this keyword.
    */
  var `type`: js.UndefOr[
    JSONSchemaType | JSONSchemaTypeName | (js.Array[JSONSchemaType | JSONSchemaTypeName])
  ] = js.native
  
  /**
    * The value of this keyword MUST be a boolean.
    *
    * If this keyword has boolean value false, the instance validates
    * successfully. If it has boolean value true, the instance validates
    * successfully if all of its elements are unique.
    *
    * Omitting this keyword has the same behavior as a value of false.
    *
    * @default false
    */
  var uniqueItems: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of this keyword MUST be a boolean. When multiple occurrences of
    * this keyword is applicable to a single sub-instance, the resulting value
    * MUST be true if any occurrence specifies a true value, and MUST be false
    * otherwise.
    *
    * If "writeOnly" has a value of boolean true, it indicates that the value is
    * never present when the instance is retrieved from the owning authority. It
    * can be present when sent to the owning authority to update or create the
    * document (or the resource it represents), but it will not be included in
    * any updated or newly created version of the instance.
    *
    * An instance document that is marked as "writeOnly" for the entire document
    * MAY be returned as a blank document of some sort, or MAY produce an error
    * upon retrieval, or have the retrieval request ignored, at the authority's
    * discretion.
    *
    * For example, "writeOnly" would be used to mark a password input field.
    *
    * These keywords can be used to assist in user interface instance generation.
    * In particular, an application MAY choose to use a widget that hides input
    * values as they are typed for write-only fields.
    *
    * @default false
    */
  var writeOnly: js.UndefOr[Boolean] = js.native
}
object JSONSchema {
  
  @scala.inline
  def apply(): JSONSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema]
  }
  
  @scala.inline
  implicit class JSONSchemaOps[Self <: JSONSchema] (val x: Self) extends AnyVal {
    
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
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    
    @scala.inline
    def setAdditionalItems(value: JSONSchema | Boolean): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: JSONSchema | Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: (JSONSchema | Boolean)*): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(value: js.Array[JSONSchema | Boolean]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: (JSONSchema | Boolean)*): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchema | Boolean]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    
    @scala.inline
    def setConst(value: js.Any): Self = this.set("const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConst: Self = this.set("const", js.undefined)
    
    @scala.inline
    def setContains(value: JSONSchema | Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: JSONSchemaContentEncodingName | JSONSchemaContentEncoding): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentMediaType(value: String): Self = this.set("contentMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMediaType: Self = this.set("contentMediaType", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchema | Boolean]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: (StringDictionary[JSONSchema | Boolean | js.Array[String]]) | js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setElse(value: JSONSchema | Boolean): Self = this.set("else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: js.Any*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[_]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setExclusiveMaximum(value: Double): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Double): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setFormat(
      value: JSONSchemaFormat | date | `date-time` | email | `full-date` | `full-time` | hostname | `idn-email` | `idn-hostname` | ipv4 | ipv6 | iri | `iri-reference` | `json-pointer` | `json-pointer-uri-fragment` | regex | `relative-json-pointer` | time | uri | `uri-reference` | `uri-template` | uuid
    ): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIf(value: JSONSchema | Boolean): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (JSONSchema | Boolean)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: JSONSchema | Boolean | (js.Array[JSONSchema | Boolean])): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
    def setNot(value: JSONSchema | Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: (JSONSchema | Boolean)*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: js.Array[JSONSchema | Boolean]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchema | Boolean]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchema | Boolean]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setPropertyNames(value: JSONSchema | Boolean): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    
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
    def setThen(value: JSONSchema | Boolean): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: (JSONSchemaType | JSONSchemaTypeName)*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: JSONSchemaType | JSONSchemaTypeName | (js.Array[JSONSchemaType | JSONSchemaTypeName])): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
