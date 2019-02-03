package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Version")
@js.native
class Version protected () extends js.Object {
  def this(versionNumber: scala.Double, alignmentPatternCenters: js.Array[scala.Double], ecBlocks1: ECBlocks, ecBlocks2: ECBlocks, ecBlocks3: ECBlocks, ecBlocks4: ECBlocks) = this()
  val AlignmentPatternCenters: js.Array[scala.Double] = js.native
  val DimensionForVersion: scala.Double = js.native
  val TotalCodewords: scala.Double = js.native
  val VersionNumber: scala.Double = js.native
  var alignmentPatternCenters: js.Array[scala.Double] = js.native
  var ecBlocks: js.Array[ECBlocks] = js.native
  var versionNumber: scala.Double = js.native
  def buildFunctionPattern(): BitMatrix = js.native
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks = js.native
}

/* static members */
@JSGlobal("Version")
@js.native
object Version extends js.Object {
  val VERSIONS: js.Array[jsqrcodeLib.Version] = js.native
  val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
  def decodeVersionInformation(versionBits: scala.Double): jsqrcodeLib.Version = js.native
  def getProvisionalVersionForDimension(dimension: scala.Double): jsqrcodeLib.Version = js.native
  def getVersionForNumber(versionNumber: scala.Double): jsqrcodeLib.Version = js.native
}

