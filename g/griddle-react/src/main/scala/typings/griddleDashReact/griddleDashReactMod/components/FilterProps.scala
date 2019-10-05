package typings.griddleDashReact.griddleDashReactMod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleDashReact.griddleDashReactMod.GriddleFilter
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FilterProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    placeholder: String = null,
    setFilter: /* filter */ GriddleFilter => Unit = null,
    style: CSSProperties = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FilterProps]
  }
}

