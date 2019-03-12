package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  def cancel(n: scala.Double): js.Promise[scala.Unit]
  def item(n: scala.Double): js.Promise[_]
  def list(): js.Promise[_]
}

object Anon_Cancel {
  @scala.inline
  def apply(
    cancel: scala.Double => js.Promise[scala.Unit],
    item: scala.Double => js.Promise[_],
    list: () => js.Promise[_]
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

