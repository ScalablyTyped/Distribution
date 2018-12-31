package typings
package joiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object joiMod {
  type DefaultsFunction = js.Function1[/* root */ Schema, Schema]
  type ExtensionBoundSchema = Schema with joiLib.Anon_CreateError
  type GuidVersions = joiLib.joiLibStrings.uuidv1 | joiLib.joiLibStrings.uuidv2 | joiLib.joiLibStrings.uuidv3 | joiLib.joiLibStrings.uuidv4 | joiLib.joiLibStrings.uuidv5
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Object]
  type LanguageRootOptions = joiLib.Anon_Key with (stdLib.Partial[stdLib.Record[Types, LanguageOptions]])
  type LazySchema = AnySchema
  type Schema = AnySchema | ArraySchema | AlternativesSchema | BinarySchema | BooleanSchema | DateSchema | FunctionSchema | NumberSchema | ObjectSchema | StringSchema | LazySchema
  type SchemaLike = java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | Schema | SchemaMap
  type Types = joiLib.joiLibStrings.any | joiLib.joiLibStrings.alternatives | joiLib.joiLibStrings.array | joiLib.joiLibStrings.boolean | joiLib.joiLibStrings.binary | joiLib.joiLibStrings.date | joiLib.joiLibStrings.function | joiLib.joiLibStrings.`lazy` | joiLib.joiLibStrings.number | joiLib.joiLibStrings.`object` | joiLib.joiLibStrings.string
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    java.lang.String | ValidationErrorItem | js.Array[ValidationErrorItem] | stdLib.Error
  ]
}
