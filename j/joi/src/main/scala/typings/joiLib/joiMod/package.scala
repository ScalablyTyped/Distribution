package typings
package joiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object joiMod {
  type DefaultsFunction = js.Function1[/* root */ Schema, Schema]
  type ExtensionBoundSchema = Schema with joiLib.Anon_Context
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias joi.joi.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = joiLib.Anon_Key with (stdLib.Partial[stdLib.Record[Types, LanguageOptions]])
  type LazySchema = AnySchema
  type Schema = _Schema | LazySchema
  type SchemaLike = _SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    java.lang.String | ValidationErrorItem | js.Array[ValidationErrorItem] | stdLib.Error
  ]
}
