package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGithubEnterpriseConfigsResponse extends StObject {
  
  /** A list of GitHubEnterpriseConfigs */
  var configs: js.UndefOr[js.Array[GitHubEnterpriseConfig]] = js.undefined
}
object ListGithubEnterpriseConfigsResponse {
  
  inline def apply(): ListGithubEnterpriseConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGithubEnterpriseConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGithubEnterpriseConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigs(value: js.Array[GitHubEnterpriseConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: GitHubEnterpriseConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
