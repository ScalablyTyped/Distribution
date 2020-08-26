package typings.griddleReact.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleStyleConfig extends js.Object {
  var classNames: js.UndefOr[GriddleStyleElements[String]] = js.native
  var icons: js.UndefOr[GriddleStyleElements[GriddleStyleIcons]] = js.native
  var styles: js.UndefOr[GriddleStyleElements[CSSProperties]] = js.native
}

object GriddleStyleConfig {
  @scala.inline
  def apply(): GriddleStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleConfig]
  }
  @scala.inline
  implicit class GriddleStyleConfigOps[Self <: GriddleStyleConfig] (val x: Self) extends AnyVal {
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
    def setClassNames(value: GriddleStyleElements[String]): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setIcons(value: GriddleStyleElements[GriddleStyleIcons]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setStyles(value: GriddleStyleElements[CSSProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

