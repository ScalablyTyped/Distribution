package typings.jsonSchemaCompare

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.jsonSchema.mod.JSONSchema7Definition
import typings.jsonSchemaCompare.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare json schemas correctly.
    *
    * - Ignores sort for arrays where sort does not matter, like required, enum, type, anyOf, oneOf, anyOf, dependencies (if array)
    * - Compares correctly type when array or string
    * - Ignores duplicate values before comparing
    * - For schemas and sub schemas `undefined`, `true` and `{}` are equal
    * - For minLength, minItems and minProperties `undefined` and `0` are equal
    * - For uniqueItems, `undefined` and `false` are equal
    */
  @scala.inline
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("json-schema-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type JSONSchemaComparee = js.UndefOr[JSONSchema4 | JSONSchema6Definition | JSONSchema7Definition]
  
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
    - typings.jsonSchemaCompare.jsonSchemaCompareStrings.`enum`
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
    - java.lang.String & typings.jsonSchemaCompare.anon._empty
  */
  type JSONSchemaKeys = _JSONSchemaKeys | KnownKeys[JSONSchema4] | (String & _empty)
  
  type KnownKeys[T] = js.Any
  
  trait Options extends StObject {
    
    /**
      * Ignores certain keywords, useful to exclude meta keywords like title,
      * description etc or custom keywords. If all you want to know if they are
      * the same in terms of validation keywords.
      *
      * @default []
      */
    var ignore: js.UndefOr[js.Array[JSONSchemaKeys]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: js.Array[JSONSchemaKeys]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: JSONSchemaKeys*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
  
  trait _JSONSchemaKeys extends StObject
}
