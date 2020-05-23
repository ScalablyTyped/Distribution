package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detector extends js.Object {
  var image: Uint8Array
  var resultPointCallback: ResultPointCallback
  def calculateModuleSize(topLeft: AlignmentPattern, topRight: AlignmentPattern, bottomLeft: AlignmentPattern): Double
  def calculateModuleSizeOneWay(pattern: AlignmentPattern, otherPattern: AlignmentPattern): Double
  def computeDimension(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    moduleSize: Double
  ): Double
  def createTransform(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    alignmentPattern: AlignmentPattern,
    dimension: Double
  ): PerspectiveTransform
  def detect(): DetectorResult
  def distance(pattern1: AlignmentPattern, pattern2: AlignmentPattern): Double
  def findAlignmentInRegion(
    overallEstModuleSize: Double,
    estAlignmentX: Double,
    estAlignmentY: Double,
    allowanceFactor: Double
  ): AlignmentPattern
  def processFinderPatternInfo(info: FinderPatternInfo): DetectorResult
  def sampleGrid(image: Uint8Array, transform: PerspectiveTransform, dimension: Double): BitMatrix
  def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double
  def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double
}

object Detector {
  @scala.inline
  def apply(
    calculateModuleSize: (AlignmentPattern, AlignmentPattern, AlignmentPattern) => Double,
    calculateModuleSizeOneWay: (AlignmentPattern, AlignmentPattern) => Double,
    computeDimension: (AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => Double,
    createTransform: (AlignmentPattern, AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => PerspectiveTransform,
    detect: () => DetectorResult,
    distance: (AlignmentPattern, AlignmentPattern) => Double,
    findAlignmentInRegion: (Double, Double, Double, Double) => AlignmentPattern,
    image: Uint8Array,
    processFinderPatternInfo: FinderPatternInfo => DetectorResult,
    resultPointCallback: ResultPointCallback,
    sampleGrid: (Uint8Array, PerspectiveTransform, Double) => BitMatrix,
    sizeOfBlackWhiteBlackRun: (Double, Double, Double, Double) => Double,
    sizeOfBlackWhiteBlackRunBothWays: (Double, Double, Double, Double) => Double
  ): Detector = {
    val __obj = js.Dynamic.literal(calculateModuleSize = js.Any.fromFunction3(calculateModuleSize), calculateModuleSizeOneWay = js.Any.fromFunction2(calculateModuleSizeOneWay), computeDimension = js.Any.fromFunction4(computeDimension), createTransform = js.Any.fromFunction5(createTransform), detect = js.Any.fromFunction0(detect), distance = js.Any.fromFunction2(distance), findAlignmentInRegion = js.Any.fromFunction4(findAlignmentInRegion), image = image.asInstanceOf[js.Any], processFinderPatternInfo = js.Any.fromFunction1(processFinderPatternInfo), resultPointCallback = resultPointCallback.asInstanceOf[js.Any], sampleGrid = js.Any.fromFunction3(sampleGrid), sizeOfBlackWhiteBlackRun = js.Any.fromFunction4(sizeOfBlackWhiteBlackRun), sizeOfBlackWhiteBlackRunBothWays = js.Any.fromFunction4(sizeOfBlackWhiteBlackRunBothWays))
    __obj.asInstanceOf[Detector]
  }
}

