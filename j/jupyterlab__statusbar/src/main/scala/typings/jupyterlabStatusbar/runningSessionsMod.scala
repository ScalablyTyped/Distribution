package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions
import typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runningSessionsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions")
  @js.native
  class RunningSessions protected () extends VDomRenderer[Model] {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: IOptions) = this()
    
    /* private */ var _handleClick: js.Any = js.native
    
    /**
      * Set the number of kernel sessions when the list changes.
      */
    /* private */ var _onSessionsRunningChanged: js.Any = js.native
    
    /**
      * Set the number of terminal sessions when the list changes.
      */
    /* private */ var _onTerminalsRunningChanged: js.Any = js.native
    
    /* private */ var _serviceManager: js.Any = js.native
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions.Model")
    @js.native
    class Model () extends VDomModel {
      
      /* private */ var _sessions: js.Any = js.native
      
      /* private */ var _terminals: js.Any = js.native
      
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
    trait IOptions extends StObject {
      
      /**
        * A click handler for the item. By defult this is used
        * to activate the running sessions side panel.
        */
      def onClick(): Unit
      
      /**
        * The application service manager.
        */
      var serviceManager: ServiceManager
    }
    object IOptions {
      
      inline def apply(onClick: () => Unit, serviceManager: ServiceManager): IOptions = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), serviceManager = serviceManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        inline def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
