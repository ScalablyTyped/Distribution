package typings.ipfsCore.startMod

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

@js.native
trait Block extends js.Object {
  
  def get(cid: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: String, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: typings.cids.mod.^): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: typings.cids.mod.^, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: Uint8Array): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: Uint8Array, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  
  def put(
    block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(
    block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any,
    options: PutOptions with AbortOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(block: Uint8Array): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(block: Uint8Array, options: PutOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  
  def rm(cids: js.Array[typings.cids.mod.^]): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: js.Array[typings.cids.mod.^], options: RmOptions with AbortOptions): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: typings.cids.mod.^): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: typings.cids.mod.^, options: RmOptions with AbortOptions): AsyncIterable[RmSucceess | RmFailure] = js.native
  
  def stat(cid: typings.cids.mod.^): js.Promise[Stat] = js.native
  def stat(cid: typings.cids.mod.^, options: StatOptions with AbortOptions): js.Promise[Stat] = js.native
}
