package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission used by this APK.
  */
@js.native
trait SchemaExternallyHostedApkUsesPermission extends StObject {
  
  /**
    * Optionally, the maximum SDK version for which the permission is required.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  
  /**
    * The name of the permission requested.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaExternallyHostedApkUsesPermission {
  
  @scala.inline
  def apply(): SchemaExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternallyHostedApkUsesPermission]
  }
  
  @scala.inline
  implicit class SchemaExternallyHostedApkUsesPermissionMutableBuilder[Self <: SchemaExternallyHostedApkUsesPermission] (val x: Self) extends AnyVal {
    
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
