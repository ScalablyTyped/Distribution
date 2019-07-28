package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWrapperMethods extends js.Object {
  def destroy(): Unit
}

object MouseWrapperMethods {
  @scala.inline
  def apply(destroy: () => Unit): MouseWrapperMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[MouseWrapperMethods]
  }
}

