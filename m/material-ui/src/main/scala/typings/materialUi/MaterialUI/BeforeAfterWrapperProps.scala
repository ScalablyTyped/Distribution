package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeAfterWrapperProps extends js.Object {
  var afterElementType: js.UndefOr[String] = js.native
  var afterStyle: js.UndefOr[CSSProperties] = js.native
  var beforeElementType: js.UndefOr[String] = js.native
  var beforeStyle: js.UndefOr[CSSProperties] = js.native
  var elementType: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object BeforeAfterWrapperProps {
  @scala.inline
  def apply(): BeforeAfterWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeAfterWrapperProps]
  }
  @scala.inline
  implicit class BeforeAfterWrapperPropsOps[Self <: BeforeAfterWrapperProps] (val x: Self) extends AnyVal {
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
    def setAfterElementType(value: String): Self = this.set("afterElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterElementType: Self = this.set("afterElementType", js.undefined)
    @scala.inline
    def setAfterStyle(value: CSSProperties): Self = this.set("afterStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterStyle: Self = this.set("afterStyle", js.undefined)
    @scala.inline
    def setBeforeElementType(value: String): Self = this.set("beforeElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeElementType: Self = this.set("beforeElementType", js.undefined)
    @scala.inline
    def setBeforeStyle(value: CSSProperties): Self = this.set("beforeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeStyle: Self = this.set("beforeStyle", js.undefined)
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

