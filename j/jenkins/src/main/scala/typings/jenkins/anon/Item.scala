package typings.jenkins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  def cancel(n: Double): js.Promise[Unit]
  def item(n: Double): js.Promise[_]
  def list(): js.Promise[_]
}

object Item {
  @scala.inline
  def apply(cancel: Double => js.Promise[Unit], item: Double => js.Promise[_], list: () => js.Promise[_]): Item = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[Item]
  }
}

