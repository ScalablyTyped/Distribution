package typings
package iobrokerLib.iobrokerMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ioBroker")
@js.native
object ioBrokerNs extends js.Object {
  @js.native
  trait Adapter extends js.Object {
    /** path to the adapter folder */
    var adapterDir: java.lang.String = js.native
    /** common part of the adapter settings */
    var common: js.Any = js.native
    /** native part of the adapter settings */
    var config: AdapterConfig = js.native
    /** if the adapter is connected to the host */
    var connected: scala.Boolean = js.native
    /** The name of the host where the adapter is running */
    var host: java.lang.String = js.native
    /** instance number of this adapter instance */
    var instance: scala.Double = js.native
    /** content of io-package.json */
    var ioPack: js.Any = js.native
    /** access to the logging functions */
    var log: Logger = js.native
    /** The name of the adapter */
    var name: java.lang.String = js.native
    /** Namespace of adapter objects: "<name>.<instance>" */
    val namespace: java.lang.String = js.native
    var objects: Objects = js.native
    /** content of package.json */
    var pack: js.Any = js.native
    var states: States = js.native
    /** Stops the adapter. Note: Is not always defined. */
    var stop: js.UndefOr[js.Function0[scala.Unit]] = js.native
    /** system part of the adapter settings */
    var systemConfig: js.UndefOr[js.Any] = js.native
    /** adapter version */
    var version: js.Any = js.native
    def addChannelToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String
    ): scala.Unit = js.native
    def addChannelToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def addChannelToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any
    ): scala.Unit = js.native
    def addChannelToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def addChannelToEnumAsync(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String
    ): js.Promise[scala.Unit] = js.native
    def addChannelToEnumAsync(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    def addStateToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String
    ): scala.Unit = js.native
    def addStateToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def addStateToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): scala.Unit = js.native
    def addStateToEnum(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def addStateToEnumAsync(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String
    ): js.Promise[scala.Unit] = js.native
    def addStateToEnumAsync(
      enumName: java.lang.String,
      addTo: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    /** <INTERNAL> Determines the users permissions */
    def calculatePermissions(
      user: java.lang.String,
      commandsPermissions: CommandsPermissions,
      callback: js.Function1[/* result */ PermissionSet, scala.Unit]
    ): scala.Unit = js.native
    def calculatePermissions(
      user: java.lang.String,
      commandsPermissions: CommandsPermissions,
      options: js.Any,
      callback: js.Function1[/* result */ PermissionSet, scala.Unit]
    ): scala.Unit = js.native
    /** <INTERNAL> Determines the users permissions */
    def calculatePermissionsAsync(user: java.lang.String, commandsPermissions: CommandsPermissions): js.Promise[PermissionSet] = js.native
    def calculatePermissionsAsync(user: java.lang.String, commandsPermissions: CommandsPermissions, options: js.Any): js.Promise[PermissionSet] = js.native
    /** <INTERNAL> Checks if a user exists and is in the given group. */
    def checkGroup(
      user: java.lang.String,
      group: java.lang.String,
      callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    def checkGroup(
      user: java.lang.String,
      group: java.lang.String,
      options: js.Any,
      callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    /** <INTERNAL> Checks if a user exists and is in the given group. */
    def checkGroupAsync(user: java.lang.String, group: java.lang.String): js.Promise[scala.Boolean] = js.native
    def checkGroupAsync(user: java.lang.String, group: java.lang.String, options: js.Any): js.Promise[scala.Boolean] = js.native
    // ==============================
    // GENERAL
    /** Validates username and password */
    def checkPassword(
      user: java.lang.String,
      password: java.lang.String,
      callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    def checkPassword(
      user: java.lang.String,
      password: java.lang.String,
      options: js.Any,
      callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    /** Validates username and password */
    def checkPasswordAsync(user: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
    def checkPasswordAsync(user: java.lang.String, password: java.lang.String, options: js.Any): js.Promise[scala.Boolean] = js.native
    /**
      * Changes access rights of all files in the adapter directory
      * @param adapter Name of the adapter instance, e.g. "admin.0". Defaults to the namespace of this adapter.
      * @param path Pattern to match the file path against
      * @param options Mode of the access change as a number or hexadecimal string
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chmodFile(
      adapter: java.lang.String,
      path: java.lang.String,
      options: iobrokerLib.Anon_Mode,
      callback: ChownFileCallback
    ): scala.Unit = js.native
    def chmodFile(
      adapter: java.lang.String,
      path: java.lang.String,
      options: stdLib.Record[java.lang.String, _],
      callback: ChownFileCallback
    ): scala.Unit = js.native
    def chmodFile(
      adapter: scala.Null,
      path: java.lang.String,
      options: iobrokerLib.Anon_Mode,
      callback: ChownFileCallback
    ): scala.Unit = js.native
    def chmodFile(
      adapter: scala.Null,
      path: java.lang.String,
      options: stdLib.Record[java.lang.String, _],
      callback: ChownFileCallback
    ): scala.Unit = js.native
    def chmodFileAsync(adapter: java.lang.String, path: java.lang.String, options: iobrokerLib.Anon_Mode): js.Promise[iobrokerLib.Anon_Entries] = js.native
    def chmodFileAsync(adapter: java.lang.String, path: java.lang.String, options: stdLib.Record[java.lang.String, _]): js.Promise[iobrokerLib.Anon_Entries] = js.native
    def chmodFileAsync(adapter: scala.Null, path: java.lang.String, options: iobrokerLib.Anon_Mode): js.Promise[iobrokerLib.Anon_Entries] = js.native
    def chmodFileAsync(adapter: scala.Null, path: java.lang.String, options: stdLib.Record[java.lang.String, _]): js.Promise[iobrokerLib.Anon_Entries] = js.native
    /** Creates an object with type channel. It must be located under a device */
    def createChannel(parentDevice: java.lang.String, channelName: java.lang.String): scala.Unit = js.native
    def createChannel(parentDevice: java.lang.String, channelName: java.lang.String, callback: SetObjectCallback): scala.Unit = js.native
    def createChannel(parentDevice: java.lang.String, channelName: java.lang.String, roleOrCommon: java.lang.String): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _]
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon]
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _]
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): scala.Unit = js.native
    def createChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    /** Creates an object with type channel. It must be located under a device */
    def createChannelAsync(parentDevice: java.lang.String, channelName: java.lang.String): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(parentDevice: java.lang.String, channelName: java.lang.String, roleOrCommon: java.lang.String): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      roleOrCommon: stdLib.Partial[ChannelCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    // ==============================
    // devices and channels
    // tslint:disable:unified-signatures
    /** creates an object with type device */
    def createDevice(deviceName: java.lang.String): scala.Unit = js.native
    def createDevice(deviceName: java.lang.String, callback: SetObjectCallback): scala.Unit = js.native
    def createDevice(deviceName: java.lang.String, common: stdLib.Partial[ObjectCommon]): scala.Unit = js.native
    def createDevice(deviceName: java.lang.String, common: stdLib.Partial[ObjectCommon], callback: SetObjectCallback): scala.Unit = js.native
    def createDevice(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _]
    ): scala.Unit = js.native
    def createDevice(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createDevice(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): scala.Unit = js.native
    def createDevice(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    /** creates an object with type device */
    def createDeviceAsync(deviceName: java.lang.String): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(deviceName: java.lang.String, common: stdLib.Partial[ObjectCommon]): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(
      deviceName: java.lang.String,
      common: stdLib.Partial[ObjectCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /**
      * Creates a state and the corresponding object. It must be located in a channel under a device
      */
    def createState(parentDevice: java.lang.String, parentChannel: java.lang.String, stateName: java.lang.String): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _]
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon]
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _]
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _],
      callback: SetObjectCallback
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): scala.Unit = js.native
    def createState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): scala.Unit = js.native
    /**
      * Creates a state and the corresponding object. It must be located in a channel under a device
      */
    def createStateAsync(parentDevice: java.lang.String, parentChannel: java.lang.String, stateName: java.lang.String): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: java.lang.String,
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _]
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      roleOrCommon: stdLib.Partial[StateCommon],
      native: stdLib.Record[java.lang.String, _],
      options: js.Any
    ): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def delFile(adapterName: java.lang.String, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delFile(adapterName: java.lang.String, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def delFile(adapterName: scala.Null, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delFile(adapterName: scala.Null, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def delFileAsync(adapterName: java.lang.String, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def delFileAsync(adapterName: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def delFileAsync(adapterName: scala.Null, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def delFileAsync(adapterName: scala.Null, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /**
      * Deletes an object (which might not belong to this adapter) from the object db
      * @param id - The id of the object including namespace
      */
    def delForeignObject(id: java.lang.String): scala.Unit = js.native
    def delForeignObject(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delForeignObject(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def delForeignObject(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes an object (which might not belong to this adapter) from the object db
      * @param id - The id of the object including namespace
      */
    def delForeignObjectAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
    def delForeignObjectAsync(id: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /** Deletes a state from the states DB, but not the associated object */
    def delForeignState(id: java.lang.String): scala.Unit = js.native
    def delForeignState(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delForeignState(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def delForeignState(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** Deletes a state from the states DB, but not the associated object */
    def delForeignStateAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
    def delForeignStateAsync(id: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /**
      * Deletes an object from the object db
      * @param id - The id of the object without namespace
      */
    def delObject(id: java.lang.String): scala.Unit = js.native
    def delObject(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delObject(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def delObject(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes an object from the object db
      * @param id - The id of the object without namespace
      */
    def delObjectAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
    def delObjectAsync(id: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
    def delState(id: java.lang.String): scala.Unit = js.native
    def delState(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delState(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def delState(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
    def delStateAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
    def delStateAsync(id: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /** Deletes a channel and its states. It must have been created with `createChannel` */
    def deleteChannel(channelName: java.lang.String): scala.Unit = js.native
    def deleteChannel(channelName: java.lang.String, options: js.Any): scala.Unit = js.native
    def deleteChannel(channelName: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def deleteChannel(parentDevice: java.lang.String, channelName: java.lang.String): scala.Unit = js.native
    def deleteChannel(parentDevice: java.lang.String, channelName: java.lang.String, options: js.Any): scala.Unit = js.native
    def deleteChannel(
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    /** Deletes a channel and its states. It must have been created with `createChannel` */
    def deleteChannelAsync(channelName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteChannelAsync(channelName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def deleteChannelAsync(parentDevice: java.lang.String, channelName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteChannelAsync(parentDevice: java.lang.String, channelName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def deleteChannelFromEnum(enumName: java.lang.String, parentDevice: java.lang.String, channelName: java.lang.String): scala.Unit = js.native
    def deleteChannelFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def deleteChannelFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any
    ): scala.Unit = js.native
    def deleteChannelFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def deleteChannelFromEnumAsync(enumName: java.lang.String, parentDevice: java.lang.String, channelName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteChannelFromEnumAsync(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      channelName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    /** deletes a device, its channels and states */
    def deleteDevice(deviceName: java.lang.String): scala.Unit = js.native
    def deleteDevice(deviceName: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def deleteDevice(deviceName: java.lang.String, options: js.Any): scala.Unit = js.native
    def deleteDevice(deviceName: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** deletes a device, its channels and states */
    def deleteDeviceAsync(deviceName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteDeviceAsync(deviceName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def deleteState(parentChannel: java.lang.String, stateName: java.lang.String): scala.Unit = js.native
    def deleteState(parentChannel: java.lang.String, stateName: java.lang.String, options: js.Any): scala.Unit = js.native
    def deleteState(
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def deleteState(parentDevice: java.lang.String, parentChannel: java.lang.String, stateName: java.lang.String): scala.Unit = js.native
    def deleteState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): scala.Unit = js.native
    def deleteState(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    /** Deletes a state. It must have been created with `createState` */
    def deleteState(stateName: java.lang.String): scala.Unit = js.native
    def deleteState(stateName: java.lang.String, options: js.Any): scala.Unit = js.native
    def deleteState(stateName: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def deleteStateAsync(parentChannel: java.lang.String, stateName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteStateAsync(parentChannel: java.lang.String, stateName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def deleteStateAsync(parentDevice: java.lang.String, parentChannel: java.lang.String, stateName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteStateAsync(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    /** Deletes a state. It must have been created with `createState` */
    def deleteStateAsync(stateName: java.lang.String): js.Promise[scala.Unit] = js.native
    def deleteStateAsync(stateName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def deleteStateFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String
    ): scala.Unit = js.native
    def deleteStateFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def deleteStateFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): scala.Unit = js.native
    def deleteStateFromEnum(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def deleteStateFromEnumAsync(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String
    ): js.Promise[scala.Unit] = js.native
    def deleteStateFromEnumAsync(
      enumName: java.lang.String,
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      stateName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    /**
      * Disables and stops the adapter instance.
      * It is recommended that you leave the current method (e.g. by using `return`) after calling this.
      */
    def disable(): scala.Unit = js.native
    /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
    def extendForeignObject(id: java.lang.String, objPart: PartialObject): scala.Unit = js.native
    def extendForeignObject(id: java.lang.String, objPart: PartialObject, callback: SetObjectCallback): scala.Unit = js.native
    def extendForeignObject(id: java.lang.String, objPart: PartialObject, options: js.Any): scala.Unit = js.native
    def extendForeignObject(id: java.lang.String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
    def extendForeignObjectAsync(id: java.lang.String, objPart: PartialObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def extendForeignObjectAsync(id: java.lang.String, objPart: PartialObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Extend an object and create it if it might not exist */
    def extendObject(id: java.lang.String, objPart: PartialObject): scala.Unit = js.native
    def extendObject(id: java.lang.String, objPart: PartialObject, callback: SetObjectCallback): scala.Unit = js.native
    def extendObject(id: java.lang.String, objPart: PartialObject, options: js.Any): scala.Unit = js.native
    def extendObject(id: java.lang.String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Extend an object and create it if it might not exist */
    def extendObjectAsync(id: java.lang.String, objPart: PartialObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def extendObjectAsync(id: java.lang.String, objPart: PartialObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /**
      * Finds an object by its ID or name
      * @param type - common.type of the state
      */
    def findForeignObject(idOrName: java.lang.String, `type`: java.lang.String, callback: FindObjectCallback): scala.Unit = js.native
    def findForeignObject(
      idOrName: java.lang.String,
      `type`: java.lang.String,
      options: js.Any,
      callback: FindObjectCallback
    ): scala.Unit = js.native
    /**
      * Finds an object by its ID or name
      * @param type - common.type of the state
      */
    def findForeignObjectAsync(idOrName: java.lang.String, `type`: java.lang.String): js.Promise[iobrokerLib.Anon_Id] = js.native
    def formatDate(dateObj: java.lang.String, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: java.lang.String, isDuration: java.lang.String, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: java.lang.String, isDuration: scala.Boolean, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: scala.Double, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: scala.Double, isDuration: java.lang.String, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: scala.Double, isDuration: scala.Boolean, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: stdLib.Date, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: stdLib.Date, isDuration: java.lang.String, format: java.lang.String): java.lang.String = js.native
    def formatDate(dateObj: stdLib.Date, isDuration: scala.Boolean, format: java.lang.String): java.lang.String = js.native
    def formatValue(value: java.lang.String, decimals: scala.Double, format: js.Any): java.lang.String = js.native
    def formatValue(value: java.lang.String, format: js.Any): java.lang.String = js.native
    def formatValue(value: scala.Double, decimals: scala.Double, format: js.Any): java.lang.String = js.native
    // ==============================
    // formatting
    def formatValue(value: scala.Double, format: js.Any): java.lang.String = js.native
    /** Get all states, channels and devices of this adapter */
    def getAdapterObjects(callback: js.Function1[/* objects */ stdLib.Record[java.lang.String, Object], scala.Unit]): scala.Unit = js.native
    /** Get all states, channels and devices of this adapter */
    def getAdapterObjectsAsync(): js.Promise[stdLib.Record[java.lang.String, Object]] = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getBinaryState(id: java.lang.String, callback: GetBinaryStateCallback): scala.Unit = js.native
    def getBinaryState(id: java.lang.String, options: js.Any, callback: GetBinaryStateCallback): scala.Unit = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param options (optional) Some internal options.
      */
    def getBinaryStateAsync(id: java.lang.String): js.Promise[CallbackReturnTypeOf[GetBinaryStateCallback]] = js.native
    def getBinaryStateAsync(id: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetBinaryStateCallback]] = js.native
    /** Returns SSL certificates by name (private key, public cert and chained certificate) for creation of HTTPS servers */
    def getCertificates(
      publicName: java.lang.String,
      privateName: java.lang.String,
      chainedName: java.lang.String,
      callback: js.Function3[
          /* err */ java.lang.String | scala.Null, 
          /* certs */ js.UndefOr[Certificates], 
          /* useLetsEncryptCert */ js.UndefOr[scala.Boolean], 
          scala.Unit
        ]
    ): scala.Unit = js.native
    /**
      * Returns a list of all channels in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getChannels(callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    def getChannels(parentDevice: java.lang.String, callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    def getChannels(parentDevice: java.lang.String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    /**
      * Returns a list of all channels in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getChannelsOf(callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    def getChannelsOf(parentDevice: java.lang.String, callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    def getChannelsOf(parentDevice: java.lang.String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): scala.Unit = js.native
    /**
      * Returns a list of all channels in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param options (optional) Some internal options.
      */
    def getChannelsOfAsync(): js.Promise[js.Array[GetObjectsItem[ChannelObject]]] = js.native
    // tslint:disable-next-line:unified-signatures
    def getChannelsOfAsync(parentDevice: java.lang.String): js.Promise[js.Array[GetObjectsItem[ChannelObject]]] = js.native
    def getChannelsOfAsync(parentDevice: java.lang.String, options: js.Any): js.Promise[js.Array[GetObjectsItem[ChannelObject]]] = js.native
    // tslint:enable:unified-signatures
    /**
      * Returns a list of all devices in this adapter instance
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getDevices(callback: GetObjectsCallback3[DeviceObject]): scala.Unit = js.native
    def getDevices(options: js.Any, callback: GetObjectsCallback3[DeviceObject]): scala.Unit = js.native
    /**
      * Returns a list of all devices in this adapter instance
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getDevicesAsync(): js.Promise[js.Array[GetObjectsItem[DeviceObject]]] = js.native
    def getDevicesAsync(options: js.Any): js.Promise[js.Array[GetObjectsItem[DeviceObject]]] = js.native
    // ==============================
    // enums
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnum(callback: GetEnumCallback): scala.Unit = js.native
    def getEnum(name: java.lang.String, callback: GetEnumCallback): scala.Unit = js.native
    def getEnum(name: java.lang.String, options: js.Any, callback: GetEnumCallback): scala.Unit = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnumAsync(name: java.lang.String): js.Promise[iobrokerLib.Anon_RequestEnum] = js.native
    def getEnumAsync(name: java.lang.String, options: js.Any): js.Promise[iobrokerLib.Anon_RequestEnum] = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnums(callback: GetEnumsCallback): scala.Unit = js.native
    def getEnums(enumList: EnumList, callback: GetEnumsCallback): scala.Unit = js.native
    def getEnums(enumList: EnumList, options: js.Any, callback: GetEnumsCallback): scala.Unit = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnumsAsync(enumList: EnumList): js.Promise[CallbackReturnTypeOf[GetEnumsCallback]] = js.native
    def getEnumsAsync(enumList: EnumList, options: js.Any): js.Promise[CallbackReturnTypeOf[GetEnumsCallback]] = js.native
    // ==============================
    // foreign objects
    /** Reads an object (which might not belong to this adapter) from the object db */
    def getForeignObject(id: java.lang.String, callback: GetObjectCallback): scala.Unit = js.native
    def getForeignObject(id: java.lang.String, options: js.Any, callback: GetObjectCallback): scala.Unit = js.native
    /** Reads an object (which might not belong to this adapter) from the object db */
    def getForeignObjectAsync(id: java.lang.String): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    def getForeignObjectAsync(id: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    /** Get foreign objects by pattern, by specific type and resolve their enums. */
    // tslint:disable:unified-signatures
    def getForeignObjects(pattern: java.lang.String, callback: GetObjectsCallback): scala.Unit = js.native
    def getForeignObjects(pattern: java.lang.String, options: js.Any, callback: GetObjectsCallback): scala.Unit = js.native
    def getForeignObjects(pattern: java.lang.String, `type`: ObjectType, callback: GetObjectsCallback): scala.Unit = js.native
    def getForeignObjects(pattern: java.lang.String, `type`: ObjectType, enums: EnumList, callback: GetObjectsCallback): scala.Unit = js.native
    def getForeignObjects(
      pattern: java.lang.String,
      `type`: ObjectType,
      enums: EnumList,
      options: js.Any,
      callback: GetObjectsCallback
    ): scala.Unit = js.native
    def getForeignObjects(pattern: java.lang.String, `type`: ObjectType, options: js.Any, callback: GetObjectsCallback): scala.Unit = js.native
    // tslint:enable:unified-signatures
    /** Get foreign objects by pattern, by specific type and resolve their enums. */
    def getForeignObjectsAsync(pattern: java.lang.String): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: java.lang.String, `type`: ObjectType): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: java.lang.String, `type`: ObjectType, enums: EnumList): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: java.lang.String, `type`: ObjectType, enums: EnumList, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: java.lang.String, `type`: ObjectType, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    /** Read a value (which might not belong to this adapter) from the states DB. */
    def getForeignState(id: java.lang.String, callback: GetStateCallback): scala.Unit = js.native
    def getForeignState(id: java.lang.String, options: js.Any, callback: GetStateCallback): scala.Unit = js.native
    /** Read a value (which might not belong to this adapter) from the states DB. */
    def getForeignStateAsync(id: java.lang.String): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    def getForeignStateAsync(id: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    /** Read all states (which might not belong to this adapter) which match the given pattern */
    def getForeignStates(pattern: java.lang.String, callback: GetStatesCallback): scala.Unit = js.native
    def getForeignStates(pattern: java.lang.String, options: js.Any, callback: GetStatesCallback): scala.Unit = js.native
    /** Read all states (which might not belong to this adapter) which match the given pattern */
    def getForeignStatesAsync(pattern: java.lang.String): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getForeignStatesAsync(pattern: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getHistory(id: java.lang.String, options: GetHistoryOptions, callback: GetHistoryCallback): scala.Unit = js.native
    // ==============================
    // own objects
    /** Reads an object from the object db */
    def getObject(id: java.lang.String, callback: GetObjectCallback): scala.Unit = js.native
    def getObject(id: java.lang.String, options: js.Any, callback: GetObjectCallback): scala.Unit = js.native
    /** Reads an object from the object db */
    def getObjectAsync(id: java.lang.String): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    def getObjectAsync(id: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    /*	===============================
      Functions defined in adapter.js
      =============================== */
    /**
      * Helper function that looks for first free TCP port starting with the given one.
      * @param port - The port to start with
      * @param callback - gets called when a free port is found
      */
    def getPort(port: scala.Double, callback: js.Function1[/* port */ scala.Double, scala.Unit]): scala.Unit = js.native
    /**
      * Helper function that looks for first free TCP port starting with the given one.
      * @param port - The port to start with
      */
    def getPortAsync(port: scala.Double): js.Promise[scala.Double] = js.native
    // tslint:enable:unified-signatures
    /** Read a value from the states DB. */
    def getState(id: java.lang.String, callback: GetStateCallback): scala.Unit = js.native
    def getState(id: java.lang.String, options: js.Any, callback: GetStateCallback): scala.Unit = js.native
    /** Read a value from the states DB. */
    def getStateAsync(id: java.lang.String): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    def getStateAsync(id: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    /** Read all states of this adapter which match the given pattern */
    def getStates(pattern: java.lang.String, callback: GetStatesCallback): scala.Unit = js.native
    def getStates(pattern: java.lang.String, options: js.Any, callback: GetStatesCallback): scala.Unit = js.native
    /** Read all states of this adapter which match the given pattern */
    def getStatesAsync(pattern: java.lang.String): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getStatesAsync(pattern: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    /**
      * Returns a list of all states in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param parentChannel (optional) Name of the parent channel to filter the channels by
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getStatesOf(callback: GetObjectsCallback3[StateObject]): scala.Unit = js.native
    def getStatesOf(parentDevice: java.lang.String, callback: GetObjectsCallback3[StateObject]): scala.Unit = js.native
    def getStatesOf(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      callback: GetObjectsCallback3[StateObject]
    ): scala.Unit = js.native
    def getStatesOf(
      parentDevice: java.lang.String,
      parentChannel: java.lang.String,
      options: js.Any,
      callback: GetObjectsCallback3[StateObject]
    ): scala.Unit = js.native
    /**
      * Returns a list of all states in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param parentChannel (optional) Name of the parent channel to filter the channels by
      * @param options (optional) Some internal options.
      */
    // tslint:disable:unified-signatures
    def getStatesOfAsync(): js.Promise[js.Array[GetObjectsItem[StateObject]]] = js.native
    def getStatesOfAsync(parentDevice: java.lang.String): js.Promise[js.Array[GetObjectsItem[StateObject]]] = js.native
    def getStatesOfAsync(parentDevice: java.lang.String, parentChannel: java.lang.String): js.Promise[js.Array[GetObjectsItem[StateObject]]] = js.native
    def getStatesOfAsync(parentDevice: java.lang.String, parentChannel: java.lang.String, options: js.Any): js.Promise[js.Array[GetObjectsItem[StateObject]]] = js.native
    /** Convert ID to {device: D, channel: C, state: S} */
    def idToDCS(id: java.lang.String): iobrokerLib.Anon_Channel = js.native
    def mkDir(adapterName: java.lang.String, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def mkDir(adapterName: java.lang.String, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def mkDir(adapterName: scala.Null, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def mkDir(adapterName: scala.Null, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def mkDirAsync(adapterName: java.lang.String, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def mkDirAsync(adapterName: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def mkDirAsync(adapterName: scala.Null, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def mkDirAsync(adapterName: scala.Null, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    @JSName("on")
    def on_message(event: iobrokerLib.iobrokerLibStrings.message, handler: MessageHandler): this.type = js.native
    @JSName("on")
    def on_objectChange(event: iobrokerLib.iobrokerLibStrings.objectChange, handler: ObjectChangeHandler): this.type = js.native
    // =============================================
    // Events exposed through EventEmitter interface
    // =============================================
    @JSName("on")
    def on_ready(event: iobrokerLib.iobrokerLibStrings.ready, handler: ReadyHandler): this.type = js.native
    @JSName("on")
    def on_stateChange(event: iobrokerLib.iobrokerLibStrings.stateChange, handler: StateChangeHandler): this.type = js.native
    @JSName("on")
    def on_unload(event: iobrokerLib.iobrokerLibStrings.unload, handler: UnloadHandler): this.type = js.native
    // tslint:enable:unified-signatures
    // ==============================
    // filesystem
    /**
      * reads the content of directory from DB for given adapter and path
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def readDir(adapterName: java.lang.String, path: java.lang.String, callback: ReadDirCallback): scala.Unit = js.native
    def readDir(adapterName: java.lang.String, path: java.lang.String, options: js.Any, callback: ReadDirCallback): scala.Unit = js.native
    def readDir(adapterName: scala.Null, path: java.lang.String, callback: ReadDirCallback): scala.Unit = js.native
    def readDir(adapterName: scala.Null, path: java.lang.String, options: js.Any, callback: ReadDirCallback): scala.Unit = js.native
    /**
      * reads the content of directory from DB for given adapter and path
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def readDirAsync(adapterName: java.lang.String, path: java.lang.String): js.Promise[CallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: scala.Null, path: java.lang.String): js.Promise[CallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: scala.Null, path: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readFile(adapterName: java.lang.String, path: java.lang.String, callback: ReadFileCallback): scala.Unit = js.native
    def readFile(adapterName: java.lang.String, path: java.lang.String, options: js.Any, callback: ReadFileCallback): scala.Unit = js.native
    def readFile(adapterName: scala.Null, path: java.lang.String, callback: ReadFileCallback): scala.Unit = js.native
    def readFile(adapterName: scala.Null, path: java.lang.String, options: js.Any, callback: ReadFileCallback): scala.Unit = js.native
    def readFileAsync(adapterName: java.lang.String, path: java.lang.String): js.Promise[iobrokerLib.Anon_File] = js.native
    def readFileAsync(adapterName: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[iobrokerLib.Anon_File] = js.native
    def readFileAsync(adapterName: scala.Null, path: java.lang.String): js.Promise[iobrokerLib.Anon_File] = js.native
    def readFileAsync(adapterName: scala.Null, path: java.lang.String, options: js.Any): js.Promise[iobrokerLib.Anon_File] = js.native
    def removeAllListeners(): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_message(event: iobrokerLib.iobrokerLibStrings.message): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_objectChange(event: iobrokerLib.iobrokerLibStrings.objectChange): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_ready(event: iobrokerLib.iobrokerLibStrings.ready): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_stateChange(event: iobrokerLib.iobrokerLibStrings.stateChange): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_unload(event: iobrokerLib.iobrokerLibStrings.unload): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: iobrokerLib.iobrokerLibStrings.message, handler: MessageHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_objectChange(event: iobrokerLib.iobrokerLibStrings.objectChange, handler: ObjectChangeHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: iobrokerLib.iobrokerLibStrings.ready, handler: ReadyHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_stateChange(event: iobrokerLib.iobrokerLibStrings.stateChange, handler: StateChangeHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_unload(event: iobrokerLib.iobrokerLibStrings.unload, handler: UnloadHandler): this.type = js.native
    def rename(
      adapterName: java.lang.String,
      oldName: java.lang.String,
      newName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def rename(
      adapterName: java.lang.String,
      oldName: java.lang.String,
      newName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def rename(
      adapterName: scala.Null,
      oldName: java.lang.String,
      newName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def rename(
      adapterName: scala.Null,
      oldName: java.lang.String,
      newName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def renameAsync(adapterName: java.lang.String, oldName: java.lang.String, newName: java.lang.String): js.Promise[scala.Unit] = js.native
    def renameAsync(
      adapterName: java.lang.String,
      oldName: java.lang.String,
      newName: java.lang.String,
      options: js.Any
    ): js.Promise[scala.Unit] = js.native
    def renameAsync(adapterName: scala.Null, oldName: java.lang.String, newName: java.lang.String): js.Promise[scala.Unit] = js.native
    def renameAsync(adapterName: scala.Null, oldName: java.lang.String, newName: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /** Restarts the adapter */
    def restart(): scala.Nothing = js.native
    def sendTo(instanceName: java.lang.String, command: java.lang.String, message: MessagePayload): scala.Unit = js.native
    def sendTo(
      instanceName: java.lang.String,
      command: java.lang.String,
      message: MessagePayload,
      callback: MessageCallback
    ): scala.Unit = js.native
    def sendTo(
      instanceName: java.lang.String,
      command: java.lang.String,
      message: MessagePayload,
      callback: MessageCallbackInfo
    ): scala.Unit = js.native
    /**
      * Sends a message to a specific instance or all instances of some specific adapter.
      * @param instanceName The instance to send this message to.
      * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
      * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
      * @param command (optional) Command name of the target instance. Default: "send"
      * @param message The message (e.g. params) to send.
      */
    def sendTo(instanceName: java.lang.String, message: MessagePayload): scala.Unit = js.native
    def sendTo(instanceName: java.lang.String, message: MessagePayload, callback: MessageCallback): scala.Unit = js.native
    def sendTo(instanceName: java.lang.String, message: MessagePayload, callback: MessageCallbackInfo): scala.Unit = js.native
    def sendToAsync(instanceName: java.lang.String, command: java.lang.String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
    /**
      * Sends a message to a specific instance or all instances of some specific adapter.
      * @param instanceName The instance to send this message to.
      * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
      * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
      * @param command (optional) Command name of the target instance. Default: "send"
      * @param message The message (e.g. params) to send.
      */
    def sendToAsync(instanceName: java.lang.String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
    def sendToHost(hostName: java.lang.String, command: java.lang.String, message: MessagePayload): scala.Unit = js.native
    def sendToHost(
      hostName: java.lang.String,
      command: java.lang.String,
      message: MessagePayload,
      callback: MessageCallback
    ): scala.Unit = js.native
    def sendToHost(
      hostName: java.lang.String,
      command: java.lang.String,
      message: MessagePayload,
      callback: MessageCallbackInfo
    ): scala.Unit = js.native
    /**
      * Sends a message to a specific host or all hosts.
      */
    def sendToHost(hostName: java.lang.String, message: MessagePayload): scala.Unit = js.native
    def sendToHost(hostName: java.lang.String, message: MessagePayload, callback: MessageCallback): scala.Unit = js.native
    def sendToHost(hostName: java.lang.String, message: MessagePayload, callback: MessageCallbackInfo): scala.Unit = js.native
    def sendToHostAsync(hostName: java.lang.String, command: java.lang.String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
    /**
      * Sends a message to a specific host or all hosts.
      */
    def sendToHostAsync(hostName: java.lang.String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
    // TODO: getHistoryAsync
    // MISSING:
    // pushFifo and similar https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4105
    // logRedirect https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4294
    // requireLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4336
    // processLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4360
    /**
      * Writes a binary state into Redis
      * @param id The id of the state
      * @param binary The data to be written
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setBinaryState(id: java.lang.String, binary: nodeLib.Buffer, callback: SetStateCallback): scala.Unit = js.native
    def setBinaryState(id: java.lang.String, binary: nodeLib.Buffer, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    /**
      * Writes a binary state into Redis
      * @param id The id of the state
      * @param binary The data to be written
      * @param options (optional) Some internal options.
      */
    def setBinaryStateAsync(id: java.lang.String, binary: nodeLib.Buffer): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setBinaryStateAsync(id: java.lang.String, binary: nodeLib.Buffer, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
    def setForeignObject(id: java.lang.String, obj: SettableObject): scala.Unit = js.native
    def setForeignObject(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setForeignObject(id: java.lang.String, obj: SettableObject, options: js.Any): scala.Unit = js.native
    def setForeignObject(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
    def setForeignObjectAsync(id: java.lang.String, obj: SettableObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setForeignObjectAsync(id: java.lang.String, obj: SettableObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
    def setForeignObjectNotExists(id: java.lang.String, obj: SettableObject): scala.Unit = js.native
    def setForeignObjectNotExists(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setForeignObjectNotExists(id: java.lang.String, obj: SettableObject, options: js.Any): scala.Unit = js.native
    def setForeignObjectNotExists(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
    def setForeignObjectNotExistsAsync(id: java.lang.String, obj: SettableObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setForeignObjectNotExistsAsync(id: java.lang.String, obj: SettableObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setForeignState(id: java.lang.String, state: State): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, ack: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(
      id: java.lang.String,
      state: State,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, options: js.Any): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: State, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB. */
    def setForeignState(id: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, options: js.Any): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: java.lang.String, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(
      id: java.lang.String,
      state: scala.Boolean,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Boolean, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, ack: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(
      id: java.lang.String,
      state: scala.Double,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, options: js.Any): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: scala.Double, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State]): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignState(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], callback: SetStateCallback): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): scala.Unit = js.native
    def setForeignState(id: java.lang.String, state: stdLib.Partial[State], options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setForeignStateAsync(id: java.lang.String, state: State): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: State, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: State, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB. */
    def setForeignStateAsync(id: java.lang.String, state: java.lang.String): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Double): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: scala.Double, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: stdLib.Partial[State]): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateChanged(id: java.lang.String, state: State): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, ack: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: State,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: State, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: java.lang.String, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: scala.Boolean,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Boolean, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: scala.Double,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: scala.Double, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: stdLib.Partial[State]): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: stdLib.Partial[State], callback: SetStateChangedCallback): scala.Unit = js.native
    def setForeignStateChanged(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): scala.Unit = js.native
    def setForeignStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: State): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: State, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: State, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
    def setForeignStateChangedAsync(id: java.lang.String, state: java.lang.String): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Double): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: scala.Double, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State]): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Creates or overwrites an object in the object db */
    def setObject(id: java.lang.String, obj: SettableObject): scala.Unit = js.native
    def setObject(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setObject(id: java.lang.String, obj: SettableObject, options: js.Any): scala.Unit = js.native
    def setObject(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Creates or overwrites an object in the object db */
    def setObjectAsync(id: java.lang.String, obj: SettableObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setObjectAsync(id: java.lang.String, obj: SettableObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Creates an object in the object db. Existing objects are not overwritten. */
    def setObjectNotExists(id: java.lang.String, obj: SettableObject): scala.Unit = js.native
    def setObjectNotExists(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setObjectNotExists(id: java.lang.String, obj: SettableObject, options: js.Any): scala.Unit = js.native
    def setObjectNotExists(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /** Creates an object in the object db. Existing objects are not overwritten. */
    def setObjectNotExistsAsync(id: java.lang.String, obj: SettableObject): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setObjectNotExistsAsync(id: java.lang.String, obj: SettableObject, options: js.Any): js.Promise[CallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Sets a new password for the given user */
    def setPassword(user: java.lang.String, password: java.lang.String): scala.Unit = js.native
    def setPassword(
      user: java.lang.String,
      password: java.lang.String,
      callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
    ): scala.Unit = js.native
    def setPassword(user: java.lang.String, password: java.lang.String, options: js.Any): scala.Unit = js.native
    def setPassword(
      user: java.lang.String,
      password: java.lang.String,
      options: js.Any,
      callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
    ): scala.Unit = js.native
    /** Sets a new password for the given user */
    def setPasswordAsync(user: java.lang.String, password: java.lang.String): js.Promise[scala.Unit] = js.native
    def setPasswordAsync(user: java.lang.String, password: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def setState(id: java.lang.String, state: State): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, ack: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(
      id: java.lang.String,
      state: State,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, options: js.Any): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    // ==============================
    // states
    // Multiple signatures help understanding what the parameters are about
    /** Writes a value into the states DB. */
    // tslint:disable:unified-signatures
    def setState(id: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, options: js.Any): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(
      id: java.lang.String,
      state: scala.Boolean,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, ack: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(
      id: java.lang.String,
      state: scala.Double,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, options: js.Any): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State]): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setState(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateCallback
    ): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], options: js.Any, callback: SetStateCallback): scala.Unit = js.native
    def setStateAsync(id: java.lang.String, state: State): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: State, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: State, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Writes a value into the states DB. */
    def setStateAsync(id: java.lang.String, state: java.lang.String): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Double): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: scala.Double, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: stdLib.Partial[State]): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateChanged(id: java.lang.String, state: State): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, ack: scala.Boolean): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: State,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, options: js.Any): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: State, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    /** Writes a value into the states DB only if it has changed. */
    def setStateChanged(id: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: java.lang.String,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: java.lang.String, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: java.lang.String, options: js.Any): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: java.lang.String, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: scala.Boolean,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Boolean, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: scala.Double,
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, options: js.Any): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: scala.Double, options: js.Any, callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: stdLib.Partial[State]): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      ack: scala.Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: stdLib.Partial[State], callback: SetStateChangedCallback): scala.Unit = js.native
    def setStateChanged(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): scala.Unit = js.native
    def setStateChanged(
      id: java.lang.String,
      state: stdLib.Partial[State],
      options: js.Any,
      callback: SetStateChangedCallback
    ): scala.Unit = js.native
    def setStateChangedAsync(id: java.lang.String, state: State): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: State, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: State, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: State, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Writes a value into the states DB only if it has changed. */
    def setStateChangedAsync(id: java.lang.String, state: java.lang.String): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: java.lang.String, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: java.lang.String, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Boolean, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Double): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Double, ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: scala.Double, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State]): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], ack: scala.Boolean, options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: java.lang.String, state: stdLib.Partial[State], options: js.Any): js.Promise[CallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Subscribe to changes of objects (which might not belong to this adapter) */
    def subscribeForeignObjects(pattern: java.lang.String): scala.Unit = js.native
    def subscribeForeignObjects(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def subscribeForeignObjects(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** Subscribe to changes of states (which might not belong to this adapter) */
    def subscribeForeignStates(pattern: java.lang.String): scala.Unit = js.native
    def subscribeForeignStates(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def subscribeForeignStates(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    // ==============================
    // subscriptions
    /** Subscribe to changes of objects in this instance */
    def subscribeObjects(pattern: java.lang.String): scala.Unit = js.native
    def subscribeObjects(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def subscribeObjects(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** Subscribe to changes of states in this instance */
    def subscribeStates(pattern: java.lang.String): scala.Unit = js.native
    def subscribeStates(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def subscribeStates(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    // TODO: getCertificates cannot be represented with promises right now
    /**
      * Terminates the adapter execution but does not disable the adapter
      * @param reason (optional) A message to print into the log prior to termination
      */
    def terminate(): scala.Nothing = js.native
    def terminate(reason: java.lang.String): scala.Nothing = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def unlink(adapterName: java.lang.String, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def unlink(adapterName: java.lang.String, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    def unlink(adapterName: scala.Null, path: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def unlink(adapterName: scala.Null, path: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def unlinkAsync(adapterName: java.lang.String, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def unlinkAsync(adapterName: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def unlinkAsync(adapterName: scala.Null, path: java.lang.String): js.Promise[scala.Unit] = js.native
    def unlinkAsync(adapterName: scala.Null, path: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    /** Unsubscribe from changes of objects (which might not belong to this adapter) */
    def unsubscribeForeignObjects(pattern: java.lang.String): scala.Unit = js.native
    def unsubscribeForeignObjects(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def unsubscribeForeignObjects(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Subscribe from changes of states (which might not belong to this adapter)
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeForeignStates(pattern: java.lang.String): scala.Unit = js.native
    def unsubscribeForeignStates(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def unsubscribeForeignStates(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /** Unsubscribe from changes of objects in this instance */
    def unsubscribeObjects(pattern: java.lang.String): scala.Unit = js.native
    def unsubscribeObjects(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def unsubscribeObjects(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Subscribe from changes of states in this instance
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeStates(pattern: java.lang.String): scala.Unit = js.native
    def unsubscribeStates(pattern: java.lang.String, options: js.Any): scala.Unit = js.native
    def unsubscribeStates(pattern: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Updates the adapter config with new values. Only a subset of the configuration has to be provided,
      * since merging with the existing config is done automatically.
      *
      * After updating the configuration, the adapter is automatically restarted. It is recommended that you
      * leave the current method (e.g. by using `return`) after calling this.
      *
      * @param newConfig The new config values to be stored
      */
    def updateConfig(newConfig: stdLib.Partial[AdapterConfig]): scala.Unit = js.native
    def writeFile(
      adapterName: java.lang.String,
      path: java.lang.String,
      data: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(
      adapterName: java.lang.String,
      path: java.lang.String,
      data: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(
      adapterName: java.lang.String,
      path: java.lang.String,
      data: nodeLib.Buffer,
      callback: ErrorCallback
    ): scala.Unit = js.native
    // options see https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/objects/objectsInMemServer.js#L599
    def writeFile(
      adapterName: java.lang.String,
      path: java.lang.String,
      data: nodeLib.Buffer,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(adapterName: scala.Null, path: java.lang.String, data: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def writeFile(
      adapterName: scala.Null,
      path: java.lang.String,
      data: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(adapterName: scala.Null, path: java.lang.String, data: nodeLib.Buffer, callback: ErrorCallback): scala.Unit = js.native
    def writeFile(
      adapterName: scala.Null,
      path: java.lang.String,
      data: nodeLib.Buffer,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFileAsync(adapterName: java.lang.String, path: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: java.lang.String, path: java.lang.String, data: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: java.lang.String, path: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: java.lang.String, path: java.lang.String, data: nodeLib.Buffer, options: js.Any): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: scala.Null, path: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: scala.Null, path: java.lang.String, data: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: scala.Null, path: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
    def writeFileAsync(adapterName: scala.Null, path: java.lang.String, data: nodeLib.Buffer, options: js.Any): js.Promise[scala.Unit] = js.native
  }
  
  // end interface AdapterOptions
  // tslint:disable-next-line:no-empty-interface
  trait AdapterConfig extends js.Object
  
  trait AdapterOptions extends js.Object {
    /** provide alternative global configuration for the adapter. Default: null */
    var config: js.UndefOr[js.Any] = js.undefined
    /** path to adapter */
    var dirname: js.UndefOr[java.lang.String] = js.undefined
    /** instance of the created adapter. Default: null */
    var instance: js.UndefOr[scala.Double] = js.undefined
    /** If the adapter collects logs from all adapters (experts only). Default: false */
    var logTransporter: js.UndefOr[scala.Boolean] = js.undefined
    /** Handler for received adapter messages. Can only be used if messagebox in io-package.json is set to true. */
    var message: js.UndefOr[MessageHandler] = js.undefined
    /** The name of the adapter */
    var name: java.lang.String
    /** if true, stateChange will be called with an id that has no namespace, e.g. "state" instead of "adapter.0.state". Default: false */
    var noNamespace: js.UndefOr[scala.Boolean] = js.undefined
    /** Handler for changes of subscribed objects */
    var objectChange: js.UndefOr[ObjectChangeHandler] = js.undefined
    /** Will be called when the adapter is intialized */
    var ready: js.UndefOr[ReadyHandler] = js.undefined
    /** Handler for changes of subscribed states */
    var stateChange: js.UndefOr[StateChangeHandler] = js.undefined
    /** if the global system config should be included in the created object. Default: false */
    var systemConfig: js.UndefOr[scala.Boolean] = js.undefined
    /** Will be called on adapter termination */
    var unload: js.UndefOr[UnloadHandler] = js.undefined
    /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
    var useFormatDate: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait BaseObject extends js.Object {
    /** The ID of this object */
    var _id: java.lang.String
    var acl: js.UndefOr[ObjectACL] = js.undefined
     // specified in the derived interfaces
    var common: ObjectCommon
    var enums: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
    var native: stdLib.Record[java.lang.String, _]
    var `type`: java.lang.String
  }
  
  trait Certificates extends js.Object {
    /** chained CA certificates */
    var ca: js.Array[java.lang.String | nodeLib.Buffer]
    /** public certificate */
    var cert: java.lang.String | nodeLib.Buffer
    /** private key file */
    var key: java.lang.String | nodeLib.Buffer
  }
  
  trait ChannelCommon extends ObjectCommon {
    /** description of this channel */
    var desc: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ChannelObject extends BaseObject {
    @JSName("common")
    var common_ChannelObject: ChannelCommon
    @JSName("type")
    var type_ChannelObject: iobrokerLib.iobrokerLibStrings.channel
  }
  
  /** Contains the return values of chownFile */
  trait ChownFileResult extends js.Object {
    /** Access rights */
    var acl: FileACL
    /** Date of creation */
    var createdAt: scala.Double
    /** Name of the file or directory */
    var file: java.lang.String
    /** Whether this is a directory or a file */
    var isDir: scala.Boolean
    /** Date of last modification */
    var modifiedAt: scala.Double
    /** The parent directory of the processed file or directory */
    var path: java.lang.String
    /** File system stats */
    var stats: nodeLib.fsMod.Stats
  }
  
  trait CommandsPermissions extends js.Object {
    var authEnabled: Permission
    var chmodFile: ObjectOrStatePermission
    var disconnect: Permission
    // TODO: Are all properties required or is a partial object ok?
    var getObject: ObjectOrStatePermission
    var getObjectView: ObjectOrStatePermission
    var getObjects: ObjectOrStatePermission
    var getState: ObjectOrStatePermission
    var getStateHistory: ObjectOrStatePermission
    var getStates: ObjectOrStatePermission
    var getUserPermissions: ObjectOrStatePermission
    var getVersion: Permission
    var httpGet: OtherPermission
    var listPermissions: Permission
    var mkdir: ObjectOrStatePermission
    var readDir: ObjectOrStatePermission
    var readFile: ObjectOrStatePermission
    var readFile64: ObjectOrStatePermission
    var rename: ObjectOrStatePermission
    var sendTo: OtherPermission
    var sendToHost: OtherPermission
    var setObject: ObjectOrStatePermission
    var setState: ObjectOrStatePermission
    var subscribe: ObjectOrStatePermission
    var subscribeObjects: ObjectOrStatePermission
    var unlink: ObjectOrStatePermission
    var unsubscribe: ObjectOrStatePermission
    var unsubscribeObjects: ObjectOrStatePermission
    var writeFile: ObjectOrStatePermission
    var writeFile64: ObjectOrStatePermission
  }
  
  trait DeviceObject extends BaseObject {
    @JSName("type")
    var type_DeviceObject: iobrokerLib.iobrokerLibStrings.device
  }
  
  trait DirectoryEntry extends js.Object {
    var acl: js.Any
    var createdAt: scala.Double
    var file: java.lang.String
    var isDir: scala.Boolean
     // access control list object
    var modifiedAt: scala.Double
    var stats: nodeLib.fsMod.Stats
  }
  
  /** Defines access rights for a single file, applied to a user or group */
  trait EvaluatedFileACL extends FileACL {
    /** Whether the user may read the file */
    var read: scala.Boolean
    /** Whether the user may write the file */
    var write: scala.Boolean
  }
  
  /** Defines access rights for a single file */
  trait FileACL extends js.Object {
    /** Full name of the user who owns this file, e.g. "system.user.admin" */
    var owner: java.lang.String
    /** Full name of the group who owns this file, e.g. "system.group.administrator" */
    var ownerGroup: java.lang.String
    /** Linux-type permissions defining access to this file */
    var permissions: scala.Double
  }
  
  trait GetHistoryOptions extends js.Object {
    var ack: js.UndefOr[scala.Boolean] = js.undefined
    var addID: js.UndefOr[scala.Boolean] = js.undefined
    var aggregate: js.UndefOr[
        iobrokerLib.iobrokerLibStrings.minmax | iobrokerLib.iobrokerLibStrings.min | iobrokerLib.iobrokerLibStrings.max | iobrokerLib.iobrokerLibStrings.average | iobrokerLib.iobrokerLibStrings.total | iobrokerLib.iobrokerLibStrings.count | iobrokerLib.iobrokerLibStrings.none
      ] = js.undefined
    var count: js.UndefOr[scala.Double] = js.undefined
    var end: js.UndefOr[scala.Double] = js.undefined
    var from: js.UndefOr[scala.Boolean] = js.undefined
    var ignoreNull: scala.Boolean
    var instance: js.UndefOr[java.lang.String] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var q: js.UndefOr[scala.Boolean] = js.undefined
    var sessionId: js.UndefOr[js.Any] = js.undefined
    var start: js.UndefOr[scala.Double] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait GetObjectListItem extends GetObjectViewItem {
    /** The same as @link{value} */
    var doc: Object
    /** A copy of the object */
    @JSName("value")
    var value_GetObjectListItem: Object
  }
  
  /** Parameters for @link{Objects.getObjectList} */
  trait GetObjectListParams extends GetObjectViewParams {
    /** Whether docs should be included in the return list */ // TODO: What are docs?
    var include_docs: scala.Boolean
  }
  
  trait GetObjectViewItem extends js.Object {
    /** The ID of this object */
    var id: java.lang.String
    /** A copy of the object from the DB or some aggregation result */
    var value: Object | js.Any
  }
  
  /** Parameters for @link{Objects.getObjectView} */
  trait GetObjectViewParams extends js.Object {
    /** Last id to include in the return list */
    var endkey: java.lang.String
    /** First id to include in the return list */
    var startkey: java.lang.String
  }
  
  trait GetObjectsItem[T /* <: BaseObject */] extends js.Object {
    /** The ID of this object */
    var id: java.lang.String
    /** A copy of the object from the DB */
    var value: T
  }
  
  trait Logger extends js.Object {
    /** Verbosity of the log output */
    var level: LogLevel
    /** log message with debug level */
    def debug(message: java.lang.String): scala.Unit
    /** log message with error severity */
    def error(message: java.lang.String): scala.Unit
    /** log message with info level (default output level for all adapters) */
    def info(message: java.lang.String): scala.Unit
    /** log message with silly level */
    def silly(message: java.lang.String): scala.Unit
    /** log message with warning severity */
    def warn(message: java.lang.String): scala.Unit
  }
  
  /** A message being passed between adapter instances */
  trait Message extends js.Object {
    /** ID of this message */
    var _id: scala.Double
    /** Callback information. This is set when the source expects a response */
    var callback: MessageCallbackInfo
    /** The command to be executed */
    var command: java.lang.String
    /** The source of this message */
    var from: java.lang.String
    /** The message payload */
    var message: MessagePayload
  }
  
  /** Callback information for a passed message */
  trait MessageCallbackInfo extends js.Object {
    // ???
    var ack: scala.Boolean
    /** ID of this callback */
    var id: scala.Double
    /** The original message payload */
    var message: MessagePayload
    /** Timestamp of this message */
    var time: scala.Double
  }
  
  /** Defines access rights for a single object */
  trait ObjectACL extends js.Object {
    /** Linux-type permissions defining access to this object */
    var `object`: scala.Double
    /** Full name of the user who owns this object, e.g. "system.user.admin" */
    var owner: java.lang.String
    /** Full name of the group who owns this object, e.g. "system.group.administrator" */
    var ownerGroup: java.lang.String
  }
  
  // Maybe this should extend Record<string, any>,
  // but the extra properties aren't defined anywhere,
  // so I'd rather force the user to explicitly state
  // he knows what he's doing by casting to any
  trait ObjectCommon extends js.Object {
    // Icon and role aren't defined in SCHEMA.md,
    // but they are being used by some adapters
    /** Icon for this object */
    var icon: js.UndefOr[java.lang.String] = js.undefined
    /** name of this object */
    var name: java.lang.String
    /** role of the object */
    var role: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Defines access rights for a single object type */
  trait ObjectOperationPermissions extends js.Object {
    /** Whether a user may create objects of this type */
    var create: scala.Boolean
    /** Whether a user may delete objects of this type */
    var delete: scala.Boolean
    /** Whether a user may enumerate objects of this type */
    var list: scala.Boolean
    /** Whether a user may read objects of this type */
    var read: scala.Boolean
    /** Whether a user may write objects of this type */
    var write: scala.Boolean
  }
  
  trait ObjectOrStatePermission extends Permission {
    @JSName("operation")
    var operation_ObjectOrStatePermission: iobrokerLib.iobrokerLibStrings.list | iobrokerLib.iobrokerLibStrings.read | iobrokerLib.iobrokerLibStrings.write | iobrokerLib.iobrokerLibStrings.create | iobrokerLib.iobrokerLibStrings.delete
    @JSName("type")
    var type_ObjectOrStatePermission: iobrokerLib.iobrokerLibStrings.`object` | iobrokerLib.iobrokerLibStrings.file | iobrokerLib.iobrokerLibStrings.users | iobrokerLib.iobrokerLibStrings.state
  }
  
  /** Defines the rights a user or group has to change objects */
  trait ObjectPermissions extends js.Object {
    /** The access rights for files */
    var file: ObjectOperationPermissions
    /** The access rights for objects */
    var `object`: ObjectOperationPermissions
    /** The access rights for states */
    var state: js.UndefOr[ObjectOperationPermissions] = js.undefined
    /** The access rights for users/groups */
    var users: ObjectOperationPermissions
  }
  
  /** Provides low-level access to the ioBroker objects db */
  @js.native
  trait Objects extends js.Object {
    /**
      * Changes access rights of all files in the root directory matching <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Pattern to match against
      * @param options Mode of the access change as a number or hexadecimal string
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chmodFile(
      id: java.lang.String,
      name: java.lang.String,
      options: iobrokerLib.Anon_Mode,
      callback: ChownFileCallback
    ): scala.Unit = js.native
    def chmodFile(
      id: java.lang.String,
      name: java.lang.String,
      options: stdLib.Record[java.lang.String, _],
      callback: ChownFileCallback
    ): scala.Unit = js.native
    /**
      * Changes access rights of all objects matching <pattern>
      * @param pattern Pattern to match against
      * @param options Mode of the access change as a number or hexadecimal string
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chmodObject(pattern: java.lang.String, callback: ChownObjectCallback): scala.Unit = js.native
    def chmodObject(pattern: java.lang.String, options: js.Any, callback: ChownObjectCallback): scala.Unit = js.native
    /**
      * Takes possession all files in the root directory matching <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chownFile(id: java.lang.String, name: java.lang.String, callback: ChownFileCallback): scala.Unit = js.native
    def chownFile(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ChownFileCallback): scala.Unit = js.native
    /**
      * Takes possession of all objects matching <pattern>
      * @param pattern Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chownObject(pattern: java.lang.String, callback: ChownObjectCallback): scala.Unit = js.native
    def chownObject(pattern: java.lang.String, options: js.Any, callback: ChownObjectCallback): scala.Unit = js.native
    /**
      * Deletes an object in the object db
      * @param id ID of the object
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delConfig(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delConfig(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delFile(id: java.lang.String, name: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delFile(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes an object in the object db
      * @param id ID of the object
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delObject(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delObject(id: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    // I'd rather not document a function with the name "destroyDB"
    /** Destructor of the class. Call this before shutting down. */
    def destroy(): scala.Unit = js.native
    /**
      * Extends an object in the object db with new properties
      * @param id ID of the object
      * @param obj Object to extend the original one with. May be just parts of an object.
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def extendObject(id: java.lang.String, obj: PartialObject, callback: ExtendObjectCallback): scala.Unit = js.native
    def extendObject(id: java.lang.String, obj: PartialObject, options: js.Any, callback: ExtendObjectCallback): scala.Unit = js.native
    /**
      * Finds an object by ID or name. If multiple objects were found, return the first one
      * @param idOrName ID or name of the object
      * @param type If != null, only return an object with a common.type equal to this
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def findObject(idOrName: java.lang.String, `type`: CommonType, callback: FindObjectCallback): scala.Unit = js.native
    def findObject(idOrName: java.lang.String, `type`: CommonType, options: js.Any, callback: FindObjectCallback): scala.Unit = js.native
    def findObject(idOrName: java.lang.String, `type`: scala.Null, callback: FindObjectCallback): scala.Unit = js.native
    def findObject(idOrName: java.lang.String, `type`: scala.Null, options: js.Any, callback: FindObjectCallback): scala.Unit = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getConfig(id: java.lang.String, callback: GetObjectCallback): scala.Unit = js.native
    def getConfig(id: java.lang.String, options: js.Any, callback: GetObjectCallback): scala.Unit = js.native
    /**
      * Returns a list of config keys matching <pattern>
      * @param pattern Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigKeys(pattern: java.lang.String, callback: GetConfigKeysCallback): scala.Unit = js.native
    def getConfigKeys(pattern: java.lang.String, callback: GetConfigKeysCallback, dontModify: js.Any): scala.Unit = js.native
    def getConfigKeys(pattern: java.lang.String, options: js.Any, callback: GetConfigKeysCallback): scala.Unit = js.native
    def getConfigKeys(pattern: java.lang.String, options: js.Any, callback: GetConfigKeysCallback, dontModify: js.Any): scala.Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigs(keys: js.Array[java.lang.String], callback: GetObjectsCallback2): scala.Unit = js.native
    def getConfigs(keys: js.Array[java.lang.String], callback: GetObjectsCallback2, dontModify: js.Any): scala.Unit = js.native
    def getConfigs(keys: js.Array[java.lang.String], options: js.Any, callback: GetObjectsCallback2): scala.Unit = js.native
    def getConfigs(
      keys: js.Array[java.lang.String],
      options: js.Any,
      callback: GetObjectsCallback2,
      dontModify: js.Any
    ): scala.Unit = js.native
    /**
      * Determines the mime type for a given file extension
      * @param ext File extension, including the leading dot, e.g. ".zip"
      */
    def getMimeType(ext: java.lang.String): iobrokerLib.Anon_IsBinary = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getObject(id: java.lang.String, callback: GetObjectCallback): scala.Unit = js.native
    def getObject(id: java.lang.String, options: js.Any, callback: GetObjectCallback): scala.Unit = js.native
    /**
      * Returns a list of objects with id between params.startkey and params.endkey
      * @param params Parameters determining the objects included in the return list. Null to include all objects
      * @param options (optional) If the returned list should be sorted. And some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getObjectList(params: GetObjectListParams, callback: GetObjectListCallback): scala.Unit = js.native
    def getObjectList(params: GetObjectListParams, options: iobrokerLib.Anon_Sorted, callback: GetObjectListCallback): scala.Unit = js.native
    def getObjectList(
      params: GetObjectListParams,
      options: stdLib.Record[java.lang.String, _],
      callback: GetObjectListCallback
    ): scala.Unit = js.native
    def getObjectList(params: scala.Null, callback: GetObjectListCallback): scala.Unit = js.native
    def getObjectList(params: scala.Null, options: iobrokerLib.Anon_Sorted, callback: GetObjectListCallback): scala.Unit = js.native
    def getObjectList(params: scala.Null, options: stdLib.Record[java.lang.String, _], callback: GetObjectListCallback): scala.Unit = js.native
    /**
      * Query a predefined object view (similar to SQL stored procedures) and return the results
      * For a detailed description refer to https://github.com/ioBroker/ioBroker/wiki/Adapter-Development-Documentation#object-fields
      * or http://guide.couchdb.org/editions/1/en/views.html
      * @param design The namespace of the object view, as defined in io-package.json. Usually the adapter name, e.g. "hm-rpc"
      * @param search The name of the object view.
      * @param params Parameters to additionally filter out objects from the return list. Null to include all objects
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getObjectView(
      design: java.lang.String,
      search: java.lang.String,
      params: GetObjectViewParams,
      callback: GetObjectViewCallback
    ): scala.Unit = js.native
    def getObjectView(
      design: java.lang.String,
      search: java.lang.String,
      params: GetObjectViewParams,
      options: js.Any,
      callback: GetObjectViewCallback
    ): scala.Unit = js.native
    def getObjectView(
      design: java.lang.String,
      search: java.lang.String,
      params: scala.Null,
      callback: GetObjectViewCallback
    ): scala.Unit = js.native
    def getObjectView(
      design: java.lang.String,
      search: java.lang.String,
      params: scala.Null,
      options: js.Any,
      callback: GetObjectViewCallback
    ): scala.Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getObjects(keys: js.Array[java.lang.String], callback: GetObjectsCallback2): scala.Unit = js.native
    def getObjects(keys: js.Array[java.lang.String], callback: GetObjectsCallback2, dontModify: js.Any): scala.Unit = js.native
    def getObjects(keys: js.Array[java.lang.String], options: js.Any, callback: GetObjectsCallback2): scala.Unit = js.native
    def getObjects(
      keys: js.Array[java.lang.String],
      options: js.Any,
      callback: GetObjectsCallback2,
      dontModify: js.Any
    ): scala.Unit = js.native
    /**
      * For a given user, returns the groups he belongs to, and his access rights
      * @param user Name of the user. Has to start with "system.user."
      * @param callback The callback function to be invoked with the return values
      */
    def getUserGroup(user: java.lang.String, callback: GetUserGroupCallback): scala.Unit = js.native
    /**
      * Creates an empty directory with the given name
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Directory name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def mkDir(id: java.lang.String, name: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def mkDir(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Finds all files and directories starting with <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File or directory name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def readDir(id: java.lang.String, name: java.lang.String, callback: ReadDirCallback): scala.Unit = js.native
    def readDir(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ReadDirCallback): scala.Unit = js.native
    /**
      * Reads a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def readFile(id: java.lang.String, name: java.lang.String, callback: ReadFileCallback): scala.Unit = js.native
    def readFile(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ReadFileCallback): scala.Unit = js.native
    /**
      * Renames a file or directory
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param oldName Old file or directory name
      * @param newName Name to rename to
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def rename(
      id: java.lang.String,
      oldName: java.lang.String,
      newName: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def rename(
      id: java.lang.String,
      oldName: java.lang.String,
      newName: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    /**
      * Deletes all files in the root directory matching <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def rm(id: java.lang.String, name: java.lang.String, callback: RmCallback): scala.Unit = js.native
    def rm(id: java.lang.String, name: java.lang.String, options: js.Any, callback: RmCallback): scala.Unit = js.native
    /**
      * Creates or overwrites an object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setConfig(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setConfig(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /**
      * Creates or overwrites an object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setObject(id: java.lang.String, obj: SettableObject, callback: SetObjectCallback): scala.Unit = js.native
    def setObject(id: java.lang.String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): scala.Unit = js.native
    /**
      * Subscribe to object changes
      * @param pattern The pattern to match against
      */
    def subscribe(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def subscribe(pattern: java.lang.String, options: js.Any, callback: EmptyCallback): scala.Unit = js.native
    // not documented. enabled = true seems to disable the cache
    // enableFileCache(enabled, options, callback)
    /**
      * Subscribe to object changes
      * @param pattern The pattern to match against
      */
    def subscribeConfig(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def subscribeConfig(pattern: java.lang.String, options: js.Any, callback: EmptyCallback): scala.Unit = js.native
    /**
      * Creates an empty file with the given name
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def touch(id: java.lang.String, name: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def touch(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def unlink(id: java.lang.String, name: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def unlink(id: java.lang.String, name: java.lang.String, options: js.Any, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Unsubscribe from object changes
      * @param pattern The pattern to match against
      */
    def unsubscribe(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def unsubscribe(pattern: java.lang.String, options: js.Any, callback: EmptyCallback): scala.Unit = js.native
    /**
      * Unsubscribe from object changes
      * @param pattern The pattern to match against
      */
    def unsubscribeConfig(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def unsubscribeConfig(pattern: java.lang.String, options: js.Any, callback: EmptyCallback): scala.Unit = js.native
    def writeFile(id: java.lang.String, name: java.lang.String, data: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def writeFile(
      id: java.lang.String,
      name: java.lang.String,
      data: java.lang.String,
      options: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(
      id: java.lang.String,
      name: java.lang.String,
      data: java.lang.String,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
    /**
      * Writes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param data Contents of the file
      * @param options (optional) MIME type of the file (string). Or some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def writeFile(id: java.lang.String, name: java.lang.String, data: nodeLib.Buffer, callback: ErrorCallback): scala.Unit = js.native
    def writeFile(
      id: java.lang.String,
      name: java.lang.String,
      data: nodeLib.Buffer,
      options: java.lang.String,
      callback: ErrorCallback
    ): scala.Unit = js.native
    def writeFile(
      id: java.lang.String,
      name: java.lang.String,
      data: nodeLib.Buffer,
      options: js.Any,
      callback: ErrorCallback
    ): scala.Unit = js.native
  }
  
  trait OtherObject extends BaseObject {
    @JSName("common")
    var common_OtherObject: OtherCommon
    @JSName("type")
    var type_OtherObject: iobrokerLib.iobrokerLibStrings.adapter | iobrokerLib.iobrokerLibStrings.config | iobrokerLib.iobrokerLibStrings.enum | iobrokerLib.iobrokerLibStrings.group | iobrokerLib.iobrokerLibStrings.host | iobrokerLib.iobrokerLibStrings.info | iobrokerLib.iobrokerLibStrings.instance | iobrokerLib.iobrokerLibStrings.meta | iobrokerLib.iobrokerLibStrings.script | iobrokerLib.iobrokerLibStrings.user
  }
  
  trait OtherPermission extends Permission {
    @JSName("operation")
    var operation_OtherPermission: iobrokerLib.iobrokerLibStrings.execute | iobrokerLib.iobrokerLibStrings.http | iobrokerLib.iobrokerLibStrings.sendto
    @JSName("type")
    var type_OtherPermission: iobrokerLib.iobrokerLibStrings.other
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialChannelObject extends js.Object {
    var common: js.UndefOr[stdLib.Partial[ChannelCommon]] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialDeviceObject extends js.Object {
    var common: js.UndefOr[stdLib.Partial[ObjectCommon]] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialOtherObject extends js.Object {
    var common: js.UndefOr[stdLib.Partial[ObjectCommon]] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'>[P]} */ trait PartialStateObject extends js.Object {
    var acl: js.UndefOr[stdLib.Partial[StateACL]] = js.undefined
    var common: js.UndefOr[stdLib.Partial[StateCommon]] = js.undefined
  }
  
  trait Permission extends js.Object {
    /** Which kind of operation is required */
    var operation: java.lang.String
    /** The type of the permission */
    var `type`: java.lang.String
  }
  
  /** Defined the complete set of access rights a user has */
  trait PermissionSet extends ObjectPermissions {
    /** The name of the groups this ACL was merged from */
    var groups: js.Array[java.lang.String]
    /** The access rights for certain commands */
    var other: iobrokerLib.Anon_Execute
    /** The name of the user this ACL is for */
    var user: java.lang.String
  }
  
  /** Contains the return values of readDir */
  trait ReadDirResult extends js.Object {
    /** Access rights */
    var acl: EvaluatedFileACL
    /** Date of creation */
    var createdAt: scala.Double
    /** Name of the file or directory */
    var file: java.lang.String
    /** Whether this is a directory or a file */
    var isDir: scala.Boolean
    /** Date of last modification */
    var modifiedAt: scala.Double
    /** File system stats */
    var stats: nodeLib.fsMod.Stats
  }
  
  /** Contains the return values of rm */
  trait RmResult extends js.Object {
    /** The name of the deleted file or directory */
    var file: java.lang.String
    /** Whether the deleted object was a directory or a file */
    var isDir: scala.Boolean
    /** The parent directory of the deleted file or directory */
    var path: java.lang.String
  }
  
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof iobroker.iobroker.Global.ioBroker.Object, '_id' | 'acl'> ]: iobroker.iobroker.Global.ioBroker.Object[P]} */ trait SettableObject extends js.Object {
    var _id: js.UndefOr[java.lang.String] = js.undefined
    var acl: js.UndefOr[StateACL | ObjectACL] = js.undefined
  }
  
  trait State extends js.Object {
    /** Direction flag: false for desired value and true for actual value. Default: false. */
    var ack: scala.Boolean
    /** Optional comment */
    var c: js.UndefOr[java.lang.String] = js.undefined
    /** Optional time in seconds after which the state is reset to null */
    var expire: js.UndefOr[scala.Double] = js.undefined
    /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
    var from: java.lang.String
    /** Unix timestamp of the last time the value changed */
    var lc: scala.Double
    /** Optional quality of the state value */
    var q: js.UndefOr[StateQuality] = js.undefined
    /** Unix timestamp. Default: current time */
    var ts: scala.Double
    /** The value of the state. */
    var `val`: js.Any
  }
  
  /** Defines access rights for a single state object */
  trait StateACL extends ObjectACL {
    /** Linux-type permissions defining access to this state */
    var state: scala.Double
  }
  
  trait StateCommon extends ObjectCommon {
    /** the default value */
    var `def`: js.UndefOr[js.Any] = js.undefined
    /** description of this state */
    var desc: js.UndefOr[java.lang.String] = js.undefined
    /** attached history information */
    var history: js.UndefOr[js.Any] = js.undefined
    /** maximum value */
    var max: js.UndefOr[scala.Double] = js.undefined
    /** minimum value */
    var min: js.UndefOr[scala.Double] = js.undefined
    /** if this state is readable */
    var read: scala.Boolean
    /** role of the state (used in user interfaces to indicate which widget to choose) */
    @JSName("role")
    var role_StateCommon: java.lang.String
    /**
      * Dictionary of possible values for this state in the form
      * <pre>
      * {
      *     "internal value 1": "displayed value 1",
      *     "internal value 2": "displayed value 2",
      *     ...
      * }
      * </pre>
      * In old ioBroker versions, this could also be a string of the form
      * "val1:text1;val2:text2" (now deprecated)
      */
    var states: js.UndefOr[(stdLib.Record[java.lang.String, java.lang.String]) | java.lang.String] = js.undefined
    /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
    var `type`: js.UndefOr[CommonType] = js.undefined
    /** unit of the value */
    var unit: js.UndefOr[java.lang.String] = js.undefined
    /** ID of a helper state indicating if the handler of this state is working */
    var workingID: js.UndefOr[java.lang.String] = js.undefined
    /** if this state is writable */
    var write: scala.Boolean
  }
  
  trait StateObject extends BaseObject {
    @JSName("acl")
    var acl_StateObject: js.UndefOr[StateACL] = js.undefined
    @JSName("common")
    var common_StateObject: StateCommon
    @JSName("type")
    var type_StateObject: iobrokerLib.iobrokerLibStrings.state
  }
  
  @js.native
  sealed trait StateQuality extends js.Object
  
  /** Provides low-level access to the ioBroker states DB */
  @js.native
  trait States extends js.Object {
    def clearAllLogs(): scala.Unit = js.native
    def clearAllLogs(callback: EmptyCallback): scala.Unit = js.native
    def clearAllMessages(): scala.Unit = js.native
    def clearAllMessages(callback: EmptyCallback): scala.Unit = js.native
    /**
      * Deletes a binary state from Redis
      * @param id The id of the state to be deleted
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delBinaryState(id: java.lang.String, callback: DeleteStateCallback): scala.Unit = js.native
    /**
      * Deletes a config object in the object db
      * @param id ID of the object
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delConfig(id: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delLog(id: java.lang.String, logId: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
    def delMessage(id: java.lang.String, messageId: scala.Double, callback: ErrorCallback): scala.Unit = js.native
    /**
      * Deletes a state
      * @param id ID of the state to be stored
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delState(id: java.lang.String, callback: DeleteStateCallback): scala.Unit = js.native
    /** Destructor of the class. Call this before shutting down */
    def destroy(): scala.Unit = js.native
    def destroySession(id: java.lang.String): scala.Unit = js.native
    def destroySession(id: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getBinaryState(id: java.lang.String, callback: GetBinaryStateCallback): scala.Unit = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getConfig(id: java.lang.String, callback: GetObjectCallback): scala.Unit = js.native
    /**
      * Returns a list of config keys matching <pattern>
      * @param pattern Pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigKeys(pattern: java.lang.String, callback: GetConfigKeysCallback): scala.Unit = js.native
    def getConfigKeys(pattern: java.lang.String, callback: GetConfigKeysCallback, dontModify: js.Any): scala.Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigs(keys: js.Array[java.lang.String], callback: GetObjectsCallback2): scala.Unit = js.native
    def getConfigs(keys: js.Array[java.lang.String], callback: GetObjectsCallback2, dontModify: js.Any): scala.Unit = js.native
    /**
      * Retrieves all ids of states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getKeys(pattern: java.lang.String, callback: GetConfigKeysCallback): scala.Unit = js.native
    def getKeys(pattern: java.lang.String, callback: GetConfigKeysCallback, dontModify: js.Any): scala.Unit = js.native
    def getLog(id: java.lang.String, callback: GenericCallback[Log]): scala.Unit = js.native
    def getMessage(id: java.lang.String, callback: GenericCallback[Message]): scala.Unit = js.native
    def getSession(id: java.lang.String, callback: GetSessionCallback): scala.Unit = js.native
    /**
      * Returns the state with the given id
      * @param id ID of the state to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getState(id: java.lang.String, callback: GetStateCallback): scala.Unit = js.native
    /**
      * Returns a list of states with the given ids
      * @param keys IDs of the states to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getStates(keys: js.Array[java.lang.String], callback: GetStatesCallback2): scala.Unit = js.native
    def getStates(keys: js.Array[java.lang.String], callback: GetStatesCallback2, dontModify: js.Any): scala.Unit = js.native
    def lenLog(id: java.lang.String, callback: GenericCallback[scala.Double]): scala.Unit = js.native
    def lenMessage(id: java.lang.String, callback: GenericCallback[scala.Double]): scala.Unit = js.native
    /**
      * EDUCATED GUESS: Notify all clients about changes to an object
      * @param type object type
      * @param id State/object id
      * @param obj The changed object
      */
    def publishAll(`type`: java.lang.String, id: java.lang.String, obj: Message): scala.Unit = js.native
    def pushLog(id: java.lang.String, log: Log, callback: SetStateCallback): scala.Unit = js.native
    // TODO: Documentation for these functions is missing
    def pushMessage(id: java.lang.String, state: Message, callback: SetStateCallback): scala.Unit = js.native
    /**
      * Register an adapter instance as subscribable.
      * This means that the instance can read information about all subscriptions to its states
      * and will be notified of changes.
      * @param instance Adapter instance to register, e.g. "admin.0"
      * @param cb Is called when the operation has finished (successfully or not)
      */
    def registerAdapterSubs(instance: java.lang.String): scala.Unit = js.native
    def registerAdapterSubs(
      instance: java.lang.String,
      cb: js.Function2[/* error */ scala.Null, /* success */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    /**
      * Writes a binary state into Redis
      * @param id The id of the state
      * @param data The data to be written
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setBinaryState(id: java.lang.String, data: nodeLib.Buffer, callback: SetStateCallback): scala.Unit = js.native
    /**
      * Creates or overwrites a config object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setConfig(id: java.lang.String, obj: Object, callback: SetObjectCallback): scala.Unit = js.native
    /**
      * Updates a state in memory without triggering a save
      * @param id ID of the state to be stored
      * @param state The state to be updated
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setRawState(id: java.lang.String, state: State): scala.Unit = js.native
    def setRawState(id: java.lang.String, state: State, callback: SetStateCallback): scala.Unit = js.native
    def setSession(id: java.lang.String, expire: scala.Double): scala.Unit = js.native
    def setSession(id: java.lang.String, expire: scala.Double, callback: EmptyCallback): scala.Unit = js.native
    def setSession(id: java.lang.String, expire: scala.Double, obj: Session): scala.Unit = js.native
    def setSession(id: java.lang.String, expire: scala.Double, obj: Session, callback: EmptyCallback): scala.Unit = js.native
    /**
      * Stores a state in the db
      * @param id ID of the state to be stored
      * @param state The state to be stored in the db
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setState(id: java.lang.String): scala.Unit = js.native
    def setState(id: java.lang.String, state: State): scala.Unit = js.native
    def setState(id: java.lang.String, state: State, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def setState(id: java.lang.String, state: java.lang.String, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Boolean, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double): scala.Unit = js.native
    def setState(id: java.lang.String, state: scala.Double, callback: SetStateCallback): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State]): scala.Unit = js.native
    def setState(id: java.lang.String, state: stdLib.Partial[State], callback: SetStateCallback): scala.Unit = js.native
    /**
      * Subscribe to changes of all states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def subscribe(pattern: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
    /**
      * Subscribe to config object changes
      * @param pattern The pattern to match against
      */
    def subscribeConfig(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def subscribeLog(id: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
    def subscribeMessage(id: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
    /**
      * Unregister an adapter instance as subscribable.
      * @param instance Adapter instance to unregister, e.g. "admin.0"
      * @param cb Is called when the operation has finished (successfully or not)
      */
    def unregisterAdapterSubs(instance: java.lang.String): scala.Unit = js.native
    def unregisterAdapterSubs(
      instance: java.lang.String,
      cb: js.Function2[/* error */ scala.Null, /* success */ scala.Boolean, scala.Unit]
    ): scala.Unit = js.native
    /**
      * Unsubscribe from changes of all states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def unsubscribe(pattern: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
    /**
      * Unsubscribe from config object changes
      * @param pattern The pattern to match against
      */
    def unsubscribeConfig(pattern: java.lang.String, callback: EmptyCallback): scala.Unit = js.native
    def unsubscribeLog(id: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
    def unsubscribeMessage(id: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
  }
  
  // interface UserGroup { }
  /** Contains information about a user */
  trait User extends js.Object {
    /** Access rights of this user */
    var acl: ObjectPermissions
    /** Which groups this user belongs to */
    var groups: js.Array[UserGroup]
  }
  
  @js.native
  object StateQuality extends js.Object {
    @js.native
    sealed trait bad
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait device_not_connected
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait device_reports_error
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait general_device_problem
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait general_problem
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait general_sensor_problem
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
     // or undefined or null
    @js.native
    sealed trait good
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait sensor_not_connected
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    @js.native
    sealed trait sensor_reports_error
      extends iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality
    
    /* 0x01 */ val bad: bad with scala.Double = js.native
    /* 0x42 */ val device_not_connected: device_not_connected with scala.Double = js.native
    /* 0x44 */ val device_reports_error: device_reports_error with scala.Double = js.native
    /* 0x41 */ val general_device_problem: general_device_problem with scala.Double = js.native
    /* 0x01 */ val general_problem: general_problem with scala.Double = js.native
    /* 0x81 */ val general_sensor_problem: general_sensor_problem with scala.Double = js.native
    /* 0x00 */ val good: good with scala.Double = js.native
    /* 0x82 */ val sensor_not_connected: sensor_not_connected with scala.Double = js.native
    /* 0x84 */ val sensor_reports_error: sensor_reports_error with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[iobrokerLib.iobrokerMod.Global.ioBrokerNs.StateQuality with scala.Double] = js.native
  }
  
  type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = stdLib.Exclude[SecondParameterOf[T], js.UndefOr[scala.Null]]
  type ChownFileCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[ChownFileResult]], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type ChownObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* list */ js.UndefOr[js.Array[Object]], 
    scala.Unit
  ]
  type CommonType = iobrokerLib.iobrokerLibStrings.number | iobrokerLib.iobrokerLibStrings.string | iobrokerLib.iobrokerLibStrings.boolean | iobrokerLib.iobrokerLibStrings.array | iobrokerLib.iobrokerLibStrings.`object` | iobrokerLib.iobrokerLibStrings.mixed | iobrokerLib.iobrokerLibStrings.file
  type DeleteStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type EmptyCallback = js.Function0[scala.Unit]
  type Enum = js.Any
  type EnumList = java.lang.String | js.Array[java.lang.String]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]
  type ExtendObjectCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[iobrokerLib.Anon_IdValue], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type FindObjectCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    /* name */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  // TODO: Redefine callbacks as subclass of GenericCallback
  type GenericCallback[T] = js.Function2[/* err */ java.lang.String | scala.Null, /* result */ js.UndefOr[T], scala.Unit]
  type GetBinaryStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* state */ js.UndefOr[nodeLib.Buffer], 
    scala.Unit
  ]
  type GetConfigKeysCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* list */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  type GetEnumCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* enums */ stdLib.Record[java.lang.String, Enum], 
    /* requestedEnum */ java.lang.String, 
    scala.Unit
  ]
  type GetEnumsCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, Enum]], 
    scala.Unit
  ]
  type GetHistoryCallback = js.Function4[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.Array[State with iobrokerLib.Anon_IdStringOptional], 
    /* step */ scala.Double, 
    /* sessionId */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type GetObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* obj */ js.UndefOr[Object | scala.Null], 
    scala.Unit
  ]
  type GetObjectListCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[iobrokerLib.Anon_RowsArray], 
    scala.Unit
  ]
  type GetObjectViewCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[iobrokerLib.Anon_Rows], 
    scala.Unit
  ]
  type GetObjectsCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* objects */ stdLib.Record[java.lang.String, Object], 
    scala.Unit
  ]
  // this is a version of the callback used by Objects.getObjects
  type GetObjectsCallback2 = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* objects */ js.UndefOr[js.Array[Object | iobrokerLib.Anon_Err]], 
    scala.Unit
  ]
  // This is a version used by GetDevices/GetChannelsOf/GetStatesOf
  type GetObjectsCallback3[T /* <: BaseObject */] = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[js.Array[GetObjectsItem[T]]], 
    scala.Unit
  ]
  type GetSessionCallback = js.Function1[/* session */ Session, scala.Unit]
  type GetStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* state */ js.UndefOr[State | scala.Null], 
    scala.Unit
  ]
  type GetStatesCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* states */ stdLib.Record[java.lang.String, State], 
    scala.Unit
  ]
  /** Version of the callback used by States.getStates */
  type GetStatesCallback2 = js.Function2[/* err */ java.lang.String | scala.Null, /* states */ js.Array[State], scala.Unit]
  type GetUserGroupCallback = js.Function4[
    /* objectsInstance */ Objects, 
    /* user */ User, 
    /* groups */ js.Array[UserGroup], 
    /* acl */ ObjectPermissions, 
    scala.Unit
  ]
  type Log = js.Any
  // end interface Objects
  type LogLevel = iobrokerLib.iobrokerLibStrings.silly | iobrokerLib.iobrokerLibStrings.debug | iobrokerLib.iobrokerLibStrings.info | iobrokerLib.iobrokerLibStrings.warn | iobrokerLib.iobrokerLibStrings.error
  type MessageCallback = js.Function1[/* response */ js.UndefOr[Message], scala.Unit]
  type MessageHandler = js.Function1[/* obj */ Message, scala.Unit]
  type MessagePayload = java.lang.String | (stdLib.Record[java.lang.String, js.Any])
  type Object = StateObject | ChannelObject | DeviceObject | OtherObject
  type ObjectChangeHandler = js.Function2[/* id */ java.lang.String, /* obj */ js.UndefOr[Object | scala.Null], scala.Unit]
  type ObjectType = iobrokerLib.iobrokerLibStrings.state | iobrokerLib.iobrokerLibStrings.channel | iobrokerLib.iobrokerLibStrings.device
  type OtherCommon = ObjectCommon with org.scalablytyped.runtime.StringDictionary[js.Any]
  type PartialObject = PartialStateObject | PartialChannelObject | PartialDeviceObject | PartialOtherObject
  type ReadDirCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[ReadDirResult]], 
    scala.Unit
  ]
  type ReadFileCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* file */ js.UndefOr[nodeLib.Buffer | java.lang.String], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  // end interface Adapter
  type ReadyHandler = js.Function0[scala.Unit]
  type RmCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[RmResult]], 
    scala.Unit
  ]
  type SecondParameterOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  // end interface States
  type Session = js.Any
  type SetObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* obj */ iobrokerLib.Anon_IdString, 
    scala.Unit
  ]
  type SetStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type SetStateChangedCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* id */ java.lang.String, 
    /* notChanged */ scala.Boolean, 
    scala.Unit
  ]
  type StateChangeHandler = js.Function2[/* id */ java.lang.String, /* obj */ js.UndefOr[State | scala.Null], scala.Unit]
  type UnloadHandler = js.Function1[/* callback */ EmptyCallback, scala.Unit]
  type UserGroup = js.Any
}

