package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDictionary
  extends /* key */ StringDictionary[js.UndefOr[js.Function]] {
  var arc: js.UndefOr[js.Function] = js.undefined
  var callout: js.UndefOr[js.Function] = js.undefined
  var circle: js.UndefOr[js.Function] = js.undefined
  var diamond: js.UndefOr[js.Function] = js.undefined
  var square: js.UndefOr[js.Function] = js.undefined
  var triangle: js.UndefOr[js.Function] = js.undefined
}

object SymbolDictionary {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[js.Function]] = null,
    arc: js.Function = null,
    callout: js.Function = null,
    circle: js.Function = null,
    diamond: js.Function = null,
    square: js.Function = null,
    triangle: js.Function = null
  ): SymbolDictionary = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arc != null) __obj.updateDynamic("arc")(arc)
    if (callout != null) __obj.updateDynamic("callout")(callout)
    if (circle != null) __obj.updateDynamic("circle")(circle)
    if (diamond != null) __obj.updateDynamic("diamond")(diamond)
    if (square != null) __obj.updateDynamic("square")(square)
    if (triangle != null) __obj.updateDynamic("triangle")(triangle)
    __obj.asInstanceOf[SymbolDictionary]
  }
}

