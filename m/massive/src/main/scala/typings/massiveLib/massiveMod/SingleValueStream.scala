package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("massive", "SingleValueStream")
@js.native
class SingleValueStream protected ()
  extends massiveLib.massiveMod.massiveNs.SingleValueStream {
  /** A stream which processes single-key results objects into their values for convenience on the client side. */
  def this(options: massiveLib.massiveMod.massiveNs.AnyObject[_]) = this()
  /** Implement the Transform stream that invokes singleValue on everything which passes through it. */
  /* CompleteClass */
  /* private */ override def _transform(
    obj: massiveLib.massiveMod.massiveNs.AnyObject[_],
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  /** Converts a single-key object into its value. */
  /* CompleteClass */
  override def singleValue(obj: massiveLib.massiveMod.massiveNs.AnyObject[_]): js.Any = js.native
}

