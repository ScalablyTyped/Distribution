package typings
package jsqubitsLib.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSQubitsStatic extends js.Object {
  var ALL: jsqubitsLib.jsqubitsLibStrings.ALL = js.native
  var Complex: ComplexStatic = js.native
  var Measurement: MeasurementStatic = js.native
  var ONE: jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex = js.native
  var QMath: JsqubitsmathStatic = js.native
  var QState: QStateStatic = js.native
  var StateWithAmplitude: StateWithAmplitudeStatic = js.native
  var ZERO: jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex = js.native
  var roundToZero: jsqubitsLib.jsqubitsLibNumbers.`0DOT0000001` = js.native
  def apply(bitString: java.lang.String): jsqubitsLib.jsqubitsMod.jsqubitsNs.QState = js.native
  def complex(real: scala.Double, imaginary: scala.Double): jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex = js.native
  def real(real: scala.Double): jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex = js.native
}

