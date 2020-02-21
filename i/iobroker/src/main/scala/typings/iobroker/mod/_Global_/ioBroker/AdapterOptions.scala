package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterOptions extends js.Object {
  /** provide alternative global configuration for the adapter. Default: null */
  var config: js.UndefOr[js.Any] = js.undefined
  /** path to adapter */
  var dirname: js.UndefOr[String] = js.undefined
  /** instance of the created adapter. Default: null */
  var instance: js.UndefOr[Double] = js.undefined
  /** If the adapter collects logs from all adapters (experts only). Default: false */
  var logTransporter: js.UndefOr[Boolean] = js.undefined
  /** Handler for received adapter messages. Can only be used if messagebox in io-package.json is set to true. */
  var message: js.UndefOr[MessageHandler] = js.undefined
  /** The name of the adapter */
  var name: String
  /** if true, stateChange will be called with an id that has no namespace, e.g. "state" instead of "adapter.0.state". Default: false */
  var noNamespace: js.UndefOr[Boolean] = js.undefined
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
  /** if the global system config should be included in the created object. Default: false */
  var systemConfig: js.UndefOr[Boolean] = js.undefined
  /** Will be called on adapter termination */
  var unload: js.UndefOr[UnloadHandler] = js.undefined
  /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
  var useFormatDate: js.UndefOr[Boolean] = js.undefined
}

object AdapterOptions {
  @scala.inline
  def apply(
    name: String,
    config: js.Any = null,
    dirname: String = null,
    instance: Int | Double = null,
    logTransporter: js.UndefOr[Boolean] = js.undefined,
    message: /* obj */ Message => Unit | js.Promise[Unit] = null,
    noNamespace: js.UndefOr[Boolean] = js.undefined,
    objectChange: (/* id */ String, /* obj */ js.UndefOr[Object | Null]) => Unit | js.Promise[Unit] = null,
    objects: js.UndefOr[Boolean] = js.undefined,
    ready: () => Unit | js.Promise[Unit] = null,
    stateChange: (/* id */ String, /* obj */ js.UndefOr[State | Null]) => Unit | js.Promise[Unit] = null,
    states: js.UndefOr[Boolean] = js.undefined,
    systemConfig: js.UndefOr[Boolean] = js.undefined,
    unload: /* callback */ EmptyCallback => Unit | js.Promise[Unit] = null,
    useFormatDate: js.UndefOr[Boolean] = js.undefined
  ): AdapterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(logTransporter)) __obj.updateDynamic("logTransporter")(logTransporter.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1(message))
    if (!js.isUndefined(noNamespace)) __obj.updateDynamic("noNamespace")(noNamespace.asInstanceOf[js.Any])
    if (objectChange != null) __obj.updateDynamic("objectChange")(js.Any.fromFunction2(objectChange))
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (stateChange != null) __obj.updateDynamic("stateChange")(js.Any.fromFunction2(stateChange))
    if (!js.isUndefined(states)) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(systemConfig)) __obj.updateDynamic("systemConfig")(systemConfig.asInstanceOf[js.Any])
    if (unload != null) __obj.updateDynamic("unload")(js.Any.fromFunction1(unload))
    if (!js.isUndefined(useFormatDate)) __obj.updateDynamic("useFormatDate")(useFormatDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterOptions]
  }
}

