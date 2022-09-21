package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionStageSummary extends StObject {
  
  /**
    * Collections produced and consumed by component transforms of this stage.
    */
  var componentSource: js.UndefOr[js.Array[SchemaComponentSource]] = js.undefined
  
  /**
    * Transforms that comprise this execution stage.
    */
  var componentTransform: js.UndefOr[js.Array[SchemaComponentTransform]] = js.undefined
  
  /**
    * Dataflow service generated id for this stage.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input sources for this stage.
    */
  var inputSource: js.UndefOr[js.Array[SchemaStageSource]] = js.undefined
  
  /**
    * Type of transform this stage is executing.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dataflow service generated name for this stage.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output sources for this stage.
    */
  var outputSource: js.UndefOr[js.Array[SchemaStageSource]] = js.undefined
  
  /**
    * Other stages that must complete before this stage can run.
    */
  var prerequisiteStage: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaExecutionStageSummary {
  
  inline def apply(): SchemaExecutionStageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionStageSummary]
  }
  
  extension [Self <: SchemaExecutionStageSummary](x: Self) {
    
    inline def setComponentSource(value: js.Array[SchemaComponentSource]): Self = StObject.set(x, "componentSource", value.asInstanceOf[js.Any])
    
    inline def setComponentSourceUndefined: Self = StObject.set(x, "componentSource", js.undefined)
    
    inline def setComponentSourceVarargs(value: SchemaComponentSource*): Self = StObject.set(x, "componentSource", js.Array(value*))
    
    inline def setComponentTransform(value: js.Array[SchemaComponentTransform]): Self = StObject.set(x, "componentTransform", value.asInstanceOf[js.Any])
    
    inline def setComponentTransformUndefined: Self = StObject.set(x, "componentTransform", js.undefined)
    
    inline def setComponentTransformVarargs(value: SchemaComponentTransform*): Self = StObject.set(x, "componentTransform", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputSource(value: js.Array[SchemaStageSource]): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    inline def setInputSourceUndefined: Self = StObject.set(x, "inputSource", js.undefined)
    
    inline def setInputSourceVarargs(value: SchemaStageSource*): Self = StObject.set(x, "inputSource", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputSource(value: js.Array[SchemaStageSource]): Self = StObject.set(x, "outputSource", value.asInstanceOf[js.Any])
    
    inline def setOutputSourceUndefined: Self = StObject.set(x, "outputSource", js.undefined)
    
    inline def setOutputSourceVarargs(value: SchemaStageSource*): Self = StObject.set(x, "outputSource", js.Array(value*))
    
    inline def setPrerequisiteStage(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStage", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteStageNull: Self = StObject.set(x, "prerequisiteStage", null)
    
    inline def setPrerequisiteStageUndefined: Self = StObject.set(x, "prerequisiteStage", js.undefined)
    
    inline def setPrerequisiteStageVarargs(value: String*): Self = StObject.set(x, "prerequisiteStage", js.Array(value*))
  }
}
