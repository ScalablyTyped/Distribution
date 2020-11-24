package typings.hotShots.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildClientOptions extends js.Object {
  
  var globalTags: js.UndefOr[Tags] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var suffix: js.UndefOr[String] = js.native
}
object ChildClientOptions {
  
  @scala.inline
  def apply(): ChildClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildClientOptions]
  }
  
  @scala.inline
  implicit class ChildClientOptionsOps[Self <: ChildClientOptions] (val x: Self) extends AnyVal {
    
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
    def setGlobalTagsVarargs(value: String*): Self = this.set("globalTags", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTags(value: Tags): Self = this.set("globalTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTags: Self = this.set("globalTags", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
