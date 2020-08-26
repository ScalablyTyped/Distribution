package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignmentPatternFinder extends js.Object {
  var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
  var height: Double = js.native
  var image: Uint8Array = js.native
  var moduleSize: Double = js.native
  var possibleCenters: js.Array[AlignmentPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  var startX: Double = js.native
  var startY: Double = js.native
  var width: Double = js.native
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double = js.native
  def find(): AlignmentPattern = js.native
  /* private */ def foundPatternCross(stateCount: Double): Boolean = js.native
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern = js.native
}

object AlignmentPatternFinder {
  @scala.inline
  def apply(
    centerFromEnd: (Double, Double) => Double,
    crossCheckStateCount: js.Tuple3[Double, Double, Double],
    find: () => AlignmentPattern,
    foundPatternCross: Double => Boolean,
    handlePossibleCenter: (Double, Double, Double) => AlignmentPattern,
    height: Double,
    image: Uint8Array,
    moduleSize: Double,
    possibleCenters: js.Array[AlignmentPattern],
    resultPointCallback: ResultPointCallback,
    startX: Double,
    startY: Double,
    width: Double
  ): AlignmentPatternFinder = {
    val __obj = js.Dynamic.literal(centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], find = js.Any.fromFunction0(find), foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentPatternFinder]
  }
  @scala.inline
  implicit class AlignmentPatternFinderOps[Self <: AlignmentPatternFinder] (val x: Self) extends AnyVal {
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
    def setCenterFromEnd(value: (Double, Double) => Double): Self = this.set("centerFromEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setCrossCheckStateCount(value: js.Tuple3[Double, Double, Double]): Self = this.set("crossCheckStateCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: () => AlignmentPattern): Self = this.set("find", js.Any.fromFunction0(value))
    @scala.inline
    def setFoundPatternCross(value: Double => Boolean): Self = this.set("foundPatternCross", js.Any.fromFunction1(value))
    @scala.inline
    def setHandlePossibleCenter(value: (Double, Double, Double) => AlignmentPattern): Self = this.set("handlePossibleCenter", js.Any.fromFunction3(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Uint8Array): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleSize(value: Double): Self = this.set("moduleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPossibleCentersVarargs(value: AlignmentPattern*): Self = this.set("possibleCenters", js.Array(value :_*))
    @scala.inline
    def setPossibleCenters(value: js.Array[AlignmentPattern]): Self = this.set("possibleCenters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = this.set("resultPointCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

