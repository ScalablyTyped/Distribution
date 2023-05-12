package typings.ipfsUnixfsImporter

import typings.hamtSharding.distSrcBucketMod.BucketChild
import typings.hamtSharding.mod.Bucket
import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsImporter.distSrcDirMod.Dir
import typings.ipfsUnixfsImporter.distSrcDirMod.DirProps
import typings.ipfsUnixfsImporter.distSrcUtilsPersistMod.PersistOptions
import typings.ipfsUnixfsImporter.mod.ImportResult
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDirShardedMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dir-sharded", JSImport.Default)
  @js.native
  open class default protected () extends DirSharded {
    def this(props: DirProps, options: PersistOptions) = this()
  }
  
  @js.native
  trait DirSharded extends Dir {
    
    /* private */ val _bucket: Any = js.native
    
    def directChildrenCount(): Double = js.native
    
    def flush(
      blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
    ): AsyncGenerator[ImportResult, Any, Any] = js.native
    
    def onlyChild(): (Bucket[InProgressImportResult | Dir]) | (BucketChild[InProgressImportResult | Dir]) = js.native
  }
}
