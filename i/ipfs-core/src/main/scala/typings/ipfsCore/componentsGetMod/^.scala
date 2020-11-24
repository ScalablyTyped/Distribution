package typings.ipfsCore.componentsGetMod

import typings.ipfsCore.anon.Ipld
import typings.ipfsCore.srcUtilsMod.Directory
import typings.ipfsCore.srcUtilsMod.File
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/get", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[GetOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
}
