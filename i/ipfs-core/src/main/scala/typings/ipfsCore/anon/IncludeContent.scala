package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeContent extends js.Object {
  
  var includeContent: js.UndefOr[Boolean] = js.native
}
object IncludeContent {
  
  @scala.inline
  def apply(): IncludeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeContent]
  }
  
  @scala.inline
  implicit class IncludeContentOps[Self <: IncludeContent] (val x: Self) extends AnyVal {
    
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
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeContent: Self = this.set("includeContent", js.undefined)
  }
}
