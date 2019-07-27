package typings
package highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Highcharts component for React
  */
@js.native
trait HighchartsReact
  extends reactLib.reactMod.PureComponent[
      highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialMod.HighchartsReactNs.Props, 
      js.Object, 
      js.Any
    ] {
  /* *
    *
    *  Properties
    *
    * */
  /**
    * Chart reference
    */
  val chart: highchartsLib.highchartsMod.Chart = js.native
  /**
    * React reference
    */
  val container: reactLib.reactMod.RefObject[stdLib.HTMLDivElement] = js.native
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Creates the chart.
    */
  def _createChart(
    props: highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialMod.HighchartsReactNs.Props
  ): scala.Unit = js.native
  /**
    * Creates the chart.
    */
  @JSName("componentDidMount")
  def componentDidMount_MHighchartsReact(): scala.Unit = js.native
  /**
    * Updates (or recreates with immutable on) the chart. Can be turned off in the optional React props.
    */
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHighchartsReact(): scala.Unit = js.native
  /**
    * Destroys the chart right before the component gets destroyed.
    */
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHighchartsReact(): scala.Unit = js.native
}

