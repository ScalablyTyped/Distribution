package typings
package jsonDashSchemaLib.jsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONSchema4
  extends /**
     * @see https://tools.ietf.org/html/draft-zyp-json-schema-04#section-5.6
     */
/* k */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[
    jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/hyper-schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-04/schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-04/hyper-schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-03/schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-03/hyper-schema#` | java.lang.String
  ] = js.undefined
  /**
       * May only be defined when "items" is defined, and is a tuple of JSONSchemas.
       *
       * This provides a definition for additional items in an array instance
       * when tuple definitions of the items is provided.  This can be false
       * to indicate additional items in the array are not allowed, or it can
       * be a schema that defines the schema of the additional items.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.6
       */
  var additionalItems: js.UndefOr[scala.Boolean | JSONSchema4] = js.undefined
  /**
       * This attribute defines a schema for all properties that are not
       * explicitly defined in an object type definition. If specified, the
       * value MUST be a schema or a boolean. If false is provided, no
       * additional properties are allowed beyond the properties defined in
       * the schema. The default value is an empty schema which allows any
       * value for additional properties.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.4
       */
  var additionalProperties: js.UndefOr[scala.Boolean | JSONSchema4] = js.undefined
  var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var default: js.UndefOr[JSONSchema4Type] = js.undefined
  var definitions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema4]] = js.undefined
  var dependencies: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema4 | js.Array[java.lang.String]]] = js.undefined
  /**
       * This attribute is a string that provides a full description of the of
       * purpose the instance property.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.22
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This provides an enumeration of all possible values that are valid
       * for the instance property. This MUST be an array, and each item in
       * the array represents a possible value for the instance value. If
       * this attribute is defined, the instance value MUST be one of the
       * values in the array in order for the schema to be valid.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.19
       */
  var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The value of this property MUST be another schema which will provide
       * a base schema which the current schema will inherit from.  The
       * inheritance rules are such that any instance that is valid according
       * to the current schema MUST be valid according to the referenced
       * schema.  This MAY also be an array, in which case, the instance MUST
       * be valid for all the schemas in the array.  A schema that extends
       * another schema MAY define additional attributes, constrain existing
       * attributes, or add other constraints.
       *
       * Conceptually, the behavior of extends can be seen as validating an
       * instance against all constraints in the extending schema as well as
       * the extended schema(s).
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.26
       */
  var `extends`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This attribute defines the allowed items in an instance array, and
       * MUST be a schema or an array of schemas.  The default value is an
       * empty schema which allows any value for items in the instance array.
       *
       * When this attribute value is a schema and the instance value is an
       * array, then all the items in the array MUST be valid according to the
       * schema.
       *
       * When this attribute value is an array of schemas and the instance
       * value is an array, each position in the instance array MUST conform
       * to the schema in the corresponding position for this array.  This
       * called tuple typing.  When tuple typing is used, additional items are
       * allowed, disallowed, or constrained by the "additionalItems"
       * (Section 5.6) attribute using the same rules as
       * "additionalProperties" (Section 5.4) for objects.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.5
       */
  var items: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[JSONSchema4] = js.undefined
  var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This attribute is an object that defines the schema for a set of
       * property names of an object instance. The name of each property of
       * this attribute's object is a regular expression pattern in the ECMA
       * 262/Perl 5 format, while the value is a schema. If the pattern
       * matches the name of a property on the instance object, the value of
       * the instance's property MUST be valid against the pattern name's
       * schema value.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.3
       */
  var patternProperties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema4]] = js.undefined
  /**
       * This attribute is an object with property definitions that define the
       * valid values of instance object property values. When the instance
       * value is an object, the property values of the instance object MUST
       * conform to the property definitions in this object. In this object,
       * each property definition's value MUST be a schema, and the property's
       * name MUST be the name of the instance property that it defines.  The
       * instance property value MUST be valid according to the schema from
       * the property definition. Properties are considered unordered, the
       * order of the instance properties MAY be in any order.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.2
       */
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema4]] = js.undefined
  /**
       * This attribute indicates if the instance must have a value, and not
       * be undefined. This is false by default, making the instance
       * optional.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.7
       */
  var required: js.UndefOr[jsonDashSchemaLib.jsonDashSchemaLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
  /**
       * This attribute is a string that provides a short description of the
       * instance property.
       *
       * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.21
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A single type, or a union of simple types
       */
  var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

