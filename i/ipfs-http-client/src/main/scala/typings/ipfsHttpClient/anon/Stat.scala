package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stat extends StObject {
  
  def stat(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  def stat(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.BitswapStats */ js.Any
  ] = js.native
  
  def unwant(cid: js.Array[^]): js.Promise[Unit] = js.native
  def unwant(
    cid: js.Array[^],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  def unwant(cid: ^): js.Promise[Unit] = js.native
  def unwant(
    cid: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  
  def wantlist(): js.Promise[js.Array[^]] = js.native
  def wantlist(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[js.Array[^]] = js.native
  
  def wantlistForPeer(peerId: String): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(
    peerId: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: ^): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(
    peerId: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: typings.peerId.mod.^): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(
    peerId: typings.peerId.mod.^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: Uint8Array): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(
    peerId: Uint8Array,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[js.Array[^]] = js.native
}
