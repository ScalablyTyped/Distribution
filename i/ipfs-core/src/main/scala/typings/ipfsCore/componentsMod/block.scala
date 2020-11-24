package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.BlockServiceGcLock
import typings.ipfsCore.anon.BlockServicePreload
import typings.ipfsCore.anon.GcLockPinManager
import typings.ipfsCore.blockStatMod.Stat
import typings.ipfsCore.blockStatMod.StatOptions
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dagPutMod.PutOptions
import typings.ipfsCore.pinRmMod.RmOptions
import typings.ipfsCore.rmMod.RmFailure
import typings.ipfsCore.rmMod.RmSucceess
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "block")
@js.native
object block extends js.Object {
  
  def get(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ String | typings.cids.mod.^  | Uint8Array, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def put(hasBlockServicePinGcLockPreload: BlockServiceGcLock): js.Function2[
    /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def rm(hasBlockServiceGcLockPinManager: GcLockPinManager): js.Function2[
    /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
    /* options */ js.UndefOr[RmOptions with AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
  
  def stat(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[StatOptions with AbortOptions], 
    js.Promise[Stat]
  ] = js.native
}
