package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckDataAccessRequest extends StObject {
  
  /**
    * Optional. Specific Consents to evaluate the access request against. These Consents must have the same `user_id` as the evaluated User data mapping, must exist in the current `consent_store`, and have a `state` of either `ACTIVE` or `DRAFT`. A maximum of 100 Consents can be provided here. If no selection is specified, the access request is evaluated against all `ACTIVE` unexpired Consents with the same `user_id` as the evaluated User data mapping.
    */
  var consentList: js.UndefOr[SchemaConsentList] = js.undefined
  
  /**
    * Required. The unique identifier of the resource to check access for. This identifier must correspond to a User data mapping in the given consent store.
    */
  var dataId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values of request attributes associated with this access request.
    */
  var requestAttributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The view for CheckDataAccessResponse. If unspecified, defaults to `BASIC` and returns `consented` as `TRUE` or `FALSE`.
    */
  var responseView: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckDataAccessRequest {
  
  inline def apply(): SchemaCheckDataAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckDataAccessRequest]
  }
  
  extension [Self <: SchemaCheckDataAccessRequest](x: Self) {
    
    inline def setConsentList(value: SchemaConsentList): Self = StObject.set(x, "consentList", value.asInstanceOf[js.Any])
    
    inline def setConsentListUndefined: Self = StObject.set(x, "consentList", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdNull: Self = StObject.set(x, "dataId", null)
    
    inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
    
    inline def setRequestAttributes(value: StringDictionary[String]): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesNull: Self = StObject.set(x, "requestAttributes", null)
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewNull: Self = StObject.set(x, "responseView", null)
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
