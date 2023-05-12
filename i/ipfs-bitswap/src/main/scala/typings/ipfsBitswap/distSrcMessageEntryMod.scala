package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageEntryMod {
  
  @JSImport("ipfs-bitswap/dist/src/message/entry", "BitswapMessageEntry")
  @js.native
  open class BitswapMessageEntry protected () extends StObject {
    def this(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType) = this()
    def this(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType, cancel: Boolean) = this()
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: WantType,
      cancel: Boolean,
      sendDontHave: Boolean
    ) = this()
    def this(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: WantType,
      cancel: Unit,
      sendDontHave: Boolean
    ) = this()
    
    var cancel: Boolean = js.native
    
    def cid: CID[Any, Double, Double, Version] = js.native
    def cid_=(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    var entry: WantListEntry = js.native
    
    def equals(other: BitswapMessageEntry): Boolean = js.native
    
    var get: Any = js.native
    
    def priority: Double = js.native
    def priority_=(`val`: Double): Unit = js.native
    
    var sendDontHave: Boolean = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    def wantType: WantType = js.native
    def wantType_=(`val`: WantType): Unit = js.native
  }
}
