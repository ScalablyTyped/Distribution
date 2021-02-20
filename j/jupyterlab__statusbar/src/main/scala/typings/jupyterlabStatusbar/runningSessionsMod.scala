package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions
import typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runningSessionsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions")
  @js.native
  class RunningSessions protected () extends VDomRenderer[Model] {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: IOptions) = this()
    
    var _handleClick: js.Any = js.native
    
    /**
      * Set the number of kernel sessions when the list changes.
      */
    var _onSessionsRunningChanged: js.Any = js.native
    
    /**
      * Set the number of terminal sessions when the list changes.
      */
    var _onTerminalsRunningChanged: js.Any = js.native
    
    var _serviceManager: js.Any = js.native
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _sessions: js.Any = js.native
      
      var _terminals: js.Any = js.native
      
      /**
        * The number of active kernel sessions.
        */
      def sessions: Double = js.native
      def sessions_=(sessions: Double): Unit = js.native
      
      /**
        * The number of active terminal sessions.
        */
      def terminals: Double = js.native
      def terminals_=(terminals: Double): Unit = js.native
    }
    
    /**
      * Options for creating a RunningSessions item.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A click handler for the item. By defult this is used
        * to activate the running sessions side panel.
        */
      def onClick(): Unit = js.native
      
      /**
        * The application service manager.
        */
      var serviceManager: ServiceManager = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(onClick: () => Unit, serviceManager: ServiceManager): IOptions = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), serviceManager = serviceManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
