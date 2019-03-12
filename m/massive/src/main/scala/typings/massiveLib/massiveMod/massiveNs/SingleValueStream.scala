package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleValueStream extends js.Object {
  /** Implement the Transform stream that invokes singleValue on everything which passes through it. */
  /* private */ def _transform(
    obj: AnyObject[_],
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit
  /** Converts a single-key object into its value. */
  def singleValue(obj: AnyObject[_]): js.Any
}

object SingleValueStream {
  @scala.inline
  def apply(
    _transform: (AnyObject[_], java.lang.String, js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) => scala.Unit,
    singleValue: AnyObject[_] => js.Any
  ): SingleValueStream = {
    val __obj = js.Dynamic.literal(_transform = js.Any.fromFunction3(_transform), singleValue = js.Any.fromFunction1(singleValue))
  
    __obj.asInstanceOf[SingleValueStream]
  }
}

