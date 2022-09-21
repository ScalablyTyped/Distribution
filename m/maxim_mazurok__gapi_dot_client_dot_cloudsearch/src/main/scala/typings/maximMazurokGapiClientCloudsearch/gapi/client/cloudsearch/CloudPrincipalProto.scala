package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudPrincipalProto extends StObject {
  
  /** Format: "{identity-pool}:{subject}#" Details: go/cloud-principal-identifiers */
  var id: js.UndefOr[String] = js.undefined
}
object CloudPrincipalProto {
  
  inline def apply(): CloudPrincipalProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudPrincipalProto]
  }
  
  extension [Self <: CloudPrincipalProto](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
