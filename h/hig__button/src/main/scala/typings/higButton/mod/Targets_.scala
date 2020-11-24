package typings.higButton.mod

import typings.higButton.higButtonStrings._blank
import typings.higButton.higButtonStrings._parent
import typings.higButton.higButtonStrings._self
import typings.higButton.higButtonStrings._top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targets_ extends js.Object {
  
  var BLANK: _blank = js.native
  
  var PARENT: _parent = js.native
  
  var SELF: _self = js.native
  
  var TOP: _top = js.native
}
object Targets_ {
  
  @scala.inline
  def apply(BLANK: _blank, PARENT: _parent, SELF: _self, TOP: _top): Targets_ = {
    val __obj = js.Dynamic.literal(BLANK = BLANK.asInstanceOf[js.Any], PARENT = PARENT.asInstanceOf[js.Any], SELF = SELF.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets_]
  }
  
  @scala.inline
  implicit class Targets_Ops[Self <: Targets_] (val x: Self) extends AnyVal {
    
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
    def setBLANK(value: _blank): Self = this.set("BLANK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARENT(value: _parent): Self = this.set("PARENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELF(value: _self): Self = this.set("SELF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP(value: _top): Self = this.set("TOP", value.asInstanceOf[js.Any])
  }
}
