package typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrigger extends StObject {
  
  /**
    * Output only. The creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Destination specifies where the events should be sent to.
    */
  var destination: js.UndefOr[SchemaDestination] = js.undefined
  
  /**
    * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User labels attached to the triggers that can be used to group resources.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
    */
  var matchingCriteria: js.UndefOr[js.Array[SchemaMatchingCriteria]] = js.undefined
  
  /**
    * Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project\}/locations/{location\}/triggers/{trigger\}` format.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
    */
  var transport: js.UndefOr[SchemaTransport] = js.undefined
  
  /**
    * Output only. The last-modified time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrigger {
  
  inline def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  
  extension [Self <: SchemaTrigger](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestination(value: SchemaDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMatchingCriteria(value: js.Array[SchemaMatchingCriteria]): Self = StObject.set(x, "matchingCriteria", value.asInstanceOf[js.Any])
    
    inline def setMatchingCriteriaUndefined: Self = StObject.set(x, "matchingCriteria", js.undefined)
    
    inline def setMatchingCriteriaVarargs(value: SchemaMatchingCriteria*): Self = StObject.set(x, "matchingCriteria", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTransport(value: SchemaTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
