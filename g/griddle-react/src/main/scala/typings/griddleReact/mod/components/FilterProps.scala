package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleFilter
import typings.react.mod.CSSProperties
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    placeholder: String = null,
    setFilter: /* filter */ GriddleFilter => Unit = null,
    style: CSSProperties = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProps]
  }
}

