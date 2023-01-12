package typings.jupyterlabServices

import typings.jupyterlabServices.anon.Id
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libWorkspaceMod.Workspace.IWorkspace
import typings.jupyterlabServices.libWorkspaceMod.WorkspaceManager.IOptions
import typings.jupyterlabStatedb.mod.DataConnector
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWorkspaceMod {
  
  @JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
  @js.native
  /**
    * Create a new workspace manager.
    */
  open class WorkspaceManager () extends DataConnector[IWorkspace, IWorkspace, String, String] {
    def this(options: IOptions) = this()
    
    /**
      * The server settings used to make API requests.
      */
    val serverSettings: ISettings = js.native
  }
  object WorkspaceManager {
    
    /**
      * The instantiation options for a workspace manager.
      */
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  object Workspace {
    
    /**
      * The interface for the workspace API manager.
      */
    type IManager = WorkspaceManager
    
    /**
      * The interface describing a workspace API response.
      */
    trait IWorkspace extends StObject {
      
      /**
        * The workspace data.
        */
      var data: ReadonlyPartialJSONObject
      
      /**
        * The metadata for a workspace.
        */
      var metadata: Id
    }
    object IWorkspace {
      
      inline def apply(data: ReadonlyPartialJSONObject, metadata: Id): IWorkspace = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[IWorkspace]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IWorkspace] (val x: Self) extends AnyVal {
        
        inline def setData(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: Id): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      }
    }
  }
}
