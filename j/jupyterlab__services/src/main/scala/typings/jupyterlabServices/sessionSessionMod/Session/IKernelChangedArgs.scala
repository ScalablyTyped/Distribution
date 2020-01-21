package typings.jupyterlabServices.sessionSessionMod.Session

import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the kernel changed signal.
  */
trait IKernelChangedArgs extends js.Object {
  /**
    * The new kernel.
    */
  var newValue: IKernelConnection | Null
  /**
    * The old kernel.
    */
  var oldValue: IKernelConnection | Null
}

object IKernelChangedArgs {
  @scala.inline
  def apply(newValue: IKernelConnection = null, oldValue: IKernelConnection = null): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelChangedArgs]
  }
}

