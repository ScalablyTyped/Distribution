package typings.atMaterialSnackbar.foundationMod

import typings.atMaterialSnackbar.adapterMod.MDCSnackbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCSnackbarAdapter] {
  val active: Boolean = js.native
  def dismissesOnAction(): Boolean = js.native
  def setDismissOnAction(dismissOnAction: Boolean): Unit = js.native
  def show(data: MDCSnackbarData): Unit = js.native
}

