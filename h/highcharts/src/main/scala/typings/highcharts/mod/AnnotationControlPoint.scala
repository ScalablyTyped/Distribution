package typings.highcharts.mod

import typings.highcharts.PartialAnnotationControlP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "AnnotationControlPoint")
@js.native
class AnnotationControlPoint protected () extends js.Object {
  /**
    * A control point class which is a connection between controllable
    * transform methods and a user actions.
    *
    * @param chart
    *        A chart instance.
    *
    * @param target
    *        A controllable instance which is a target for a control point.
    *
    * @param options
    *        An options object.
    *
    * @param index
    *        Point index.
    */
  def this(chart: Chart_, target: AnnotationControllable, options: AnnotationControlPointOptionsObject) = this()
  def this(
    chart: Chart_,
    target: AnnotationControllable,
    options: AnnotationControlPointOptionsObject,
    index: Double
  ) = this()
  /**
    * Set the visibility of the control point.
    *
    * @param visible
    *        Visibility of the control point.
    */
  def setVisibility(visible: Boolean): Unit = js.native
  /**
    * Update the control point.
    *
    * @param userOptions
    *        New options for the control point.
    */
  def update(userOptions: PartialAnnotationControlP): Unit = js.native
}

