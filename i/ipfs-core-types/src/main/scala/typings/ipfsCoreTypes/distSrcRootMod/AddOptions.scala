package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOptions
  extends StObject
     with AbortOptions {
  
  /**
    * How many blocks from a file to write concurrently
    */
  var blockWriteConcurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * Chunking algorithm used to build ipfs DAGs. (defaults to 'size-262144')
    */
  var chunker: js.UndefOr[String] = js.undefined
  
  /**
    * The CID version to use when storing the data
    */
  var cidVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * Multihash hashing algorithm to use. (Defaults to 'sha2-256')
    */
  var hashAlg: js.UndefOr[String] = js.undefined
  
  /**
    * If true, will not add blocks to the blockstore. (Defaults to `false`)
    */
  var onlyHash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pin this object when adding. (Defaults to `true`)
    */
  var pin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to preload all blocks created during this operation
    */
  var preload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that will be called with the number of bytes added as a file is
    * added to ipfs and the path of the file being added.
    *
    * **Note** It will not be called for directory entries.
    */
  var progress: js.UndefOr[AddProgressFn] = js.undefined
  
  /**
    * If true, DAG leaves will contain raw file data and not be wrapped in a
    * protobuf. (Defaults to `false`)
    */
  var rawLeaves: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true will use the
    * [trickle DAG](https://godoc.org/github.com/ipsn/go-ipfs/gxlibs/github.com/ipfs/go-unixfs/importer/trickle)
    * format for DAG generation. (Defaults to `false`).
    */
  var trickle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds a wrapping node around the content. (Defaults to `false`)
    */
  var wrapWithDirectory: js.UndefOr[Boolean] = js.undefined
}
object AddOptions {
  
  inline def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  
  extension [Self <: AddOptions](x: Self) {
    
    inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
    
    inline def setBlockWriteConcurrencyUndefined: Self = StObject.set(x, "blockWriteConcurrency", js.undefined)
    
    inline def setChunker(value: String): Self = StObject.set(x, "chunker", value.asInstanceOf[js.Any])
    
    inline def setChunkerUndefined: Self = StObject.set(x, "chunker", js.undefined)
    
    inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
    
    inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
    
    inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
    
    inline def setOnlyHashUndefined: Self = StObject.set(x, "onlyHash", js.undefined)
    
    inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setProgress(value: (/* bytes */ Double, /* path */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
    
    inline def setRawLeavesUndefined: Self = StObject.set(x, "rawLeaves", js.undefined)
    
    inline def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
    
    inline def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
    
    inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
    
    inline def setWrapWithDirectoryUndefined: Self = StObject.set(x, "wrapWithDirectory", js.undefined)
  }
}
