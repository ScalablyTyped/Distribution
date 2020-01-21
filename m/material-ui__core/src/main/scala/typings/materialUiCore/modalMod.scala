package typings.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typings.materialUiCore.modalModalMod.ModalProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typings.materialUiCore.modalManagerMod.default {
    def this(opts: AnonHandleContainerOverflow) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[ModalProps, ComponentState, js.Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[ModalProps]]
  
}

