package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDnsMod {
  
  @JSImport("ipfs-http-client/dist/src/dns", "createDns")
  @js.native
  val createDns: Factory[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.DNSOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[String]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
