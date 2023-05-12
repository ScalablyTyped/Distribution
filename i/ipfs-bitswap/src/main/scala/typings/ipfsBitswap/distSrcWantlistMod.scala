package typings.ipfsBitswap

import org.scalablytyped.runtime.Instantiable3
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantlistMod {
  
  @JSImport("ipfs-bitswap/dist/src/wantlist", "Wantlist")
  @js.native
  open class Wantlist () extends StObject {
    def this(stats: Stats) = this()
    def this(stats: Unit, libp2p: Libp2p[Record[String, Any]]) = this()
    def this(stats: Stats, libp2p: Libp2p[Record[String, Any]]) = this()
    
    /* private */ val _stats: Any = js.native
    
    def add(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType): Unit = js.native
    
    def contains(cid: CID[Any, Double, Double, Version]): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, WantListEntry]] = js.native
    
    def forEach(fn: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]): Unit = js.native
    
    def get(cid: CID[Any, Double, Double, Version]): js.UndefOr[WantListEntry] = js.native
    
    def length: Double = js.native
    
    def remove(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    def removeForce(cidStr: String): Unit = js.native
    
    /* private */ val set: Any = js.native
    
    def sortedEntries(): Map[String, WantListEntry] = js.native
  }
  /* static members */
  object Wantlist {
    
    @JSImport("ipfs-bitswap/dist/src/wantlist", "Wantlist")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-bitswap/dist/src/wantlist", "Wantlist.Entry")
    @js.native
    def Entry: Instantiable3[
        /* cid */ CID[Any, Double, Double, Version], 
        /* priority */ Double, 
        /* wantType */ WantType, 
        WantListEntry
      ] = js.native
    inline def Entry_=(
      x: Instantiable3[
          /* cid */ CID[Any, Double, Double, Version], 
          /* priority */ Double, 
          /* wantType */ WantType, 
          WantListEntry
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entry")(x.asInstanceOf[js.Any])
  }
}
