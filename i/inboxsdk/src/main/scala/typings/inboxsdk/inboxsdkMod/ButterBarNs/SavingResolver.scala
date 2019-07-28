package typings.inboxsdk.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavingResolver extends js.Object {
  def reject(): Unit
  def resolve(): Unit
}

object SavingResolver {
  @scala.inline
  def apply(reject: () => Unit, resolve: () => Unit): SavingResolver = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
  
    __obj.asInstanceOf[SavingResolver]
  }
}

