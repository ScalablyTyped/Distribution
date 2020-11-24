package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsCaseSensitive extends js.Object {
  
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  
  var stripTrailingSlash: js.UndefOr[Boolean] = js.native
}
object IsCaseSensitive {
  
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  
  @scala.inline
  implicit class IsCaseSensitiveOps[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    
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
    def setIsCaseSensitive(value: Boolean): Self = this.set("isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCaseSensitive: Self = this.set("isCaseSensitive", js.undefined)
    
    @scala.inline
    def setStripTrailingSlash(value: Boolean): Self = this.set("stripTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripTrailingSlash: Self = this.set("stripTrailingSlash", js.undefined)
  }
}
