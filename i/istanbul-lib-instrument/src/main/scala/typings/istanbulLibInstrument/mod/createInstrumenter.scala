package typings.istanbulLibInstrument.mod

import typings.istanbulLibInstrument.anon.PartialInstrumenterOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", "createInstrumenter")
@js.native
object createInstrumenter extends js.Object {
  def apply(): Instrumenter = js.native
  def apply(options: PartialInstrumenterOption): Instrumenter = js.native
}

