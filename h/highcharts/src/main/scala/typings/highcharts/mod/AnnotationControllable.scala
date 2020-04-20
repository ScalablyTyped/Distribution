package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationControllable extends js.Object {
  var annotation: Annotation
  var chart: Chart_
  var collection: String
  var points: js.Array[Point]
}

object AnnotationControllable {
  @scala.inline
  def apply(annotation: Annotation, chart: Chart_, collection: String, points: js.Array[Point]): AnnotationControllable = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationControllable]
  }
}

