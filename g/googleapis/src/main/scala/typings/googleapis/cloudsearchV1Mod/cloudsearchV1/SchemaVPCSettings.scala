package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVPCSettings extends StObject {
  
  /**
    * The resource name of the GCP Project to be used for VPC SC policy check. VPC security settings on this project will be honored for Cloud Search APIs after project_name has been updated through CustomerService. Format: projects/{project_id\}
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaVPCSettings {
  
  inline def apply(): SchemaVPCSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVPCSettings]
  }
  
  extension [Self <: SchemaVPCSettings](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
