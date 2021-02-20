package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterOptions extends StObject {
  
  /** provide alternative global configuration for the adapter. Default: null */
  var config: js.UndefOr[js.Any] = js.native
  
  /** path to adapter */
  var dirname: js.UndefOr[String] = js.native
  
  /** Will be called when ioBroker detects an unhandled error in the adapter. Return `true` to signal that the error was handled and the adapter does not need to be restarted. */
  var error: js.UndefOr[ErrorHandler] = js.native
  
  /** instance of the created adapter. Default: null */
  var instance: js.UndefOr[Double] = js.native
  
  /** If the adapter collects logs from all adapters (experts only). Default: false */
  var logTransporter: js.UndefOr[Boolean] = js.native
  
  /** Handler for received adapter messages. Can only be used if messagebox in io-package.json is set to true. */
  var message: js.UndefOr[MessageHandler] = js.native
  
  /** The name of the adapter */
  var name: String = js.native
  
  /** if true, stateChange will be called with an id that has no namespace, e.g. "state" instead of "adapter.0.state". Default: false */
  var noNamespace: js.UndefOr[Boolean] = js.native
  
  /** Handler for changes of subscribed objects */
  var objectChange: js.UndefOr[ObjectChangeHandler] = js.native
  
  /** If true, the adapter will have a property `oObjects` that contains a live cache of the adapter's objects */
  var objects: js.UndefOr[Boolean] = js.native
  
  /** Will be called when the adapter is intialized */
  var ready: js.UndefOr[ReadyHandler] = js.native
  
  /** Handler for changes of subscribed states */
  var stateChange: js.UndefOr[StateChangeHandler] = js.native
  
  /** If true, the adapter will have a property `oStates` that contains a live cache of the adapter's states */
  var states: js.UndefOr[Boolean] = js.native
  
  /** Whether the adapter should warn if states are set without an corresponding existing object. Default: `true` */
  var strictObjectChecks: js.UndefOr[Boolean] = js.native
  
  /** if the global system config should be included in the created object. Default: false */
  var systemConfig: js.UndefOr[Boolean] = js.native
  
  /** Will be called on adapter termination */
  var unload: js.UndefOr[UnloadHandler] = js.native
  
  /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
  var useFormatDate: js.UndefOr[Boolean] = js.native
}
object AdapterOptions {
  
  @scala.inline
  def apply(name: String): AdapterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterOptions]
  }
  
  @scala.inline
  implicit class AdapterOptionsMutableBuilder[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    @scala.inline
    def setError(value: /* err */ Error => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInstance(value: Double): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setLogTransporter(value: Boolean): Self = StObject.set(x, "logTransporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTransporterUndefined: Self = StObject.set(x, "logTransporter", js.undefined)
    
    @scala.inline
    def setMessage(value: /* obj */ Message => Unit | js.Promise[Unit]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNamespace(value: Boolean): Self = StObject.set(x, "noNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNamespaceUndefined: Self = StObject.set(x, "noNamespace", js.undefined)
    
    @scala.inline
    def setObjectChange(value: (/* id */ String, /* obj */ js.UndefOr[Object | Null]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "objectChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setObjectChangeUndefined: Self = StObject.set(x, "objectChange", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setStateChange(value: (/* id */ String, /* obj */ js.UndefOr[State | Null]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "stateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    @scala.inline
    def setStates(value: Boolean): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStrictObjectChecks(value: Boolean): Self = StObject.set(x, "strictObjectChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictObjectChecksUndefined: Self = StObject.set(x, "strictObjectChecks", js.undefined)
    
    @scala.inline
    def setSystemConfig(value: Boolean): Self = StObject.set(x, "systemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemConfigUndefined: Self = StObject.set(x, "systemConfig", js.undefined)
    
    @scala.inline
    def setUnload(value: /* callback */ EmptyCallback => Unit | js.Promise[Unit]): Self = StObject.set(x, "unload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    
    @scala.inline
    def setUseFormatDate(value: Boolean): Self = StObject.set(x, "useFormatDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormatDateUndefined: Self = StObject.set(x, "useFormatDate", js.undefined)
  }
}
