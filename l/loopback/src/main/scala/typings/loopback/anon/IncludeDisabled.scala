package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeDisabled extends js.Object {
  
  var includeDisabled: Boolean = js.native
}
object IncludeDisabled {
  
  @scala.inline
  def apply(includeDisabled: Boolean): IncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDisabled]
  }
  
  @scala.inline
  implicit class IncludeDisabledOps[Self <: IncludeDisabled] (val x: Self) extends AnyVal {
    
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
    def setIncludeDisabled(value: Boolean): Self = this.set("includeDisabled", value.asInstanceOf[js.Any])
  }
}
