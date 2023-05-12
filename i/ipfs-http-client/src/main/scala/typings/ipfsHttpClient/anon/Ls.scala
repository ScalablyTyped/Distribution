package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ls extends StObject {
  
  def add(
    name: String,
    credentials: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Credentials */ Any) & AbortOptions & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def ls(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RemotePinServiceWithStat */ Any
    ]
  ] = js.native
  def ls(options: js.Object): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RemotePinServiceWithStat */ Any
    ]
  ] = js.native
  
  def rm(name: String): js.Promise[Unit] = js.native
  def rm(name: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
}
