package typings.jestUtil.deepCyclicCopyMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepCyclicCopyOptions extends js.Object {
  
  var blacklist: js.UndefOr[Set[String]] = js.native
  
  var keepPrototype: js.UndefOr[Boolean] = js.native
}
object DeepCyclicCopyOptions {
  
  @scala.inline
  def apply(): DeepCyclicCopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepCyclicCopyOptions]
  }
  
  @scala.inline
  implicit class DeepCyclicCopyOptionsOps[Self <: DeepCyclicCopyOptions] (val x: Self) extends AnyVal {
    
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
    def setBlacklist(value: Set[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setKeepPrototype(value: Boolean): Self = this.set("keepPrototype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepPrototype: Self = this.set("keepPrototype", js.undefined)
  }
}
