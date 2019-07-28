package typings.griddleDashReact.griddleDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleDashReact.Anon_FilterPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleInitialState
  extends /* x */ StringDictionary[js.Any] {
  var enableSettings: js.UndefOr[Boolean] = js.undefined
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.undefined
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.undefined
  var textProperties: js.UndefOr[Anon_FilterPlaceholder] = js.undefined
}

object GriddleInitialState {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    enableSettings: js.UndefOr[Boolean] = js.undefined,
    pageProperties: GriddlePageProperties = null,
    sortMethod: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    textProperties: Anon_FilterPlaceholder = null
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

