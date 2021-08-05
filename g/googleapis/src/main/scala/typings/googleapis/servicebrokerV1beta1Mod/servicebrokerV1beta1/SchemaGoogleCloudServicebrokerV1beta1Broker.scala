package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Broker represents a consumable collection of Service Registry catalogs
  * exposed as an OSB Broker.
  */
trait SchemaGoogleCloudServicebrokerV1beta1Broker extends StObject {
  
  /**
    * Output only. Timestamp for when the broker was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the broker in the format:
    * &lt;projects&gt;/&lt;project-id&gt;/brokers/&lt;broker&gt;. This allows
    * for multiple brokers per project which can be used to enable having
    * custom brokers per GKE cluster, for example.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User friendly title of the broker. Limited to 1024 characters. Requests
    * with longer titles will be rejected.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. URL of the broker OSB-compliant endpoint, for example:
    * https://servicebroker.googleapis.com/projects/&lt;project&gt;/brokers/&lt;broker&gt;
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1Broker {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1beta1Broker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Broker]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1beta1Broker](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
