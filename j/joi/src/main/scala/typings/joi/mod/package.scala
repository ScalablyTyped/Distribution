package typings.joi.mod

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

type SchemaFunction = js.Function1[/* schema */ Schema[Any], Schema[Any]]

type SchemaLike = SchemaLikeWithoutArray | js.Object

type SchemaLikeWithoutArray = String | Double | Boolean | Null | Schema[Any] | (SchemaMap[Any, `false`])

type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ErrorReport], String | ValidationErrorItem | js.Error]
