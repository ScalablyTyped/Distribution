package typings.materialUiCore

import typings.materialUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typings.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import typings.react.mod.ComponentType
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

