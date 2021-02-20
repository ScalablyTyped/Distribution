package typings.jupyterlabServices

import typings.jupyterlabServices.builderMod.BuildManager.IOptions
import typings.jupyterlabServices.builderMod.BuildManager.IStatus
import typings.jupyterlabServices.jupyterlabServicesStrings.building
import typings.jupyterlabServices.jupyterlabServicesStrings.needed
import typings.jupyterlabServices.jupyterlabServicesStrings.stable
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("@jupyterlab/services/lib/builder", "BuildManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  class BuildManager () extends StObject {
    def this(options: IOptions) = this()
    
    var _url: js.Any = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
    
    /**
      * The build status response from the server.
      */
    @js.native
    trait IStatus extends StObject {
      
      /**
        * The message associated with the build status.
        */
      val message: String = js.native
      
      /**
        * Whether a build is needed.
        */
      val status: stable | needed | building = js.native
    }
    object IStatus {
      
      @scala.inline
      def apply(message: String, status: stable | needed | building): IStatus = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[IStatus]
      }
      
      @scala.inline
      implicit class IStatusMutableBuilder[Self <: IStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: stable | needed | building): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
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
