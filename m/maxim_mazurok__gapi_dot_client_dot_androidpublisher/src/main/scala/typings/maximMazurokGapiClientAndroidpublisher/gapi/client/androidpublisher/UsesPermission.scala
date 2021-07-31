package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsesPermission extends StObject {
  
  /** Optionally, the maximum SDK version for which the permission is required. */
  var maxSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** The name of the permission requested. */
  var name: js.UndefOr[String] = js.undefined
}
object UsesPermission {
  
  @scala.inline
  def apply(): UsesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsesPermission]
  }
  
  @scala.inline
  implicit class UsesPermissionMutableBuilder[Self <: UsesPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
