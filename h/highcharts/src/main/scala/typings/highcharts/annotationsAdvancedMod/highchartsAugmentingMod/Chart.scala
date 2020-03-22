package typings.highcharts.annotationsAdvancedMod.highchartsAugmentingMod

import typings.highcharts.mod.Annotation
import typings.highcharts.mod.AnnotationsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Add an annotation to the chart after render time.
    *
    * @param options
    *        The annotation options for the new, detailed annotation.
    *
    * @return - The newly generated annotation.
    */
  def addAnnotation(options: AnnotationsOptions): Annotation = js.native
  def addAnnotation(options: AnnotationsOptions, redraw: Boolean): Annotation = js.native
  def removeAnnotation(idOrAnnotation: String): Unit = js.native
  /**
    * Remove an annotation from the chart.
    *
    * @param idOrAnnotation
    *        The annotation's id or direct annotation object.
    */
  def removeAnnotation(idOrAnnotation: Double): Unit = js.native
  def removeAnnotation(idOrAnnotation: Annotation): Unit = js.native
}

