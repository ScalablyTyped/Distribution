package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grant extends StObject {
  
  /** The permissions granted to the user for this app. */
  var appLevelPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Resource name for this grant, following the pattern "developers/{developer}/users/{email}/grants/{package_name}". If this grant is for a draft app, the app ID will be used
    * in this resource name instead of the package name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. The package name of the app. This will be empty for draft apps. */
  var packageName: js.UndefOr[String] = js.undefined
}
object Grant {
  
  inline def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  
  extension [Self <: Grant](x: Self) {
    
    inline def setAppLevelPermissions(value: js.Array[String]): Self = StObject.set(x, "appLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setAppLevelPermissionsUndefined: Self = StObject.set(x, "appLevelPermissions", js.undefined)
    
    inline def setAppLevelPermissionsVarargs(value: String*): Self = StObject.set(x, "appLevelPermissions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
