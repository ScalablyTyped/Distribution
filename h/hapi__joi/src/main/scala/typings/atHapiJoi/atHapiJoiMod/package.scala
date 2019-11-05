package typings.atHapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiJoiMod {
  import typings.std.Error
  import typings.std.Record

  type CoerceFunction = js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[js.Any], CoerceResult]
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ CustomHelpers[js.Any], V]
  type ExtensionBoundSchema = Schema with SchemaInternals
  type ExtensionFactory = js.Function1[/* joi */ Root, Extension]
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  type LanguageMessages = Record[String, String]
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.atHapiJoi.atHapiJoiMod.AnySchema
    - typings.atHapiJoi.atHapiJoiMod.ArraySchema
    - typings.atHapiJoi.atHapiJoiMod.AlternativesSchema
    - typings.atHapiJoi.atHapiJoiMod.BinarySchema
    - typings.atHapiJoi.atHapiJoiMod.BooleanSchema
    - typings.atHapiJoi.atHapiJoiMod.DateSchema
    - typings.atHapiJoi.atHapiJoiMod.FunctionSchema
    - typings.atHapiJoi.atHapiJoiMod.NumberSchema
    - typings.atHapiJoi.atHapiJoiMod.ObjectSchema[js.Any]
    - typings.atHapiJoi.atHapiJoiMod.StringSchema
    - typings.atHapiJoi.atHapiJoiMod.LinkSchema
    - typings.atHapiJoi.atHapiJoiMod.SymbolSchema
  */
  type Schema = _Schema | ObjectSchema[js.Any]
  type SchemaFunction = js.Function1[/* schema */ Schema, Schema]
  type SchemaLike = String | Double | Boolean | js.Object | Null | Schema | SchemaMap[js.Any]
  type SchemaMap[TSchema] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? @hapi/joi.@hapi/joi.SchemaLike | std.Array<@hapi/joi.@hapi/joi.SchemaLike>}
    */ typings.atHapiJoi.atHapiJoiStrings.SchemaMap with js.Any
  type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ValidationErrorItem], String | ValidationErrorItem | Error]
}
