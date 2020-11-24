package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reason extends js.Object {
  
  var cid: js.Any = js.native
  
  var metadata: js.UndefOr[scala.Nothing] = js.native
  
  var parent: js.UndefOr[scala.Nothing] = js.native
  
  var pinned: Boolean = js.native
  
  var reason: js.UndefOr[scala.Nothing] = js.native
}
object Reason {
  
  @scala.inline
  def apply(cid: js.Any, pinned: Boolean): Reason = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit class ReasonOps[Self <: Reason] (val x: Self) extends AnyVal {
    
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
    def setCid(value: js.Any): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
  }
}
