package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAll extends StObject {
  
  def get(key: String): js.Promise[String | js.Object] = js.native
  def get(key: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[String | js.Object] = js.native
  
  def getAll(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Config */ Any
  ] = js.native
  def getAll(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Config */ Any
  ] = js.native
  
  var profiles: Apply = js.native
  
  def replace(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Config */ Any
  ): js.Promise[Unit] = js.native
  def replace(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Config */ Any,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def set(key: String, value: Any): js.Promise[Unit] = js.native
  def set(key: String, value: Any, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
}
