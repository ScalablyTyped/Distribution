package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cmds extends StObject {
  
  def cmds(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CmdsResult */ Any
    ]
  ] = js.native
  def cmds(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CmdsResult */ Any
    ]
  ] = js.native
  
  def net(): js.Promise[Any] = js.native
  def net(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Any] = js.native
  
  def sys(): js.Promise[Any] = js.native
  def sys(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Any] = js.native
}
