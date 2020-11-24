package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Now extends js.Object {
  
  var id: js.Any = js.native
  
  var now: js.Any = js.native
  
  var overwrite: Boolean = js.native
  
  var was: js.Any = js.native
}
object Now {
  
  @scala.inline
  def apply(id: js.Any, now: js.Any, overwrite: Boolean, was: js.Any): Now = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], was = was.asInstanceOf[js.Any])
    __obj.asInstanceOf[Now]
  }
  
  @scala.inline
  implicit class NowOps[Self <: Now] (val x: Self) extends AnyVal {
    
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: js.Any): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWas(value: js.Any): Self = this.set("was", value.asInstanceOf[js.Any])
  }
}
