package typings.heremaps.HNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to cancelable requests and actions.
  */
trait ICancelable extends js.Object {
  /**
    * This method is used to cancel current action
    */
  def cancel(): Unit
}

object ICancelable {
  @scala.inline
  def apply(cancel: () => Unit): ICancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[ICancelable]
  }
}

