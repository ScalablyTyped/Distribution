package typings.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicType = scala.Boolean | scala.Double | java.lang.String | js.Array[js.Any] | js.Object | scala.Null
  
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typings.joi.mod.CustomHelpers[js.Any], 
    typings.joi.mod.CoerceResult
  ]
  
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type CustomValidator[V] = js.Function2[
    /* value */ V, 
    /* helpers */ typings.joi.mod.CustomHelpers[js.Any], 
    V | typings.joi.mod.ErrorReport
  ]
  
  type ExtensionBoundSchema = typings.joi.mod.Schema with typings.joi.mod.SchemaInternals
  
  type ExtensionFactory = js.Function1[/* joi */ typings.joi.mod.Root, typings.joi.mod.Extension]
  
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  
  type LanguageMessages = typings.std.Record[java.lang.String, java.lang.String]
  
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.joi.mod.AnySchema
    - typings.joi.mod.ArraySchema
    - typings.joi.mod.AlternativesSchema
    - typings.joi.mod.BinarySchema
    - typings.joi.mod.BooleanSchema
    - typings.joi.mod.DateSchema
    - typings.joi.mod.FunctionSchema
    - typings.joi.mod.NumberSchema
    - typings.joi.mod.ObjectSchema[js.Any]
    - typings.joi.mod.StringSchema
    - typings.joi.mod.LinkSchema
    - typings.joi.mod.SymbolSchema
  */
  type Schema = typings.joi.mod._Schema | typings.joi.mod.ObjectSchema[js.Any]
  
  type SchemaFunction = js.Function1[/* schema */ typings.joi.mod.Schema, typings.joi.mod.Schema]
  
  type SchemaLike = typings.joi.mod.SchemaLikeWithoutArray | js.Object
  
  type SchemaLikeWithoutArray = java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.joi.mod.Schema | typings.joi.mod.SchemaMap[js.Any]
  
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? joi.joi.SchemaLike | std.Array<joi.joi.SchemaLike>}
    */ typings.joi.joiStrings.SchemaMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typings.joi.mod.ErrorReport], 
    java.lang.String | typings.joi.mod.ValidationErrorItem | typings.std.Error
  ]
}
