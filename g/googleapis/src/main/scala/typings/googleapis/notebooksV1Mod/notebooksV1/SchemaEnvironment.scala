package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironment extends StObject {
  
  /**
    * Use a container image to start the notebook instance.
    */
  var containerImage: js.UndefOr[SchemaContainerImage] = js.undefined
  
  /**
    * Output only. The time at which this environment was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A brief description of this environment.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of this environment for the UI.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of this environment. Format: `projects/{project_id\}/locations/{location\}/environments/{environment_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"`
    */
  var postStartupScript: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use a Compute Engine VM image to start the notebook instance.
    */
  var vmImage: js.UndefOr[SchemaVmImage] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setContainerImage(value: SchemaContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostStartupScript(value: String): Self = StObject.set(x, "postStartupScript", value.asInstanceOf[js.Any])
    
    inline def setPostStartupScriptNull: Self = StObject.set(x, "postStartupScript", null)
    
    inline def setPostStartupScriptUndefined: Self = StObject.set(x, "postStartupScript", js.undefined)
    
    inline def setVmImage(value: SchemaVmImage): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    inline def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
