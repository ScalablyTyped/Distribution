package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsPlayintegrityconfigBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource names of the PlayIntegrityConfigs to retrieve, in the format ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ``` A maximum of 100 objects can be retrieved in a batch.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The parent project name shared by all PlayIntegrityConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsPlayintegrityconfigBatchget {
  
  inline def apply(): ParamsResourceProjectsAppsPlayintegrityconfigBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsPlayintegrityconfigBatchget]
  }
  
  extension [Self <: ParamsResourceProjectsAppsPlayintegrityconfigBatchget](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
