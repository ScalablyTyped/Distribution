package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  /** A boolean value specifying whether access to devices on the I2C bus should be allowed even if they are already in use by a kernel driver/module. Corresponds to I2C_SLAVE_FORCE on Linux. The valid values for forceAccess are true and false. Optional, the default value is false. */
  var forceAccess: Boolean
}

object OpenOptions {
  @scala.inline
  def apply(forceAccess: Boolean): OpenOptions = {
    val __obj = js.Dynamic.literal(forceAccess = forceAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
}

