package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _empty extends _RulesLogic {
  
  @JSName("==")
  var EqualssignEqualssign: js.Tuple2[_, _] = js.native
}
object _empty {
  
  @scala.inline
  def apply(EqualssignEqualssign: js.Tuple2[_, _]): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("==")(EqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    
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
    def setEqualssignEqualssign(value: js.Tuple2[_, _]): Self = this.set("==", value.asInstanceOf[js.Any])
  }
}
