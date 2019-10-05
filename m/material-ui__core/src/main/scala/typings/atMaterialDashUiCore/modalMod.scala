package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.modalModalMod.ModalProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typings.atMaterialDashUiCore.modalModalManagerMod.default {
    def this(opts: Anon_HandleContainerOverflow) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[ModalProps, ComponentState, js.Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: js.Any) = this()
  }
  
  val default: ComponentType[ModalProps] = js.native
}

