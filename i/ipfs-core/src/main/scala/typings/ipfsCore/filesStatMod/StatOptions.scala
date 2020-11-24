package typings.ipfsCore.filesStatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatOptions extends js.Object {
  
  /**
    * - If true, return only the CID
    */
  var hash: js.UndefOr[Boolean] = js.native
  
  /**
    * - If true, return only the size
    */
  var size: js.UndefOr[Boolean] = js.native
  
  /**
    * - If true, compute the amount of the DAG that is local and if possible the total size
    */
  var withLocal: js.UndefOr[Boolean] = js.native
}
object StatOptions {
  
  @scala.inline
  def apply(): StatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatOptions]
  }
  
  @scala.inline
  implicit class StatOptionsOps[Self <: StatOptions] (val x: Self) extends AnyVal {
    
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
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWithLocal(value: Boolean): Self = this.set("withLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithLocal: Self = this.set("withLocal", js.undefined)
  }
}
