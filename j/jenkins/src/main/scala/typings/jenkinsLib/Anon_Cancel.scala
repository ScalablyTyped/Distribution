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
    cancel: js.Function1[scala.Double, js.Promise[scala.Unit]],
    item: js.Function1[scala.Double, js.Promise[_]],
    list: js.Function0[js.Promise[_]]
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

