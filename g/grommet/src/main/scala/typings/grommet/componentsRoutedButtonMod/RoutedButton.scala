package typings.grommet.componentsRoutedButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsButtonMod.ButtonProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RoutedButton", "RoutedButton")
@js.native
class RoutedButton protected ()
  extends Component[RoutedButtonProps with ButtonProps, ComponentState, js.Any] {
  def this(props: RoutedButtonProps with ButtonProps) = this()
  def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
}

@JSImport("grommet/components/RoutedButton", "RoutedButton")
@js.native
object RoutedButton extends TopLevel[ComponentClass[RoutedButtonProps with ButtonProps, ComponentState]]

