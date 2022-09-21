package typings.ipfsUnixfsImporter

import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfs.typesMod.Mtime
import typings.ipfsUnixfsImporter.anon.Key
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDirMod {
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('multiformats/cid').CID} CID
    *
    * @typedef {object} DirProps
    * @property {boolean} root
    * @property {boolean} dir
    * @property {string} path
    * @property {boolean} dirty
    * @property {boolean} flat
    * @property {Dir} [parent]
    * @property {string} [parentKey]
    * @property {import('ipfs-unixfs').UnixFS} [unixfs]
    * @property {number} [mode]
    * @property {import('ipfs-unixfs').Mtime} [mtime]
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dir", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Dir {
    /**
      * @param {DirProps} props
      * @param {ImporterOptions} options
      */
    def this(props: DirProps, options: ImporterOptions) = this()
  }
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type CID = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CID */ Any
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('multiformats/cid').CID} CID
    *
    * @typedef {object} DirProps
    * @property {boolean} root
    * @property {boolean} dir
    * @property {string} path
    * @property {boolean} dirty
    * @property {boolean} flat
    * @property {Dir} [parent]
    * @property {string} [parentKey]
    * @property {import('ipfs-unixfs').UnixFS} [unixfs]
    * @property {number} [mode]
    * @property {import('ipfs-unixfs').Mtime} [mtime]
    */
  @js.native
  trait Dir extends StObject {
    
    /** @type {CID | undefined} */
    var cid: js.UndefOr[CID] = js.native
    
    var dir: Boolean = js.native
    
    var dirty: Boolean = js.native
    
    /**
      * @returns {AsyncIterable<{ key: string, child: InProgressImportResult | Dir}>}
      */
    def eachChildSeries(): AsyncIterable[Key] = js.native
    
    var flat: Boolean = js.native
    
    /**
      * @param {Blockstore} blockstore
      * @returns {AsyncIterable<ImportResult>}
      */
    def flush(blockstore: Blockstore): AsyncIterable[ImportResult] = js.native
    
    /**
      * @param {string} name
      * @returns {Promise<InProgressImportResult | Dir | undefined>}
      */
    def get(name: String): js.Promise[js.UndefOr[InProgressImportResult | Dir]] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Mtime] = js.native
    
    var options: typings.ipfsUnixfsImporter.typesMod.ImporterOptions = js.native
    
    var parent: js.UndefOr[Dir] = js.native
    
    var parentKey: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    def put(name: String, value: Dir): js.Promise[Unit] = js.native
    /**
      * @param {string} name
      * @param {InProgressImportResult | Dir} value
      */
    def put(name: String, value: InProgressImportResult): js.Promise[Unit] = js.native
    
    var root: Boolean = js.native
    
    /** @type {number | undefined} */
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
    
    extension [Self <: DirProps](x: Self) {
      
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
  
  type ImportResult = typings.ipfsUnixfsImporter.typesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
}
