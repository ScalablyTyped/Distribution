package typings.jsonSchemaCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchemaComparee = js.UndefOr[
    typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6Definition | typings.jsonSchema.mod.JSONSchema7Definition
  ]
  /**
    * The `string & {''?: never}` is a workaround for
    * [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729).
    * It will be removed as soon as it's not needed anymore.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jsonSchemaCompare.mod.KnownKeys[typings.jsonSchema.mod.JSONSchema4]
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.$id
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.$ref
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.$schema
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.multipleOf
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.maximum
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMaximum
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.minimum
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMinimum
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.maxLength
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.minLength
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.pattern
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.items
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.additionalItems
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.maxItems
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.minItems
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.uniqueItems
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.contains
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.maxProperties
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.minProperties
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.required
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.properties
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.patternProperties
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.additionalProperties
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.dependencies
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.propertyNames
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.enum
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.const
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.`type`
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.allOf
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.anyOf
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.oneOf
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.not
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.definitions
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.title
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.description
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.default
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.examples
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.format
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.$comment
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.`if`
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.`then`
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.`else`
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.contentMediaType
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.contentEncoding
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.readOnly
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.writeOnly
    - java.lang.String with typings.jsonSchemaCompare.anon._empty
  */
  type JSONSchemaKeys = typings.jsonSchemaCompare.mod._JSONSchemaKeys | typings.jsonSchemaCompare.mod.KnownKeys[typings.jsonSchema.mod.JSONSchema4] | (java.lang.String with typings.jsonSchemaCompare.anon._empty)
  type KnownKeys[T] = js.Any
}
