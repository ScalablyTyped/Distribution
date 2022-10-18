package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.building
import typings.jupyterlabServices.jupyterlabServicesStrings.needed
import typings.jupyterlabServices.jupyterlabServicesStrings.stable
import typings.jupyterlabServices.libBuilderMod.BuildManager.IOptions
import typings.jupyterlabServices.libBuilderMod.BuildManager.IStatus
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBuilderMod {
  
  @JSImport("@jupyterlab/services/lib/builder", "BuildManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  open class BuildManager () extends StObject {
    def this(options: IOptions) = this()
    
    /* private */ var _url: Any = js.native
    
    /**
      * Build the application.
      */
    def build(): js.Promise[Unit] = js.native
    
    /**
      * Cancel an active build.
      */
    def cancel(): js.Promise[Unit] = js.native
    
    /**
      * Get whether the application should be built.
      */
    def getStatus(): js.Promise[IStatus] = js.native
    
    /**
      * Test whether the build service is available.
      */
    def isAvailable: Boolean = js.native
    
    /**
      * The server settings used to make API requests.
      */
    val serverSettings: ISettings = js.native
    
    /**
      * Test whether to check build status automatically.
      */
    def shouldCheck: Boolean = js.native
  }
  object BuildManager {
    
    /**
      * The instantiation options for a setting manager.
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
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
    
    /**
      * The build status response from the server.
      */
    trait IStatus extends StObject {
      
      /**
        * The message associated with the build status.
        */
      val message: String
      
      /**
        * Whether a build is needed.
        */
      val status: stable | needed | building
    }
    object IStatus {
      
      inline def apply(message: String, status: stable | needed | building): IStatus = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[IStatus]
      }
      
      extension [Self <: IStatus](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: stable | needed | building): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Builder {
    
    /**
      * The interface for the build manager.
      */
    type IManager = BuildManager
  }
}
