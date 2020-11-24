package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenOptions extends js.Object {
  
  /** A boolean value specifying whether access to devices on the I2C bus should be allowed even if they are already in use by a kernel driver/module. Corresponds to I2C_SLAVE_FORCE on Linux. The valid values for forceAccess are true and false. Optional, the default value is false. */
  var forceAccess: Boolean = js.native
}
object OpenOptions {
  
  @scala.inline
  def apply(forceAccess: Boolean): OpenOptions = {
    val __obj = js.Dynamic.literal(forceAccess = forceAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
    
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
    def setForceAccess(value: Boolean): Self = this.set("forceAccess", value.asInstanceOf[js.Any])
  }
}
