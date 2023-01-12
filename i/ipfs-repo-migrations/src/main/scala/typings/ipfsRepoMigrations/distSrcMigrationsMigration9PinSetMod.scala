package typings.ipfsRepoMigrations

import typings.ipfsRepoMigrations.anon.Hash
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMigrationsMigration9PinSetMod {
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/pin-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadSet(blockstore: Blockstore, rootNode: PBNode, name: String): AsyncGenerator[CID[Any, Double, Double, Version], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSet")(blockstore.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[CID[Any, Double, Double, Version], Unit, Unit]]
  
  inline def storeSet(blockstore: Blockstore, `type`: String, cids: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("storeSet")(blockstore.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cids.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type PBNode = typings.ipldDagPb.mod.PBNode
  
  trait Pin extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var key: CID[Any, Double, Double, Version]
  }
  object Pin {
    
    inline def apply(key: CID[Any, Double, Double, Version]): Pin = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pin] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
