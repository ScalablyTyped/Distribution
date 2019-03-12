package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCancel extends js.Object {
  def cancel(n: scala.Double, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit
  def item(n: scala.Double, callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
  def list(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

object Anon_CallbackCancel {
  @scala.inline
  def apply(
    cancel: (scala.Double, js.Function1[/* err */ stdLib.Error, scala.Unit]) => scala.Unit,
    item: (scala.Double, js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]) => scala.Unit,
    list: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit] => scala.Unit
  ): Anon_CallbackCancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), item = js.Any.fromFunction2(item), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[Anon_CallbackCancel]
  }
}

