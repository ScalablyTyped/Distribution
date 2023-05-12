package typings.ipfsUnixfsImporter

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

object distSrcDirFlatMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dir-flat", "DirFlat")
  @js.native
  open class DirFlat protected () extends Dir {
    def this(props: DirProps, options: PersistOptions) = this()
    
    /* private */ val _children: Any = js.native
    
    def directChildrenCount(): Double = js.native
    
    def flush(
      block: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
    ): AsyncGenerator[ImportResult, Any, Any] = js.native
    
    def onlyChild(): InProgressImportResult | Dir = js.native
  }
}
