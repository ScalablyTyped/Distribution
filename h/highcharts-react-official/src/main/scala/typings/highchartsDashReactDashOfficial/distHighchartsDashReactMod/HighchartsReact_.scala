package typings.highchartsDashReactDashOfficial.distHighchartsDashReactMod

import typings.highcharts.highchartsMod.Chart
import typings.highchartsDashReactDashOfficial.distHighchartsDashReactMod.HighchartsReact.Props
import typings.react.reactMod.Component
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Highcharts component for React
  */
@JSName("HighchartsReact")
@js.native
trait HighchartsReact_
  extends Component[Props, js.Object, js.Any] {
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
  def componentDidMount_MHighchartsReact_(): Unit = js.native
  /**
    * Updates (or recreates with immutable on) the chart. Can be turned off in the optional React props.
    */
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHighchartsReact_(): Unit = js.native
  /**
    * Destroys the chart right before the component gets destroyed.
    */
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHighchartsReact_(): Unit = js.native
}

