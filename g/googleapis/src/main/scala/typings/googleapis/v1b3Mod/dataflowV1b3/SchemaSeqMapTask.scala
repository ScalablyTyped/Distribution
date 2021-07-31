package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a particular function to invoke.
  */
trait SchemaSeqMapTask extends StObject {
  
  /**
    * Information about each of the inputs.
    */
  var inputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.undefined
  
  /**
    * The user-provided name of the SeqDo operation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Information about each of the outputs.
    */
  var outputInfos: js.UndefOr[js.Array[SchemaSeqMapTaskOutputInfo]] = js.undefined
  
  /**
    * System-defined name of the stage containing the SeqDo operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.undefined
  
  /**
    * System-defined name of the SeqDo operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
  
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaSeqMapTask {
  
  @scala.inline
  def apply(): SchemaSeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTask]
  }
  
  @scala.inline
  implicit class SchemaSeqMapTaskMutableBuilder[Self <: SchemaSeqMapTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputInfos(value: js.Array[SchemaSeqMapTaskOutputInfo]): Self = StObject.set(x, "outputInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputInfosUndefined: Self = StObject.set(x, "outputInfos", js.undefined)
    
    @scala.inline
    def setOutputInfosVarargs(value: SchemaSeqMapTaskOutputInfo*): Self = StObject.set(x, "outputInfos", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setUserFn(value: StringDictionary[js.Any]): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
