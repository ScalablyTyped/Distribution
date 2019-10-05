package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsChartMod.ChartProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Chart")
@js.native
class Chart protected ()
  extends Component[ChartProps, ComponentState, js.Any] {
  def this(props: ChartProps) = this()
  def this(props: ChartProps, context: js.Any) = this()
}

@JSImport("grommet", "Chart")
@js.native
object Chart extends TopLevel[ComponentClass[ChartProps, ComponentState]]

