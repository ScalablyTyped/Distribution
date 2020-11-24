package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends _RulesLogic {
  
  @JSName("!!")
  var ExclamationmarkExclamationmark: js.Any = js.native
}
object `3` {
  
  @scala.inline
  def apply(ExclamationmarkExclamationmark: js.Any): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!!")(ExclamationmarkExclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
    
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
    def setExclamationmarkExclamationmark(value: js.Any): Self = this.set("!!", value.asInstanceOf[js.Any])
  }
}
