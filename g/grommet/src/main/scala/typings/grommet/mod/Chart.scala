package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.chartMod.ChartProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Chart")
@js.native
class Chart protected ()
  extends Component[ChartProps, ComponentState, js.Any] {
  def this(props: ChartProps) = this()
  def this(props: ChartProps, context: js.Any) = this()
}

@JSImport("grommet/es6", "Chart")
@js.native
object Chart extends TopLevel[ComponentClass[ChartProps, ComponentState]]

