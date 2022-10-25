package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.IPFSPath
import typings.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Exports a CAR for the entire DAG available from the given root CID. The CAR will have a single
      * root and IPFS will attempt to fetch and bundle all blocks that are linked within the connected
      * DAG.
      */
    def `export`(root: CID[Any, Double, Double, Version]): AsyncIterable[js.typedarray.Uint8Array] = js.native
    def `export`(root: CID[Any, Double, Double, Version], options: ExportOptions & OptionExtension): AsyncIterable[js.typedarray.Uint8Array] = js.native
    
    /**
      * Retrieve an IPLD format node
      *
      * @example
      * ```js
      * // example obj
      * const obj = {
      *   a: 1,
      *   b: [1, 2, 3],
      *   c: {
      *     ca: [5, 6, 7],
      *     cb: 'foo'
      *   }
      * }
      *
      * const cid = await ipfs.dag.put(obj, { storeCodec: 'dag-cbor', hashAlg: 'sha2-256' })
      * console.log(cid.toString())
      * // zdpuAmtur968yprkhG9N5Zxn6MFVoqAWBbhUAkNLJs2UtkTq5
      *
      * async function getAndLog(cid, path) {
      *   const result = await ipfs.dag.get(cid, { path })
      *   console.log(result.value)
      * }
      *
      * await getAndLog(cid, '/a')
      * // Logs:
      * // 1
      *
      * await getAndLog(cid, '/b')
      * // Logs:
      * // [1, 2, 3]
      *
      * await getAndLog(cid, '/c')
      * // Logs:
      * // {
      * //   ca: [5, 6, 7],
      * //   cb: 'foo'
      * // }
      *
      * await getAndLog(cid, '/c/ca/1')
      * // Logs:
      * // 6
      * ```
      */
    def get(cid: CID[Any, Double, Double, Version]): js.Promise[GetResult] = js.native
    def get(cid: CID[Any, Double, Double, Version], options: GetOptions & OptionExtension): js.Promise[GetResult] = js.native
    
    /**
      * Import all blocks from one or more CARs and optionally recursively pin the roots identified
      * within the CARs.
      */
    def `import`(sources: js.Iterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]): AsyncIterable[ImportResult] = js.native
    def `import`(
      sources: js.Iterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array],
      options: ImportOptions & OptionExtension
    ): AsyncIterable[ImportResult] = js.native
    def `import`(sources: AsyncIterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]): AsyncIterable[ImportResult] = js.native
    def `import`(
      sources: AsyncIterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array],
      options: ImportOptions & OptionExtension
    ): AsyncIterable[ImportResult] = js.native
    
    /**
      * Store an IPLD format node
      *
      * @example
      * ```js
      * const obj = { simple: 'object' }
      * const cid = await ipfs.dag.put(obj, { storeCodec: 'dag-cbor', hashAlg: 'sha2-512' })
      *
      * console.log(cid.toString())
      * // zBwWX9ecx5F4X54WAjmFLErnBT6ByfNxStr5ovowTL7AhaUR98RWvXPS1V3HqV1qs3r5Ec5ocv7eCdbqYQREXNUfYNuKG
      * ```
      */
    def put(node: Any): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def put(node: Any, options: PutOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * Returns the CID and remaining path of the node at the end of the passed IPFS path
      *
      * @example
      * ```JavaScript
      * // example obj
      * const obj = {
      *   a: 1,
      *   b: [1, 2, 3],
      *   c: {
      *     ca: [5, 6, 7],
      *     cb: 'foo'
      *   }
      * }
      *
      * const cid = await ipfs.dag.put(obj, { storeCodec: 'dag-cbor', hashAlg: 'sha2-256' })
      * console.log(cid.toString())
      * // bafyreicyer3d34cutdzlsbe2nqu5ye62mesuhwkcnl2ypdwpccrsecfmjq
      *
      * const result = await ipfs.dag.resolve(`${cid}/c/cb`)
      * console.log(result)
      * // Logs:
      * // {
      * //   cid: CID(bafyreicyer3d34cutdzlsbe2nqu5ye62mesuhwkcnl2ypdwpccrsecfmjq),
      * //   remainderPath: 'c/cb'
      * // }
      * ```
      */
    def resolve(ipfsPath: IPFSPath): js.Promise[ResolveResult] = js.native
    def resolve(ipfsPath: IPFSPath, options: ResolveOptions & OptionExtension): js.Promise[ResolveResult] = js.native
  }
  
  trait ExportOptions
    extends StObject
       with AbortOptions
       with PreloadOptions
  object ExportOptions {
    
    inline def apply(): ExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOptions]
    }
  }
  
  trait GetOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * If set to true, it will avoid resolving through different objects
      */
    var localResolve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional path within the DAG to resolve
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setLocalResolve(value: Boolean): Self = StObject.set(x, "localResolve", value.asInstanceOf[js.Any])
      
      inline def setLocalResolveUndefined: Self = StObject.set(x, "localResolve", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait GetResult extends StObject {
    
    /**
      * The remainder of the Path that the node was unable to resolve or what was left in a localResolve scenario
      */
    var remainderPath: js.UndefOr[String] = js.undefined
    
    /**
      * The value or node that was fetched during the get operation
      */
    var value: Any
  }
  object GetResult {
    
    inline def apply(value: Any): GetResult = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResult]
    }
    
    extension [Self <: GetResult](x: Self) {
      
      inline def setRemainderPath(value: String): Self = StObject.set(x, "remainderPath", value.asInstanceOf[js.Any])
      
      inline def setRemainderPathUndefined: Self = StObject.set(x, "remainderPath", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * Recursively pin roots for the imported CARs, defaults to true.
      */
    var pinRoots: js.UndefOr[Boolean] = js.undefined
  }
  object ImportOptions {
    
    inline def apply(): ImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportOptions]
    }
    
    extension [Self <: ImportOptions](x: Self) {
      
      inline def setPinRoots(value: Boolean): Self = StObject.set(x, "pinRoots", value.asInstanceOf[js.Any])
      
      inline def setPinRootsUndefined: Self = StObject.set(x, "pinRoots", js.undefined)
    }
  }
  
  trait ImportResult extends StObject {
    
    /**
      * A list of roots and their pin status if `pinRoots` was set.
      */
    var root: ImportRootStatus
  }
  object ImportResult {
    
    inline def apply(root: ImportRootStatus): ImportResult = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportResult]
    }
    
    extension [Self <: ImportResult](x: Self) {
      
      inline def setRoot(value: ImportRootStatus): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportRootStatus extends StObject {
    
    /**
      * CID of a root that was recursively pinned.
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The error message if the pin was unsuccessful.
      */
    var pinErrorMsg: js.UndefOr[String] = js.undefined
  }
  object ImportRootStatus {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): ImportRootStatus = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportRootStatus]
    }
    
    extension [Self <: ImportRootStatus](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPinErrorMsg(value: String): Self = StObject.set(x, "pinErrorMsg", value.asInstanceOf[js.Any])
      
      inline def setPinErrorMsgUndefined: Self = StObject.set(x, "pinErrorMsg", js.undefined)
    }
  }
  
  trait PutOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * Multihash hashing algorithm to use (defaults to 'sha2-256')
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * The codec that the input object is encoded with if a pre-encoded object is supplied.
      */
    var inputCodec: js.UndefOr[String] = js.undefined
    
    /**
      * If true no blocks will be written to the underlying blockstore
      */
    var onlyHash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pin this block when adding. (Defaults to `false`)
      */
    var pin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The codec that the stored object will be encoded with (defaults to 'dag-cbor')
      */
    var storeCodec: js.UndefOr[String] = js.undefined
    
    /**
      * The version to use to create the CID (default to 1)
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  object PutOptions {
    
    inline def apply(): PutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions]
    }
    
    extension [Self <: PutOptions](x: Self) {
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setInputCodec(value: String): Self = StObject.set(x, "inputCodec", value.asInstanceOf[js.Any])
      
      inline def setInputCodecUndefined: Self = StObject.set(x, "inputCodec", js.undefined)
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setOnlyHashUndefined: Self = StObject.set(x, "onlyHash", js.undefined)
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setStoreCodec(value: String): Self = StObject.set(x, "storeCodec", value.asInstanceOf[js.Any])
      
      inline def setStoreCodecUndefined: Self = StObject.set(x, "storeCodec", js.undefined)
      
      inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ResolveOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * If ipfsPath is a CID, you may pass a path here
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object ResolveOptions {
    
    inline def apply(): ResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveOptions]
    }
    
    extension [Self <: ResolveOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ResolveResult extends StObject {
    
    /**
      * The last CID encountered during the traversal and the path to the end of the IPFS path inside the node referenced by the CID
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The remainder of the Path that the node was unable to resolve
      */
    var remainderPath: js.UndefOr[String] = js.undefined
  }
  object ResolveResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): ResolveResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveResult]
    }
    
    extension [Self <: ResolveResult](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setRemainderPath(value: String): Self = StObject.set(x, "remainderPath", value.asInstanceOf[js.Any])
      
      inline def setRemainderPathUndefined: Self = StObject.set(x, "remainderPath", js.undefined)
    }
  }
  
  trait RmOptions
    extends StObject
       with AbortOptions {
    
    /**
      * Ignores non-existent blocks
      */
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object RmOptions {
    
    inline def apply(): RmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmOptions]
    }
    
    extension [Self <: RmOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  trait TreeOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    /**
      * An optional path within the DAG to resolve
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, it will follow the links and continuously run tree on them, returning all the paths in the graph
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object TreeOptions {
    
    inline def apply(): TreeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeOptions]
    }
    
    extension [Self <: TreeOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
