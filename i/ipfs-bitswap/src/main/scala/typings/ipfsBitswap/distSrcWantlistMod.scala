package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.libp2p.mod.Libp2p
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantlistMod {
  
  @JSImport("ipfs-bitswap/dist/src/wantlist", "Wantlist")
  @js.native
  /**
    * @param {import('../stats').Stats} [stats]
    * @param {import('libp2p').Libp2p} [libp2p]
    */
  open class Wantlist () extends StObject {
    def this(stats: Stats) = this()
    def this(stats: Unit, libp2p: Libp2p) = this()
    def this(stats: Stats, libp2p: Libp2p) = this()
    
    var _stats: js.UndefOr[Stats] = js.native
    
    /**
      * @param {CID} cid
      * @param {number} priority
      * @param {import('../message/message').Message.Wantlist.WantType} wantType
      */
    def add(
      cid: CID,
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.Wantlist.WantType */ Any
    ): Unit = js.native
    
    /**
      * @param {CID} cid
      */
    def contains(cid: CID): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, WantListEntry]] = js.native
    
    /**
      * @param {(entry:Entry, key:string) => void} fn
      */
    def forEach(fn: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]): Unit = js.native
    
    /**
      * @param {CID} cid
      */
    def get(cid: CID): js.UndefOr[WantListEntry] = js.native
    
    def length: Double = js.native
    
    /**
      * @param {CID} cid
      */
    def remove(cid: CID): Unit = js.native
    
    /**
      * @param {string} cidStr
      */
    def removeForce(cidStr: String): Unit = js.native
    
    /** @type {Map<string, Entry>} */
    var set: Map[String, WantListEntry] = js.native
    
    def sortedEntries(): Map[String, WantListEntry] = js.native
  }
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
}
