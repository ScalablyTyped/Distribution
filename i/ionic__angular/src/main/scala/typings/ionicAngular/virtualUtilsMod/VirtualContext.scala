package typings.ionicAngular.virtualUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualContext extends js.Object {
  
  @JSName("$implicit")
  var $implicit: js.Any = js.native
  
  var index: Double = js.native
}
object VirtualContext {
  
  @scala.inline
  def apply($implicit: js.Any, index: Double): VirtualContext = {
    val __obj = js.Dynamic.literal($implicit = $implicit.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualContext]
  }
  
  @scala.inline
  implicit class VirtualContextOps[Self <: VirtualContext] (val x: Self) extends AnyVal {
    
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
    def set$implicit(value: js.Any): Self = this.set("$implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
