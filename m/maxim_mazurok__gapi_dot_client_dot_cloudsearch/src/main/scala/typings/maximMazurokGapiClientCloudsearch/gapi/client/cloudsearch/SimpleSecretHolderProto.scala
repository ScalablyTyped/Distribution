package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleSecretHolderProto extends StObject {
  
  /** A descriptive label to help identify a relevant ACL entry or otherwise disambiguate this instance. */
  var label: js.UndefOr[SimpleSecretLabelProto] = js.undefined
}
object SimpleSecretHolderProto {
  
  inline def apply(): SimpleSecretHolderProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSecretHolderProto]
  }
  
  extension [Self <: SimpleSecretHolderProto](x: Self) {
    
    inline def setLabel(value: SimpleSecretLabelProto): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
