package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.boxMod.BoxProps
import typings.grommet.radioButtonGroupMod.RadioButtonGroupProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RadioButtonGroup")
@js.native
class RadioButtonGroup protected ()
  extends Component[RadioButtonGroupProps with BoxProps, ComponentState, js.Any] {
  def this(props: RadioButtonGroupProps with BoxProps) = this()
  def this(props: RadioButtonGroupProps with BoxProps, context: js.Any) = this()
}

@JSImport("grommet", "RadioButtonGroup")
@js.native
object RadioButtonGroup extends TopLevel[ComponentClass[RadioButtonGroupProps with BoxProps, ComponentState]]

