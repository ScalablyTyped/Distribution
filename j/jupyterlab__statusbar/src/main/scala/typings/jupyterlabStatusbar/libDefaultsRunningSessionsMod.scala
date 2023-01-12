package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.IOptions
import typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.Model
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultsRunningSessionsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions")
  @js.native
  open class RunningSessions protected () extends VDomRenderer[Model] {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: IOptions) = this()
    
    /* private */ var _handleClick: Any = js.native
    
    /**
      * Set the number of kernel sessions when the list changes.
      */
    /* private */ var _onSessionsRunningChanged: Any = js.native
    
    /**
      * Set the number of terminal sessions when the list changes.
      */
    /* private */ var _onTerminalsRunningChanged: Any = js.native
    
    /* private */ var _serviceManager: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunningSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions.Model")
    @js.native
    open class Model () extends VDomModel {
      
      /* private */ var _sessions: Any = js.native
      
      /* private */ var _terminals: Any = js.native
      
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
        * A click handler for the item. By default this is used
        * to activate the running sessions side panel.
        */
      def onClick(): Unit
      
      /**
        * The application service manager.
        */
      var serviceManager: ServiceManager
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(onClick: () => Unit, serviceManager: ServiceManager): IOptions = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), serviceManager = serviceManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        inline def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
