package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  def dispose(): Unit
}

object KnockoutSubscription {
  @scala.inline
  def apply(dispose: () => Unit): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

