package typings.highchartsDashReactDashOfficial.highchartsDashReactDashOfficialMod

import typings.highcharts.highchartsMod.Chart
import typings.highchartsDashReactDashOfficial.highchartsDashReactDashOfficialMod.HighchartsReactNs.Props
import typings.react.reactMod.PureComponent
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Highcharts component for React
  */
@js.native
trait HighchartsReact
  extends PureComponent[Props, js.Object, js.Any] {
  /* *
    *
    *  Properties
    *
    * */
  /**
    * Chart reference
    */
  val chart: Chart = js.native
  /**
    * React reference
    */
  val container: RefObject[HTMLDivElement] = js.native
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Creates the chart.
    */
  def _createChart(props: Props): Unit = js.native
  /**
    * Creates the chart.
    */
  @JSName("componentDidMount")
  def componentDidMount_MHighchartsReact(): Unit = js.native
  /**
    * Updates (or recreates with immutable on) the chart. Can be turned off in the optional React props.
    */
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHighchartsReact(): Unit = js.native
  /**
    * Destroys the chart right before the component gets destroyed.
    */
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHighchartsReact(): Unit = js.native
}

