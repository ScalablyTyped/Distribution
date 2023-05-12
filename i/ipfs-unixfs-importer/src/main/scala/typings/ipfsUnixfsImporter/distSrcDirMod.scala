package typings.ipfsUnixfsImporter

import typings.ipfsUnixfs.mod.Mtime
import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfsImporter.anon.Child
import typings.ipfsUnixfsImporter.distSrcUtilsPersistMod.PersistOptions
import typings.ipfsUnixfsImporter.mod.ImportResult
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.ipfsUnixfsImporter.mod.WritableStorage
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDirMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dir", "CID_V0")
  @js.native
  val CID_V0: CID[Any, Double, Double, Version] = js.native
  
  @JSImport("ipfs-unixfs-importer/dist/src/dir", "CID_V1")
  @js.native
  val CID_V1: CID[Any, Double, Double, Version] = js.native
  
  /* note: abstract class */ @JSImport("ipfs-unixfs-importer/dist/src/dir", "Dir")
  @js.native
  open class Dir protected () extends StObject {
    def this(props: DirProps, options: PersistOptions) = this()
    
    def childCount(): Double = js.native
    
    var cid: js.UndefOr[CID[Any, Double, Double, Version]] = js.native
    
    var dir: Boolean = js.native
    
    var dirty: Boolean = js.native
    
    def eachChildSeries(): AsyncIterable[Child] = js.native
    
    def estimateNodeSize(): Double = js.native
    
    var flat: Boolean = js.native
    
    def flush(blockstore: WritableStorage): AsyncGenerator[ImportResult, Any, Any] = js.native
    
    def get(name: String): js.Promise[js.UndefOr[InProgressImportResult | Dir]] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Mtime] = js.native
    
    var nodeSize: js.UndefOr[Double] = js.native
    
    var options: PersistOptions = js.native
    
    var parent: js.UndefOr[Dir] = js.native
    
    var parentKey: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    def put(name: String, value: Dir): js.Promise[Unit] = js.native
    def put(name: String, value: InProgressImportResult): js.Promise[Unit] = js.native
    
    var root: Boolean = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var unixfs: js.UndefOr[UnixFS] = js.native
  }
  
  trait DirProps extends StObject {
    
    var dir: Boolean
    
    var dirty: Boolean
    
    var flat: Boolean
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var parent: js.UndefOr[Dir] = js.undefined
    
    var parentKey: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var root: Boolean
    
    var unixfs: js.UndefOr[UnixFS] = js.undefined
  }
  object DirProps {
    
    inline def apply(dir: Boolean, dirty: Boolean, flat: Boolean, path: String, root: Boolean): DirProps = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirProps] (val x: Self) extends AnyVal {
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setParent(value: Dir): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentKey(value: String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
      
      inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setUnixfs(value: UnixFS): Self = StObject.set(x, "unixfs", value.asInstanceOf[js.Any])
      
      inline def setUnixfsUndefined: Self = StObject.set(x, "unixfs", js.undefined)
    }
  }
}
