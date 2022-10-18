package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gc extends StObject {
  
  def gc(): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GCResult */ Any
  ] = js.native
  def gc(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GCOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GCResult */ Any
  ] = js.native
  
  def stat(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  def stat(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  
  def version(): js.Promise[Double] = js.native
  def version(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Double] = js.native
}
