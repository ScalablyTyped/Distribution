package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): Unit
  def setDisabled(disabled: Boolean): Unit
  def stop(): Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(destroy: () => Unit, setDisabled: Boolean => Unit, stop: () => Unit): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

