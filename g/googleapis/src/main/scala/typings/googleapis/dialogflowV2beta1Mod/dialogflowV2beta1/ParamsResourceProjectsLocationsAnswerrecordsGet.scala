package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAnswerrecordsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the answer record to retrieve. Format: `projects//locations//answerRecords/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAnswerrecordsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAnswerrecordsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAnswerrecordsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAnswerrecordsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
