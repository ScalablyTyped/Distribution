package typings.libratoNode.mod

import typings.libratoNode.libratoNodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibratoSimulate extends js.Object {
  
  var simulate: `true` = js.native
}
object LibratoSimulate {
  
  @scala.inline
  def apply(simulate: `true`): LibratoSimulate = {
    val __obj = js.Dynamic.literal(simulate = simulate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibratoSimulate]
  }
  
  @scala.inline
  implicit class LibratoSimulateOps[Self <: LibratoSimulate] (val x: Self) extends AnyVal {
    
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
    def setSimulate(value: `true`): Self = this.set("simulate", value.asInstanceOf[js.Any])
  }
}
