package typings.massive.massiveMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("massive", "SingleValueStream")
@js.native
class SingleValueStream protected () extends js.Object {
  /** A stream which processes single-key results objects into their values for convenience on the client side. */
  def this(options: AnyObject[_]) = this()
  /** Implement the Transform stream that invokes singleValue on everything which passes through it. */
  /* private */ def _transform(obj: AnyObject[_], encoding: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /** Converts a single-key object into its value. */
  def singleValue(obj: AnyObject[_]): js.Any = js.native
}

