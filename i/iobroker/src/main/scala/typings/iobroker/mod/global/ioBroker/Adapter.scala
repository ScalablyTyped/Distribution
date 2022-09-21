package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.Channel
import typings.iobroker.anon.Entries
import typings.iobroker.anon.Id
import typings.iobroker.anon.Mode
import typings.iobroker.anon.PartialChannelCommon
import typings.iobroker.anon.PartialDeviceCommon
import typings.iobroker.anon.PartialStateCommon
import typings.iobroker.anon.RequestEnum
import typings.iobroker.anon.Sorted
import typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket
import typings.iobroker.iobrokerStrings.accessErrors
import typings.iobroker.iobrokerStrings.fileToJsonl
import typings.iobroker.iobrokerStrings.fsIoErrors
import typings.iobroker.iobrokerStrings.memIssues
import typings.iobroker.iobrokerStrings.message
import typings.iobroker.iobrokerStrings.noDiskSpace
import typings.iobroker.iobrokerStrings.nonExistingFileErrors
import typings.iobroker.iobrokerStrings.objectChange
import typings.iobroker.iobrokerStrings.ready
import typings.iobroker.iobrokerStrings.remoteHostErrors
import typings.iobroker.iobrokerStrings.restartLoop
import typings.iobroker.iobrokerStrings.stateChange
import typings.iobroker.iobrokerStrings.system
import typings.iobroker.iobrokerStrings.unload
import typings.iobroker.iobrokerStrings.write
import typings.iobroker.objectsMod.global.ioBroker.AdapterScopedObject
import typings.iobroker.objectsMod.global.ioBroker.AnyObject
import typings.iobroker.objectsMod.global.ioBroker.ChannelObject
import typings.iobroker.objectsMod.global.ioBroker.DeviceObject
import typings.iobroker.objectsMod.global.ioBroker.InferGetObjectViewItemType
import typings.iobroker.objectsMod.global.ioBroker.Object
import typings.iobroker.objectsMod.global.ioBroker.ObjectIdToObjectType
import typings.iobroker.objectsMod.global.ioBroker.ObjectType
import typings.iobroker.objectsMod.global.ioBroker.PartialObject
import typings.iobroker.objectsMod.global.ioBroker.SettableObject
import typings.iobroker.objectsMod.global.ioBroker.StateObject
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends StObject {
  
  /** Can be used to test for forbidden chars in object IDs */
  val FORBIDDEN_CHARS: js.RegExp = js.native
  
  /** path to the adapter folder */
  var adapterDir: String = js.native
  
  def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String): Unit = js.native
  def addChannelToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    channelName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String, options: Any): Unit = js.native
  def addChannelToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    channelName: String,
    options: Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String, options: Any): js.Promise[Unit] = js.native
  
  def addStateToEnum(enumName: String, addTo: String, parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Any
  ): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def addStateToEnumAsync(enumName: String, addTo: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def addStateToEnumAsync(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Any
  ): js.Promise[Unit] = js.native
  
  /** <INTERNAL> Determines the users permissions */
  def calculatePermissions(
    user: String,
    commandsPermissions: CommandsPermissions,
    callback: js.Function1[/* result */ PermissionSet, Unit]
  ): Unit = js.native
  def calculatePermissions(
    user: String,
    commandsPermissions: CommandsPermissions,
    options: Any,
    callback: js.Function1[/* result */ PermissionSet, Unit]
  ): Unit = js.native
  
  /** <INTERNAL> Determines the users permissions */
  def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions): js.Promise[PermissionSet] = js.native
  def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions, options: Any): js.Promise[PermissionSet] = js.native
  
  /** <INTERNAL> Checks if a user exists and is in the given group. */
  def checkGroup(user: String, group: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def checkGroup(user: String, group: String, options: Any, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  /** <INTERNAL> Checks if a user exists and is in the given group. */
  def checkGroupAsync(user: String, group: String): js.Promise[Boolean] = js.native
  def checkGroupAsync(user: String, group: String, options: Any): js.Promise[Boolean] = js.native
  
  /** Validates username and password */
  def checkPassword(user: String, password: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def checkPassword(user: String, password: String, options: Any, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  /** Validates username and password */
  def checkPasswordAsync(user: String, password: String): js.Promise[Boolean] = js.native
  def checkPasswordAsync(user: String, password: String, options: Any): js.Promise[Boolean] = js.native
  
  /**
    * Changes access rights of all files in the adapter directory
    * @param adapter Name of the adapter instance, e.g. "admin.0". Defaults to the namespace of this adapter.
    * @param path Pattern to match the file path against
    * @param options Mode of the access change as a number or hexadecimal string
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chmodFile(adapter: String, path: String, options: Mode, callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: String, path: String, options: Record[String, Any], callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: Null, path: String, options: Mode, callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: Null, path: String, options: Record[String, Any], callback: ChownFileCallback): Unit = js.native
  
  def chmodFileAsync(adapter: String, path: String, options: Mode): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: String, path: String, options: Record[String, Any]): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: Null, path: String, options: Mode): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: Null, path: String, options: Record[String, Any]): js.Promise[Entries] = js.native
  
  def clearInterval(intervalId: Interval): Unit = js.native
  
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  
  /** common part of the adapter settings */
  var common: Any = js.native
  
  /** native part of the adapter settings */
  var config: AdapterConfig = js.native
  
  /** if the adapter is connected to the host */
  var connected: Boolean = js.native
  
  /** Creates an object with type channel. It must be located under a device */
  def createChannel(parentDevice: String, channelName: String): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, callback: SetObjectCallback): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, callback: SetObjectCallback): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, Any]): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: PartialChannelCommon): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any]
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any],
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any],
    options: Any
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** Creates an object with type channel. It must be located under a device */
  def createChannelAsync(parentDevice: String, channelName: String): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, Any]): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any
  ): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: PartialChannelCommon): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any]
  ): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, Any],
    options: Any
  ): SetObjectPromise = js.native
  
  // ==============================
  // devices and channels
  // tslint:disable:unified-signatures
  /** creates an object with type device */
  def createDevice(deviceName: String): Unit = js.native
  def createDevice(deviceName: String, callback: SetObjectCallback): Unit = js.native
  def createDevice(deviceName: String, common: PartialDeviceCommon): Unit = js.native
  def createDevice(deviceName: String, common: PartialDeviceCommon, callback: SetObjectCallback): Unit = js.native
  def createDevice(deviceName: String, common: PartialDeviceCommon, native: Record[String, Any]): Unit = js.native
  def createDevice(
    deviceName: String,
    common: PartialDeviceCommon,
    native: Record[String, Any],
    callback: SetObjectCallback
  ): Unit = js.native
  def createDevice(deviceName: String, common: PartialDeviceCommon, native: Record[String, Any], options: Any): Unit = js.native
  def createDevice(
    deviceName: String,
    common: PartialDeviceCommon,
    native: Record[String, Any],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** creates an object with type device */
  def createDeviceAsync(deviceName: String): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialDeviceCommon): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialDeviceCommon, native: Record[String, Any]): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialDeviceCommon, native: Record[String, Any], options: Any): SetObjectPromise = js.native
  
  /**
    * Creates a state and the corresponding object. It must be located in a channel under a device
    */
  def createState(parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, callback: SetObjectCallback): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: String): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any]
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: PartialStateCommon): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any]
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any],
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any],
    options: Any
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /**
    * Creates a state and the corresponding object. It must be located in a channel under a device
    */
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String): SetObjectPromise = js.native
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: String): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any]
  ): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, Any],
    options: Any
  ): SetObjectPromise = js.native
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: PartialStateCommon): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any]
  ): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, Any],
    options: Any
  ): SetObjectPromise = js.native
  
  /**
    * Decrypt a value that has been encrypted with the `encrypt` method
    */
  def decrypt(ciphertext: String): String = js.native
  
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link delForeignBinaryState} instead.
    *
    * Deletes a binary state from the states DB
    */
  def delBinaryState(id: String): Unit = js.native
  def delBinaryState(id: String, callback: ErrorCallback): Unit = js.native
  def delBinaryState(id: String, options: Any): Unit = js.native
  def delBinaryState(id: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link delForeignBinaryStateAsync} instead.
    *
    * Deletes a binary state from the states DB
    */
  def delBinaryStateAsync(id: String): js.Promise[Unit] = js.native
  def delBinaryStateAsync(id: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def delFile(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: String, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: Null, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def delFileAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: String, path: String, options: Any): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: Null, path: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes a binary state from the states DB. The ID will not be prefixed with the adapter namespace.
    */
  def delForeignBinaryState(id: String): Unit = js.native
  def delForeignBinaryState(id: String, callback: ErrorCallback): Unit = js.native
  def delForeignBinaryState(id: String, options: Any): Unit = js.native
  def delForeignBinaryState(id: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes a binary state from the states DB. The ID will not be prefixed with the adapter namespace.
    */
  def delForeignBinaryStateAsync(id: String): js.Promise[Unit] = js.native
  def delForeignBinaryStateAsync(id: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes an object (which might not belong to this adapter) from the object db
    * @param id - The id of the object including namespace
    */
  def delForeignObject(id: String): Unit = js.native
  def delForeignObject(id: String, callback: ErrorCallback): Unit = js.native
  def delForeignObject(id: String, options: DelObjectOptions): Unit = js.native
  def delForeignObject(id: String, options: DelObjectOptions, callback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes an object (which might not belong to this adapter) from the object db
    * @param id - The id of the object including namespace
    */
  def delForeignObjectAsync(id: String): js.Promise[Unit] = js.native
  def delForeignObjectAsync(id: String, options: DelObjectOptions): js.Promise[Unit] = js.native
  
  /** Deletes a state from the states DB, but not the associated object */
  def delForeignState(id: String): Unit = js.native
  def delForeignState(id: String, callback: ErrorCallback): Unit = js.native
  def delForeignState(id: String, options: Any): Unit = js.native
  def delForeignState(id: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a state from the states DB, but not the associated object */
  def delForeignStateAsync(id: String): js.Promise[Unit] = js.native
  def delForeignStateAsync(id: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes an object from the object db
    * @param id - The id of the object without namespace
    */
  def delObject(id: String): Unit = js.native
  def delObject(id: String, callback: ErrorCallback): Unit = js.native
  def delObject(id: String, options: DelObjectOptions): Unit = js.native
  def delObject(id: String, options: DelObjectOptions, callback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes an object from the object db
    * @param id - The id of the object without namespace
    */
  def delObjectAsync(id: String): js.Promise[Unit] = js.native
  def delObjectAsync(id: String, options: DelObjectOptions): js.Promise[Unit] = js.native
  
  /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
  def delState(id: String): Unit = js.native
  def delState(id: String, callback: ErrorCallback): Unit = js.native
  def delState(id: String, options: Any): Unit = js.native
  def delState(id: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
  def delStateAsync(id: String): js.Promise[Unit] = js.native
  def delStateAsync(id: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Returns a Promise that resolves after the given delay in milliseconds.
    * This will automatically be cleared (and not resolve) when the adapter is terminated in the meantime.
    */
  def delay(delayMs: Double): js.Promise[Unit] = js.native
  
  /** Deletes a channel and its states. It must have been created with `createChannel` */
  def deleteChannel(channelName: String): Unit = js.native
  def deleteChannel(channelName: String, options: Any): Unit = js.native
  def deleteChannel(channelName: String, options: Any, callback: ErrorCallback): Unit = js.native
  def deleteChannel(channelName: String, options: Unit, callback: ErrorCallback): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String, options: Any): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String, options: Any, callback: ErrorCallback): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String, options: Unit, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a channel and its states. It must have been created with `createChannel` */
  def deleteChannelAsync(channelName: String): js.Promise[Unit] = js.native
  def deleteChannelAsync(channelName: String, options: Any): js.Promise[Unit] = js.native
  def deleteChannelAsync(parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def deleteChannelAsync(parentDevice: String, channelName: String, options: Any): js.Promise[Unit] = js.native
  
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String): Unit = js.native
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, callback: ErrorCallback): Unit = js.native
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, options: Any): Unit = js.native
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String, options: Any): js.Promise[Unit] = js.native
  
  /** deletes a device, its channels and states */
  def deleteDevice(deviceName: String): Unit = js.native
  def deleteDevice(deviceName: String, callback: ErrorCallback): Unit = js.native
  def deleteDevice(deviceName: String, options: Any): Unit = js.native
  def deleteDevice(deviceName: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** deletes a device, its channels and states */
  def deleteDeviceAsync(deviceName: String): js.Promise[Unit] = js.native
  def deleteDeviceAsync(deviceName: String, options: Any): js.Promise[Unit] = js.native
  
  def deleteState(parentChannel: String, stateName: String): Unit = js.native
  def deleteState(parentChannel: String, stateName: String, options: Any): Unit = js.native
  def deleteState(parentChannel: String, stateName: String, options: Any, callback: ErrorCallback): Unit = js.native
  def deleteState(parentChannel: String, stateName: String, options: Unit, callback: ErrorCallback): Unit = js.native
  def deleteState(parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def deleteState(parentDevice: String, parentChannel: String, stateName: String, options: Any): Unit = js.native
  def deleteState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Any,
    callback: ErrorCallback
  ): Unit = js.native
  def deleteState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Unit,
    callback: ErrorCallback
  ): Unit = js.native
  /** Deletes a state. It must have been created with `createState` */
  def deleteState(stateName: String): Unit = js.native
  def deleteState(stateName: String, options: Any): Unit = js.native
  def deleteState(stateName: String, options: Any, callback: ErrorCallback): Unit = js.native
  def deleteState(stateName: String, options: Unit, callback: ErrorCallback): Unit = js.native
  
  def deleteStateAsync(parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(parentChannel: String, stateName: String, options: Any): js.Promise[Unit] = js.native
  def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String, options: Any): js.Promise[Unit] = js.native
  /** Deletes a state. It must have been created with `createState` */
  def deleteStateAsync(stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(stateName: String, options: Any): js.Promise[Unit] = js.native
  
  def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def deleteStateFromEnum(
    enumName: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: Any): Unit = js.native
  def deleteStateFromEnum(
    enumName: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Disables and stops the adapter instance.
    * It is recommended that you leave the current method (e.g. by using `return`) after calling this.
    */
  def disable(): Unit = js.native
  
  // TODO: getCertificates cannot be represented with promises right now
  /**
    * Encrypt the given cleartext, so it can be stored securely in adapter settings.
    */
  def encrypt(cleartext: String): String = js.native
  
  /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
  @JSName("extendForeignObjectAsync")
  def extendForeignObjectAsync_write[T /* <: String */](id: T, objPart: PartialObject[ObjectIdToObjectType[T, write]]): SetObjectPromise = js.native
  @JSName("extendForeignObjectAsync")
  def extendForeignObjectAsync_write[T /* <: String */](id: T, objPart: PartialObject[ObjectIdToObjectType[T, write]], options: ExtendObjectOptions): SetObjectPromise = js.native
  
  /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
  @JSName("extendForeignObject")
  def extendForeignObject_write[T /* <: String */](id: T, objPart: PartialObject[ObjectIdToObjectType[T, write]]): Unit = js.native
  @JSName("extendForeignObject")
  def extendForeignObject_write[T /* <: String */](id: T, objPart: PartialObject[ObjectIdToObjectType[T, write]], callback: SetObjectCallback): Unit = js.native
  @JSName("extendForeignObject")
  def extendForeignObject_write[T /* <: String */](id: T, objPart: PartialObject[ObjectIdToObjectType[T, write]], options: ExtendObjectOptions): Unit = js.native
  @JSName("extendForeignObject")
  def extendForeignObject_write[T /* <: String */](
    id: T,
    objPart: PartialObject[ObjectIdToObjectType[T, write]],
    options: ExtendObjectOptions,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** Extend an object and create it if it might not exist */
  def extendObject(id: String, objPart: PartialObject[AnyObject]): Unit = js.native
  def extendObject(id: String, objPart: PartialObject[AnyObject], callback: SetObjectCallback): Unit = js.native
  def extendObject(id: String, objPart: PartialObject[AnyObject], options: ExtendObjectOptions): Unit = js.native
  def extendObject(
    id: String,
    objPart: PartialObject[AnyObject],
    options: ExtendObjectOptions,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** Extend an object and create it if it might not exist */
  def extendObjectAsync(id: String, objPart: PartialObject[AnyObject]): SetObjectPromise = js.native
  def extendObjectAsync(id: String, objPart: PartialObject[AnyObject], options: ExtendObjectOptions): SetObjectPromise = js.native
  
  /**
    * Checks if a file exists in the DB
    */
  def fileExists(adapterName: String, path: String, callback: GenericCallback[Boolean]): Unit = js.native
  def fileExists(adapterName: String, path: String, options: Any, callback: GenericCallback[Boolean]): Unit = js.native
  def fileExists(adapterName: Null, path: String, callback: GenericCallback[Boolean]): Unit = js.native
  def fileExists(adapterName: Null, path: String, options: Any, callback: GenericCallback[Boolean]): Unit = js.native
  
  def fileExistsAsync(adapterName: String, path: String): js.Promise[Boolean] = js.native
  def fileExistsAsync(adapterName: String, path: String, options: Any): js.Promise[Boolean] = js.native
  def fileExistsAsync(adapterName: Null, path: String): js.Promise[Boolean] = js.native
  def fileExistsAsync(adapterName: Null, path: String, options: Any): js.Promise[Boolean] = js.native
  
  /**
    * Finds an object by its ID or name
    * @param type - common.type of the state
    */
  def findForeignObject(idOrName: String, `type`: String, callback: FindObjectCallback): Unit = js.native
  def findForeignObject(idOrName: String, `type`: String, options: Any, callback: FindObjectCallback): Unit = js.native
  
  /**
    * Finds an object by its ID or name
    * @param type - common.type of the state
    */
  def findForeignObjectAsync(idOrName: String, `type`: String): js.Promise[Id] = js.native
  
  def formatDate(dateObj: String, format: String): String = js.native
  def formatDate(dateObj: String, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: String, isDuration: Boolean, format: String): String = js.native
  def formatDate(dateObj: js.Date, format: String): String = js.native
  def formatDate(dateObj: js.Date, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: js.Date, isDuration: Boolean, format: String): String = js.native
  def formatDate(dateObj: Double, format: String): String = js.native
  def formatDate(dateObj: Double, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: Double, isDuration: Boolean, format: String): String = js.native
  
  def formatValue(value: String, decimals: Double, format: Any): String = js.native
  def formatValue(value: String, format: Any): String = js.native
  def formatValue(value: Double, decimals: Double, format: Any): String = js.native
  // ==============================
  // formatting
  def formatValue(value: Double, format: Any): String = js.native
  
  /** Get all states, channels, devices and folders of this adapter */
  def getAdapterObjects(callback: js.Function1[/* objects */ Record[String, AdapterScopedObject], Unit]): Unit = js.native
  
  /** Get all states, channels, devices and folders of this adapter */
  def getAdapterObjectsAsync(): js.Promise[Record[String, AdapterScopedObject]] = js.native
  
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link getForeignBinaryState} instead.
    *
    * Reads a binary state from Redis
    * @param id The id of the state
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
  def getBinaryState(id: String, options: Any, callback: GetBinaryStateCallback): Unit = js.native
  
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link getForeignBinaryStateAsync} instead.
    *
    * Reads a binary state from Redis
    * @param id The id of the state
    * @param options (optional) Some internal options.
    */
  def getBinaryStateAsync(id: String): GetBinaryStatePromise = js.native
  def getBinaryStateAsync(id: String, options: Any): GetBinaryStatePromise = js.native
  
  /** Returns SSL certificates by name (private key, public cert and chained certificate) for creation of HTTPS servers */
  def getCertificates(
    publicName: String,
    privateName: String,
    chainedName: String,
    callback: js.Function3[
      /* err */ js.UndefOr[js.Error | Null], 
      /* certs */ js.UndefOr[Certificates], 
      /* useLetsEncryptCert */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getChannels(callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannels(parentDevice: String, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannels(parentDevice: String, options: Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    */
  def getChannelsAsync(): js.Promise[js.Array[ChannelObject]] = js.native
  // tslint:disable-next-line:unified-signatures
  def getChannelsAsync(parentDevice: String): js.Promise[js.Array[ChannelObject]] = js.native
  def getChannelsAsync(parentDevice: String, options: Any): js.Promise[js.Array[ChannelObject]] = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getChannelsOf(callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannelsOf(parentDevice: String, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannelsOf(parentDevice: String, options: Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    */
  def getChannelsOfAsync(): js.Promise[js.Array[ChannelObject]] = js.native
  // tslint:disable-next-line:unified-signatures
  def getChannelsOfAsync(parentDevice: String): js.Promise[js.Array[ChannelObject]] = js.native
  def getChannelsOfAsync(parentDevice: String, options: Any): js.Promise[js.Array[ChannelObject]] = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Returns a list of all devices in this adapter instance
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getDevices(callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
  def getDevices(options: Any, callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
  
  /**
    * Returns a list of all devices in this adapter instance
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getDevicesAsync(): js.Promise[js.Array[DeviceObject]] = js.native
  def getDevicesAsync(options: Any): js.Promise[js.Array[DeviceObject]] = js.native
  
  // ==============================
  // enums
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnum(callback: GetEnumCallback): Unit = js.native
  def getEnum(name: String, callback: GetEnumCallback): Unit = js.native
  def getEnum(name: String, options: Any, callback: GetEnumCallback): Unit = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnumAsync(name: String): js.Promise[RequestEnum] = js.native
  def getEnumAsync(name: String, options: Any): js.Promise[RequestEnum] = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnums(callback: GetEnumsCallback): Unit = js.native
  def getEnums(enumList: EnumList, callback: GetEnumsCallback): Unit = js.native
  def getEnums(enumList: EnumList, options: Any, callback: GetEnumsCallback): Unit = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnumsAsync(enumList: EnumList): GetEnumsPromise = js.native
  def getEnumsAsync(enumList: EnumList, options: Any): GetEnumsPromise = js.native
  
  /**
    * Reads a binary state from Redis. The ID will not be prefixed with the adapter namespace.
    * @param id The id of the state
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getForeignBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
  def getForeignBinaryState(id: String, options: Any, callback: GetBinaryStateCallback): Unit = js.native
  
  /**
    * Reads a binary state from Redis. The ID will not be prefixed with the adapter namespace.
    * @param id The id of the state
    * @param options (optional) Some internal options.
    */
  def getForeignBinaryStateAsync(id: String): GetBinaryStatePromise = js.native
  def getForeignBinaryStateAsync(id: String, options: Any): GetBinaryStatePromise = js.native
  
  // ==============================
  // foreign objects
  /** Reads an object (which might not belong to this adapter) from the object db */
  def getForeignObject[T /* <: String */](id: T, callback: GetObjectCallback[T]): Unit = js.native
  def getForeignObject[T /* <: String */](id: T, options: Any, callback: GetObjectCallback[T]): Unit = js.native
  
  /** Reads an object (which might not belong to this adapter) from the object db */
  def getForeignObjectAsync[T /* <: String */](id: T): GetObjectPromise[T] = js.native
  def getForeignObjectAsync[T /* <: String */](id: T, options: Any): GetObjectPromise[T] = js.native
  
  /** Get foreign objects by pattern, by specific type and resolve their enums. */
  // tslint:disable:unified-signatures
  def getForeignObjects(pattern: String, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects(pattern: String, options: Any, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects[T /* <: ObjectType */](pattern: String, `type`: T, enums: Any | EnumList, callback: GetObjectsCallbackTyped[T]): Unit = js.native
  def getForeignObjects[T /* <: ObjectType */](pattern: String, `type`: T, enums: EnumList, options: Any, callback: GetObjectsCallbackTyped[T]): Unit = js.native
  
  def getForeignObjectsAsync(pattern: String): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, options: Any): GetObjectsPromise = js.native
  // tslint:enable:unified-signatures
  /** Get foreign objects by pattern, by specific type and resolve their enums. */
  def getForeignObjectsAsync[T /* <: ObjectType */](pattern: String, `type`: T, enums: Any | EnumList): GetObjectsPromiseTyped[T] = js.native
  def getForeignObjectsAsync[T /* <: ObjectType */](pattern: String, `type`: T, enums: EnumList, options: Any): GetObjectsPromiseTyped[T] = js.native
  @JSName("getForeignObjectsAsync")
  def getForeignObjectsAsync_T_ObjectType_GetObjectsPromiseTyped[T /* <: ObjectType */](pattern: String, `type`: T): GetObjectsPromiseTyped[T] = js.native
  
  @JSName("getForeignObjects")
  def getForeignObjects_T_ObjectType[T /* <: ObjectType */](pattern: String, `type`: T, callback: GetObjectsCallbackTyped[T]): Unit = js.native
  
  /** Read a value (which might not belong to this adapter) from the states DB. */
  def getForeignState(id: String, callback: GetStateCallback): Unit = js.native
  def getForeignState(id: String, options: Any, callback: GetStateCallback): Unit = js.native
  
  /** Read a value (which might not belong to this adapter) from the states DB. */
  def getForeignStateAsync(id: String): GetStatePromise = js.native
  def getForeignStateAsync(id: String, options: Any): GetStatePromise = js.native
  
  /** Read all states (which might not belong to this adapter) which match the given pattern */
  def getForeignStates(pattern: String, callback: GetStatesCallback): Unit = js.native
  def getForeignStates(pattern: String, options: Any, callback: GetStatesCallback): Unit = js.native
  
  /** Read all states (which might not belong to this adapter) which match the given pattern */
  def getForeignStatesAsync(pattern: String): GetStatesPromise = js.native
  def getForeignStatesAsync(pattern: String, options: Any): GetStatesPromise = js.native
  
  def getHistory(id: String, options: GetHistoryOptions, callback: GetHistoryCallback): Unit = js.native
  
  // ==============================
  // own objects
  /** Reads an object from the object db */
  def getObject(id: String, callback: GetObjectCallback[String]): Unit = js.native
  def getObject(id: String, options: Any, callback: GetObjectCallback[String]): Unit = js.native
  
  /** Reads an object from the object db */
  def getObjectAsync(id: String): GetObjectPromise[String] = js.native
  def getObjectAsync(id: String, options: Any): GetObjectPromise[String] = js.native
  
  def getObjectList(params: Null, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Record[String, Any], callback: GetObjectListCallback): Unit = js.native
  /**
    * Returns a list of objects with id between params.startkey and params.endkey
    * @param params Parameters determining the objects included in the return list. Null to include all objects
    * @param options If the returned list should be sorted. And some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObjectList(params: GetObjectListParams, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Record[String, Any], callback: GetObjectListCallback): Unit = js.native
  
  /**
    * Returns a list of objects with id between params.startkey and params.endkey
    * @param params Parameters determining the objects included in the return list. Null to include all objects
    * @param options If the returned list should be sorted. And some internal options.
    */
  def getObjectListAsync(): GetObjectListPromise = js.native
  def getObjectListAsync(params: Null, options: Sorted): GetObjectListPromise = js.native
  def getObjectListAsync(params: Null, options: Record[String, Any]): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams, options: Sorted): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams, options: Record[String, Any]): GetObjectListPromise = js.native
  
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: Null,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: Null,
    options: Any,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: Unit,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: Unit,
    options: Any,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
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
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: GetObjectViewParams,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
  def getObjectView[Design /* <: String */, Search /* <: String */](
    design: Design,
    search: Search,
    params: GetObjectViewParams,
    options: Any,
    callback: GetObjectViewCallback[InferGetObjectViewItemType[Design, Search]]
  ): Unit = js.native
  
  /**
    * Query a predefined object view (similar to SQL stored procedures) and return the results
    * For a detailed description refer to https://github.com/ioBroker/ioBroker/wiki/Adapter-Development-Documentation#object-fields
    * or http://guide.couchdb.org/editions/1/en/views.html
    * @param design The namespace of the object view, as defined in io-package.json. Usually the adapter name, e.g. "hm-rpc"
    * @param search The name of the object view.
    * @param params Parameters to additionally filter out objects from the return list. Null to include all objects
    * @param options (optional) Some internal options.
    */
  def getObjectViewAsync[Design /* <: String */, Search /* <: String */](design: Design, search: Search): GetObjectViewPromise[InferGetObjectViewItemType[Design, Search]] = js.native
  def getObjectViewAsync[Design /* <: String */, Search /* <: String */](design: Design, search: Search, params: Null, options: Any): GetObjectViewPromise[InferGetObjectViewItemType[Design, Search]] = js.native
  def getObjectViewAsync[Design /* <: String */, Search /* <: String */](design: Design, search: Search, params: Unit, options: Any): GetObjectViewPromise[InferGetObjectViewItemType[Design, Search]] = js.native
  def getObjectViewAsync[Design /* <: String */, Search /* <: String */](design: Design, search: Search, params: GetObjectViewParams): GetObjectViewPromise[InferGetObjectViewItemType[Design, Search]] = js.native
  def getObjectViewAsync[Design /* <: String */, Search /* <: String */](design: Design, search: Search, params: GetObjectViewParams, options: Any): GetObjectViewPromise[InferGetObjectViewItemType[Design, Search]] = js.native
  
  /**
    * Returns the configuration for a loaded plugin
    * @param name The name of the plugin
    * @returns The plugin configuration or null if it is not existent or not active
    */
  def getPluginConfig(name: String): (Record[String, Any]) | Null = js.native
  
  /**
    * Returns an instance of a loaded plugin
    * @param name The name of the plugin
    * @returns The plugin instance or null if it is not existent or not active
    */
  def getPluginInstance(name: String): Plugin | Null = js.native
  
  /* ===============================
    Functions defined in adapter.js
    =============================== */
  /**
    * Helper function that looks for first free TCP port starting with the given one.
    * @param port - The port to start with
    * @param callback - gets called when a free port is found
    */
  def getPort(port: Double, callback: js.Function1[/* port */ Double, Unit]): Unit = js.native
  
  /**
    * Helper function that looks for first free TCP port starting with the given one.
    * @param port - The port to start with
    */
  def getPortAsync(port: Double): js.Promise[Double] = js.native
  
  // tslint:enable:unified-signatures
  /** Read a value from the states DB. */
  def getState(id: String, callback: GetStateCallback): Unit = js.native
  def getState(id: String, options: Any, callback: GetStateCallback): Unit = js.native
  
  /** Read a value from the states DB. */
  def getStateAsync(id: String): GetStatePromise = js.native
  def getStateAsync(id: String, options: Any): GetStatePromise = js.native
  
  /** Read all states of this adapter which match the given pattern */
  def getStates(pattern: String, callback: GetStatesCallback): Unit = js.native
  def getStates(pattern: String, options: Any, callback: GetStatesCallback): Unit = js.native
  
  /** Read all states of this adapter which match the given pattern */
  def getStatesAsync(pattern: String): GetStatesPromise = js.native
  def getStatesAsync(pattern: String, options: Any): GetStatesPromise = js.native
  
  /**
    * Returns a list of all states in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param parentChannel (optional) Name of the parent channel to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getStatesOf(callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(parentDevice: String, callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(parentDevice: String, parentChannel: String, callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(
    parentDevice: String,
    parentChannel: String,
    options: Any,
    callback: GetObjectsCallback3[StateObject]
  ): Unit = js.native
  
  /**
    * Returns a list of all states in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param parentChannel (optional) Name of the parent channel to filter the channels by
    * @param options (optional) Some internal options.
    */
  // tslint:disable:unified-signatures
  def getStatesOfAsync(): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String, parentChannel: String): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String, parentChannel: String, options: Any): js.Promise[js.Array[StateObject]] = js.native
  
  // ==============================
  // GENERAL
  /** Returns the ID of the user with the given username, if it exists */
  def getUserID(username: String): js.Promise[js.UndefOr[String]] = js.native
  
  /** The name of the host where the adapter is running */
  var host: String = js.native
  
  /** Convert ID to {device: D, channel: C, state: S} */
  def idToDCS(id: String): Channel = js.native
  
  /** instance number of this adapter instance */
  var instance: Double = js.native
  
  /** content of io-package.json */
  var ioPack: Any = js.native
  
  /** access to the logging functions */
  var log: Logger = js.native
  
  def mkDir(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: String, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: Null, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  
  def mkDirAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: String, path: String, options: Any): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: Null, path: String, options: Any): js.Promise[Unit] = js.native
  
  /** The name of the adapter */
  var name: String = js.native
  
  /** Namespace of adapter objects: `<name>.<instance>` */
  val namespace: DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket = js.native
  
  /**
    * Contains a live cache of the adapter's objects.
    *
    * NOTE: This is only defined if the adapter was initialized with the option `objects: true`.
    */
  var oObjects: js.UndefOr[Record[String, js.UndefOr[Object]]] = js.native
  
  /**
    * Contains a live cache of the adapter's states.
    *
    * NOTE: This is only defined if the adapter was initialized with the option `states: true`.
    */
  var oStates: js.UndefOr[Record[String, js.UndefOr[State]]] = js.native
  
  @JSName("on")
  def on_message(event: message, handler: MessageHandler): this.type = js.native
  @JSName("on")
  def on_objectChange(event: objectChange, handler: ObjectChangeHandler): this.type = js.native
  // =============================================
  // Events exposed through EventEmitter interface
  // =============================================
  @JSName("on")
  def on_ready(event: ready, handler: ReadyHandler): this.type = js.native
  @JSName("on")
  def on_stateChange(event: stateChange, handler: StateChangeHandler): this.type = js.native
  @JSName("on")
  def on_unload(event: unload, handler: UnloadHandler): this.type = js.native
  
  /** content of package.json */
  var pack: Any = js.native
  
  /**
    * Whether the adapter should warn if states are set without an corresponding existing object.
    * Defaults to the value passed to the constructor via the option {@link AdapterOptions.strictObjectChecks}.
    */
  var performStrictObjectChecks: Boolean = js.native
  
  // tslint:enable:unified-signatures
  // ==============================
  // filesystem
  /**
    * reads the content of directory from DB for given adapter and path
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def readDir(adapterName: String, path: String, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: String, path: String, options: Any, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: Null, path: String, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: Null, path: String, options: Any, callback: ReadDirCallback): Unit = js.native
  
  /**
    * reads the content of directory from DB for given adapter and path
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def readDirAsync(adapterName: String, path: String): ReadDirPromise = js.native
  def readDirAsync(adapterName: String, path: String, options: Any): ReadDirPromise = js.native
  def readDirAsync(adapterName: Null, path: String): ReadDirPromise = js.native
  def readDirAsync(adapterName: Null, path: String, options: Any): ReadDirPromise = js.native
  
  def readFile(adapterName: String, path: String, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: String, path: String, options: Any, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: Null, path: String, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: Null, path: String, options: Any, callback: ReadFileCallback): Unit = js.native
  
  def readFileAsync(adapterName: String, path: String): ReadFilePromise = js.native
  def readFileAsync(adapterName: String, path: String, options: Any): ReadFilePromise = js.native
  def readFileAsync(adapterName: Null, path: String): ReadFilePromise = js.native
  def readFileAsync(adapterName: Null, path: String, options: Any): ReadFilePromise = js.native
  
  /**
    * Send a notification with the given scope and category to the host of this adapter
    * @param scope The scope of the notification
    * @param category The category of the notification. If `null` is passed, ioBroker will try to infer a matching category from the `message` parameter.
    *
    * **Note:** If no category can be inferred, the message will NOT be registered!
    * @param message The message of the notification
    */
  def registerNotification(
    scope: system,
    category: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl,
    message: String
  ): js.Promise[Unit] = js.native
  @JSName("registerNotification")
  def registerNotification_system(scope: system, category: Null, message: String): js.Promise[Unit] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: ready | unload | stateChange | objectChange | message): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_message(event: message, handler: MessageHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_objectChange(event: objectChange, handler: ObjectChangeHandler): this.type = js.native
  // The error event handler can not be attached later
  @JSName("removeListener")
  def removeListener_ready(event: ready, handler: ReadyHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_stateChange(event: stateChange, handler: StateChangeHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_unload(event: unload, handler: UnloadHandler): this.type = js.native
  
  def rename(adapterName: String, oldName: String, newName: String, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: String, oldName: String, newName: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: Null, oldName: String, newName: String, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: Null, oldName: String, newName: String, options: Any, callback: ErrnoCallback): Unit = js.native
  
  def renameAsync(adapterName: String, oldName: String, newName: String): js.Promise[Unit] = js.native
  def renameAsync(adapterName: String, oldName: String, newName: String, options: Any): js.Promise[Unit] = js.native
  def renameAsync(adapterName: Null, oldName: String, newName: String): js.Promise[Unit] = js.native
  def renameAsync(adapterName: Null, oldName: String, newName: String, options: Any): js.Promise[Unit] = js.native
  
  /** Restarts the adapter */
  def restart(): scala.Nothing = js.native
  
  def sendTo(instanceName: String, command: String, message: MessagePayload): Unit = js.native
  def sendTo(instanceName: String, command: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendTo(instanceName: String, command: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  /**
    * Sends a message to a specific instance or all instances of some specific adapter.
    * @param instanceName The instance to send this message to.
    * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
    * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
    * @param command (optional) Command name of the target instance. Default: "send"
    * @param message The message (e.g. params) to send.
    */
  def sendTo(instanceName: String, message: MessagePayload): Unit = js.native
  def sendTo(instanceName: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendTo(instanceName: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  
  def sendToAsync(instanceName: String, command: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  /**
    * Sends a message to a specific instance or all instances of some specific adapter.
    * @param instanceName The instance to send this message to.
    * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
    * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
    * @param command (optional) Command name of the target instance. Default: "send"
    * @param message The message (e.g. params) to send.
    */
  def sendToAsync(instanceName: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  
  def sendToHost(hostName: String, command: String, message: MessagePayload): Unit = js.native
  def sendToHost(hostName: String, command: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendToHost(hostName: String, command: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  /**
    * Sends a message to a specific host or all hosts.
    */
  def sendToHost(hostName: String, message: MessagePayload): Unit = js.native
  def sendToHost(hostName: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendToHost(hostName: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  
  def sendToHostAsync(hostName: String, command: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  /**
    * Sends a message to a specific host or all hosts.
    */
  def sendToHostAsync(hostName: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  
  // TODO: getHistoryAsync
  // MISSING:
  // logRedirect https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4294
  // requireLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4336
  // processLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4360
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link setForeignBinaryState} instead.
    *
    * Writes a binary state into Redis
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setBinaryState(id: String, binary: Buffer, callback: SetStateCallback): Unit = js.native
  def setBinaryState(id: String, binary: Buffer, options: Any, callback: SetStateCallback): Unit = js.native
  
  /**
    * @deprecated Despite the naming convention, this method doesn't prepend the adapter namespace. Use {@link setForeignBinaryStateAsync} instead.
    *
    * Writes a binary state into Redis
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    */
  def setBinaryStateAsync(id: String, binary: Buffer): SetStatePromise = js.native
  def setBinaryStateAsync(id: String, binary: Buffer, options: Any): SetStatePromise = js.native
  
  /**
    * Set capabilities of the given executable. Only works on Linux systems.
    * @param execPath Path to the executable. For Node.js, this can be determined via `process.execPath`.
    * @param capabilities Capabilities to set, e.g. ['cap_net_admin', 'cap_net_bind_service']
    * @param modeEffective Add effective mode
    * @param modePermitted Add permitted mode
    * @param modeInherited Add inherited mode
    */
  def setExecutableCapabilities(execPath: String, capabilities: js.Array[String]): js.Promise[Unit] = js.native
  def setExecutableCapabilities(execPath: String, capabilities: js.Array[String], modeEffective: Boolean): js.Promise[Unit] = js.native
  def setExecutableCapabilities(execPath: String, capabilities: js.Array[String], modeEffective: Boolean, modePermitted: Boolean): js.Promise[Unit] = js.native
  def setExecutableCapabilities(
    execPath: String,
    capabilities: js.Array[String],
    modeEffective: Boolean,
    modePermitted: Boolean,
    modeInherited: Boolean
  ): js.Promise[Unit] = js.native
  def setExecutableCapabilities(
    execPath: String,
    capabilities: js.Array[String],
    modeEffective: Boolean,
    modePermitted: Unit,
    modeInherited: Boolean
  ): js.Promise[Unit] = js.native
  def setExecutableCapabilities(execPath: String, capabilities: js.Array[String], modeEffective: Unit, modePermitted: Boolean): js.Promise[Unit] = js.native
  def setExecutableCapabilities(
    execPath: String,
    capabilities: js.Array[String],
    modeEffective: Unit,
    modePermitted: Boolean,
    modeInherited: Boolean
  ): js.Promise[Unit] = js.native
  def setExecutableCapabilities(
    execPath: String,
    capabilities: js.Array[String],
    modeEffective: Unit,
    modePermitted: Unit,
    modeInherited: Boolean
  ): js.Promise[Unit] = js.native
  
  /**
    * Writes a binary state into Redis. The ID will not be prefixed with the adapter namespace.
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setForeignBinaryState(id: String, binary: Buffer, callback: SetStateCallback): Unit = js.native
  def setForeignBinaryState(id: String, binary: Buffer, options: Any, callback: SetStateCallback): Unit = js.native
  
  /**
    * Writes a binary state into Redis. The ID will not be prefixed with the adapter namespace.
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    */
  def setForeignBinaryStateAsync(id: String, binary: Buffer): SetStatePromise = js.native
  def setForeignBinaryStateAsync(id: String, binary: Buffer, options: Any): SetStatePromise = js.native
  
  /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
  @JSName("setForeignObjectAsync")
  def setForeignObjectAsync_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]]): SetObjectPromise = js.native
  @JSName("setForeignObjectAsync")
  def setForeignObjectAsync_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], options: Any): SetObjectPromise = js.native
  
  /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
  @JSName("setForeignObjectNotExistsAsync")
  def setForeignObjectNotExistsAsync_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]]): SetObjectPromise = js.native
  @JSName("setForeignObjectNotExistsAsync")
  def setForeignObjectNotExistsAsync_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], options: Any): SetObjectPromise = js.native
  
  /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
  @JSName("setForeignObjectNotExists")
  def setForeignObjectNotExists_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]]): Unit = js.native
  @JSName("setForeignObjectNotExists")
  def setForeignObjectNotExists_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], callback: SetObjectCallback): Unit = js.native
  @JSName("setForeignObjectNotExists")
  def setForeignObjectNotExists_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], options: Any): Unit = js.native
  @JSName("setForeignObjectNotExists")
  def setForeignObjectNotExists_write[T /* <: String */](
    id: T,
    obj: SettableObject[ObjectIdToObjectType[T, write]],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
  @JSName("setForeignObject")
  def setForeignObject_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]]): Unit = js.native
  @JSName("setForeignObject")
  def setForeignObject_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], callback: SetObjectCallback): Unit = js.native
  @JSName("setForeignObject")
  def setForeignObject_write[T /* <: String */](id: T, obj: SettableObject[ObjectIdToObjectType[T, write]], options: Any): Unit = js.native
  @JSName("setForeignObject")
  def setForeignObject_write[T /* <: String */](
    id: T,
    obj: SettableObject[ObjectIdToObjectType[T, write]],
    options: Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  def setForeignState(id: String, state: SettableState): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, options: Any): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, options: Any): Unit = js.native
  def setForeignState(id: String, state: SettableState, options: Any, callback: SetStateCallback): Unit = js.native
  /** Writes a value (which might not belong to this adapter) into the states DB. */
  def setForeignState(id: String, state: State): Unit = js.native
  def setForeignState(id: String, state: StateValue): Unit = js.native
  def setForeignState(id: String, state: StateValue, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: StateValue, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: StateValue, ack: Boolean, options: Any): Unit = js.native
  def setForeignState(id: String, state: StateValue, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: StateValue, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: StateValue, options: Any): Unit = js.native
  def setForeignState(id: String, state: StateValue, options: Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, options: Any): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, options: Any): Unit = js.native
  def setForeignState(id: String, state: State, options: Any, callback: SetStateCallback): Unit = js.native
  
  def setForeignStateAsync(id: String, state: SettableState): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, ack: Boolean, options: Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, options: Any): SetStatePromise = js.native
  /** Writes a value (which might not belong to this adapter) into the states DB. */
  def setForeignStateAsync(id: String, state: State): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: StateValue): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: StateValue, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: StateValue, ack: Boolean, options: Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: StateValue, options: Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, ack: Boolean, options: Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, options: Any): SetStatePromise = js.native
  
  def setForeignStateChanged(id: String, state: SettableState): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, options: Any, callback: SetStateChangedCallback): Unit = js.native
  /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
  def setForeignStateChanged(id: String, state: State): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, ack: Boolean, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: StateValue, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, options: Any): Unit = js.native
  def setForeignStateChanged(id: String, state: State, options: Any, callback: SetStateChangedCallback): Unit = js.native
  
  def setForeignStateChangedAsync(id: String, state: SettableState): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, options: Any): SetStateChangedPromise = js.native
  /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
  def setForeignStateChangedAsync(id: String, state: State): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: StateValue): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: StateValue, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: StateValue, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: StateValue, options: Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, options: Any): SetStateChangedPromise = js.native
  
  /** Creates an interval that can automatically be cleared when the adapter is terminated */
  def setInterval[T /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ T, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Interval = js.native
  
  /** Creates or overwrites an object in the object db */
  def setObject(id: String, obj: SettableObject[AnyObject]): Unit = js.native
  def setObject(id: String, obj: SettableObject[AnyObject], callback: SetObjectCallback): Unit = js.native
  def setObject(id: String, obj: SettableObject[AnyObject], options: Any): Unit = js.native
  def setObject(id: String, obj: SettableObject[AnyObject], options: Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates or overwrites an object in the object db */
  def setObjectAsync(id: String, obj: SettableObject[AnyObject]): SetObjectPromise = js.native
  def setObjectAsync(id: String, obj: SettableObject[AnyObject], options: Any): SetObjectPromise = js.native
  
  /** Creates an object in the object db. Existing objects are not overwritten. */
  def setObjectNotExists(id: String, obj: SettableObject[AnyObject]): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject[AnyObject], callback: SetObjectCallback): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject[AnyObject], options: Any): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject[AnyObject], options: Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates an object in the object db. Existing objects are not overwritten. */
  def setObjectNotExistsAsync(id: String, obj: SettableObject[AnyObject]): SetObjectPromise = js.native
  def setObjectNotExistsAsync(id: String, obj: SettableObject[AnyObject], options: Any): SetObjectPromise = js.native
  
  /** Sets a new password for the given user */
  def setPassword(user: String, password: String): Unit = js.native
  def setPassword(user: String, password: String, callback: ErrorCallback): Unit = js.native
  def setPassword(user: String, password: String, options: Any): Unit = js.native
  def setPassword(user: String, password: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Sets a new password for the given user */
  def setPasswordAsync(user: String, password: String): js.Promise[Unit] = js.native
  def setPasswordAsync(user: String, password: String, options: Any): js.Promise[Unit] = js.native
  
  def setState(id: String, state: SettableState): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, options: Any): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, options: Any): Unit = js.native
  def setState(id: String, state: SettableState, options: Any, callback: SetStateCallback): Unit = js.native
  // ==============================
  // states
  // Multiple signatures help understanding what the parameters are about
  /** Writes a value into the states DB. */
  // tslint:disable:unified-signatures
  def setState(id: String, state: State): Unit = js.native
  def setState(id: String, state: StateValue): Unit = js.native
  def setState(id: String, state: StateValue, ack: Boolean): Unit = js.native
  def setState(id: String, state: StateValue, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: StateValue, ack: Boolean, options: Any): Unit = js.native
  def setState(id: String, state: StateValue, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: StateValue, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: StateValue, options: Any): Unit = js.native
  def setState(id: String, state: StateValue, options: Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, ack: Boolean): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, options: Any): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, options: Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, options: Any): Unit = js.native
  def setState(id: String, state: State, options: Any, callback: SetStateCallback): Unit = js.native
  
  def setStateAsync(id: String, state: SettableState): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, ack: Boolean, options: Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, options: Any): SetStatePromise = js.native
  /** Writes a value into the states DB. */
  def setStateAsync(id: String, state: State): SetStatePromise = js.native
  def setStateAsync(id: String, state: StateValue): SetStatePromise = js.native
  def setStateAsync(id: String, state: StateValue, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: StateValue, ack: Boolean, options: Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: StateValue, options: Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, ack: Boolean, options: Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, options: Any): SetStatePromise = js.native
  
  def setStateChanged(id: String, state: SettableState): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, options: Any): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, options: Any): Unit = js.native
  def setStateChanged(id: String, state: SettableState, options: Any, callback: SetStateChangedCallback): Unit = js.native
  /** Writes a value into the states DB only if it has changed. */
  def setStateChanged(id: String, state: State): Unit = js.native
  def setStateChanged(id: String, state: StateValue): Unit = js.native
  def setStateChanged(id: String, state: StateValue, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: StateValue, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: StateValue, ack: Boolean, options: Any): Unit = js.native
  def setStateChanged(id: String, state: StateValue, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: StateValue, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: StateValue, options: Any): Unit = js.native
  def setStateChanged(id: String, state: StateValue, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, options: Any): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, options: Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, options: Any): Unit = js.native
  def setStateChanged(id: String, state: State, options: Any, callback: SetStateChangedCallback): Unit = js.native
  
  def setStateChangedAsync(id: String, state: SettableState): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, options: Any): SetStateChangedPromise = js.native
  /** Writes a value into the states DB only if it has changed. */
  def setStateChangedAsync(id: String, state: State): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: StateValue): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: StateValue, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: StateValue, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: StateValue, options: Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, ack: Boolean, options: Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, options: Any): SetStateChangedPromise = js.native
  
  // =============================================
  // Managed version of builtin setTimeout/setInterval/clear...
  // =============================================
  /** Creates a timeout that can automatically be cleared when the adapter is terminated */
  def setTimeout[T /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ T, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
  
  /** Stops the adapter. Note: Is not always defined. */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Subscribe to changes of objects (which might not belong to this adapter) */
  def subscribeForeignObjects(pattern: String): Unit = js.native
  def subscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeForeignObjects(pattern: String, options: Any): Unit = js.native
  def subscribeForeignObjects(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of objects (which might not belong to this adapter) */
  def subscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeForeignObjectsAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /** Subscribe to changes of states (which might not belong to this adapter) */
  def subscribeForeignStates(pattern: String): Unit = js.native
  def subscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeForeignStates(pattern: String, options: Any): Unit = js.native
  def subscribeForeignStates(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of states (which might not belong to this adapter) */
  def subscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeForeignStatesAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  // ==============================
  // subscriptions
  /** Subscribe to changes of objects in this instance */
  def subscribeObjects(pattern: String): Unit = js.native
  def subscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeObjects(pattern: String, options: Any): Unit = js.native
  def subscribeObjects(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of objects in this instance */
  def subscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeObjectsAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /** Subscribe to changes of states in this instance */
  def subscribeStates(pattern: String): Unit = js.native
  def subscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeStates(pattern: String, options: Any): Unit = js.native
  def subscribeStates(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of states in this instance */
  def subscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeStatesAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Checks if a given feature is supported by the current installation
    * @param featureName The name of the feature to test for
    */
  var supportsFeature: js.UndefOr[js.Function1[/* featureName */ String, Boolean]] = js.native
  
  /** system part of the adapter settings */
  var systemConfig: js.UndefOr[Any] = js.native
  
  /**
    * Terminates the adapter execution but does not disable the adapter
    * @param reason (optional) A message to print into the log prior to termination
    * @param exitCode (optional) The exit code to use for termination
    */
  def terminate(): scala.Nothing = js.native
  def terminate(exitCode: Double): scala.Nothing = js.native
  def terminate(reason: String): scala.Nothing = js.native
  def terminate(reason: String, exitCode: Double): scala.Nothing = js.native
  def terminate(reason: Unit, exitCode: Double): scala.Nothing = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def unlink(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: String, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: Null, path: String, options: Any, callback: ErrnoCallback): Unit = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def unlinkAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: String, path: String, options: Any): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: Null, path: String, options: Any): js.Promise[Unit] = js.native
  
  /** Unsubscribe from changes of objects (which might not belong to this adapter) */
  def unsubscribeForeignObjects(pattern: String): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, options: Any): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Unsubscribe from changes of objects (which might not belong to this adapter) */
  def unsubscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeForeignObjectsAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Subscribe from changes of states (which might not belong to this adapter)
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeForeignStates(pattern: String): Unit = js.native
  def unsubscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeForeignStates(pattern: String, options: Any): Unit = js.native
  def unsubscribeForeignStates(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Subscribe from changes of states (which might not belong to this adapter)
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeForeignStatesAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /** Unsubscribe from changes of objects in this instance */
  def unsubscribeObjects(pattern: String): Unit = js.native
  def unsubscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeObjects(pattern: String, options: Any): Unit = js.native
  def unsubscribeObjects(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /** Unsubscribe from changes of objects in this instance */
  def unsubscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeObjectsAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Subscribe from changes of states in this instance
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeStates(pattern: String): Unit = js.native
  def unsubscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeStates(pattern: String, options: Any): Unit = js.native
  def unsubscribeStates(pattern: String, options: Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Subscribe from changes of states in this instance
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeStatesAsync(pattern: String, options: Any): js.Promise[Unit] = js.native
  
  /**
    * Updates the adapter config with new values. Only a subset of the configuration has to be provided,
    * since merging with the existing config is done automatically.
    *
    * After updating the configuration, the adapter is automatically restarted. It is recommended that you
    * leave the current method (e.g. by using `return`) after calling this.
    *
    * @param newConfig The new config values to be stored
    */
  def updateConfig(newConfig: js.Object): Unit = js.native
  
  /** adapter version */
  var version: Any = js.native
  
  def writeFile(adapterName: String, path: String, data: String, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: String, path: String, data: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: String, path: String, data: Buffer, callback: ErrnoCallback): Unit = js.native
  // options see https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/objects/objectsInMemServer.js#L599
  def writeFile(adapterName: String, path: String, data: Buffer, options: Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: String, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: String, options: Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: Buffer, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: Buffer, options: Any, callback: ErrnoCallback): Unit = js.native
  
  def writeFileAsync(adapterName: String, path: String, data: String): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: String, options: Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: Buffer, options: Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: String): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: String, options: Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: Buffer, options: Any): js.Promise[Unit] = js.native
}
