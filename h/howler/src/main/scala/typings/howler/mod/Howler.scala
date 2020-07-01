package typings.howler.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.AudioContext
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Howler extends js.Object {
  var autoSuspend: Boolean = js.native
  var autoUnlock: Boolean = js.native
  var ctx: AudioContext = js.native
  var html5PoolSize: Double = js.native
  var masterGain: GainNode = js.native
  var noAudio: Boolean = js.native
  var usingWebAudio: Boolean = js.native
  def codecs(ext: String): Boolean = js.native
  def mute(muted: Boolean): this.type = js.native
  def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type | Unit = js.native
  def pos(x: Double, y: Double, z: Double): this.type | Unit = js.native
  def stereo(pan: Double): this.type = js.native
  def unload(): this.type = js.native
  def volume(): Double = js.native
  def volume(volume: Double): this.type = js.native
}

@JSImport("howler", "Howler")
@js.native
object Howler extends TopLevel[Howler]

