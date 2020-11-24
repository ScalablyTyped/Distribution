package typings.lodash.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashAnyHack extends js.Object {
  
  var __lodashAnyHack: js.Any = js.native
}
object LodashAnyHack {
  
  @scala.inline
  def apply(__lodashAnyHack: js.Any): LodashAnyHack = {
    val __obj = js.Dynamic.literal(__lodashAnyHack = __lodashAnyHack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LodashAnyHack]
  }
  
  @scala.inline
  implicit class LodashAnyHackOps[Self <: LodashAnyHack] (val x: Self) extends AnyVal {
    
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
    def set__lodashAnyHack(value: js.Any): Self = this.set("__lodashAnyHack", value.asInstanceOf[js.Any])
  }
}
