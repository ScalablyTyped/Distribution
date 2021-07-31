package typings.materialGridList

import typings.materialGridList.adapterMod.MDCGridListAdapter
import typings.materialGridList.anon.PartialMDCGridListAdapter
import typings.materialGridList.anon.TILESELECTOR
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/grid-list", "MDCGridList")
  @js.native
  class MDCGridList protected ()
    extends typings.materialGridList.componentMod.MDCGridList {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialGridList.foundationMod.MDCGridListFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCGridList {
    
    @JSImport("@material/grid-list", "MDCGridList")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialGridList.componentMod.MDCGridList = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialGridList.componentMod.MDCGridList]
  }
  
  @JSImport("@material/grid-list", "MDCGridListFoundation")
  @js.native
  class MDCGridListFoundation ()
    extends typings.materialGridList.foundationMod.MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  object strings {
    
    @JSImport("@material/grid-list", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/grid-list", "strings.TILES_SELECTOR")
    @js.native
    def TILES_SELECTOR: String = js.native
    @scala.inline
    def TILES_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILES_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/grid-list", "strings.TILE_SELECTOR")
    @js.native
    def TILE_SELECTOR: String = js.native
    @scala.inline
    def TILE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
