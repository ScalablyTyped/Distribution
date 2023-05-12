package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.mod.WritableStorage
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressOptions
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPersistMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/utils/persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def persist(buffer: js.typedarray.Uint8Array, blockstore: WritableStorage, options: PersistOptions): js.Promise[CID[Any, Double, Double, Version]] = (^.asInstanceOf[js.Dynamic].applyDynamic("persist")(buffer.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID[Any, Double, Double, Version]]]
  
  trait PersistOptions
    extends StObject
       with ProgressOptions[Any] {
    
    var cidVersion: Version
    
    var codec: js.UndefOr[BlockCodec[Any, Any]] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object PersistOptions {
    
    inline def apply(cidVersion: Version): PersistOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistOptions] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCodec(value: BlockCodec[Any, Any]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
