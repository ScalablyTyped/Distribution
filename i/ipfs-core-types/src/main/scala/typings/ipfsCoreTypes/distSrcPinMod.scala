package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.AwaitIterable
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Adds an IPFS block to the pinset and also stores it to the IPFS
      * repo. pinset is the set of hashes currently pinned (not gc'able)
      *
      * @example
      * ```js
      * const cid = CID.parse('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * const pinned of ipfs.pin.add(cid))
      * console.log(pinned)
      * // Logs:
      * // CID('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * ```
      */
    def add(cid: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def add(cid: String, options: AddOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def add(cid: CID[Any, Double, Double, Version]): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def add(cid: CID[Any, Double, Double, Version], options: AddOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * Adds multiple IPFS blocks to the pinset and also stores it to the IPFS
      * repo. pinset is the set of hashes currently pinned (not gc'able)
      *
      * @example
      * ```js
      * const cid = CID.parse('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * for await (const cid of ipfs.pin.addAll([cid])) {
      *   console.log(cid)
      * }
      * // Logs:
      * // CID('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * ```
      */
    def addAll(source: AwaitIterable[AddInput]): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
    def addAll(source: AwaitIterable[AddInput], options: AddAllOptions & OptionExtension): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * List all the objects pinned to local storage
      *
      * @example
      * ```js
      * for await (const { cid, type } of ipfs.pin.ls()) {
      *   console.log({ cid, type })
      * }
      * // { cid: CID(Qmc5XkteJdb337s7VwFBAGtiaoj2QCEzyxtNRy3iMudc3E), type: 'recursive' }
      * // { cid: CID(QmZbj5ruYneZb8FuR9wnLqJCpCXMQudhSdWhdhp5U1oPWJ), type: 'indirect' }
      * // { cid: CID(QmSo73bmN47gBxMNqbdV6rZ4KJiqaArqJ1nu5TvFhqqj1R), type: 'indirect' }
      *
      * const paths = [
      *   CID.parse('Qmc5..'),
      *   CID.parse('QmZb..'),
      *   CID.parse('QmSo..')
      * ]
      * for await (const { cid, type } of ipfs.pin.ls({ paths })) {
      *   console.log({ cid, type })
      * }
      * // { cid: CID(Qmc5XkteJdb337s7VwFBAGtiaoj2QCEzyxtNRy3iMudc3E), type: 'recursive' }
      * // { cid: CID(QmZbj5ruYneZb8FuR9wnLqJCpCXMQudhSdWhdhp5U1oPWJ), type: 'indirect' }
      * // { cid: CID(QmSo73bmN47gBxMNqbdV6rZ4KJiqaArqJ1nu5TvFhqqj1R), type: 'indirect' }
      * ```
      */
    def ls(): AsyncIterable[LsResult] = js.native
    def ls(options: LsOptions & OptionExtension): AsyncIterable[LsResult] = js.native
    
    var remote: typings.ipfsCoreTypes.distSrcPinRemoteMod.API[OptionExtension] = js.native
    
    /**
      * Unpin this block from your repo
      *
      * @example
      * ```js
      * const cid = CID.parse('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * const result = await ipfs.pin.rm(cid)
      * console.log(result)
      * // prints the CID that was unpinned
      * // CID('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * ```
      */
    def rm(ipfsPath: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rm(ipfsPath: String, options: RmOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rm(ipfsPath: CID[Any, Double, Double, Version]): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rm(ipfsPath: CID[Any, Double, Double, Version], options: RmOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * Unpin one or more blocks from your repo
      *
      * @example
      * ```js
      * const source = [
      *   CID.parse('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * ]
      * for await (const cid of ipfs.pin.rmAll(source)) {
      *   console.log(cid)
      * }
      * // prints the CIDs that were unpinned
      * // CID('QmWATWQ7fVPP2EFGu71UkfnqhYXDYH566qy47CnJDgvs8u')
      * ```
      */
    def rmAll(source: AwaitIterable[RmAllInput]): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
    def rmAll(source: AwaitIterable[RmAllInput], options: AbortOptions & OptionExtension): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
  }
  
  trait AddAllOptions
    extends StObject
       with AbortOptions {
    
    /**
      * Internal option used to control whether to create a repo write lock during a pinning operation
      */
    var lock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to preload all blocks pinned during this operation
      */
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object AddAllOptions {
    
    inline def apply(): AddAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddAllOptions]
    }
    
    extension [Self <: AddAllOptions](x: Self) {
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
  
  type AddInput = (CID[Any, Double, Double, Version]) | AddInputWithOptions
  
  trait AddInputWithOptions extends StObject {
    
    /**
      * A CID to pin - nb. you must pass either `cid` or `path`, not both
      */
    var cid: js.UndefOr[CID[Any, Double, Double, Version]] = js.undefined
    
    /**
      * A human readable string to store with this pin
      */
    var comments: js.UndefOr[String] = js.undefined
    
    /**
      * An IPFS path to pin - nb. you must pass either `cid` or `path`, not both
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * If true, pin all blocked linked to from the pinned CID
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object AddInputWithOptions {
    
    inline def apply(): AddInputWithOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddInputWithOptions]
    }
    
    extension [Self <: AddInputWithOptions](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait AddOptions
    extends StObject
       with AbortOptions {
    
    /**
      * Internal option used to control whether to create a repo write lock during a pinning operation
      */
    var lock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to preload all blocks pinned during this operation
      */
    var preload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, pin all blocked linked to from the pinned CID
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object AddOptions {
    
    inline def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    extension [Self <: AddOptions](x: Self) {
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait LsOptions
    extends StObject
       with AbortOptions {
    
    var paths: js.UndefOr[
        (CID[Any, Double, Double, Version]) | (js.Array[(CID[Any, Double, Double, Version]) | String]) | String
      ] = js.undefined
    
    var `type`: js.UndefOr[PinQueryType] = js.undefined
  }
  object LsOptions {
    
    inline def apply(): LsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LsOptions]
    }
    
    extension [Self <: LsOptions](x: Self) {
      
      inline def setPaths(
        value: (CID[Any, Double, Double, Version]) | (js.Array[(CID[Any, Double, Double, Version]) | String]) | String
      ): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: ((CID[Any, Double, Double, Version]) | String)*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setType(value: PinQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LsResult extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var metadata: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `type`: PinType | String
  }
  object LsResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version], `type`: PinType | String): LsResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LsResult]
    }
    
    extension [Self <: LsResult](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setType(value: PinType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.all
  */
  trait PinQueryType extends StObject
  object PinQueryType {
    
    inline def all: typings.ipfsCoreTypes.ipfsCoreTypesStrings.all = "all".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.all]
    
    inline def direct: typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct = "direct".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct]
    
    inline def indirect: typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect = "indirect".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect]
    
    inline def recursive: typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive = "recursive".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.all
  */
  trait PinType extends StObject
  object PinType {
    
    inline def all: typings.ipfsCoreTypes.ipfsCoreTypesStrings.all = "all".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.all]
    
    inline def direct: typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct = "direct".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.direct]
    
    inline def indirect: typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect = "indirect".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.indirect]
    
    inline def recursive: typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive = "recursive".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.recursive]
  }
  
  trait RmAllInput extends StObject {
    
    var cid: js.UndefOr[CID[Any, Double, Double, Version]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object RmAllInput {
    
    inline def apply(): RmAllInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmAllInput]
    }
    
    extension [Self <: RmAllInput](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait RmOptions
    extends StObject
       with AbortOptions {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object RmOptions {
    
    inline def apply(): RmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmOptions]
    }
    
    extension [Self <: RmOptions](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
