package typings.materialGridList

import typings.materialGridList.adapterMod.MDCGridListAdapter
import typings.materialGridList.anon.PartialMDCGridListAdapter
import typings.materialGridList.anon.TILESELECTOR
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCGridList ()
    extends typings.materialGridList.componentMod.MDCGridList
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    
    def attachTo(root: Element): typings.materialGridList.componentMod.MDCGridList = js.native
  }
  
  @js.native
  class MDCGridListFoundation ()
    extends typings.materialGridList.foundationMod.MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    
    val defaultAdapter: MDCGridListAdapter = js.native
    
    val strings: TILESELECTOR = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var TILES_SELECTOR: String = js.native
    
    var TILE_SELECTOR: String = js.native
  }
}
