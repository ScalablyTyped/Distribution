package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditCustomerMatchMembersRequest extends StObject {
  
  /**
    * Input only. A list of contact information to define the members to be added.
    */
  var addedContactInfoList: js.UndefOr[SchemaContactInfoList] = js.undefined
  
  /**
    * Input only. A list of mobile device IDs to define the members to be added.
    */
  var addedMobileDeviceIdList: js.UndefOr[SchemaMobileDeviceIdList] = js.undefined
  
  /**
    * Required. The ID of the owner advertiser of the updated Customer Match FirstAndThirdPartyAudience.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEditCustomerMatchMembersRequest {
  
  inline def apply(): SchemaEditCustomerMatchMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditCustomerMatchMembersRequest]
  }
  
  extension [Self <: SchemaEditCustomerMatchMembersRequest](x: Self) {
    
    inline def setAddedContactInfoList(value: SchemaContactInfoList): Self = StObject.set(x, "addedContactInfoList", value.asInstanceOf[js.Any])
    
    inline def setAddedContactInfoListUndefined: Self = StObject.set(x, "addedContactInfoList", js.undefined)
    
    inline def setAddedMobileDeviceIdList(value: SchemaMobileDeviceIdList): Self = StObject.set(x, "addedMobileDeviceIdList", value.asInstanceOf[js.Any])
    
    inline def setAddedMobileDeviceIdListUndefined: Self = StObject.set(x, "addedMobileDeviceIdList", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
  }
}
