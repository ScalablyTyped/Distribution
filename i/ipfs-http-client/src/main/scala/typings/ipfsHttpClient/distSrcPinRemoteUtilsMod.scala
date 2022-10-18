package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.All
import typings.ipfsHttpClient.anon.Cid
import typings.ipfsHttpClient.anon.CidCID
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteUtilsMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodePin(hasNameStatusCid: Cid): Pin = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePin")(hasNameStatusCid.asInstanceOf[js.Any]).asInstanceOf[Pin]
  
  inline def encodeAddParams(hasCidServiceBackgroundNameOrigins: AddOptions & CidCID): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeAddParams")(hasCidServiceBackgroundNameOrigins.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  
  inline def encodeCID(cid: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCID")(cid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeQuery(hasServiceCidNameStatusAll: Query & All): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeQuery")(hasServiceCidNameStatusAll.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  
  inline def encodeService(service: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeService")(service.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  
  type AddOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.AddOptions */ Any
  
  type Pin = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Pin */ Any
  
  type Query = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Query */ Any
  
  type Status = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Status */ Any
}
