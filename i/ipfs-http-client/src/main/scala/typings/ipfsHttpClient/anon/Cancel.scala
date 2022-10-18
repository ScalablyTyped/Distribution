package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  def cancel(name: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PubsubCancelResult */ Any
  ] = js.native
  def cancel(name: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PubsubCancelResult */ Any
  ] = js.native
  
  def state(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PubsubStateResult */ Any
  ] = js.native
  def state(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PubsubStateResult */ Any
  ] = js.native
  
  def subs(): js.Promise[js.Array[String]] = js.native
  def subs(options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[String]] = js.native
}
