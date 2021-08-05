package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to quick previewing a workspace.
  */
trait SchemaQuickPreviewResponse extends StObject {
  
  /**
    * Were there compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The quick previewed container version.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.undefined
  
  /**
    * Whether quick previewing failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.undefined
}
object SchemaQuickPreviewResponse {
  
  inline def apply(): SchemaQuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuickPreviewResponse]
  }
  
  extension [Self <: SchemaQuickPreviewResponse](x: Self) {
    
    inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    inline def setContainerVersion(value: SchemaContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setSyncStatus(value: SchemaSyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
