package typings.atMaterialList

import typings.atMaterialList.adapterMod.MDCListAdapter
import typings.atMaterialList.constantsMod.Index
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list", JSImport.Namespace)
@js.native
object atMaterialListMod extends js.Object {
  @js.native
  class MDCList protected () extends js.Object {
    def this(args: js.Any*) = this()
    val listElements: js.Array[Element] = js.native
    var selectedIndex: Index = js.native
    var singleSelection: Boolean = js.native
    var vertical: Boolean = js.native
    var wrapFocus: Boolean = js.native
    def destroy(): Unit = js.native
    def getDefaultFoundation(): typings.atMaterialList.foundationMod.MDCListFoundation = js.native
    def initialSyncWithDOM(): Unit = js.native
    /**
      * Initialize selectedIndex value based on pre-selected checkbox list items, single selection or radio.
      */
    def initializeListType(): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCListFoundation protected ()
    extends typings.atMaterialList.foundationMod.MDCListFoundation {
    def this(adapter: MDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typings.atMaterialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typings.atMaterialList.constantsMod.strings = js.native
  }
  
}

