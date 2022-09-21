package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserResponse extends StObject {
  
  var MFAOptions: js.UndefOr[js.Array[MFAOptionType]] = js.undefined
  
  var PreferredMfaSetting: js.UndefOr[String] = js.undefined
  
  var UserAttributes: js.Array[AttributeType]
  
  var UserMFASettingList: js.UndefOr[js.Array[String]] = js.undefined
  
  var Username: String
}
object GetUserResponse {
  
  inline def apply(UserAttributes: js.Array[AttributeType], Username: String): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
  
  extension [Self <: GetUserResponse](x: Self) {
    
    inline def setMFAOptions(value: js.Array[MFAOptionType]): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    inline def setMFAOptionsUndefined: Self = StObject.set(x, "MFAOptions", js.undefined)
    
    inline def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value*))
    
    inline def setPreferredMfaSetting(value: String): Self = StObject.set(x, "PreferredMfaSetting", value.asInstanceOf[js.Any])
    
    inline def setPreferredMfaSettingUndefined: Self = StObject.set(x, "PreferredMfaSetting", js.undefined)
    
    inline def setUserAttributes(value: js.Array[AttributeType]): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value*))
    
    inline def setUserMFASettingList(value: js.Array[String]): Self = StObject.set(x, "UserMFASettingList", value.asInstanceOf[js.Any])
    
    inline def setUserMFASettingListUndefined: Self = StObject.set(x, "UserMFASettingList", js.undefined)
    
    inline def setUserMFASettingListVarargs(value: String*): Self = StObject.set(x, "UserMFASettingList", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
