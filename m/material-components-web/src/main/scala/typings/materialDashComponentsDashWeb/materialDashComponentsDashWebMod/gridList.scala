package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialGridDashList.adapterMod.MDCGridListAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "gridList")
@js.native
object gridList extends js.Object {
  @js.native
  class MDCGridList ()
    extends typings.atMaterialGridDashList.atMaterialGridDashListMod.MDCGridList
  
  @js.native
  class MDCGridListFoundation ()
    extends typings.atMaterialGridDashList.atMaterialGridDashListMod.MDCGridListFoundation
  
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: Element): typings.atMaterialGridDashList.atMaterialGridDashListMod.MDCGridList = js.native
  }
  
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typings.atMaterialGridDashList.constantsMod.strings = js.native
  }
  
}

