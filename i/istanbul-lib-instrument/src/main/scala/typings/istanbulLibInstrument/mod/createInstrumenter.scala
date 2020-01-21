package typings.istanbulLibInstrument.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", "createInstrumenter")
@js.native
object createInstrumenter extends js.Object {
  def apply(): Instrumenter = js.native
  def apply(options: Partial[InstrumenterOptions]): Instrumenter = js.native
}

