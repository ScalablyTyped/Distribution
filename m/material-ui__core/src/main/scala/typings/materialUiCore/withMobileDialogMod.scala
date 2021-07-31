package typings.materialUiCore

import typings.materialUiCore.anon.PartialWithWidth
import typings.materialUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typings.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMobileDialogMod {
  
  @JSImport("@material-ui/core/withMobileDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P](): js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ]]
  @scala.inline
  def default[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & InjectedProps & PartialWithWidth], 
    ComponentType[P & PartialWithWidth]
  ]]
}
