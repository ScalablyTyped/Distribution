package typings.ipfsCore.anon

import typings.ipfsCore.configMod.IPFSConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Original extends js.Object {
  
  var original: IPFSConfig = js.native
  
  var updated: IPFSConfig = js.native
}
object Original {
  
  @scala.inline
  def apply(original: IPFSConfig, updated: IPFSConfig): Original = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  @scala.inline
  implicit class OriginalOps[Self <: Original] (val x: Self) extends AnyVal {
    
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
    def setOriginal(value: IPFSConfig): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: IPFSConfig): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
