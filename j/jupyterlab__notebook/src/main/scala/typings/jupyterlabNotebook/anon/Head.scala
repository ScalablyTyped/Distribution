package typings.jupyterlabNotebook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Head extends js.Object {
  
  var anchor: Null = js.native
  
  var head: Null = js.native
}
object Head {
  
  @scala.inline
  def apply(anchor: Null, head: Null): Head = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Head]
  }
  
  @scala.inline
  implicit class HeadOps[Self <: Head] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Null): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: Null): Self = this.set("head", value.asInstanceOf[js.Any])
  }
}
