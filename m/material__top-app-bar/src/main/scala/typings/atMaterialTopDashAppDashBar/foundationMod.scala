package typings.atMaterialTopDashAppDashBar

import typings.atMaterialTopDashAppDashBar.adapterMod.MDCTopAppBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class default ()
    extends typings.atMaterialBase.foundationMod.default[MDCTopAppBarAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialTopDashAppDashBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typings.atMaterialTopDashAppDashBar.constantsMod.numbers = js.native
    val strings: typings.atMaterialTopDashAppDashBar.constantsMod.strings = js.native
  }
  
  type MDCTopAppBarBaseFoundation = typings.atMaterialBase.foundationMod.default[MDCTopAppBarAdapter]
}

