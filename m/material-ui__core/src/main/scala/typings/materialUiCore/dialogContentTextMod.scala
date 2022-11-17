package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.dialogContentTextDialogContentTextMod.DialogContentTextTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialogs](https://mui.com/components/dialogs/)
    *
    * API:
    *
    * - [DialogContentText API](https://mui.com/api/dialog-content-text/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/DialogContentText", JSImport.Default)
  @js.native
  val default: OverridableComponent[DialogContentTextTypeMap[js.Object, "span"]] = js.native
  
  type _To = OverridableComponent[DialogContentTextTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `dialogContentTextMod.foo` */
  override def _to: OverridableComponent[DialogContentTextTypeMap[js.Object, "span"]] = default
}
