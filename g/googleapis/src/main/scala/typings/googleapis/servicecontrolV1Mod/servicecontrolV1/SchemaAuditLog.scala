package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common audit log format for Google Cloud Platform API operations.
  */
trait SchemaAuditLog extends StObject {
  
  /**
    * Authentication information.
    */
  var authenticationInfo: js.UndefOr[SchemaAuthenticationInfo] = js.undefined
  
  /**
    * Authorization information. If there are multiple resources or permissions
    * involved, then there is one AuthorizationInfo element for each {resource,
    * permission} tuple.
    */
  var authorizationInfo: js.UndefOr[js.Array[SchemaAuthorizationInfo]] = js.undefined
  
  /**
    * Other service-specific data about the request, response, and other
    * information associated with the current audited event.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The name of the service method or operation. For API calls, this should
    * be the name of the API method. For example,
    * &quot;google.datastore.v1.Datastore.RunQuery&quot;
    * &quot;google.logging.v1.LoggingService.DeleteLog&quot;
    */
  var methodName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of items returned from a List or Query API method, if
    * applicable.
    */
  var numResponseItems: js.UndefOr[String] = js.undefined
  
  /**
    * The operation request. This may not include all request parameters, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Metadata about the operation.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.undefined
  
  /**
    * The resource location information.
    */
  var resourceLocation: js.UndefOr[SchemaResourceLocation] = js.undefined
  
  /**
    * The resource or collection that is the target of the operation. The name
    * is a scheme-less URI, not including the API service name. For example:
    * &quot;shelves/SHELF_ID/books&quot;
    * &quot;shelves/SHELF_ID/books/BOOK_ID&quot;
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource&#39;s original state before mutation. Present only for
    * operations which have successfully modified the targeted resource(s). In
    * general, this field should contain all changed fields, except those that
    * are already been included in `request`, `response`, `metadata` or
    * `service_data` fields. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var resourceOriginalState: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The operation response. This may not include all response elements, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Deprecated, use `metadata` field instead. Other service-specific data
    * about the request, response, and other activities.
    */
  var serviceData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The name of the API service performing the operation. For example,
    * `&quot;datastore.googleapis.com&quot;`.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the overall operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaAuditLog {
  
  @scala.inline
  def apply(): SchemaAuditLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLog]
  }
  
  @scala.inline
  implicit class SchemaAuditLogMutableBuilder[Self <: SchemaAuditLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationInfo(value: SchemaAuthenticationInfo): Self = StObject.set(x, "authenticationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationInfoUndefined: Self = StObject.set(x, "authenticationInfo", js.undefined)
    
    @scala.inline
    def setAuthorizationInfo(value: js.Array[SchemaAuthorizationInfo]): Self = StObject.set(x, "authorizationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationInfoUndefined: Self = StObject.set(x, "authorizationInfo", js.undefined)
    
    @scala.inline
    def setAuthorizationInfoVarargs(value: SchemaAuthorizationInfo*): Self = StObject.set(x, "authorizationInfo", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setNumResponseItems(value: String): Self = StObject.set(x, "numResponseItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResponseItemsUndefined: Self = StObject.set(x, "numResponseItems", js.undefined)
    
    @scala.inline
    def setRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMetadata(value: SchemaRequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResourceLocation(value: SchemaResourceLocation): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceOriginalState(value: StringDictionary[js.Any]): Self = StObject.set(x, "resourceOriginalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOriginalStateUndefined: Self = StObject.set(x, "resourceOriginalState", js.undefined)
    
    @scala.inline
    def setResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setServiceData(value: StringDictionary[js.Any]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
