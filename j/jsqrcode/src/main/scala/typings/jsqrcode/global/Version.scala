package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Version")
@js.native
class Version protected ()
  extends typings.jsqrcode.Version {
  def this(
    versionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    ecBlocks1: typings.jsqrcode.ECBlocks,
    ecBlocks2: typings.jsqrcode.ECBlocks,
    ecBlocks3: typings.jsqrcode.ECBlocks,
    ecBlocks4: typings.jsqrcode.ECBlocks
  ) = this()
  /* CompleteClass */
  override val AlignmentPatternCenters: js.Array[Double] = js.native
  /* CompleteClass */
  override val DimensionForVersion: Double = js.native
  /* CompleteClass */
  override val TotalCodewords: Double = js.native
  /* CompleteClass */
  override val VersionNumber: Double = js.native
  /* CompleteClass */
  override var alignmentPatternCenters: js.Array[Double] = js.native
  /* CompleteClass */
  override var ecBlocks: js.Array[typings.jsqrcode.ECBlocks] = js.native
  /* CompleteClass */
  override var versionNumber: Double = js.native
  /* CompleteClass */
  override def buildFunctionPattern(): typings.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override def getECBlocksForLevel(ecLevel: typings.jsqrcode.ErrorCorrectionLevel): typings.jsqrcode.ECBlocks = js.native
}

/* static members */
@JSGlobal("Version")
@js.native
object Version extends js.Object {
  val VERSIONS: js.Array[typings.jsqrcode.Version] = js.native
  val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
  def decodeVersionInformation(versionBits: Double): typings.jsqrcode.Version = js.native
  def getProvisionalVersionForDimension(dimension: Double): typings.jsqrcode.Version = js.native
  def getVersionForNumber(versionNumber: Double): typings.jsqrcode.Version = js.native
}

