package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.std.TemplateStringsArray

  type Callback = js.Function2[/* error */ js.Any, /* t */ TFunction, Unit]
  /**
    * Uses similar args as the t function and returns true if a key exists.
    */
  type ExistsFunction[TKeys /* <: String */, TInterpolationMap /* <: js.Object */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[TOptions[TInterpolationMap]], 
    Boolean
  ]
  type FallbackLng = String | js.Array[String] | FallbackLngObjList
  type FallbackLngObjList = StringDictionary[js.Array[String]]
  type FormatFunction = js.Function3[
    /* value */ js.Any, 
    /* format */ js.UndefOr[String], 
    /* lng */ js.UndefOr[String], 
    String
  ]
  type ReadCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ Resource, Unit]
  type Resource = StringDictionary[ResourceLanguage]
  type ResourceKey = String | StringDictionary[js.Any]
  type ResourceLanguage = StringDictionary[ResourceKey]
  // indexer that is open to any value
  type StringMap = StringDictionary[js.Any]
  type TFunction = js.Function2[
    /* key */ String | TemplateStringsArray | (js.Array[String | TemplateStringsArray]), 
    /* options */ js.UndefOr[TOptions[js.Object] | String], 
    js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null]
  ]
  /**
    * Options that allow open ended values for interpolation unless type is provided.
    */
  type TOptions[TInterpolationMap /* <: js.Object */] = TOptionsBase with TInterpolationMap
}
