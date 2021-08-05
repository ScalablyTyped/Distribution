package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provenance of a build. Contains all information needed to verify the full
  * details about the build from source to completion.
  */
trait SchemaBuildProvenance extends StObject {
  
  /**
    * Special options applied to this build. This is a catch-all field where
    * build providers can enter any desired additional details.
    */
  var buildOptions: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Version string of the builder at the time this build was executed.
    */
  var builderVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Output of the build.
    */
  var builtArtifacts: js.UndefOr[js.Array[SchemaArtifact]] = js.undefined
  
  /**
    * Commands requested by the build.
    */
  var commands: js.UndefOr[js.Array[SchemaCommand]] = js.undefined
  
  /**
    * Time at which the build was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * E-mail address of the user who initiated this build. Note that this was
    * the user&#39;s e-mail address at the time the build was initiated; this
    * address may not represent the same end-user for all time.
    */
  var creator: js.UndefOr[String] = js.undefined
  
  /**
    * Time at which execution of the build was finished.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Unique identifier of the build.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * URI where any logs for this provenance were written.
    */
  var logsUri: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Details of the Source input to the build.
    */
  var sourceProvenance: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * Time at which execution of the build was started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Trigger identifier if the build was triggered automatically; empty if
    * not.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object SchemaBuildProvenance {
  
  inline def apply(): SchemaBuildProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildProvenance]
  }
  
  extension [Self <: SchemaBuildProvenance](x: Self) {
    
    inline def setBuildOptions(value: StringDictionary[String]): Self = StObject.set(x, "buildOptions", value.asInstanceOf[js.Any])
    
    inline def setBuildOptionsUndefined: Self = StObject.set(x, "buildOptions", js.undefined)
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
    
    inline def setBuiltArtifacts(value: js.Array[SchemaArtifact]): Self = StObject.set(x, "builtArtifacts", value.asInstanceOf[js.Any])
    
    inline def setBuiltArtifactsUndefined: Self = StObject.set(x, "builtArtifacts", js.undefined)
    
    inline def setBuiltArtifactsVarargs(value: SchemaArtifact*): Self = StObject.set(x, "builtArtifacts", js.Array(value :_*))
    
    inline def setCommands(value: js.Array[SchemaCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: SchemaCommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogsUri(value: String): Self = StObject.set(x, "logsUri", value.asInstanceOf[js.Any])
    
    inline def setLogsUriUndefined: Self = StObject.set(x, "logsUri", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSourceProvenance(value: SchemaSource): Self = StObject.set(x, "sourceProvenance", value.asInstanceOf[js.Any])
    
    inline def setSourceProvenanceUndefined: Self = StObject.set(x, "sourceProvenance", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
