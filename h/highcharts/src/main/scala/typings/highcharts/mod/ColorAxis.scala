package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ColorAxis object for inclusion in gradient legends.
  */
@js.native
trait ColorAxis extends Axis {
  
  /**
    * Initializes the color axis.
    *
    * @param chart
    *        The related chart of the color axis.
    *
    * @param userOptions
    *        The color axis options for initialization.
    */
  def init(chart: Chart_, userOptions: ColorAxisOptions): Unit = js.native
  
  /**
    * Updates a color axis instance with a new set of options. The options
    * are merged with the existing options, so only new or altered options
    * need to be specified.
    *
    * @param newOptions
    *        The new options that will be merged in with existing options
    *        on the color axis.
    *
    * @param redraw
    *        Whether to redraw the chart after the color axis is altered.
    *        If doing more operations on the chart, it is a good idea to
    *        set redraw to `false` and call Highcharts.Chart#redraw after.
    */
  def update(newOptions: ColorAxisOptions): Unit = js.native
  def update(newOptions: ColorAxisOptions, redraw: Boolean): Unit = js.native
}
