package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Version")
@js.native
class Version protected () extends js.Object {
  def this(
    versionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    ecBlocks1: ECBlocks,
    ecBlocks2: ECBlocks,
    ecBlocks3: ECBlocks,
    ecBlocks4: ECBlocks
  ) = this()
  val AlignmentPatternCenters: js.Array[Double] = js.native
  val DimensionForVersion: Double = js.native
  val TotalCodewords: Double = js.native
  val VersionNumber: Double = js.native
  var alignmentPatternCenters: js.Array[Double] = js.native
  var ecBlocks: js.Array[ECBlocks] = js.native
  var versionNumber: Double = js.native
  def buildFunctionPattern(): BitMatrix = js.native
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks = js.native
}

/* static members */
@JSGlobal("Version")
@js.native
object Version extends js.Object {
  val VERSIONS: js.Array[Version] = js.native
  val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
  def decodeVersionInformation(versionBits: Double): Version = js.native
  def getProvisionalVersionForDimension(dimension: Double): Version = js.native
  def getVersionForNumber(versionNumber: Double): Version = js.native
}

