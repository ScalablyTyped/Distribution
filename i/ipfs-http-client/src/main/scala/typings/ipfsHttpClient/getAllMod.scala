package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAllMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any, 
    HttpOptions
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any, 
    HttpOptions
  ]]
  
  @JSImport("ipfs-http-client/dist/src/config/getAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
