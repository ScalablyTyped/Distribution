package typings
package atMaterialDialogLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDialogFoundation
  extends atMaterialBaseLib.atMaterialBaseMod.MDCFoundation[atMaterialDialogLib.adapterMod.MDCDialogAdapter] {
  def accept(shouldNotify: scala.Boolean): scala.Unit = js.native
  def cancel(shouldNotify: scala.Boolean): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
}

