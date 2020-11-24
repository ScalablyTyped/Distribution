package typings.materialUiLab.usePaginationMod

import typings.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typings.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typings.materialUiLab.materialUiLabStrings.first
import typings.materialUiLab.materialUiLabStrings.last
import typings.materialUiLab.materialUiLabStrings.next
import typings.materialUiLab.materialUiLabStrings.page
import typings.materialUiLab.materialUiLabStrings.previous
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePaginationItem extends js.Object {
  
  var disabled: Boolean = js.native
  
  var onClick: ReactEventHandler[Element] = js.native
  
  var page: Double = js.native
  
  var selected: Boolean = js.native
  
  var `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis` = js.native
}
object UsePaginationItem {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onClick: SyntheticEvent[Element, Event] => Unit,
    page: Double,
    selected: Boolean,
    `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`
  ): UsePaginationItem = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), page = page.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationItem]
  }
  
  @scala.inline
  implicit class UsePaginationItemOps[Self <: UsePaginationItem] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
