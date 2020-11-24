package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normal extends js.Object {
  
  var normal: Map = js.native
}
object Normal {
  
  @scala.inline
  def apply(normal: Map): Normal = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normal]
  }
  
  @scala.inline
  implicit class NormalOps[Self <: Normal] (val x: Self) extends AnyVal {
    
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
    def setNormal(value: Map): Self = this.set("normal", value.asInstanceOf[js.Any])
  }
}
