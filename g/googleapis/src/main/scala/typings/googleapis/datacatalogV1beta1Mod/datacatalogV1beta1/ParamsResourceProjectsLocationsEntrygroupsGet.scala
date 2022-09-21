package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entry group. For example, `projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The fields to return. If not set or empty, all fields are returned.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
