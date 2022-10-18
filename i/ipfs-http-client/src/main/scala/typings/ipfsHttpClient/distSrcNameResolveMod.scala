package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNameResolveMod {
  
  @JSImport("ipfs-http-client/dist/src/name/resolve", "createResolve")
  @js.native
  val createResolve: Factory[
    js.Function2[
      /* path */ String | PeerId, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_name.ResolveOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[String]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type NameAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_name.API<HTTPClientExtraOptions> */ Any
}
