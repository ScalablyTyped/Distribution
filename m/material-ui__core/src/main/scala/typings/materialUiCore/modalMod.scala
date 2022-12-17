package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.HandleContainerOverflow
import typings.materialUiCore.modalModalMod.ModalProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod extends Shortcut {
  
  /**
    * Modal is a lower-level construct that is leveraged by the following components:
    *
    * -   [Dialog](https://mui.com/api/dialog/)
    * -   [Drawer](https://mui.com/api/drawer/)
    * -   [Menu](https://mui.com/api/menu/)
    * -   [Popover](https://mui.com/api/popover/)
    *
    * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/api/dialog/) component
    * rather than directly using Modal.
    *
    * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
    * Demos:
    *
    * - [Modal](https://mui.com/components/modal/)
    *
    * API:
    *
    * - [Modal API](https://mui.com/api/modal/)
    */
  @JSImport("@material-ui/core/Modal", JSImport.Default)
  @js.native
  val default: ComponentType[ModalProps] = js.native
  
  @JSImport("@material-ui/core/Modal", "ModalManager")
  @js.native
  open class ModalManager ()
    extends typings.materialUiCore.modalModalManagerMod.default {
    def this(opts: HandleContainerOverflow) = this()
  }
  
  type _To = ComponentType[ModalProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalMod.foo` */
  override def _to: ComponentType[ModalProps] = default
}
