package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detector extends js.Object {
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
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalculateModuleSize(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern) => Double): Self = this.set("calculateModuleSize", js.Any.fromFunction3(value))
    @scala.inline
    def setCalculateModuleSizeOneWay(value: (AlignmentPattern, AlignmentPattern) => Double): Self = this.set("calculateModuleSizeOneWay", js.Any.fromFunction2(value))
    @scala.inline
    def setComputeDimension(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => Double): Self = this.set("computeDimension", js.Any.fromFunction4(value))
    @scala.inline
    def setCreateTransform(
      value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => PerspectiveTransform
    ): Self = this.set("createTransform", js.Any.fromFunction5(value))
    @scala.inline
    def setDetect(value: () => DetectorResult): Self = this.set("detect", js.Any.fromFunction0(value))
    @scala.inline
    def setDistance(value: (AlignmentPattern, AlignmentPattern) => Double): Self = this.set("distance", js.Any.fromFunction2(value))
    @scala.inline
    def setFindAlignmentInRegion(value: (Double, Double, Double, Double) => AlignmentPattern): Self = this.set("findAlignmentInRegion", js.Any.fromFunction4(value))
    @scala.inline
    def setImage(value: Uint8Array): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessFinderPatternInfo(value: FinderPatternInfo => DetectorResult): Self = this.set("processFinderPatternInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = this.set("resultPointCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleGrid(value: (Uint8Array, PerspectiveTransform, Double) => BitMatrix): Self = this.set("sampleGrid", js.Any.fromFunction3(value))
    @scala.inline
    def setSizeOfBlackWhiteBlackRun(value: (Double, Double, Double, Double) => Double): Self = this.set("sizeOfBlackWhiteBlackRun", js.Any.fromFunction4(value))
    @scala.inline
    def setSizeOfBlackWhiteBlackRunBothWays(value: (Double, Double, Double, Double) => Double): Self = this.set("sizeOfBlackWhiteBlackRunBothWays", js.Any.fromFunction4(value))
  }
  
}

