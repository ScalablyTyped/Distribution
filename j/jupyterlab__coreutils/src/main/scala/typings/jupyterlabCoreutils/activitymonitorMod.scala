package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IArguments
import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activitymonitorMod {
  
  @JSImport("@jupyterlab/coreutils/lib/activitymonitor", "ActivityMonitor")
  @js.native
  class ActivityMonitor[Sender, Args] protected () extends IDisposable {
    /**
      * Construct a new activity monitor.
      */
    def this(options: IOptions[Sender, Args]) = this()
    
    var _activityStopped: js.Any = js.native
    
    var _args: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * A signal handler for the monitored signal.
      */
    var _onSignalFired: js.Any = js.native
    
    var _sender: js.Any = js.native
    
    var _timeout: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    /**
      * A signal emitted when activity has ceased.
      */
    def activityStopped: ISignal[this.type, IArguments[Sender, Args]] = js.native
    
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
    @js.native
    trait IArguments[Sender, Args] extends StObject {
      
      /**
        * The most recent argument object.
        */
      var args: Args = js.native
      
      /**
        * The most recent sender object.
        */
      var sender: Sender = js.native
    }
    object IArguments {
      
      @scala.inline
      def apply[Sender, Args](args: Args, sender: Sender): IArguments[Sender, Args] = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
        __obj.asInstanceOf[IArguments[Sender, Args]]
      }
      
      @scala.inline
      implicit class IArgumentsMutableBuilder[Self <: IArguments[_, _], Sender, Args] (val x: Self with (IArguments[Sender, Args])) extends AnyVal {
        
        @scala.inline
        def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSender(value: Sender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to construct a new `ActivityMonitor`.
      */
    @js.native
    trait IOptions[Sender, Args] extends StObject {
      
      /**
        * The signal to monitor.
        */
      var signal: ISignal[Sender, Args] = js.native
      
      /**
        * The activity timeout in milliseconds.
        *
        * The default is 1 second.
        */
      var timeout: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[Sender, Args](signal: ISignal[Sender, Args]): IOptions[Sender, Args] = {
        val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[Sender, Args]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_, _], Sender, Args] (val x: Self with (IOptions[Sender, Args])) extends AnyVal {
        
        @scala.inline
        def setSignal(value: ISignal[Sender, Args]): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}
