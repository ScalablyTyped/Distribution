package typings.ipfsCore.startMod

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

@js.native
trait DAG extends js.Object {
  
  def get(ipfsPath: typings.cids.mod.^): js.Promise[DagEntry] = js.native
  def get(ipfsPath: typings.cids.mod.^, options: GetOptions with AbortOptions): js.Promise[DagEntry] = js.native
  
  def put(dagNode: js.Any): js.Promise[typings.cids.mod.^] = js.native
  def put(dagNode: js.Any, options: PutOptions with AbortOptions): js.Promise[typings.cids.mod.^] = js.native
  
  def resolve(ipfsPath: String): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: String, options: ResolveOptions with AbortOptions): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: typings.cids.mod.^): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: typings.cids.mod.^, options: ResolveOptions with AbortOptions): js.Promise[ResolveResult] = js.native
  
  def tree(ipfsPath: typings.cids.mod.^): AsyncIterable[String] = js.native
  def tree(ipfsPath: typings.cids.mod.^, options: TreeOptions with AbortOptions): AsyncIterable[String] = js.native
}
