package typings.atMaterialDialog.foundationMod

import typings.atMaterialBase.atMaterialBaseMod.MDCFoundation
import typings.atMaterialDialog.adapterMod.MDCDialogAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDialogFoundation extends MDCFoundation[MDCDialogAdapter] {
  def accept(shouldNotify: Boolean): Unit = js.native
  def cancel(shouldNotify: Boolean): Unit = js.native
  def close(): Unit = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
}

