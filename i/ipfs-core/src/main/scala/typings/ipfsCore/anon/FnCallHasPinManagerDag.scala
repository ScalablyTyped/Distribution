package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.componentsLsMod.LSOptions
import typings.ipfsCore.lsMod.UnixFSEntry
import typings.ipfsCore.pinLsMod.LsEntry
import typings.ipfsCore.pinLsMod.LsSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.srcUtilsMod.Directory
import typings.ipfsCore.srcUtilsMod.File
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasPinManagerDag extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | ^ , 
    /* options */ js.UndefOr[LSOptions with AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
  def apply(hasPinManagerDag: DagPinManager): js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]] = js.native
}
