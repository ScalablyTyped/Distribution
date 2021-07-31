package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudBuildOptions extends StObject {
  
  /**
    * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See
    * https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
    */
  var appYamlPath: js.UndefOr[String] = js.undefined
  
  /** The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes. */
  var cloudBuildTimeout: js.UndefOr[String] = js.undefined
}
object CloudBuildOptions {
  
  @scala.inline
  def apply(): CloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudBuildOptions]
  }
  
  @scala.inline
  implicit class CloudBuildOptionsMutableBuilder[Self <: CloudBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppYamlPath(value: String): Self = StObject.set(x, "appYamlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppYamlPathUndefined: Self = StObject.set(x, "appYamlPath", js.undefined)
    
    @scala.inline
    def setCloudBuildTimeout(value: String): Self = StObject.set(x, "cloudBuildTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildTimeoutUndefined: Self = StObject.set(x, "cloudBuildTimeout", js.undefined)
  }
}
