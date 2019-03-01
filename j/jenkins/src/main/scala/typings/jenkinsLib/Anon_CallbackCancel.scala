package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCancel extends js.Object {
  def cancel(n: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit
  def item(n: scala.Double, callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
  def list(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

object Anon_CallbackCancel {
  @scala.inline
  def apply(
    cancel: js.Function2[scala.Double, js.Function1[/* err */ nodeLib.Error, scala.Unit], scala.Unit],
    item: js.Function2[
      scala.Double, 
      js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ],
    list: js.Function1[js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit], scala.Unit]
  ): Anon_CallbackCancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[Anon_CallbackCancel]
  }
}

