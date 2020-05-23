package typings.jenkins.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  def cancel(n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit
  def item(n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
  def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
}

object Cancel {
  @scala.inline
  def apply(
    cancel: (Double, js.Function1[/* err */ Error, Unit]) => Unit,
    item: (Double, js.Function2[/* err */ Error, /* data */ js.Any, Unit]) => Unit,
    list: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit
  ): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), item = js.Any.fromFunction2(item), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Cancel]
  }
}

