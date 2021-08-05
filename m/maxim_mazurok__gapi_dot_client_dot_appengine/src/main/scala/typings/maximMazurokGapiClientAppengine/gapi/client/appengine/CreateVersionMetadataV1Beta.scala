package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionMetadataV1Beta extends StObject {
  
  /** The Cloud Build ID if one was created as part of the version create. @OutputOnly */
  var cloudBuildId: js.UndefOr[String] = js.undefined
}
object CreateVersionMetadataV1Beta {
  
  inline def apply(): CreateVersionMetadataV1Beta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionMetadataV1Beta]
  }
  
  extension [Self <: CreateVersionMetadataV1Beta](x: Self) {
    
    inline def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
