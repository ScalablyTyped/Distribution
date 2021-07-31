package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.HandleContainerOverflow
import typings.materialUiCore.modalModalMod.ModalProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod extends Shortcut {
  
  @JSImport("@material-ui/core/Modal", JSImport.Default)
  @js.native
  val default: ComponentType[ModalProps] = js.native
  
  @JSImport("@material-ui/core/Modal", "ModalManager")
  @js.native
  class ModalManager ()
    extends typings.materialUiCore.modalManagerMod.default {
    def this(opts: HandleContainerOverflow) = this()
  }
  
  type _To = ComponentType[ModalProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalMod.foo` */
  override def _to: ComponentType[ModalProps] = default
}
