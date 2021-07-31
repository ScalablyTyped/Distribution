package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStageSummary extends StObject {
  
  /** Collections produced and consumed by component transforms of this stage. */
  var componentSource: js.UndefOr[js.Array[ComponentSource]] = js.undefined
  
  /** Transforms that comprise this execution stage. */
  var componentTransform: js.UndefOr[js.Array[ComponentTransform]] = js.undefined
  
  /** Dataflow service generated id for this stage. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Input sources for this stage. */
  var inputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
  
  /** Type of tranform this stage is executing. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Dataflow service generated name for this stage. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output sources for this stage. */
  var outputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
  
  /** Other stages that must complete before this stage can run. */
  var prerequisiteStage: js.UndefOr[js.Array[String]] = js.undefined
}
object ExecutionStageSummary {
  
  @scala.inline
  def apply(): ExecutionStageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageSummary]
  }
  
  @scala.inline
  implicit class ExecutionStageSummaryMutableBuilder[Self <: ExecutionStageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentSource(value: js.Array[ComponentSource]): Self = StObject.set(x, "componentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentSourceUndefined: Self = StObject.set(x, "componentSource", js.undefined)
    
    @scala.inline
    def setComponentSourceVarargs(value: ComponentSource*): Self = StObject.set(x, "componentSource", js.Array(value :_*))
    
    @scala.inline
    def setComponentTransform(value: js.Array[ComponentTransform]): Self = StObject.set(x, "componentTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentTransformUndefined: Self = StObject.set(x, "componentTransform", js.undefined)
    
    @scala.inline
    def setComponentTransformVarargs(value: ComponentTransform*): Self = StObject.set(x, "componentTransform", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputSource(value: js.Array[StageSource]): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourceUndefined: Self = StObject.set(x, "inputSource", js.undefined)
    
    @scala.inline
    def setInputSourceVarargs(value: StageSource*): Self = StObject.set(x, "inputSource", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputSource(value: js.Array[StageSource]): Self = StObject.set(x, "outputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSourceUndefined: Self = StObject.set(x, "outputSource", js.undefined)
    
    @scala.inline
    def setOutputSourceVarargs(value: StageSource*): Self = StObject.set(x, "outputSource", js.Array(value :_*))
    
    @scala.inline
    def setPrerequisiteStage(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerequisiteStageUndefined: Self = StObject.set(x, "prerequisiteStage", js.undefined)
    
    @scala.inline
    def setPrerequisiteStageVarargs(value: String*): Self = StObject.set(x, "prerequisiteStage", js.Array(value :_*))
  }
}
