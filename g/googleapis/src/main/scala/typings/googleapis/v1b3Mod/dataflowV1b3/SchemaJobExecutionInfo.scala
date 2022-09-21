package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobExecutionInfo extends StObject {
  
  /**
    * A mapping from each stage to the information about that stage.
    */
  var stages: js.UndefOr[StringDictionary[SchemaJobExecutionStageInfo] | Null] = js.undefined
}
object SchemaJobExecutionInfo {
  
  inline def apply(): SchemaJobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionInfo]
  }
  
  extension [Self <: SchemaJobExecutionInfo](x: Self) {
    
    inline def setStages(value: StringDictionary[SchemaJobExecutionStageInfo]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesNull: Self = StObject.set(x, "stages", null)
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
  }
}
