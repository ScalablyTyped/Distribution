package typings.atMaterialDialog

import typings.atMaterialBase.atMaterialBaseMod.MDCFoundation
import typings.atMaterialDialog.adapterMod.MDCDialogAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCDialogFoundation extends MDCFoundation[MDCDialogAdapter] {
    def accept(shouldNotify: Boolean): Unit = js.native
    def cancel(shouldNotify: Boolean): Unit = js.native
    def close(): Unit = js.native
    def isOpen(): Boolean = js.native
    def open(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCDialogFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialDialog.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDialogAdapter = js.native
    val strings: typings.atMaterialDialog.constantsMod.strings = js.native
  }
  
}

