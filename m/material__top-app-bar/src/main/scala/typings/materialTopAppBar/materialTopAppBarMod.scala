package typings.materialTopAppBar

import typings.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/foundation", JSImport.Namespace)
@js.native
object materialTopAppBarMod extends js.Object {
  @js.native
  class default ()
    extends typings.materialBase.foundationMod.default[MDCTopAppBarAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typings.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typings.materialTopAppBar.constantsMod.strings = js.native
  }
  
  type MDCTopAppBarBaseFoundation = typings.materialBase.foundationMod.default[MDCTopAppBarAdapter]
}

