package typings.materialUiCore

import typings.materialUiCore.anon.HandleContainerOverflow
import typings.materialUiCore.modalModalMod.ModalProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typings.materialUiCore.modalManagerMod.default {
    def this(opts: HandleContainerOverflow) = this()
  }
  
  val default: ComponentType[ModalProps] = js.native
}

