package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialList.adapterMod.MDCListAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "list")
@js.native
object list extends js.Object {
  @js.native
  class MDCList protected ()
    extends typings.atMaterialList.atMaterialListMod.MDCList {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCListFoundation protected ()
    extends typings.atMaterialList.atMaterialListMod.MDCListFoundation {
    def this(adapter: MDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): typings.atMaterialList.atMaterialListMod.MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typings.atMaterialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typings.atMaterialList.constantsMod.strings = js.native
  }
  
}

