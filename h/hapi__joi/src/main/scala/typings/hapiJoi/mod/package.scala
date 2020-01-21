package typings.hapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typings.hapiJoi.mod.CustomHelpers[js.Any], 
    typings.hapiJoi.mod.CoerceResult
  ]
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ typings.hapiJoi.mod.CustomHelpers[js.Any], V]
  type ExtensionBoundSchema = typings.hapiJoi.mod.Schema with typings.hapiJoi.mod.SchemaInternals
  type ExtensionFactory = js.Function1[/* joi */ typings.hapiJoi.mod.Root, typings.hapiJoi.mod.Extension]
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  type LanguageMessages = typings.std.Record[java.lang.String, java.lang.String]
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.hapiJoi.mod.AnySchema
    - typings.hapiJoi.mod.ArraySchema
    - typings.hapiJoi.mod.AlternativesSchema
    - typings.hapiJoi.mod.BinarySchema
    - typings.hapiJoi.mod.BooleanSchema
    - typings.hapiJoi.mod.DateSchema
    - typings.hapiJoi.mod.FunctionSchema
    - typings.hapiJoi.mod.NumberSchema
    - typings.hapiJoi.mod.ObjectSchema[js.Any]
    - typings.hapiJoi.mod.StringSchema
    - typings.hapiJoi.mod.LinkSchema
    - typings.hapiJoi.mod.SymbolSchema
  */
  type Schema = typings.hapiJoi.mod._Schema | typings.hapiJoi.mod.ObjectSchema[js.Any]
  type SchemaFunction = js.Function1[/* schema */ typings.hapiJoi.mod.Schema, typings.hapiJoi.mod.Schema]
  type SchemaLike = java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typings.hapiJoi.mod.Schema | typings.hapiJoi.mod.SchemaMap[js.Any]
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? @hapi/joi.@hapi/joi.SchemaLike | std.Array<@hapi/joi.@hapi/joi.SchemaLike>}
    */ typings.hapiJoi.hapiJoiStrings.SchemaMap with js.Any
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typings.hapiJoi.mod.ValidationErrorItem], 
    java.lang.String | typings.hapiJoi.mod.ValidationErrorItem | typings.std.Error
  ]
}
