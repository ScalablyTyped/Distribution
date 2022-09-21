package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAnswerrecordsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the answer record to retrieve. Format: `projects//locations//answerRecords/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAnswerrecordsGet {
  
  inline def apply(): ParamsResourceProjectsAnswerrecordsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAnswerrecordsGet]
  }
  
  extension [Self <: ParamsResourceProjectsAnswerrecordsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
