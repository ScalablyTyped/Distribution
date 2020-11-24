package typings.ipfsCore.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeResult extends js.Object {
  
  /**
    * - The last CID encountered during the traversal
    */
  var cid: CID = js.native
  
  /**
    * - The path to the end of the IPFS path
    * inside the node referenced by the CID
    */
  var remainderPath: String = js.native
}
object TreeResult {
  
  @scala.inline
  def apply(cid: CID, remainderPath: String): TreeResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], remainderPath = remainderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeResult]
  }
  
  @scala.inline
  implicit class TreeResultOps[Self <: TreeResult] (val x: Self) extends AnyVal {
    
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
    def setRemainderPath(value: String): Self = this.set("remainderPath", value.asInstanceOf[js.Any])
  }
}
