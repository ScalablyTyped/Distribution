package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IArguments
import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activitymonitorMod {
  
  @JSImport("@jupyterlab/coreutils/lib/activitymonitor", "ActivityMonitor")
  @js.native
  open class ActivityMonitor[Sender, Args] protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new activity monitor.
      */
    def this(options: IOptions[Sender, Args]) = this()
    
    /* private */ var _activityStopped: Any = js.native
    
    /* private */ var _args: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * A signal handler for the monitored signal.
      */
    /* private */ var _onSignalFired: Any = js.native
    
    /* private */ var _sender: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * A signal emitted when activity has ceased.
      */
    def activityStopped: ISignal[this.type, IArguments[Sender, Args]] = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the monitor has been disposed.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("isDisposed")
    def isDisposed_MActivityMonitor: Boolean = js.native
    
    /**
      * The timeout associated with the monitor, in milliseconds.
      */
    def timeout: Double = js.native
    def timeout_=(value: Double): Unit = js.native
  }
  object ActivityMonitor {
    
    /**
      * The argument object for an activity timeout.
      *
      */
    trait IArguments[Sender, Args] extends StObject {
      
      /**
        * The most recent argument object.
        */
      var args: Args
      
      /**
        * The most recent sender object.
        */
      var sender: Sender
    }
    object IArguments {
      
      inline def apply[Sender, Args](args: Args, sender: Sender): IArguments[Sender, Args] = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
        __obj.asInstanceOf[IArguments[Sender, Args]]
      }
      
      extension [Self <: IArguments[?, ?], Sender, Args](x: Self & (IArguments[Sender, Args])) {
        
        inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setSender(value: Sender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to construct a new `ActivityMonitor`.
      */
    trait IOptions[Sender, Args] extends StObject {
      
      /**
        * The signal to monitor.
        */
      var signal: ISignal[Sender, Args]
      
      /**
        * The activity timeout in milliseconds.
        *
        * The default is 1 second.
        */
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply[Sender, Args](signal: ISignal[Sender, Args]): IOptions[Sender, Args] = {
        val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[Sender, Args]]
      }
      
      extension [Self <: IOptions[?, ?], Sender, Args](x: Self & (IOptions[Sender, Args])) {
        
        inline def setSignal(value: ISignal[Sender, Args]): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}
