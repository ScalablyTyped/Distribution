package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends _RulesLogic {
  
  @JSName("===")
  var EqualssignEqualssignEqualssign: js.Tuple2[_, _] = js.native
}
object `0` {
  
  @scala.inline
  def apply(EqualssignEqualssignEqualssign: js.Tuple2[_, _]): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("===")(EqualssignEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    
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
    def setEqualssignEqualssignEqualssign(value: js.Tuple2[_, _]): Self = this.set("===", value.asInstanceOf[js.Any])
  }
}
