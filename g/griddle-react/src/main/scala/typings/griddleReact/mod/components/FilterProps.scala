package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleFilter
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object FilterProps {
  @scala.inline
  def apply(): FilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterProps]
  }
  @scala.inline
  implicit class FilterPropsOps[Self <: FilterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSetFilter(value: /* filter */ GriddleFilter => Unit): Self = this.set("setFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilter: Self = this.set("setFilter", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

