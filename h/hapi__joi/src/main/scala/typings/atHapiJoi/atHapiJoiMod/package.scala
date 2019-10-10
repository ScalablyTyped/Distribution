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
  type SchemaFunction = js.Function1[/* schema */ Schema, Schema]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.atHapiJoi.atHapiJoiMod.Schema
    - typings.atHapiJoi.atHapiJoiMod.SchemaMap
  */
  type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null
  type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ValidationErrorItem], String | ValidationErrorItem | Error]
}
