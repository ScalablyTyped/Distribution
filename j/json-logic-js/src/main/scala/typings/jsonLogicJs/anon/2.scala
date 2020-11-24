package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends _RulesLogic {
  
  @JSName("!==")
  var ExclamationmarkEqualssignEqualssign: js.Tuple2[_, _] = js.native
}
object `2` {
  
  @scala.inline
  def apply(ExclamationmarkEqualssignEqualssign: js.Tuple2[_, _]): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!==")(ExclamationmarkEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setExclamationmarkEqualssignEqualssign(value: js.Tuple2[_, _]): Self = this.set("!==", value.asInstanceOf[js.Any])
  }
}
