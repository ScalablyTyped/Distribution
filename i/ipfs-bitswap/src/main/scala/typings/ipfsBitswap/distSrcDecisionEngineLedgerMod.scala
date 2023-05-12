package typings.ipfsBitswap

import typings.ipfsBitswap.anon.BytesRecv
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.ipfsBitswap.distSrcWantlistMod.Wantlist
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineLedgerMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine/ledger", "Ledger")
  @js.native
  open class Ledger protected () extends StObject {
    def this(peerId: PeerId) = this()
    
    var accounting: BytesRecv = js.native
    
    /**
      * @param {CID} cid
      * @returns {void}
      */
    def cancelWant(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    def debtRatio(): Double = js.native
    
    var exchangeCount: Double = js.native
    
    var lastExchange: js.UndefOr[Double] = js.native
    
    var partner: PeerId = js.native
    
    def receivedBytes(n: Double): Unit = js.native
    
    def sentBytes(n: Double): Unit = js.native
    
    var wantlist: Wantlist = js.native
    
    def wantlistContains(cid: CID[Any, Double, Double, Version]): js.UndefOr[WantListEntry] = js.native
    
    def wants(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType): Unit = js.native
  }
}
