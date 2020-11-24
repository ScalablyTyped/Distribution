package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.GcLockIpld
import typings.ipfsCore.anon.IpldPreload
import typings.ipfsCore.dagGetMod.DagEntry
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dagPutMod.PutOptions
import typings.ipfsCore.nameResolveMod.ResolveOptions
import typings.ipfsCore.resolveMod.ResolveResult
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.treeMod.TreeOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "dag")
@js.native
object dag extends js.Object {
  
  @JSName("get_1")
  def get1(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ typings.cids.mod.^, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[DagEntry]
  ] = js.native
  
  @JSName("put_1")
  def put1(hasIpldPinGcLockPreload: GcLockIpld): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[typings.cids.mod.^]
  ] = js.native
  
  def resolve(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
  
  def tree(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ typings.cids.mod.^, 
    /* options */ js.UndefOr[TreeOptions with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
