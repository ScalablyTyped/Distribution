package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.libSavehandlerMod.SaveHandler.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSavehandlerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/savehandler", "SaveHandler")
  @js.native
  open class SaveHandler protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new save handler.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _autosaveTimer: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _inDialog: Any = js.native
    
    /* private */ var _interval: Any = js.native
    
    /* private */ var _isActive: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _minInterval: Any = js.native
    
    /* private */ var _multiplier: Any = js.native
    
    /**
      * Handle an autosave timeout.
      */
    /* private */ var _save: Any = js.native
    
    /**
      * Set the timer.
      */
    /* private */ var _setTimer: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Get whether the handler is active.
      */
    def isActive: Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
    trait IOptions extends StObject {
      
      /**
        * The context associated with the file.
        */
      var context: Context
      
      /**
        * The minimum save interval in seconds (default is two minutes).
        */
      var saveInterval: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(context: Context): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setSaveInterval(value: Double): Self = StObject.set(x, "saveInterval", value.asInstanceOf[js.Any])
        
        inline def setSaveIntervalUndefined: Self = StObject.set(x, "saveInterval", js.undefined)
      }
    }
  }
}
