package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  val AlignmentPatternCenters: js.Array[Double]
  val DimensionForVersion: Double
  val TotalCodewords: Double
  val VersionNumber: Double
  var alignmentPatternCenters: js.Array[Double]
  var ecBlocks: js.Array[ECBlocks]
  var versionNumber: Double
  def buildFunctionPattern(): BitMatrix
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks
}

object Version {
  @scala.inline
  def apply(
    AlignmentPatternCenters: js.Array[Double],
    DimensionForVersion: Double,
    TotalCodewords: Double,
    VersionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    buildFunctionPattern: () => BitMatrix,
    ecBlocks: js.Array[ECBlocks],
    getECBlocksForLevel: ErrorCorrectionLevel => ECBlocks,
    versionNumber: Double
  ): Version = {
    val __obj = js.Dynamic.literal(AlignmentPatternCenters = AlignmentPatternCenters.asInstanceOf[js.Any], DimensionForVersion = DimensionForVersion.asInstanceOf[js.Any], TotalCodewords = TotalCodewords.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any], alignmentPatternCenters = alignmentPatternCenters.asInstanceOf[js.Any], buildFunctionPattern = js.Any.fromFunction0(buildFunctionPattern), ecBlocks = ecBlocks.asInstanceOf[js.Any], getECBlocksForLevel = js.Any.fromFunction1(getECBlocksForLevel), versionNumber = versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

