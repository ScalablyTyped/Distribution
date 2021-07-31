package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApksAddExternallyHostedRequest extends StObject {
  
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.undefined
}
object SchemaApksAddExternallyHostedRequest {
  
  @scala.inline
  def apply(): SchemaApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksAddExternallyHostedRequest]
  }
  
  @scala.inline
  implicit class SchemaApksAddExternallyHostedRequestMutableBuilder[Self <: SchemaApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternallyHostedApk(value: SchemaExternallyHostedApk): Self = StObject.set(x, "externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedApkUndefined: Self = StObject.set(x, "externallyHostedApk", js.undefined)
  }
}
