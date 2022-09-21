package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMonitoredresourcedescriptorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The monitored resource descriptor to get. The format is: projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE] The [RESOURCE_TYPE] is a predefined type, such as cloudsql_database.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsMonitoredresourcedescriptorsGet {
  
  inline def apply(): ParamsResourceProjectsMonitoredresourcedescriptorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMonitoredresourcedescriptorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsMonitoredresourcedescriptorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
