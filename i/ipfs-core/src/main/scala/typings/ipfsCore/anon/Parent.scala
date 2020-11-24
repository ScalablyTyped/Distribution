package typings.ipfsCore.anon

import typings.ipfsCore.ipfsCoreStrings.direct
import typings.ipfsCore.ipfsCoreStrings.recursive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parent extends js.Object {
  
  var cid: js.Any = js.native
  
  var metadata: js.Any = js.native
  
  var parent: js.UndefOr[scala.Nothing] = js.native
  
  var pinned: Boolean = js.native
  
  var reason: direct | recursive = js.native
}
object Parent {
  
  @scala.inline
  def apply(cid: js.Any, metadata: js.Any, pinned: Boolean, reason: direct | recursive): Parent = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit class ParentOps[Self <: Parent] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: direct | recursive): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
