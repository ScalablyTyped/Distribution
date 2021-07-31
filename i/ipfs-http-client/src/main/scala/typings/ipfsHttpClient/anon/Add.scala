package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.mod.HttpOptions
import typings.multiaddr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  def add(addr: ^): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  def add(
    addr: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  
  def clear(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  def clear(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  def list(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  
  def reset(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  def reset(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  
  def rm(addr: ^): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
  def rm(
    addr: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Peers */ js.Any
  ] = js.native
}
