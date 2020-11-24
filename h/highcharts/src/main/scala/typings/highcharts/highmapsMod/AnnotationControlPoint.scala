package typings.highcharts.highmapsMod

import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationControllable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "AnnotationControlPoint")
@js.native
class AnnotationControlPoint protected ()
  extends typings.highcharts.mod.AnnotationControlPoint {
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
  def this(
    chart: typings.highcharts.mod.Chart_,
    target: AnnotationControllable,
    options: AnnotationControlPointOptionsObject
  ) = this()
  def this(
    chart: typings.highcharts.mod.Chart_,
    target: AnnotationControllable,
    options: AnnotationControlPointOptionsObject,
    index: Double
  ) = this()
}
