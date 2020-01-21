package typings.materialGridList

import typings.materialBase.mod.MDCComponent
import typings.materialGridList.adapterMod.MDCGridListAdapter
import typings.materialGridList.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    val strings: typings.materialGridList.constantsMod.strings = js.native
  }
  
}

