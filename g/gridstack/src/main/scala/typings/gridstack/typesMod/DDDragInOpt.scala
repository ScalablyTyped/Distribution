package typings.gridstack.typesMod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDDragInOpt extends DDDragOpt {
  
  /** helper function when dropping (ex: 'clone' or your own method) */
  var helper: js.UndefOr[String | (js.Function1[/* event */ Event, HTMLElement])] = js.native
  
  /** used when dragging item from the outside, and canceling (ex: 'invalid' or your own method)*/
  var revert: js.UndefOr[String | (js.Function1[/* event */ Event, HTMLElement])] = js.native
}
object DDDragInOpt {
  
  @scala.inline
  def apply(): DDDragInOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DDDragInOpt]
  }
  
  @scala.inline
  implicit class DDDragInOptOps[Self <: DDDragInOpt] (val x: Self) extends AnyVal {
    
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
    def setHelperFunction1(value: /* event */ Event => HTMLElement): Self = this.set("helper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHelper(value: String | (js.Function1[/* event */ Event, HTMLElement])): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    
    @scala.inline
    def setRevertFunction1(value: /* event */ Event => HTMLElement): Self = this.set("revert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevert(value: String | (js.Function1[/* event */ Event, HTMLElement])): Self = this.set("revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
  }
}
