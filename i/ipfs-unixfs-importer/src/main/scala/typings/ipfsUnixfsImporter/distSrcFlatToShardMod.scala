package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcDirMod.Dir
import typings.ipfsUnixfsImporter.distSrcDirShardedMod.default
import typings.ipfsUnixfsImporter.distSrcUtilsPersistMod.PersistOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlatToShardMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/flat-to-shard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatToShard(child: Null, dir: Dir, threshold: Double, options: PersistOptions): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatToShard")(child.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
  inline def flatToShard(child: Dir, dir: Dir, threshold: Double, options: PersistOptions): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatToShard")(child.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
}
