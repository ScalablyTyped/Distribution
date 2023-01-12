package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdapterOptions extends StObject {
  
  /** provide alternative global configuration for the adapter. Default: null */
  var config: js.UndefOr[Any] = js.undefined
  
  /** path to adapter */
  var dirname: js.UndefOr[String] = js.undefined
  
  /** Will be called when ioBroker detects an unhandled error in the adapter. Return `true` to signal that the error was handled and the adapter does not need to be restarted. */
  var error: js.UndefOr[ErrorHandler] = js.undefined
  
  /** instance of the created adapter. Default: null */
  var instance: js.UndefOr[Double] = js.undefined
  
  /** If the adapter collects logs from all adapters (experts only). Default: false */
  var logTransporter: js.UndefOr[Boolean] = js.undefined
  
  /** Handler for received adapter messages. Can only be used if messagebox in io-package.json is set to true. */
  var message: js.UndefOr[MessageHandler] = js.undefined
  
  /** The name of the adapter */
  var name: String
  
  /** Handler for changes of subscribed objects */
  var objectChange: js.UndefOr[ObjectChangeHandler] = js.undefined
  
  /** If true, the adapter will have a property `oObjects` that contains a live cache of the adapter's objects */
  var objects: js.UndefOr[Boolean] = js.undefined
  
  /** Will be called when the adapter is intialized */
  var ready: js.UndefOr[ReadyHandler] = js.undefined
  
  /** Handler for changes of subscribed states */
  var stateChange: js.UndefOr[StateChangeHandler] = js.undefined
  
  /** If true, the adapter will have a property `oStates` that contains a live cache of the adapter's states */
  var states: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the adapter should warn if states are set without an corresponding existing object. Default: `true` */
  var strictObjectChecks: js.UndefOr[Boolean] = js.undefined
  
  /** if the global system config should be included in the created object. Default: false */
  var systemConfig: js.UndefOr[Boolean] = js.undefined
  
  /** Will be called on adapter termination */
  var unload: js.UndefOr[UnloadHandler] = js.undefined
  
  /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
  var useFormatDate: js.UndefOr[Boolean] = js.undefined
}
object AdapterOptions {
  
  inline def apply(name: String): AdapterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    inline def setError(value: /* err */ js.Error => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInstance(value: Double): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLogTransporter(value: Boolean): Self = StObject.set(x, "logTransporter", value.asInstanceOf[js.Any])
    
    inline def setLogTransporterUndefined: Self = StObject.set(x, "logTransporter", js.undefined)
    
    inline def setMessage(value: /* obj */ Message => Unit | js.Promise[Unit]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObjectChange(value: (/* id */ String, /* obj */ js.UndefOr[Object | Null]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "objectChange", js.Any.fromFunction2(value))
    
    inline def setObjectChangeUndefined: Self = StObject.set(x, "objectChange", js.undefined)
    
    inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setReady(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setStateChange(value: (/* id */ String, /* obj */ js.UndefOr[State | Null]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "stateChange", js.Any.fromFunction2(value))
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    inline def setStates(value: Boolean): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStrictObjectChecks(value: Boolean): Self = StObject.set(x, "strictObjectChecks", value.asInstanceOf[js.Any])
    
    inline def setStrictObjectChecksUndefined: Self = StObject.set(x, "strictObjectChecks", js.undefined)
    
    inline def setSystemConfig(value: Boolean): Self = StObject.set(x, "systemConfig", value.asInstanceOf[js.Any])
    
    inline def setSystemConfigUndefined: Self = StObject.set(x, "systemConfig", js.undefined)
    
    inline def setUnload(value: UnloadHandler): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
    
    inline def setUnloadFunction0(value: () => js.Promise[Unit]): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
    
    inline def setUnloadFunction1(value: /* callback */ EmptyCallback => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction1(value))
    
    inline def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    
    inline def setUseFormatDate(value: Boolean): Self = StObject.set(x, "useFormatDate", value.asInstanceOf[js.Any])
    
    inline def setUseFormatDateUndefined: Self = StObject.set(x, "useFormatDate", js.undefined)
  }
}
