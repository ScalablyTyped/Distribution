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
  
  @scala.inline
  def apply(): ProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPermissions]
  }
  
  @scala.inline
  implicit class ProductPermissionsMutableBuilder[Self <: ProductPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: js.Array[ProductPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: ProductPermission*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
