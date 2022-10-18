package typings.highcharts.mod

import typings.highcharts.modulesMapMod.highchartsAugmentingMod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map-optimized chart. Use Chart for common charts.
  */
@js.native
trait MapChart
  extends StObject
     with Chart {
  
  /**
    * Initializes the chart. The constructor's arguments are passed on
    * directly.
    *
    * @param userOptions
    *        Custom options.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded.
    *
    * @fires Highcharts.MapChart#init
    * @fires Highcharts.MapChart#afterInit
    */
  def init(userOptions: Options): Unit = js.native
  def init(userOptions: Options, callback: js.Function): Unit = js.native
}
