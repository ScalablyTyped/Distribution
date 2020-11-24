package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionStageSummary extends js.Object {
  
  /** Collections produced and consumed by component transforms of this stage. */
  var componentSource: js.UndefOr[js.Array[ComponentSource]] = js.native
  
  /** Transforms that comprise this execution stage. */
  var componentTransform: js.UndefOr[js.Array[ComponentTransform]] = js.native
  
  /** Dataflow service generated id for this stage. */
  var id: js.UndefOr[String] = js.native
  
  /** Input sources for this stage. */
  var inputSource: js.UndefOr[js.Array[StageSource]] = js.native
  
  /** Type of tranform this stage is executing. */
  var kind: js.UndefOr[String] = js.native
  
  /** Dataflow service generated name for this stage. */
  var name: js.UndefOr[String] = js.native
  
  /** Output sources for this stage. */
  var outputSource: js.UndefOr[js.Array[StageSource]] = js.native
  
  /** Other stages that must complete before this stage can run. */
  var prerequisiteStage: js.UndefOr[js.Array[String]] = js.native
}
object ExecutionStageSummary {
  
  @scala.inline
  def apply(): ExecutionStageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageSummary]
  }
  
  @scala.inline
  implicit class ExecutionStageSummaryOps[Self <: ExecutionStageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentSourceVarargs(value: ComponentSource*): Self = this.set("componentSource", js.Array(value :_*))
    
    @scala.inline
    def setComponentSource(value: js.Array[ComponentSource]): Self = this.set("componentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSource: Self = this.set("componentSource", js.undefined)
    
    @scala.inline
    def setComponentTransformVarargs(value: ComponentTransform*): Self = this.set("componentTransform", js.Array(value :_*))
    
    @scala.inline
    def setComponentTransform(value: js.Array[ComponentTransform]): Self = this.set("componentTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentTransform: Self = this.set("componentTransform", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputSourceVarargs(value: StageSource*): Self = this.set("inputSource", js.Array(value :_*))
    
    @scala.inline
    def setInputSource(value: js.Array[StageSource]): Self = this.set("inputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSource: Self = this.set("inputSource", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputSourceVarargs(value: StageSource*): Self = this.set("outputSource", js.Array(value :_*))
    
    @scala.inline
    def setOutputSource(value: js.Array[StageSource]): Self = this.set("outputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSource: Self = this.set("outputSource", js.undefined)
    
    @scala.inline
    def setPrerequisiteStageVarargs(value: String*): Self = this.set("prerequisiteStage", js.Array(value :_*))
    
    @scala.inline
    def setPrerequisiteStage(value: js.Array[String]): Self = this.set("prerequisiteStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerequisiteStage: Self = this.set("prerequisiteStage", js.undefined)
  }
}
