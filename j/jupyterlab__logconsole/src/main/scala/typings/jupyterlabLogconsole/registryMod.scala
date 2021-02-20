package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistryChange
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("@jupyterlab/logconsole/lib/registry", "LoggerRegistry")
  @js.native
  class LoggerRegistry protected () extends ILoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: IOptions) = this()
    
    var _defaultRendermime: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _loggers: js.Any = js.native
    
    var _maxLength: js.Any = js.native
    
    var _registryChanged: js.Any = js.native
    
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
    @JSName("registryChanged")
    def registryChanged_MLoggerRegistry: ISignal[this.type, ILoggerRegistryChange] = js.native
  }
  object LoggerRegistry {
    
    @js.native
    trait IOptions extends StObject {
      
      var defaultRendermime: IRenderMimeRegistry = js.native
      
      var maxLength: Double = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(defaultRendermime: IRenderMimeRegistry, maxLength: Double): IOptions = {
        val __obj = js.Dynamic.literal(defaultRendermime = defaultRendermime.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "defaultRendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      }
    }
  }
}
