package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDeploymentURLs extends StObject {
  
  var downloadAppsUrl: js.UndefOr[String] = js.undefined
  
  var userDocumentationURL: js.UndefOr[String] = js.undefined
}
object ConfigDeploymentURLs {
  
  inline def apply(): ConfigDeploymentURLs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigDeploymentURLs]
  }
  
  extension [Self <: ConfigDeploymentURLs](x: Self) {
    
    inline def setDownloadAppsUrl(value: String): Self = StObject.set(x, "downloadAppsUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadAppsUrlUndefined: Self = StObject.set(x, "downloadAppsUrl", js.undefined)
    
    inline def setUserDocumentationURL(value: String): Self = StObject.set(x, "userDocumentationURL", value.asInstanceOf[js.Any])
    
    inline def setUserDocumentationURLUndefined: Self = StObject.set(x, "userDocumentationURL", js.undefined)
  }
}
