package typings.highcharts.mod

import typings.highcharts.PartialAnnotationsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Annotation")
@js.native
class Annotation protected () extends js.Object {
  /**
    * An annotation class which serves as a container for items like labels or
    * shapes. Created items are positioned on the chart either by linking them
    * to existing points or created mock points
    *
    * @param chart
    *        a chart instance
    *
    * @param userOptions
    *        the options object
    */
  def this(chart: Chart_, userOptions: AnnotationsOptions) = this()
  /**
    * The chart that the annotation belongs to.
    */
  var chart: Chart_ = js.native
  /**
    * The group svg element.
    */
  var group: SVGElement = js.native
  /**
    * The group svg element of the annotation's labels.
    */
  var labelsGroup: SVGElement = js.native
  /**
    * The options for the annotations.
    */
  var options: AnnotationsOptions = js.native
  /**
    * The array of points which defines the annotation.
    */
  var points: js.Array[Point] = js.native
  /**
    * The group svg element of the annotation's shapes.
    */
  var shapesGroup: SVGElement = js.native
  /**
    * The user options for the annotations.
    */
  var userOptions: AnnotationsOptions = js.native
  /**
    * Updates an annotation.
    *
    * @param userOptions
    *        New user options for the annotation.
    */
  def update(userOptions: PartialAnnotationsOptions): Unit = js.native
}

