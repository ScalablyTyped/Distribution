package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.StandardProps
import typings.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleClassKey
import typings.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/ButtonBase/TouchRipple", JSImport.Namespace)
@js.native
object buttonBaseTouchRippleMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.root
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ripple
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.rippleVisible
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ripplePulsate
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.child
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.childLeaving
    - typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.childPulsate
  */
  trait TouchRippleClassKey extends js.Object
  
  @js.native
  class default protected ()
    extends Component[TouchRippleProps, ComponentState, js.Any] {
    def this(props: TouchRippleProps) = this()
    def this(props: TouchRippleProps, context: js.Any) = this()
  }
  
  val default: ComponentType[TouchRippleProps] = js.native
  type TouchRippleProps = (StandardProps[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionGroup.TransitionGroupProps */ _, 
    TouchRippleClassKey, 
    scala.Nothing
  ]) with Anon_Center
}

