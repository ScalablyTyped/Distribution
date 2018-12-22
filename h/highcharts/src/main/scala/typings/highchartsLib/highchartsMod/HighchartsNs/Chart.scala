package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart
  extends /**
         * This is the constructor for creating a new chart object.
         * @param  options The chart options
         * @param callback A function to execute when the chart object is finished loading and rendering. In most cases the chart is built in one thread,
         * but in Internet Explorer version 8 or less the chart is sometimes initiated before the document is ready,
         * and in these cases the chart object will not be finished directly after callingnew Highcharts.Chart().
         * s a consequence, code that relies on the newly built Chart object should always run in the callback. Defining a chart.event.load handler is equivalent.
         */
org.scalablytyped.runtime.Instantiable1[/* options */ Options, ChartObject]
     with /**
         * This is the constructor for creating a new chart object.
         * @param  options The chart options
         * @param callback A function to execute when the chart object is finished loading and rendering. In most cases the chart is built in one thread,
         * but in Internet Explorer version 8 or less the chart is sometimes initiated before the document is ready,
         * and in these cases the chart object will not be finished directly after callingnew Highcharts.Chart().
         * s a consequence, code that relies on the newly built Chart object should always run in the callback. Defining a chart.event.load handler is equivalent.
         */
/**
         * This is the constructor for creating a new chart object.
         * @param renderTo The id or a reference to a DOM element where the chart should be rendered (since v4.2.0).
         * @param options The chart options
         * @param callback A function to execute when the chart object is finished loading and rendering. In most cases the chart is built in one thread,
         * but in Internet Explorer version 8 or less the chart is sometimes initiated before the document is ready,
         * and in these cases the chart object will not be finished directly after callingnew Highcharts.Chart().
         * As a consequence, code that relies on the newly built Chart object should always run in the callback. Defining a chart.event.load handler is equivalent.
         */
org.scalablytyped.runtime.Instantiable2[
      (/* renderTo */ stdLib.HTMLElement) | (/* options */ Options) | (/* renderTo */ java.lang.String), 
      (/* callback */ js.Function1[/* chart */ ChartObject, scala.Unit]) | (/* options */ Options), 
      ChartObject
    ]
     with /**
         * This is the constructor for creating a new chart object.
         * @param renderTo The id or a reference to a DOM element where the chart should be rendered (since v4.2.0).
         * @param options The chart options
         * @param callback A function to execute when the chart object is finished loading and rendering. In most cases the chart is built in one thread,
         * but in Internet Explorer version 8 or less the chart is sometimes initiated before the document is ready,
         * and in these cases the chart object will not be finished directly after callingnew Highcharts.Chart().
         * As a consequence, code that relies on the newly built Chart object should always run in the callback. Defining a chart.event.load handler is equivalent.
         */
org.scalablytyped.runtime.Instantiable3[
      (/* renderTo */ stdLib.HTMLElement) | (/* renderTo */ java.lang.String), 
      /* options */ Options, 
      /* callback */ js.Function1[/* chart */ ChartObject, scala.Unit], 
      ChartObject
    ]

