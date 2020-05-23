package typings.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultsFunction = js.Function1[/* root */ typings.joi.mod.Schema, typings.joi.mod.Schema]
  type ExtensionBoundSchema = typings.joi.mod.Schema with typings.joi.anon.CreateError
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias joi.joi.LanguageOptions */ js.Object
  ])
  type LazySchema = typings.joi.mod.AnySchema
  /* Rewritten from type alias, can be one of: 
    - typings.joi.mod.AnySchema
    - typings.joi.mod.ArraySchema
    - typings.joi.mod.AlternativesSchema
    - typings.joi.mod.BinarySchema
    - typings.joi.mod.BooleanSchema
    - typings.joi.mod.DateSchema
    - typings.joi.mod.FunctionSchema
    - typings.joi.mod.NumberSchema
    - typings.joi.mod.ObjectSchema
    - typings.joi.mod.StringSchema
    - typings.joi.mod.LazySchema
  */
  type Schema = typings.joi.mod._Schema | typings.joi.mod.LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.joi.mod.Schema
    - typings.joi.mod.SchemaMap
  */
  type SchemaLike = typings.joi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typings.joi.mod.LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typings.joi.mod.ValidationErrorItem], 
    java.lang.String | typings.joi.mod.ValidationErrorItem | js.Array[typings.joi.mod.ValidationErrorItem] | typings.std.Error
  ]
}
