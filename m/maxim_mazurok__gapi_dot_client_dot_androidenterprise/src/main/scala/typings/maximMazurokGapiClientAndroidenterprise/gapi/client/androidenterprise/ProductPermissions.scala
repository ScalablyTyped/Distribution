package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductPermissions extends StObject {
  
  /** The permissions required by the app. */
  var permission: js.UndefOr[js.Array[ProductPermission]] = js.undefined
  
  /** The ID of the app that the permissions relate to, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}
object ProductPermissions {
  
  inline def apply(): ProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPermissions]
  }
  
  extension [Self <: ProductPermissions](x: Self) {
    
    inline def setPermission(value: js.Array[ProductPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: ProductPermission*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
