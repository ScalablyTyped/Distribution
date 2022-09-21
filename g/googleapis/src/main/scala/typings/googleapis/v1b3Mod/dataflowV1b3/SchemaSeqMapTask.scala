package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeqMapTask extends StObject {
  
  /**
    * Information about each of the inputs.
    */
  var inputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.undefined
  
  /**
    * The user-provided name of the SeqDo operation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about each of the outputs.
    */
  var outputInfos: js.UndefOr[js.Array[SchemaSeqMapTaskOutputInfo]] = js.undefined
  
  /**
    * System-defined name of the stage containing the SeqDo operation. Unique across the workflow.
    */
  var stageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System-defined name of the SeqDo operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaSeqMapTask {
  
  inline def apply(): SchemaSeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTask]
  }
  
  extension [Self <: SchemaSeqMapTask](x: Self) {
    
    inline def setInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputInfos(value: js.Array[SchemaSeqMapTaskOutputInfo]): Self = StObject.set(x, "outputInfos", value.asInstanceOf[js.Any])
    
    inline def setOutputInfosUndefined: Self = StObject.set(x, "outputInfos", js.undefined)
    
    inline def setOutputInfosVarargs(value: SchemaSeqMapTaskOutputInfo*): Self = StObject.set(x, "outputInfos", js.Array(value*))
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameNull: Self = StObject.set(x, "stageName", null)
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameNull: Self = StObject.set(x, "systemName", null)
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setUserFn(value: StringDictionary[Any]): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    inline def setUserFnNull: Self = StObject.set(x, "userFn", null)
    
    inline def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
