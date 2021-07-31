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
  
  @scala.inline
  def apply(): SchemaResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyGetwatchdetailsResponse]
  }
  
  @scala.inline
  implicit class SchemaResellernotifyGetwatchdetailsResponseMutableBuilder[Self <: SchemaResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
    
    @scala.inline
    def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
