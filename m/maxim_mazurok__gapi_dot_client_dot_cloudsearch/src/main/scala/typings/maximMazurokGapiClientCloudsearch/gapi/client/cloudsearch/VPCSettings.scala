package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCSettings extends StObject {
  
  /**
    * The resource name of the GCP Project to be used for VPC SC policy check. VPC security settings on this project will be honored for Cloud Search APIs after project_name has been
    * updated through CustomerService. Format: projects/{project_id}
    */
  var project: js.UndefOr[String] = js.undefined
}
object VPCSettings {
  
  inline def apply(): VPCSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VPCSettings] (val x: Self) extends AnyVal {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
