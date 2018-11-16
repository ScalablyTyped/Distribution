package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Detector")
@js.native
class Detector protected () extends js.Object {
  def this(image: stdLib.Uint8Array) = this()
  var image: stdLib.Uint8Array = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def calculateModuleSize(topLeft: AlignmentPattern, topRight: AlignmentPattern, bottomLeft: AlignmentPattern): scala.Double = js.native
  def calculateModuleSizeOneWay(pattern: AlignmentPattern, otherPattern: AlignmentPattern): scala.Double = js.native
  def computeDimension(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    moduleSize: scala.Double
  ): scala.Double = js.native
  def createTransform(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    alignmentPattern: AlignmentPattern,
    dimension: scala.Double
  ): PerspectiveTransform = js.native
  def detect(): DetectorResult = js.native
  def distance(pattern1: AlignmentPattern, pattern2: AlignmentPattern): scala.Double = js.native
  def findAlignmentInRegion(
    overallEstModuleSize: scala.Double,
    estAlignmentX: scala.Double,
    estAlignmentY: scala.Double,
    allowanceFactor: scala.Double
  ): AlignmentPattern = js.native
  def processFinderPatternInfo(info: FinderPatternInfo): DetectorResult = js.native
  def sampleGrid(image: stdLib.Uint8Array, transform: PerspectiveTransform, dimension: scala.Double): BitMatrix = js.native
  def sizeOfBlackWhiteBlackRun(fromX: scala.Double, fromY: scala.Double, toX: scala.Double, toY: scala.Double): scala.Double = js.native
  def sizeOfBlackWhiteBlackRunBothWays(fromX: scala.Double, fromY: scala.Double, toX: scala.Double, toY: scala.Double): scala.Double = js.native
}

