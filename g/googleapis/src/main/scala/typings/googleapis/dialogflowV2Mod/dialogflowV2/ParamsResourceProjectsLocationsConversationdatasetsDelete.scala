package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationdatasetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation dataset to delete. Format: `projects//locations//conversationDatasets/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationdatasetsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationdatasetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationdatasetsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationdatasetsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
