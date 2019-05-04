package typings
package atJupyterlabOutputareaLib.libWidgetMod.StdinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options to create a stdin widget.
  */
trait IOptions extends js.Object {
  /**
    * The kernel future associated with the request.
    */
  var future: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IFuture
  /**
    * Whether the input is a password.
    */
  var password: scala.Boolean
  /**
    * The prompt text.
    */
  var prompt: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(
    future: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IFuture,
    password: scala.Boolean,
    prompt: java.lang.String
  ): IOptions = {
    val __obj = js.Dynamic.literal(future = future, password = password, prompt = prompt)
  
    __obj.asInstanceOf[IOptions]
  }
}

