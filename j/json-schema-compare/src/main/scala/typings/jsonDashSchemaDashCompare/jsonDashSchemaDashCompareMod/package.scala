package typings.jsonDashSchemaDashCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashSchemaDashCompareMod {
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Definition
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7Definition

  type JSONSchemaComparee = js.UndefOr[JSONSchema4 | JSONSchema6Definition | JSONSchema7Definition]
  /**
    * The `string & {''?: never}` is a workaround for
    * [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729).
    * It will be removed as soon as it's not needed anymore.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareMod.KnownKeys[typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4]
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.DOLLARid
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.DOLLARref
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.DOLLARschema
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.multipleOf
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.maximum
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.exclusiveMaximum
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.minimum
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.exclusiveMinimum
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.maxLength
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.minLength
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.pattern
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.items
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.additionalItems
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.maxItems
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.minItems
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.uniqueItems
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.contains
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.maxProperties
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.minProperties
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.required
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.properties
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.patternProperties
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.additionalProperties
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.dependencies
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.propertyNames
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.enum
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.const
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.`type`
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.allOf
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.anyOf
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.oneOf
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.not
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.definitions
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.title
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.description
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.default
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.examples
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.format
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.DOLLARcomment
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.`if`
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.`then`
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.`else`
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.contentMediaType
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.contentEncoding
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.readOnly
    - typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareStrings.writeOnly
    - java.lang.String with js.Object
  */
  type JSONSchemaKeys = _JSONSchemaKeys | KnownKeys[JSONSchema4] | (String with js.Object)
  type KnownKeys[T] = js.Any
}
