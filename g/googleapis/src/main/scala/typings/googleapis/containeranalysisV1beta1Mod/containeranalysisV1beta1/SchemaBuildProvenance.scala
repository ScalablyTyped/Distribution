package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provenance of a build. Contains all information needed to verify the full
  * details about the build from source to completion.
  */
@js.native
trait SchemaBuildProvenance extends js.Object {
  
  /**
    * Special options applied to this build. This is a catch-all field where
    * build providers can enter any desired additional details.
    */
  var buildOptions: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Version string of the builder at the time this build was executed.
    */
  var builderVersion: js.UndefOr[String] = js.native
  
  /**
    * Output of the build.
    */
  var builtArtifacts: js.UndefOr[js.Array[SchemaArtifact]] = js.native
  
  /**
    * Commands requested by the build.
    */
  var commands: js.UndefOr[js.Array[SchemaCommand]] = js.native
  
  /**
    * Time at which the build was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * E-mail address of the user who initiated this build. Note that this was
    * the user&#39;s e-mail address at the time the build was initiated; this
    * address may not represent the same end-user for all time.
    */
  var creator: js.UndefOr[String] = js.native
  
  /**
    * Time at which execution of the build was finished.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Required. Unique identifier of the build.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * URI where any logs for this provenance were written.
    */
  var logsUri: js.UndefOr[String] = js.native
  
  /**
    * ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Details of the Source input to the build.
    */
  var sourceProvenance: js.UndefOr[SchemaSource] = js.native
  
  /**
    * Time at which execution of the build was started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Trigger identifier if the build was triggered automatically; empty if
    * not.
    */
  var triggerId: js.UndefOr[String] = js.native
}
object SchemaBuildProvenance {
  
  @scala.inline
  def apply(): SchemaBuildProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildProvenance]
  }
  
  @scala.inline
  implicit class SchemaBuildProvenanceOps[Self <: SchemaBuildProvenance] (val x: Self) extends AnyVal {
    
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
    def setBuildOptions(value: StringDictionary[String]): Self = this.set("buildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildOptions: Self = this.set("buildOptions", js.undefined)
    
    @scala.inline
    def setBuilderVersion(value: String): Self = this.set("builderVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderVersion: Self = this.set("builderVersion", js.undefined)
    
    @scala.inline
    def setBuiltArtifactsVarargs(value: SchemaArtifact*): Self = this.set("builtArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setBuiltArtifacts(value: js.Array[SchemaArtifact]): Self = this.set("builtArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltArtifacts: Self = this.set("builtArtifacts", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: SchemaCommand*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[SchemaCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLogsUri(value: String): Self = this.set("logsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogsUri: Self = this.set("logsUri", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSourceProvenance(value: SchemaSource): Self = this.set("sourceProvenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProvenance: Self = this.set("sourceProvenance", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
  }
}
