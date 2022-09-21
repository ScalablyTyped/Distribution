package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobExecutionStageInfo extends StObject {
  
  /**
    * The steps associated with the execution stage. Note that stages may have several steps, and that a given step might be run by more than one stage.
    */
  var stepName: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaJobExecutionStageInfo {
  
  inline def apply(): SchemaJobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionStageInfo]
  }
  
  extension [Self <: SchemaJobExecutionStageInfo](x: Self) {
    
    inline def setStepName(value: js.Array[String]): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameNull: Self = StObject.set(x, "stepName", null)
    
    inline def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    inline def setStepNameVarargs(value: String*): Self = StObject.set(x, "stepName", js.Array(value*))
  }
}
