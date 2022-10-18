package typings.ipfsBitswap

import typings.ipfsBitswap.anon.BytesRecv
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.ipfsBitswap.distSrcWantlistMod.Wantlist
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineLedgerMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine/ledger", "Ledger")
  @js.native
  open class Ledger protected () extends StObject {
    /**
      * @param {import('@libp2p/interface-peer-id').PeerId} peerId
      */
    def this(peerId: PeerId) = this()
    
    var accounting: BytesRecv = js.native
    
    /**
      * @param {CID} cid
      * @returns {void}
      */
    def cancelWant(cid: CID): Unit = js.native
    
    /**
      * @returns {number}
      */
    def debtRatio(): Double = js.native
    
    var exchangeCount: Double = js.native
    
    var lastExchange: js.UndefOr[Double] = js.native
    
    var partner: PeerId = js.native
    
    /**
      * @param {number} n
      */
    def receivedBytes(n: Double): Unit = js.native
    
    /**
      * @param {number} n
      */
    def sentBytes(n: Double): Unit = js.native
    
    var sentToPeer: Map[Any, Any] = js.native
    
    var wantlist: Wantlist = js.native
    
    /**
      * @param {CID} cid
      */
    def wantlistContains(cid: CID): js.UndefOr[WantListEntry] = js.native
    
    /**
      *
      * @param {CID} cid
      * @param {number} priority
      * @param {import('../message/message').Message.Wantlist.WantType} wantType
      * @returns {void}
      */
    def wants(
      cid: CID,
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any
    ): Unit = js.native
  }
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
}
