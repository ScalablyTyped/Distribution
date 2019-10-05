package typings.atMaterialGridDashList

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialGridDashList.adapterMod.MDCGridListAdapter
import typings.atMaterialGridDashList.atMaterialGridDashListMod.MDCGridList
import typings.atMaterialGridDashList.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object atMaterialGridDashListMod extends js.Object {
  @js.native
  class MDCGridList () extends MDCComponent[MDCGridListAdapter, default]
  
  @js.native
  class MDCGridListFoundation () extends default
  
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: Element): MDCGridList = js.native
  }
  
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typings.atMaterialGridDashList.constantsMod.strings = js.native
  }
  
}

