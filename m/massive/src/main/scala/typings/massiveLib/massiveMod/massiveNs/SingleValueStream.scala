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
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit
  /** Converts a single-key object into its value. */
  def singleValue(obj: AnyObject[_]): js.Any
}

object SingleValueStream {
  @scala.inline
  def apply(
    _transform: js.Function3[
      AnyObject[_], 
      java.lang.String, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ],
    singleValue: js.Function1[AnyObject[_], js.Any]
  ): SingleValueStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_transform")(_transform)
    __obj.updateDynamic("singleValue")(singleValue)
    __obj.asInstanceOf[SingleValueStream]
  }
}

