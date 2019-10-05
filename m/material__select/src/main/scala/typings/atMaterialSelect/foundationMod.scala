package typings.atMaterialSelect

import typings.atMaterialBase.atMaterialBaseMod.MDCFoundation
import typings.atMaterialSelect.adapterMod.MDCSelectAdapter
import typings.atMaterialSelect.foundationMod.MDCSelectFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCSelectFoundation extends MDCFoundation[MDCSelectAdapter] {
    def setDisabled(disabled: Boolean): Unit = js.native
    def setSelectedIndex(index: Double): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSelectFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typings.atMaterialSelect.constantsMod.strings = js.native
  }
  
}

