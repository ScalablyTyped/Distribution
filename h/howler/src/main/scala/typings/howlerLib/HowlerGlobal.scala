package typings
package howlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HowlerGlobal extends js.Object {
  var autoSuspend: scala.Boolean = js.native
  var autoUnlock: scala.Boolean = js.native
  var ctx: stdLib.AudioContext = js.native
  var html5PoolSize: scala.Double = js.native
  var masterGain: stdLib.GainNode = js.native
  var noAudio: scala.Boolean = js.native
  var usingWebAudio: scala.Boolean = js.native
  def codecs(ext: java.lang.String): scala.Boolean = js.native
  def mute(muted: scala.Boolean): this.type = js.native
  def orientation(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    xUp: scala.Double,
    yUp: scala.Double,
    zUp: scala.Double
  ): this.type | scala.Unit = js.native
  def pos(x: scala.Double, y: scala.Double, z: scala.Double): this.type | scala.Unit = js.native
  def stereo(pan: scala.Double): this.type = js.native
  def unload(): this.type = js.native
  def volume(): scala.Double = js.native
  def volume(volume: scala.Double): this.type = js.native
}

