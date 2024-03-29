package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDynamictargetingkeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only dynamic targeting keys whose object has this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only dynamic targeting keys exactly matching these names.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only dynamic targeting keys with this object ID.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only dynamic targeting keys with this object type.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDynamictargetingkeysList {
  
  inline def apply(): ParamsResourceDynamictargetingkeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDynamictargetingkeysList]
  }
  
  extension [Self <: ParamsResourceDynamictargetingkeysList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
