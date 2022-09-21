package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersPhotosUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserPhoto] = js.undefined
  
  /**
    * Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersPhotosUpdate {
  
  inline def apply(): ParamsResourceUsersPhotosUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersPhotosUpdate]
  }
  
  extension [Self <: ParamsResourceUsersPhotosUpdate](x: Self) {
    
    inline def setRequestBody(value: SchemaUserPhoto): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
