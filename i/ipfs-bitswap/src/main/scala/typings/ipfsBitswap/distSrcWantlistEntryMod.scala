package typings.ipfsBitswap

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantlistEntryMod {
  
  @JSImport("ipfs-bitswap/dist/src/wantlist/entry", "WantListEntry")
  @js.native
  open class WantListEntry protected () extends StObject {
    /**
      * @param {import('multiformats').CID} cid
      * @param {number} priority
      * @param {import('../message/message').Message.Wantlist.WantType} wantType
      */
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any
    ) = this()
    
    var _refCounter: Double = js.native
    
    var cid: CID[Any, Double, Double, Version] = js.native
    
    def dec(): Unit = js.native
    
    var get: Any = js.native
    
    def hasRefs(): Boolean = js.native
    
    def inc(): Unit = js.native
    
    var priority: Double = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    var wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any = js.native
  }
}
