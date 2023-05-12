package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.mod.Directory
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.ipfsUnixfsImporter.mod.WritableStorage
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderDirMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dirBuilder(dir: Directory, blockstore: WritableStorage, options: DirBuilderOptions): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("dirBuilder")(dir.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  trait DirBuilderOptions extends StObject {
    
    var cidVersion: Version
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object DirBuilderOptions {
    
    inline def apply(cidVersion: Version): DirBuilderOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
