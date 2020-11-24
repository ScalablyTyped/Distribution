package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterOptions extends js.Object {
  
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
  implicit class AdapterOptionsOps[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setError(value: /* err */ Error => Boolean): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInstance(value: Double): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLogTransporter(value: Boolean): Self = this.set("logTransporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTransporter: Self = this.set("logTransporter", js.undefined)
    
    @scala.inline
    def setMessage(value: /* obj */ Message => Unit | js.Promise[Unit]): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNoNamespace(value: Boolean): Self = this.set("noNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNamespace: Self = this.set("noNamespace", js.undefined)
    
    @scala.inline
    def setObjectChange(value: (/* id */ String, /* obj */ js.UndefOr[Object | Null]) => Unit | js.Promise[Unit]): Self = this.set("objectChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteObjectChange: Self = this.set("objectChange", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit | js.Promise[Unit]): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setStateChange(value: (/* id */ String, /* obj */ js.UndefOr[State | Null]) => Unit | js.Promise[Unit]): Self = this.set("stateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
    
    @scala.inline
    def setStates(value: Boolean): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setStrictObjectChecks(value: Boolean): Self = this.set("strictObjectChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictObjectChecks: Self = this.set("strictObjectChecks", js.undefined)
    
    @scala.inline
    def setSystemConfig(value: Boolean): Self = this.set("systemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemConfig: Self = this.set("systemConfig", js.undefined)
    
    @scala.inline
    def setUnload(value: /* callback */ EmptyCallback => Unit | js.Promise[Unit]): Self = this.set("unload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnload: Self = this.set("unload", js.undefined)
    
    @scala.inline
    def setUseFormatDate(value: Boolean): Self = this.set("useFormatDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFormatDate: Self = this.set("useFormatDate", js.undefined)
  }
}
