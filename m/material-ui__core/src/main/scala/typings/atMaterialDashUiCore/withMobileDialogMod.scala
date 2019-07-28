package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typings.atMaterialDashUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/withMobileDialog", JSImport.Namespace)
@js.native
object withMobileDialogMod extends js.Object {
  def default[P](): js.Function1[
    /* component */ ComponentType[P with InjectedProps with PartialWithWidth], 
    ComponentType[P with PartialWithWidth]
  ] = js.native
  def default[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ComponentType[P with InjectedProps with PartialWithWidth], 
    ComponentType[P with PartialWithWidth]
  ] = js.native
}

