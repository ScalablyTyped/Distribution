package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AlignmentPatternFinder")
@js.native
class AlignmentPatternFinder protected () extends js.Object {
  def this(image: stdLib.Uint8Array, startX: scala.Double, startY: scala.Double, width: scala.Double, height: scala.Double, moduleSize: scala.Double, resultPointCallback: ResultPointCallback) = this()
  var crossCheckStateCount: js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  var height: scala.Double = js.native
  var image: stdLib.Uint8Array = js.native
  var moduleSize: scala.Double = js.native
  var possibleCenters: js.Array[AlignmentPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  var startX: scala.Double = js.native
  var startY: scala.Double = js.native
  var width: scala.Double = js.native
  /* private */ def centerFromEnd(stateCount: scala.Double, end: scala.Double): scala.Double = js.native
  def find(): AlignmentPattern = js.native
  /* private */ def foundPatternCross(stateCount: scala.Double): scala.Boolean = js.native
  /* private */ def handlePossibleCenter(stateCount: scala.Double, i: scala.Double, j: scala.Double): AlignmentPattern = js.native
}

