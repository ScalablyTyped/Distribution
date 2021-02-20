package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object savehandlerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/savehandler", "SaveHandler")
  @js.native
  class SaveHandler protected () extends IDisposable {
    /**
      * Construct a new save handler.
      */
    def this(options: IOptions) = this()
    
    var _autosaveTimer: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _inDialog: js.Any = js.native
    
    var _interval: js.Any = js.native
    
    var _isActive: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _minInterval: js.Any = js.native
    
    var _multiplier: js.Any = js.native
    
    /**
      * Handle an autosave timeout.
      */
    var _save: js.Any = js.native
    
    /**
      * Set the timer.
      */
    var _setTimer: js.Any = js.native
    
    /**
      * Get whether the handler is active.
      */
    def isActive: Boolean = js.native
    
    /**
      * Get whether the save handler is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSaveHandler: Boolean = js.native
    
    /**
      * The save interval used by the timer (in seconds).
      */
    def saveInterval: Double = js.native
    def saveInterval_=(value: Double): Unit = js.native
    
    /**
      * Start the autosaver.
      */
    def start(): Unit = js.native
    
    /**
      * Stop the autosaver.
      */
    def stop(): Unit = js.native
  }
  object SaveHandler {
    
    /**
      * The options used to create a save handler.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The context asssociated with the file.
        */
      var context: Context = js.native
      
      /**
        * The minimum save interval in seconds (default is two minutes).
        */
      var saveInterval: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(context: Context): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaveInterval(value: Double): Self = StObject.set(x, "saveInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaveIntervalUndefined: Self = StObject.set(x, "saveInterval", js.undefined)
      }
    }
  }
}
