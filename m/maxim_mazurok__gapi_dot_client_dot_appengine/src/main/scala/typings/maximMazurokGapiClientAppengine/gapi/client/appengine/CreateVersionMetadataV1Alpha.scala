package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionMetadataV1Alpha extends StObject {
  
  /** The Cloud Build ID if one was created as part of the version create. @OutputOnly */
  var cloudBuildId: js.UndefOr[String] = js.undefined
}
object CreateVersionMetadataV1Alpha {
  
  @scala.inline
  def apply(): CreateVersionMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionMetadataV1Alpha]
  }
  
  @scala.inline
  implicit class CreateVersionMetadataV1AlphaMutableBuilder[Self <: CreateVersionMetadataV1Alpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
