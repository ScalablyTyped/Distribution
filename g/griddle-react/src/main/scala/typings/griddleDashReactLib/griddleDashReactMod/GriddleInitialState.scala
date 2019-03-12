package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleInitialState
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var textProperties: js.UndefOr[griddleDashReactLib.Anon_FilterPlaceholder] = js.undefined
}

object GriddleInitialState {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    enableSettings: js.UndefOr[scala.Boolean] = js.undefined,
    pageProperties: GriddlePageProperties = null,
    sortMethod: (/* data */ js.Array[_], /* column */ java.lang.String, /* sortAscending */ js.UndefOr[scala.Boolean]) => scala.Double = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    textProperties: griddleDashReactLib.Anon_FilterPlaceholder = null
  ): GriddleInitialState = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings)
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties)
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties)
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties)
    __obj.asInstanceOf[GriddleInitialState]
  }
}

