package typings.hoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hoek", "Bench")
@js.native
class Bench () extends js.Object {
  
  /** The time (ms) elapsed since the timer was created. */
  def elapsed(): Double = js.native
  
  /** The number of milliseconds on the node clock elapsed since the epoch. */
  var ts: Double = js.native
}
