package typings.interfaceBlockstore

import typings.interfaceStore.mod.AbortOptions
import typings.interfaceStore.mod.AwaitIterable
import typings.interfaceStore.mod.Store
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Blockstore[HasOptionsExtension, PutOptionsExtension, PutManyOptionsExtension, GetOptionsExtension, GetManyOptionsExtension, GetAllOptionsExtension, DeleteOptionsExtension, DeleteManyOptionsExtension]
    extends StObject
       with Store[
          CID[Any, Double, Double, Version], 
          js.typedarray.Uint8Array, 
          Pair, 
          HasOptionsExtension, 
          PutOptionsExtension, 
          PutManyOptionsExtension, 
          GetOptionsExtension, 
          GetManyOptionsExtension, 
          DeleteOptionsExtension, 
          DeleteManyOptionsExtension
        ] {
    
    /**
      * Retrieve all cid/block pairs from the blockstore as an unordered iterable
      *
      * @example
      * ```js
      * for await (const { multihash, block } of store.getAll()) {
      *   console.log('got:', multihash, block)
      *   // => got MultihashDigest('Qmfoo') Uint8Array[...]
      * }
      * ```
      */
    def getAll(): AwaitIterable[Pair] = js.native
    def getAll(options: AbortOptions & GetAllOptionsExtension): AwaitIterable[Pair] = js.native
  }
  
  trait Pair extends StObject {
    
    var block: js.typedarray.Uint8Array
    
    var cid: CID[Any, Double, Double, Version]
  }
  object Pair {
    
    inline def apply(block: js.typedarray.Uint8Array, cid: CID[Any, Double, Double, Version]): Pair = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pair] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
}
