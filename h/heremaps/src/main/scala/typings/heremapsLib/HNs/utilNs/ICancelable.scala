package typings
package heremapsLib.HNs.utilNs

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
  def cancel(): scala.Unit
}

object ICancelable {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit]): ICancelable = {
    val __obj = js.Dynamic.literal(cancel = cancel)
  
    __obj.asInstanceOf[ICancelable]
  }
}

