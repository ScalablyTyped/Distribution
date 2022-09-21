package typings.materialUiCore

import typings.materialUiCore.anon.PartialWithMobileDialog
import typings.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialog
import typings.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import typings.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMobileDialogMod {
  
  @JSImport("@material-ui/core/withMobileDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](): PropInjector[WithMobileDialog, PartialWithMobileDialog] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithMobileDialog, PartialWithMobileDialog]]
  inline def default[P](options: WithMobileDialogOptions): PropInjector[WithMobileDialog, PartialWithMobileDialog] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithMobileDialog, PartialWithMobileDialog]]
}
