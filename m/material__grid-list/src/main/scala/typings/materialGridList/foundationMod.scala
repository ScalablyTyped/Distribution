package typings.materialGridList

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialGridList.adapterMod.MDCGridListAdapter
import typings.materialGridList.anon.PartialMDCGridListAdapter
import typings.materialGridList.anon.TILESELECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/grid-list/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/grid-list/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "default.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  @JSImport("@material/grid-list/foundation", "MDCGridListFoundation")
  @js.native
  open class MDCGridListFoundation () extends MDCFoundation[MDCGridListAdapter] {
    def this(adapter: PartialMDCGridListAdapter) = this()
    
    def alignCenter(): Unit = js.native
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
}
