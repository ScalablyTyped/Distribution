package typings.atMaterialToolbar

import typings.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import typings.atMaterialToolbar.foundationMod.MDCToolbarFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCToolbarFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCToolbarAdapter] {
    def updateAdjustElementStyles(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCToolbarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typings.atMaterialToolbar.constantsMod.numbers = js.native
    val strings: typings.atMaterialToolbar.constantsMod.strings = js.native
  }
  
}

