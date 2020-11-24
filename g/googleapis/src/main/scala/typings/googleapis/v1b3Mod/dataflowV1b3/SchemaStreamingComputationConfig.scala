package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration information for a single streaming computation.
  */
@js.native
trait SchemaStreamingComputationConfig extends js.Object {
  
  /**
    * Unique identifier for this computation.
    */
  var computationId: js.UndefOr[String] = js.native
  
  /**
    * Instructions that comprise the computation.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.native
  
  /**
    * Stage name of this computation.
    */
  var stageName: js.UndefOr[String] = js.native
  
  /**
    * System defined name for this computation.
    */
  var systemName: js.UndefOr[String] = js.native
  
  /**
    * Map from user name of stateful transforms in this stage to their state
    * family.
    */
  var transformUserNameToStateFamily: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaStreamingComputationConfig {
  
  @scala.inline
  def apply(): SchemaStreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationConfig]
  }
  
  @scala.inline
  implicit class SchemaStreamingComputationConfigOps[Self <: SchemaStreamingComputationConfig] (val x: Self) extends AnyVal {
    
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
    def setComputationId(value: String): Self = this.set("computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputationId: Self = this.set("computationId", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: SchemaParallelInstruction*): Self = this.set("instructions", js.Array(value :_*))
    
    @scala.inline
    def setInstructions(value: js.Array[SchemaParallelInstruction]): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    
    @scala.inline
    def setTransformUserNameToStateFamily(value: StringDictionary[String]): Self = this.set("transformUserNameToStateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformUserNameToStateFamily: Self = this.set("transformUserNameToStateFamily", js.undefined)
  }
}
