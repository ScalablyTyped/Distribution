package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantlistEntryMod {
  
  @JSImport("ipfs-bitswap/dist/src/wantlist/entry", "WantListEntry")
  @js.native
  open class WantListEntry protected () extends StObject {
    def this(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType) = this()
    
    /* private */ var _refCounter: Any = js.native
    
    var cid: CID[Any, Double, Double, Version] = js.native
    
    def dec(): Unit = js.native
    
    var get: Any = js.native
    
    def hasRefs(): Boolean = js.native
    
    def inc(): Unit = js.native
    
    var priority: Double = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    var wantType: WantType = js.native
  }
}
