package typings.lucasmogariReactPagination.mod

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageItemProps extends js.Object {
  
  var `aria-current`: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
}
object PageItemProps {
  
  @scala.inline
  def apply(onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): PageItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[PageItemProps]
  }
  
  @scala.inline
  implicit class PageItemPropsOps[Self <: PageItemProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setAria-current`(value: Boolean): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
