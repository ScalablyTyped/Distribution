package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcDirMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlatToShardMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/flat-to-shard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(child: Null, dir: Dir, threshold: Double, options: ImporterOptions): js.Promise[typings.ipfsUnixfsImporter.distSrcDirShardedMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(child.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.distSrcDirShardedMod.default]]
  /**
    * @typedef {import('./dir').default} Dir
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    */
  /**
    * @param {Dir | null} child
    * @param {Dir} dir
    * @param {number} threshold
    * @param {ImporterOptions} options
    * @returns {Promise<DirSharded>}
    */
  inline def default(child: Dir, dir: Dir, threshold: Double, options: ImporterOptions): js.Promise[typings.ipfsUnixfsImporter.distSrcDirShardedMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(child.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.distSrcDirShardedMod.default]]
  
  type Dir = default
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
}
