package typings.ipfsCli.anon

import typings.cids.mod.^
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Put extends StObject {
  
  def get(cid: String): js.Promise[js.Any] = js.native
  def get(
    cid: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): js.Promise[js.Any] = js.native
  def get(cid: ^): js.Promise[js.Any] = js.native
  def get(
    cid: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): js.Promise[js.Any] = js.native
  def get(cid: Uint8Array): js.Promise[js.Any] = js.native
  def get(
    cid: Uint8Array,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): js.Promise[js.Any] = js.native
  
  def put(data: js.Any): js.Promise[js.Any] = js.native
  def put(
    data: js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
  ): js.Promise[js.Any] = js.native
  
  def rm(cid: js.Array[^]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmSucceess */ js.Any
  ] = js.native
  def rm(
    cid: js.Array[^],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmSucceess */ js.Any
  ] = js.native
  def rm(cid: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmSucceess */ js.Any
  ] = js.native
  def rm(
    cid: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmSucceess */ js.Any
  ] = js.native
  
  def stat(cid: ^): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
  ] = js.native
  def stat(
    cid: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.StatOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
  ] = js.native
}
