package typings.ipfsCore.anon

import typings.ipfsCore.ipfsCoreStrings.indirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pinned extends js.Object {
  
  var cid: js.Any = js.native
  
  var metadata: js.UndefOr[scala.Nothing] = js.native
  
  var parent: js.Any = js.native
  
  var pinned: Boolean = js.native
  
  var reason: indirect = js.native
}
object Pinned {
  
  @scala.inline
  def apply(cid: js.Any, parent: js.Any, pinned: Boolean, reason: indirect): Pinned = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pinned]
  }
  
  @scala.inline
  implicit class PinnedOps[Self <: Pinned] (val x: Self) extends AnyVal {
    
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
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: indirect): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
