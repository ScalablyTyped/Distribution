package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.indySdk.anon.Name
import typings.indySdk.anon.Nonrevoked
import typings.indySdk.indySdkStrings.`1Dot0`
import typings.indySdk.indySdkStrings.`2Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndyProofRequest extends StObject {
  
  var name: String
  
  var non_revoked: js.UndefOr[NonRevokedInterval] = js.undefined
  
  var nonce: String
  
  var requested_attributes: StringDictionary[Name]
  
  var requested_predicates: StringDictionary[Nonrevoked]
  
  var ver: js.UndefOr[`1Dot0` | `2Dot0`] = js.undefined
  
  var version: String
}
object IndyProofRequest {
  
  inline def apply(
    name: String,
    nonce: String,
    requested_attributes: StringDictionary[Name],
    requested_predicates: StringDictionary[Nonrevoked],
    version: String
  ): IndyProofRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], requested_attributes = requested_attributes.asInstanceOf[js.Any], requested_predicates = requested_predicates.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndyProofRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndyProofRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNon_revoked(value: NonRevokedInterval): Self = StObject.set(x, "non_revoked", value.asInstanceOf[js.Any])
    
    inline def setNon_revokedUndefined: Self = StObject.set(x, "non_revoked", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setRequested_attributes(value: StringDictionary[Name]): Self = StObject.set(x, "requested_attributes", value.asInstanceOf[js.Any])
    
    inline def setRequested_predicates(value: StringDictionary[Nonrevoked]): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
    
    inline def setVer(value: `1Dot0` | `2Dot0`): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    
    inline def setVerUndefined: Self = StObject.set(x, "ver", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
