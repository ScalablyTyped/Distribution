package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GriddleInitialState
  extends /* x */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var enableSettings: js.UndefOr[scala.Boolean] = js.undefined
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.undefined
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ java.lang.String, 
      /* sortAscending */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.undefined
  var textProperties: js.UndefOr[griddleDashReactLib.Anon_Next] = js.undefined
}

