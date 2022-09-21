package typings.highcharts.mod

import typings.highcharts.anon.PartialAnnotationsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Annotation")
@js.native
open class Annotation protected () extends StObject {
  /**
    * An annotation class which serves as a container for items like labels or
    * shapes. Created items are positioned on the chart either by linking them
    * to existing points or created mock points
    *
    * @param chart
    *        A chart instance
    *
    * @param userOptions
    *        The annotation options
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
    * The group svg element of the annotation's shapes.
    */
  var shapesGroup: SVGElement = js.native
  
  /**
    * Updates an annotation.
    *
    * @param userOptions
    *        New user options for the annotation.
    */
  def update(userOptions: PartialAnnotationsOptions): Unit = js.native
  
  /**
    * The user options for the annotations.
    */
  var userOptions: AnnotationsOptions = js.native
}
