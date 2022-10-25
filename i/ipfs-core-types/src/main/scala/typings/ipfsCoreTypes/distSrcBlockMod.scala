package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBlockMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Get a raw IPFS block
      *
      * @example
      * ```js
      * const block = await ipfs.block.get(cid)
      * console.log(block)
      * ```
      */
    def get(cid: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Stores a Uint8Array as a block in the underlying blockstore
      *
      * @example
      * ```js
      * import * as dagPB from '@ipld/dag-pb'
      * // Defaults
      * const encoder = new TextEncoder()
      * const decoder = new TextDecoder()
      *
      * const bytes = encoder.encode('a serialized object')
      * const cid = await ipfs.block.put(bytes)
      *
      * console.log(decoder.decode(block.data))
      * // Logs:
      * // a serialized object
      * console.log(block.cid.toString())
      * // Logs:
      * // the CID of the object
      * ```
      */
    def put(block: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def put(block: js.typedarray.Uint8Array, options: PutOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    def rm(cid: js.Array[CID[Any, Double, Double, Version]]): AsyncIterable[RmResult] = js.native
    def rm(cid: js.Array[CID[Any, Double, Double, Version]], options: RmOptions & OptionExtension): AsyncIterable[RmResult] = js.native
    /**
      * Remove one or more IPFS block(s) from the underlying block store
      *
      * @example
      * ```js
      * for await (const result of ipfs.block.rm(cid)) {
      *   if (result.error) {
      *     console.error(`Failed to remove block ${result.cid} due to ${result.error.message}`)
      *   } else {
      *    console.log(`Removed block ${result.cid}`)
      *   }
      * }
      * ```
      */
    def rm(cid: CID[Any, Double, Double, Version]): AsyncIterable[RmResult] = js.native
    def rm(cid: CID[Any, Double, Double, Version], options: RmOptions & OptionExtension): AsyncIterable[RmResult] = js.native
    
    /**
      * Print information of a raw IPFS block
      *
      * @example
      * ```js
      * const cid = CID.parse('QmQULBtTjNcMwMr4VMNknnVv3RpytrLSdgpvMcTnfNhrBJ')
      * const stats = await ipfs.block.stat(cid)
      * console.log(stats.cid.toString())
      * // Logs: QmQULBtTjNcMwMr4VMNknnVv3RpytrLSdgpvMcTnfNhrBJ
      * console.log(stat.size)
      * // Logs: 3739
      * ```
      */
    def stat(cid: CID[Any, Double, Double, Version]): js.Promise[StatResult] = js.native
    def stat(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[StatResult] = js.native
  }
  
  trait PutOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * The codec to use to create the CID
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Multihash hashing algorithm to use. (Defaults to 'sha2-256')
      */
    var mhtype: js.UndefOr[String] = js.undefined
    
    /**
      * Pin this block when adding. (Defaults to `false`)
      */
    var pin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The version to use to create the CID
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  object PutOptions {
    
    inline def apply(): PutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions]
    }
    
    extension [Self <: PutOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMhtype(value: String): Self = StObject.set(x, "mhtype", value.asInstanceOf[js.Any])
      
      inline def setMhtypeUndefined: Self = StObject.set(x, "mhtype", js.undefined)
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait RmOptions
    extends StObject
       with AbortOptions {
    
    /**
      * Ignores non-existent blocks
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not return output if true
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object RmOptions {
    
    inline def apply(): RmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmOptions]
    }
    
    extension [Self <: RmOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
  
  trait RmResult extends StObject {
    
    /**
      * The CID of the removed block
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * Any error that occurred while trying to remove the block
      */
    var error: js.UndefOr[js.Error] = js.undefined
  }
  object RmResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): RmResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RmResult]
    }
    
    extension [Self <: RmResult](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait StatResult extends StObject {
    
    /**
      * The CID of the block
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The size of the block
      */
    var size: Double
  }
  object StatResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version], size: Double): StatResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatResult]
    }
    
    extension [Self <: StatResult](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
