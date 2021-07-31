package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create container versions response.
  */
trait SchemaCreateContainerVersionResponse extends StObject {
  
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.undefined
  
  /**
    * Auto generated workspace path created as a result of version creation.
    * This field should only be populated if the created version was not a
    * quick preview.
    */
  var newWorkspacePath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether version creation failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.undefined
}
object SchemaCreateContainerVersionResponse {
  
  @scala.inline
  def apply(): SchemaCreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateContainerVersionResponseMutableBuilder[Self <: SchemaCreateContainerVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: SchemaContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setNewWorkspacePath(value: String): Self = StObject.set(x, "newWorkspacePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWorkspacePathUndefined: Self = StObject.set(x, "newWorkspacePath", js.undefined)
    
    @scala.inline
    def setSyncStatus(value: SchemaSyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
