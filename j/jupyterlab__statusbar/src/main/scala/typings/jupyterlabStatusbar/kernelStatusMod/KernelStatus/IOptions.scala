package typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a KernelStatus object.
  */
trait IOptions extends js.Object {
  /**
    * A click handler for the item. By default
    * we launch a kernel selection dialog.
    */
  def onClick(): Unit
}

object IOptions {
  @scala.inline
  def apply(onClick: () => Unit): IOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[IOptions]
  }
}

