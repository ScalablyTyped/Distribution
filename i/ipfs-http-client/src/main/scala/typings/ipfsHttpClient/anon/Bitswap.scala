package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bitswap extends StObject {
  
  def bitswap(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Stats */ Any
  ] = js.native
  def bitswap(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Stats */ Any
  ] = js.native
  
  def bw(): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.BWResult */ Any
  ] = js.native
  def bw(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.BWOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.BWResult */ Any
  ] = js.native
  
  def repo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  def repo(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
}
