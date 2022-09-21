package typings.joi.mod

import org.scalablytyped.runtime.TopLevel
import typings.joi.joiBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasicType = Boolean | Double | String | js.Array[Any] | js.Object | Null

type CoerceFunction = js.Function2[/* value */ Any, /* helpers */ CustomHelpers[Any], CoerceResult]

type ComparatorFunction = js.Function2[/* a */ Any, /* b */ Any, Boolean]

type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ CustomHelpers[Any], V | ErrorReport]

type ExtensionBoundSchema = Schema[Any] & SchemaInternals

type ExtensionFactory = js.Function1[/* joi */ Root, Extension]

type ExternalValidationFunction[V] = js.Function2[/* value */ V, /* helpers */ ExternalHelpers, js.UndefOr[V]]

type LanguageMessages = Record[String, String]

type NullableType[T] = js.UndefOr[Null | T]

/* Rewritten from type alias, can be one of: 
  - typings.joi.mod.ObjectSchema[typings.joi.mod.StrictSchemaMap[T]]
  - typings.joi.mod.ArraySchema
  - typings.joi.mod.DateSchema
  - typings.joi.mod.BooleanSchema
  - typings.joi.mod.NumberSchema
  - typings.joi.mod.StringSchema
*/
type ObjectPropertiesSchema[T] = _ObjectPropertiesSchema[T] | ObjectSchema[StrictSchemaMap[T]]

type PartialSchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof TSchema ]:? joi.joi.SchemaLike | std.Array<joi.joi.SchemaLike>}
  */ typings.joi.joiStrings.PartialSchemaMap & TopLevel[Any]

/* Rewritten from type alias, can be one of: 
  - typings.joi.mod.AnySchema[scala.Any]
  - typings.joi.mod.ArraySchema
  - typings.joi.mod.AlternativesSchema
  - typings.joi.mod.BinarySchema
  - typings.joi.mod.BooleanSchema
  - typings.joi.mod.DateSchema
  - typings.joi.mod.FunctionSchema
  - typings.joi.mod.NumberSchema
  - typings.joi.mod.ObjectSchema[P]
  - typings.joi.mod.StringSchema
  - typings.joi.mod.LinkSchema
  - typings.joi.mod.SymbolSchema
*/
type Schema[P] = _Schema[P] | AnySchema[Any]

type SchemaFunction = js.Function1[/* schema */ Schema[Any], Schema[Any]]

type SchemaLike = SchemaLikeWithoutArray | js.Object

type SchemaLikeWithoutArray = String | Double | Boolean | Null | Schema[Any] | (SchemaMap[Any, `false`])

type SchemaMap[TSchema, isStrict] = PartialSchemaMap[TSchema] | StrictSchemaMap[TSchema]

type StrictSchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof TSchema ]: -? joi.joi.ObjectPropertiesSchema<TSchema[key]>}
  */ typings.joi.joiStrings.StrictSchemaMap & TopLevel[TSchema]

type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ErrorReport], String | ValidationErrorItem | js.Error]
