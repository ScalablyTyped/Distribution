package typings.mainBowerFiles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaths extends js.Object {
  
  var bowerDirectory: js.UndefOr[String] = js.native
  
  var bowerJson: js.UndefOr[String] = js.native
  
  var bowerrc: js.UndefOr[String] = js.native
}
object IPaths {
  
  @scala.inline
  def apply(): IPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaths]
  }
  
  @scala.inline
  implicit class IPathsOps[Self <: IPaths] (val x: Self) extends AnyVal {
    
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
    def setBowerDirectory(value: String): Self = this.set("bowerDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBowerDirectory: Self = this.set("bowerDirectory", js.undefined)
    
    @scala.inline
    def setBowerJson(value: String): Self = this.set("bowerJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBowerJson: Self = this.set("bowerJson", js.undefined)
    
    @scala.inline
    def setBowerrc(value: String): Self = this.set("bowerrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBowerrc: Self = this.set("bowerrc", js.undefined)
  }
}
