package typings.ipfsCore.pinLsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LsEntry extends js.Object {
  
  /**
    * -  CID of the pinned node
    */
  var cid: CID = js.native
  
  /**
    * -  Pin type ("recursive", "direct" or "indirect")
    */
  var `type`: PinType = js.native
}
object LsEntry {
  
  @scala.inline
  def apply(cid: CID, `type`: PinType): LsEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LsEntry]
  }
  
  @scala.inline
  implicit class LsEntryOps[Self <: LsEntry] (val x: Self) extends AnyVal {
    
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
    def setCid(value: CID): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PinType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
