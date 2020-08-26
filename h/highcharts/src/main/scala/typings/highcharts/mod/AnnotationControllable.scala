package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationControllable extends js.Object {
  var annotation: Annotation = js.native
  var chart: Chart_ = js.native
  var collection: String = js.native
  var points: js.Array[Point] = js.native
}

object AnnotationControllable {
  @scala.inline
  def apply(annotation: Annotation, chart: Chart_, collection: String, points: js.Array[Point]): AnnotationControllable = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationControllable]
  }
  @scala.inline
  implicit class AnnotationControllableOps[Self <: AnnotationControllable] (val x: Self) extends AnyVal {
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
    def setAnnotation(value: Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setChart(value: Chart_): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

