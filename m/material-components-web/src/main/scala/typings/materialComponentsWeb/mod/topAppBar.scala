package typings.materialComponentsWeb.mod

import typings.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typings.materialTopAppBar.materialTopAppBarMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "topAppBar")
@js.native
object topAppBar extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typings.materialTopAppBar.mod.MDCTopAppBar
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typings.materialTopAppBar.mod.MDCTopAppBarBaseFoundation
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): typings.materialTopAppBar.mod.MDCTopAppBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    val cssClasses: typings.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typings.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typings.materialTopAppBar.constantsMod.strings = js.native
  }
  
}

