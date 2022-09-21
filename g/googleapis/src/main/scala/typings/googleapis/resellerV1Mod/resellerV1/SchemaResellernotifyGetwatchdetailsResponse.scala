package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResellernotifyGetwatchdetailsResponse extends StObject {
  
  /**
    * List of registered service accounts.
    */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String | Null] = js.undefined
}
object SchemaResellernotifyGetwatchdetailsResponse {
  
  inline def apply(): SchemaResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyGetwatchdetailsResponse]
  }
  
  extension [Self <: SchemaResellernotifyGetwatchdetailsResponse](x: Self) {
    
    inline def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailAddressesNull: Self = StObject.set(x, "serviceAccountEmailAddresses", null)
    
    inline def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
    
    inline def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value*))
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameNull: Self = StObject.set(x, "topicName", null)
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
