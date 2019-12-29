package typings.atMaterialDashUiStyles

import org.scalablytyped.runtime.TopLevel
import typings.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typings.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/StylesProvider", JSImport.Namespace)
@js.native
object stylesProviderMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  @js.native
  object default extends TopLevel[ComponentType[StylesProviderProps]]
  
}

