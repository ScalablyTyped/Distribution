package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApksAddExternallyHostedResponse extends StObject {
  
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.undefined
}
object SchemaApksAddExternallyHostedResponse {
  
  @scala.inline
  def apply(): SchemaApksAddExternallyHostedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksAddExternallyHostedResponse]
  }
  
  @scala.inline
  implicit class SchemaApksAddExternallyHostedResponseMutableBuilder[Self <: SchemaApksAddExternallyHostedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternallyHostedApk(value: SchemaExternallyHostedApk): Self = StObject.set(x, "externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedApkUndefined: Self = StObject.set(x, "externallyHostedApk", js.undefined)
  }
}
