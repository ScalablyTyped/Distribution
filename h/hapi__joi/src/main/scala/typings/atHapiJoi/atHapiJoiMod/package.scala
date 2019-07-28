package typings.atHapiJoi

import org.scalablytyped.runtime.StringDictionary
import typings.atHapiJoi.Anon_Context
import typings.atHapiJoi.Anon_Key
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiJoiMod {
  type DefaultsFunction = js.Function1[/* root */ Schema, Schema]
  type ExtensionBoundSchema = Schema with Anon_Context
  type LanguageOptions = String | Boolean | Null | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @hapi/joi.@hapi/joi.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = Anon_Key with (Partial[Record[Types, LanguageOptions]])
  type LazySchema = AnySchema
  /* Rewritten from type alias, can be one of: 
    - typings.atHapiJoi.atHapiJoiMod.AnySchema
    - typings.atHapiJoi.atHapiJoiMod.ArraySchema
    - typings.atHapiJoi.atHapiJoiMod.AlternativesSchema
    - typings.atHapiJoi.atHapiJoiMod.BinarySchema
    - typings.atHapiJoi.atHapiJoiMod.BooleanSchema
    - typings.atHapiJoi.atHapiJoiMod.DateSchema
    - typings.atHapiJoi.atHapiJoiMod.FunctionSchema
    - typings.atHapiJoi.atHapiJoiMod.NumberSchema
    - typings.atHapiJoi.atHapiJoiMod.ObjectSchema
    - typings.atHapiJoi.atHapiJoiMod.StringSchema
    - typings.atHapiJoi.atHapiJoiMod.LazySchema
  */
  type Schema = _Schema | LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.atHapiJoi.atHapiJoiMod.Schema
    - typings.atHapiJoi.atHapiJoiMod.SchemaMap
  */
  type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null | LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    String | ValidationErrorItem | js.Array[ValidationErrorItem] | Error
  ]
}
