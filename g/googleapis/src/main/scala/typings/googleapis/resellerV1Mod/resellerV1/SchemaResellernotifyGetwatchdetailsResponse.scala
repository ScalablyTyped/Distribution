package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for resellernotify getwatchdetails response.
  */
trait SchemaResellernotifyGetwatchdetailsResponse extends StObject {
  
  /**
    * List of registered service accounts.
    */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.undefined
}
object SchemaResellernotifyGetwatchdetailsResponse {
  
  inline def apply(): SchemaResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyGetwatchdetailsResponse]
  }
  
  extension [Self <: SchemaResellernotifyGetwatchdetailsResponse](x: Self) {
    
    inline def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
    
    inline def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value :_*))
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
