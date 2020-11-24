package typings.lockfileLintApi.mod

import typings.lockfileLintApi.lockfileLintApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseLockfileResult extends js.Object {
  
  var `object`: Packages = js.native
  
  var `type`: success = js.native
}
object ParseLockfileResult {
  
  @scala.inline
  def apply(`object`: Packages, `type`: success): ParseLockfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLockfileResult]
  }
  
  @scala.inline
  implicit class ParseLockfileResultOps[Self <: ParseLockfileResult] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Packages): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: success): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
