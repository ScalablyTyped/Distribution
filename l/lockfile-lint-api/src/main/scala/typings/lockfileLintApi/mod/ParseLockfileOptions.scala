package typings.lockfileLintApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseLockfileOptions extends js.Object {
  
  var lockfilePath: String = js.native
  
  var lockfileType: String = js.native
}
object ParseLockfileOptions {
  
  @scala.inline
  def apply(lockfilePath: String, lockfileType: String): ParseLockfileOptions = {
    val __obj = js.Dynamic.literal(lockfilePath = lockfilePath.asInstanceOf[js.Any], lockfileType = lockfileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLockfileOptions]
  }
  
  @scala.inline
  implicit class ParseLockfileOptionsOps[Self <: ParseLockfileOptions] (val x: Self) extends AnyVal {
    
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
    def setLockfilePath(value: String): Self = this.set("lockfilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockfileType(value: String): Self = this.set("lockfileType", value.asInstanceOf[js.Any])
  }
}
