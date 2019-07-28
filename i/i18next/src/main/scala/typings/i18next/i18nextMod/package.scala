package typings.i18next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextMod {
  type Callback = js.Function2[/* error */ js.Any, /* t */ TranslationFunction[js.Any, js.Object, String], Unit]
  type FallbackLng = String | js.Array[String] | FallbackLngObjList
  type FallbackLngObjList = StringDictionary[js.Array[String]]
  type FormatFunction = js.Function3[
    /* value */ js.Any, 
    /* format */ js.UndefOr[String], 
    /* lng */ js.UndefOr[String], 
    String
  ]
  type Resource = StringDictionary[ResourceLanguage]
  type ResourceKey = StringDictionary[js.Any]
  type ResourceLanguage = StringDictionary[ResourceKey]
  type TranslationFunction[TResult, TValues /* <: js.Object */, TKeys /* <: String */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[TranslationOptions[TValues]], 
    TResult
  ]
  // Add an indexer to assure that interpolation arguments can be passed
  type TranslationOptions[TCustomOptions /* <: js.Object */] = TranslationOptionsBase with TCustomOptions with StringDictionary[js.Any]
}
