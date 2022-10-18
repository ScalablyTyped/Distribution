package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageEntryMod {
  
  @JSImport("ipfs-bitswap/dist/src/message/entry", "BitswapMessageEntry")
  @js.native
  open class BitswapMessageEntry protected () extends StObject {
    /**
      * @param {import('multiformats').CID} cid
      * @param {number} priority
      * @param {import('./message').Message.Wantlist.WantType} wantType
      * @param {boolean} [cancel]
      * @param {boolean} [sendDontHave]
      */
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any
    ) = this()
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any,
      cancel: Boolean
    ) = this()
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any,
      cancel: Boolean,
      sendDontHave: Boolean
    ) = this()
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any,
      cancel: Unit,
      sendDontHave: Boolean
    ) = this()
    
    var cancel: Boolean = js.native
    
    def cid: CID[Any, Double, Double, Version] = js.native
    def cid_=(arg: CID[Any, Double, Double, Version]): Unit = js.native
    
    var entry: WantListEntry = js.native
    
    /**
      * @param {this} other
      */
    def equals(other: BitswapMessageEntry): Any = js.native
    
    var get: Any = js.native
    
    def priority: Double = js.native
    def priority_=(arg: Double): Unit = js.native
    
    var sendDontHave: Boolean = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    def wantType: Any = js.native
    def wantType_=(
      arg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any
    ): Unit = js.native
  }
}
