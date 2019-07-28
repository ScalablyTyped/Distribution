package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Detector")
@js.native
class Detector protected () extends js.Object {
  def this(image: Uint8Array) = this()
  var image: Uint8Array = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def calculateModuleSize(topLeft: AlignmentPattern, topRight: AlignmentPattern, bottomLeft: AlignmentPattern): Double = js.native
  def calculateModuleSizeOneWay(pattern: AlignmentPattern, otherPattern: AlignmentPattern): Double = js.native
  def computeDimension(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    moduleSize: Double
  ): Double = js.native
  def createTransform(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    alignmentPattern: AlignmentPattern,
    dimension: Double
  ): PerspectiveTransform = js.native
  def detect(): DetectorResult = js.native
  def distance(pattern1: AlignmentPattern, pattern2: AlignmentPattern): Double = js.native
  def findAlignmentInRegion(
    overallEstModuleSize: Double,
    estAlignmentX: Double,
    estAlignmentY: Double,
    allowanceFactor: Double
  ): AlignmentPattern = js.native
  def processFinderPatternInfo(info: FinderPatternInfo): DetectorResult = js.native
  def sampleGrid(image: Uint8Array, transform: PerspectiveTransform, dimension: Double): BitMatrix = js.native
  def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
  def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
}

