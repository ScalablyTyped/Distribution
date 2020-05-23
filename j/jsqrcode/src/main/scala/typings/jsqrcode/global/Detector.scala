package typings.jsqrcode.global

import typings.jsqrcode.ResultPointCallback
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Detector")
@js.native
class Detector protected ()
  extends typings.jsqrcode.Detector {
  def this(image: Uint8Array) = this()
  /* CompleteClass */
  override var image: Uint8Array = js.native
  /* CompleteClass */
  override var resultPointCallback: ResultPointCallback = js.native
  /* CompleteClass */
  override def calculateModuleSize(
    topLeft: typings.jsqrcode.AlignmentPattern,
    topRight: typings.jsqrcode.AlignmentPattern,
    bottomLeft: typings.jsqrcode.AlignmentPattern
  ): Double = js.native
  /* CompleteClass */
  override def calculateModuleSizeOneWay(pattern: typings.jsqrcode.AlignmentPattern, otherPattern: typings.jsqrcode.AlignmentPattern): Double = js.native
  /* CompleteClass */
  override def computeDimension(
    topLeft: typings.jsqrcode.AlignmentPattern,
    topRight: typings.jsqrcode.AlignmentPattern,
    bottomLeft: typings.jsqrcode.AlignmentPattern,
    moduleSize: Double
  ): Double = js.native
  /* CompleteClass */
  override def createTransform(
    topLeft: typings.jsqrcode.AlignmentPattern,
    topRight: typings.jsqrcode.AlignmentPattern,
    bottomLeft: typings.jsqrcode.AlignmentPattern,
    alignmentPattern: typings.jsqrcode.AlignmentPattern,
    dimension: Double
  ): typings.jsqrcode.PerspectiveTransform = js.native
  /* CompleteClass */
  override def detect(): typings.jsqrcode.DetectorResult = js.native
  /* CompleteClass */
  override def distance(pattern1: typings.jsqrcode.AlignmentPattern, pattern2: typings.jsqrcode.AlignmentPattern): Double = js.native
  /* CompleteClass */
  override def findAlignmentInRegion(
    overallEstModuleSize: Double,
    estAlignmentX: Double,
    estAlignmentY: Double,
    allowanceFactor: Double
  ): typings.jsqrcode.AlignmentPattern = js.native
  /* CompleteClass */
  override def processFinderPatternInfo(info: typings.jsqrcode.FinderPatternInfo): typings.jsqrcode.DetectorResult = js.native
  /* CompleteClass */
  override def sampleGrid(image: Uint8Array, transform: typings.jsqrcode.PerspectiveTransform, dimension: Double): typings.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
  /* CompleteClass */
  override def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
}

