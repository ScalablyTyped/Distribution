package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.libRegistryMod.LoggerRegistry.IOptions
import typings.jupyterlabLogconsole.libTokensMod.ILogger
import typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistryChange
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegistryMod {
  
  @JSImport("@jupyterlab/logconsole/lib/registry", "LoggerRegistry")
  @js.native
  open class LoggerRegistry protected ()
    extends StObject
       with ILoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _defaultRendermime: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _loggers: Any = js.native
    
    /* private */ var _maxLength: Any = js.native
    
    /* private */ var _registryChanged: Any = js.native
    
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
      * Get the logger for the specified source.
      *
      * @param source - The name of the log source.
      *
      * @returns The logger for the specified source.
      */
    /* CompleteClass */
    override def getLogger(source: String): ILogger = js.native
    
    /**
      * Get all loggers registered.
      *
      * @returns The array containing all registered loggers.
      */
    /* CompleteClass */
    override def getLoggers(): js.Array[ILogger] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the register is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MLoggerRegistry: Boolean = js.native
    
    /**
      * The max length for loggers.
      */
    def maxLength: Double = js.native
    def maxLength_=(value: Double): Unit = js.native
    
    /**
      * A signal emitted when the logger registry changes.
      */
    /* CompleteClass */
    override val registryChanged: ISignal[this.type, ILoggerRegistryChange] = js.native
    /**
      * A signal emitted when the logger registry changes.
      */
    @JSName("registryChanged")
    def registryChanged_MLoggerRegistry: ISignal[this.type, ILoggerRegistryChange] = js.native
  }
  object LoggerRegistry {
    
    trait IOptions extends StObject {
      
      var defaultRendermime: IRenderMimeRegistry
      
      var maxLength: Double
    }
    object IOptions {
      
      inline def apply(defaultRendermime: IRenderMimeRegistry, maxLength: Double): IOptions = {
        val __obj = js.Dynamic.literal(defaultRendermime = defaultRendermime.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setDefaultRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "defaultRendermime", value.asInstanceOf[js.Any])
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      }
    }
  }
}
