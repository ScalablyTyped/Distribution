package typings
package atMaterialSnackbarLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialSnackbarLib.adapterMod.MDCSnackbarAdapter] {
  val active: scala.Boolean = js.native
  def dismissesOnAction(): scala.Boolean = js.native
  def setDismissOnAction(dismissOnAction: scala.Boolean): scala.Unit = js.native
  def show(data: MDCSnackbarData): scala.Unit = js.native
}

