package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): APIWithExtraOptions[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
      ], 
      js.Promise[String]
    ], 
    HttpOptions
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[APIWithExtraOptions[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
      ], 
      js.Promise[String]
    ], 
    HttpOptions
  ]]
  
  @JSImport("ipfs-http-client/dist/src/dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
