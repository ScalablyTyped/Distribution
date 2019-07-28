package typings.iobroker.iobrokerMod.Global

import org.scalablytyped.runtime.StringDictionary
import typings.iobroker.Anon_Acl
import typings.iobroker.Anon_Channel
import typings.iobroker.Anon_Entries
import typings.iobroker.Anon_Err
import typings.iobroker.Anon_Execute
import typings.iobroker.Anon_File
import typings.iobroker.Anon_Id
import typings.iobroker.Anon_IdString
import typings.iobroker.Anon_IdStringOptional
import typings.iobroker.Anon_IdValue
import typings.iobroker.Anon_IsBinary
import typings.iobroker.Anon_Mode
import typings.iobroker.Anon_RequestEnum
import typings.iobroker.Anon_Rows
import typings.iobroker.Anon_RowsArray
import typings.iobroker.Anon_Sorted
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.AdapterConfig
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.BaseObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.CallbackReturnTypeOf
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Certificates
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChannelCommon
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChannelObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChownFileCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChownFileResult
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChownObjectCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.CommandsPermissions
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.CommonType
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.DeleteStateCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.DeviceCommon
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.DeviceObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.EmptyCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Enum
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.EnumList
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ErrorCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.EvaluatedFileACL
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ExtendObjectCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.FileACL
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.FindObjectCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GenericCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetBinaryStateCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetConfigKeysCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetEnumCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetEnumsCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetHistoryCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetHistoryOptions
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetHistoryResult
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectListCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectListParams
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectViewCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectViewItem
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectViewParams
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectsCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectsCallback2
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectsCallback3
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetSessionCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetStateCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetStatesCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetStatesCallback2
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetUserGroupCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Log
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.LogLevel
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Logger
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Message
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.MessageCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.MessageCallbackInfo
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.MessageHandler
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.MessagePayload
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.NonNullCallbackReturnTypeOf
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Object
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectACL
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectChangeHandler
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectCommon
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectOperationPermissions
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectOrStatePermission
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectPermissions
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ObjectType
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Objects
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.OtherCommon
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.OtherPermission
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.PartialObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Permission
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.PermissionSet
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ReadDirCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ReadDirResult
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ReadFileCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.ReadyHandler
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.RmCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.RmResult
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SecondParameterOf
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.Session
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SetObjectCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SetStateCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SetStateChangedCallback
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SettableObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.SettableObjectWorker
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.State
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateACL
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateChangeHandler
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateCommon
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateObject
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.States
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.UnloadHandler
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.User
import typings.iobroker.iobrokerMod.Global.ioBrokerNs.UserGroup
import typings.iobroker.iobrokerStrings._id
import typings.iobroker.iobrokerStrings.`object`
import typings.iobroker.iobrokerStrings.acl
import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.average
import typings.iobroker.iobrokerStrings.channel
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.count
import typings.iobroker.iobrokerStrings.create
import typings.iobroker.iobrokerStrings.delete
import typings.iobroker.iobrokerStrings.device
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.execute
import typings.iobroker.iobrokerStrings.file
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.http
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.list
import typings.iobroker.iobrokerStrings.max
import typings.iobroker.iobrokerStrings.message
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.min
import typings.iobroker.iobrokerStrings.minmax
import typings.iobroker.iobrokerStrings.none
import typings.iobroker.iobrokerStrings.objectChange
import typings.iobroker.iobrokerStrings.other
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.ready
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.sendto
import typings.iobroker.iobrokerStrings.state
import typings.iobroker.iobrokerStrings.stateChange
import typings.iobroker.iobrokerStrings.total
import typings.iobroker.iobrokerStrings.unload
import typings.iobroker.iobrokerStrings.user
import typings.iobroker.iobrokerStrings.users
import typings.iobroker.iobrokerStrings.write
import typings.node.Buffer
import typings.node.fsMod.Stats
import typings.std.Date
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ioBroker")
@js.native
object ioBrokerNs extends js.Object {
  @js.native
  trait Adapter extends js.Object {
    /** path to the adapter folder */
    var adapterDir: String = js.native
    /** common part of the adapter settings */
    var common: js.Any = js.native
    /** native part of the adapter settings */
    var config: AdapterConfig = js.native
    /** if the adapter is connected to the host */
    var connected: Boolean = js.native
    /** The name of the host where the adapter is running */
    var host: String = js.native
    /** instance number of this adapter instance */
    var instance: Double = js.native
    /** content of io-package.json */
    var ioPack: js.Any = js.native
    /** access to the logging functions */
    var log: Logger = js.native
    /** The name of the adapter */
    var name: String = js.native
    /** Namespace of adapter objects: "<name>.<instance>" */
    val namespace: String = js.native
    var objects: Objects = js.native
    /** content of package.json */
    var pack: js.Any = js.native
    var states: States = js.native
    /** Stops the adapter. Note: Is not always defined. */
    var stop: js.UndefOr[js.Function0[Unit]] = js.native
    /** system part of the adapter settings */
    var systemConfig: js.UndefOr[js.Any] = js.native
    /** adapter version */
    var version: js.Any = js.native
    def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String): Unit = js.native
    def addChannelToEnum(
      enumName: String,
      addTo: String,
      parentDevice: String,
      channelName: String,
      callback: ErrorCallback
    ): Unit = js.native
    def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String, options: js.Any): Unit = js.native
    def addChannelToEnum(
      enumName: String,
      addTo: String,
      parentDevice: String,
      channelName: String,
      options: js.Any,
      callback: ErrorCallback
    ): Unit = js.native
    def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
    def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
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
      options: js.Any
    ): Unit = js.native
    def addStateToEnum(
      enumName: String,
      addTo: String,
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      options: js.Any,
      callback: ErrorCallback
    ): Unit = js.native
    def addStateToEnumAsync(enumName: String, addTo: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
    def addStateToEnumAsync(
      enumName: String,
      addTo: String,
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      options: js.Any
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
      options: js.Any,
      callback: js.Function1[/* result */ PermissionSet, Unit]
    ): Unit = js.native
    /** <INTERNAL> Determines the users permissions */
    def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions): js.Promise[PermissionSet] = js.native
    def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions, options: js.Any): js.Promise[PermissionSet] = js.native
    /** <INTERNAL> Checks if a user exists and is in the given group. */
    def checkGroup(user: String, group: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
    def checkGroup(user: String, group: String, options: js.Any, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
    /** <INTERNAL> Checks if a user exists and is in the given group. */
    def checkGroupAsync(user: String, group: String): js.Promise[Boolean] = js.native
    def checkGroupAsync(user: String, group: String, options: js.Any): js.Promise[Boolean] = js.native
    // ==============================
    // GENERAL
    /** Validates username and password */
    def checkPassword(user: String, password: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
    def checkPassword(
      user: String,
      password: String,
      options: js.Any,
      callback: js.Function1[/* result */ Boolean, Unit]
    ): Unit = js.native
    /** Validates username and password */
    def checkPasswordAsync(user: String, password: String): js.Promise[Boolean] = js.native
    def checkPasswordAsync(user: String, password: String, options: js.Any): js.Promise[Boolean] = js.native
    /**
      * Changes access rights of all files in the adapter directory
      * @param adapter Name of the adapter instance, e.g. "admin.0". Defaults to the namespace of this adapter.
      * @param path Pattern to match the file path against
      * @param options Mode of the access change as a number or hexadecimal string
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chmodFile(adapter: String, path: String, options: Anon_Mode, callback: ChownFileCallback): Unit = js.native
    def chmodFile(adapter: String, path: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
    def chmodFile(adapter: Null, path: String, options: Anon_Mode, callback: ChownFileCallback): Unit = js.native
    def chmodFile(adapter: Null, path: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
    def chmodFileAsync(adapter: String, path: String, options: Anon_Mode): js.Promise[Anon_Entries] = js.native
    def chmodFileAsync(adapter: String, path: String, options: Record[String, _]): js.Promise[Anon_Entries] = js.native
    def chmodFileAsync(adapter: Null, path: String, options: Anon_Mode): js.Promise[Anon_Entries] = js.native
    def chmodFileAsync(adapter: Null, path: String, options: Record[String, _]): js.Promise[Anon_Entries] = js.native
    /** Creates an object with type channel. It must be located under a device */
    def createChannel(parentDevice: String, channelName: String): Unit = js.native
    def createChannel(parentDevice: String, channelName: String, callback: SetObjectCallback): Unit = js.native
    def createChannel(parentDevice: String, channelName: String, roleOrCommon: String): Unit = js.native
    def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, callback: SetObjectCallback): Unit = js.native
    def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, _]): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: String,
      native: Record[String, _],
      callback: SetObjectCallback
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): Unit = js.native
    def createChannel(parentDevice: String, channelName: String, roleOrCommon: Partial[ChannelCommon]): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      callback: SetObjectCallback
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _]
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _],
      callback: SetObjectCallback
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _],
      options: js.Any
    ): Unit = js.native
    def createChannel(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): Unit = js.native
    /** Creates an object with type channel. It must be located under a device */
    def createChannelAsync(parentDevice: String, channelName: String): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, _]): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: String,
      channelName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: Partial[ChannelCommon]): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _]
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createChannelAsync(
      parentDevice: String,
      channelName: String,
      roleOrCommon: Partial[ChannelCommon],
      native: Record[String, _],
      options: js.Any
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    // ==============================
    // devices and channels
    // tslint:disable:unified-signatures
    /** creates an object with type device */
    def createDevice(deviceName: String): Unit = js.native
    def createDevice(deviceName: String, callback: SetObjectCallback): Unit = js.native
    def createDevice(deviceName: String, common: Partial[ObjectCommon]): Unit = js.native
    def createDevice(deviceName: String, common: Partial[ObjectCommon], callback: SetObjectCallback): Unit = js.native
    def createDevice(deviceName: String, common: Partial[ObjectCommon], native: Record[String, _]): Unit = js.native
    def createDevice(
      deviceName: String,
      common: Partial[ObjectCommon],
      native: Record[String, _],
      callback: SetObjectCallback
    ): Unit = js.native
    def createDevice(deviceName: String, common: Partial[ObjectCommon], native: Record[String, _], options: js.Any): Unit = js.native
    def createDevice(
      deviceName: String,
      common: Partial[ObjectCommon],
      native: Record[String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): Unit = js.native
    /** creates an object with type device */
    def createDeviceAsync(deviceName: String): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(deviceName: String, common: Partial[ObjectCommon]): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(deviceName: String, common: Partial[ObjectCommon], native: Record[String, _]): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createDeviceAsync(deviceName: String, common: Partial[ObjectCommon], native: Record[String, _], options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
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
      native: Record[String, _]
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: String,
      native: Record[String, _],
      callback: SetObjectCallback
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): Unit = js.native
    def createState(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: Partial[StateCommon]): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      callback: SetObjectCallback
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _]
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _],
      callback: SetObjectCallback
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _],
      options: js.Any
    ): Unit = js.native
    def createState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _],
      options: js.Any,
      callback: SetObjectCallback
    ): Unit = js.native
    /**
      * Creates a state and the corresponding object. It must be located in a channel under a device
      */
    def createStateAsync(parentDevice: String, parentChannel: String, stateName: String): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: String): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: String,
      native: Record[String, _]
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: String,
      native: Record[String, _],
      options: js.Any
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: Partial[StateCommon]): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _]
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def createStateAsync(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      roleOrCommon: Partial[StateCommon],
      native: Record[String, _],
      options: js.Any
    ): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def delFile(adapterName: String, path: String, callback: ErrorCallback): Unit = js.native
    def delFile(adapterName: String, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def delFile(adapterName: Null, path: String, callback: ErrorCallback): Unit = js.native
    def delFile(adapterName: Null, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def delFileAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
    def delFileAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
    def delFileAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
    def delFileAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Deletes an object (which might not belong to this adapter) from the object db
      * @param id - The id of the object including namespace
      */
    def delForeignObject(id: String): Unit = js.native
    def delForeignObject(id: String, callback: ErrorCallback): Unit = js.native
    def delForeignObject(id: String, options: js.Any): Unit = js.native
    def delForeignObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes an object (which might not belong to this adapter) from the object db
      * @param id - The id of the object including namespace
      */
    def delForeignObjectAsync(id: String): js.Promise[Unit] = js.native
    def delForeignObjectAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
    /** Deletes a state from the states DB, but not the associated object */
    def delForeignState(id: String): Unit = js.native
    def delForeignState(id: String, callback: ErrorCallback): Unit = js.native
    def delForeignState(id: String, options: js.Any): Unit = js.native
    def delForeignState(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Deletes a state from the states DB, but not the associated object */
    def delForeignStateAsync(id: String): js.Promise[Unit] = js.native
    def delForeignStateAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Deletes an object from the object db
      * @param id - The id of the object without namespace
      */
    def delObject(id: String): Unit = js.native
    def delObject(id: String, callback: ErrorCallback): Unit = js.native
    def delObject(id: String, options: js.Any): Unit = js.native
    def delObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes an object from the object db
      * @param id - The id of the object without namespace
      */
    def delObjectAsync(id: String): js.Promise[Unit] = js.native
    def delObjectAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
    /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
    def delState(id: String): Unit = js.native
    def delState(id: String, callback: ErrorCallback): Unit = js.native
    def delState(id: String, options: js.Any): Unit = js.native
    def delState(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
    def delStateAsync(id: String): js.Promise[Unit] = js.native
    def delStateAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
    /** Deletes a channel and its states. It must have been created with `createChannel` */
    def deleteChannel(channelName: String): Unit = js.native
    def deleteChannel(channelName: String, options: js.Any): Unit = js.native
    def deleteChannel(channelName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def deleteChannel(parentDevice: String, channelName: String): Unit = js.native
    def deleteChannel(parentDevice: String, channelName: String, options: js.Any): Unit = js.native
    def deleteChannel(parentDevice: String, channelName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Deletes a channel and its states. It must have been created with `createChannel` */
    def deleteChannelAsync(channelName: String): js.Promise[Unit] = js.native
    def deleteChannelAsync(channelName: String, options: js.Any): js.Promise[Unit] = js.native
    def deleteChannelAsync(parentDevice: String, channelName: String): js.Promise[Unit] = js.native
    def deleteChannelAsync(parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
    def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String): Unit = js.native
    def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, callback: ErrorCallback): Unit = js.native
    def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, options: js.Any): Unit = js.native
    def deleteChannelFromEnum(
      enumName: String,
      parentDevice: String,
      channelName: String,
      options: js.Any,
      callback: ErrorCallback
    ): Unit = js.native
    def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
    def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
    /** deletes a device, its channels and states */
    def deleteDevice(deviceName: String): Unit = js.native
    def deleteDevice(deviceName: String, callback: ErrorCallback): Unit = js.native
    def deleteDevice(deviceName: String, options: js.Any): Unit = js.native
    def deleteDevice(deviceName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** deletes a device, its channels and states */
    def deleteDeviceAsync(deviceName: String): js.Promise[Unit] = js.native
    def deleteDeviceAsync(deviceName: String, options: js.Any): js.Promise[Unit] = js.native
    def deleteState(parentChannel: String, stateName: String): Unit = js.native
    def deleteState(parentChannel: String, stateName: String, options: js.Any): Unit = js.native
    def deleteState(parentChannel: String, stateName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def deleteState(parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
    def deleteState(parentDevice: String, parentChannel: String, stateName: String, options: js.Any): Unit = js.native
    def deleteState(
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      options: js.Any,
      callback: ErrorCallback
    ): Unit = js.native
    /** Deletes a state. It must have been created with `createState` */
    def deleteState(stateName: String): Unit = js.native
    def deleteState(stateName: String, options: js.Any): Unit = js.native
    def deleteState(stateName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def deleteStateAsync(parentChannel: String, stateName: String): js.Promise[Unit] = js.native
    def deleteStateAsync(parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
    def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
    def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
    /** Deletes a state. It must have been created with `createState` */
    def deleteStateAsync(stateName: String): js.Promise[Unit] = js.native
    def deleteStateAsync(stateName: String, options: js.Any): js.Promise[Unit] = js.native
    def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
    def deleteStateFromEnum(
      enumName: String,
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      callback: ErrorCallback
    ): Unit = js.native
    def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: js.Any): Unit = js.native
    def deleteStateFromEnum(
      enumName: String,
      parentDevice: String,
      parentChannel: String,
      stateName: String,
      options: js.Any,
      callback: ErrorCallback
    ): Unit = js.native
    def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
    def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Disables and stops the adapter instance.
      * It is recommended that you leave the current method (e.g. by using `return`) after calling this.
      */
    def disable(): Unit = js.native
    /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
    def extendForeignObject(id: String, objPart: PartialObject): Unit = js.native
    def extendForeignObject(id: String, objPart: PartialObject, callback: SetObjectCallback): Unit = js.native
    def extendForeignObject(id: String, objPart: PartialObject, options: js.Any): Unit = js.native
    def extendForeignObject(id: String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
    def extendForeignObjectAsync(id: String, objPart: PartialObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def extendForeignObjectAsync(id: String, objPart: PartialObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Extend an object and create it if it might not exist */
    def extendObject(id: String, objPart: PartialObject): Unit = js.native
    def extendObject(id: String, objPart: PartialObject, callback: SetObjectCallback): Unit = js.native
    def extendObject(id: String, objPart: PartialObject, options: js.Any): Unit = js.native
    def extendObject(id: String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Extend an object and create it if it might not exist */
    def extendObjectAsync(id: String, objPart: PartialObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def extendObjectAsync(id: String, objPart: PartialObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /**
      * Finds an object by its ID or name
      * @param type - common.type of the state
      */
    def findForeignObject(idOrName: String, `type`: String, callback: FindObjectCallback): Unit = js.native
    def findForeignObject(idOrName: String, `type`: String, options: js.Any, callback: FindObjectCallback): Unit = js.native
    /**
      * Finds an object by its ID or name
      * @param type - common.type of the state
      */
    def findForeignObjectAsync(idOrName: String, `type`: String): js.Promise[Anon_Id] = js.native
    def formatDate(dateObj: String, format: String): String = js.native
    def formatDate(dateObj: String, isDuration: String, format: String): String = js.native
    def formatDate(dateObj: String, isDuration: Boolean, format: String): String = js.native
    def formatDate(dateObj: Double, format: String): String = js.native
    def formatDate(dateObj: Double, isDuration: String, format: String): String = js.native
    def formatDate(dateObj: Double, isDuration: Boolean, format: String): String = js.native
    def formatDate(dateObj: Date, format: String): String = js.native
    def formatDate(dateObj: Date, isDuration: String, format: String): String = js.native
    def formatDate(dateObj: Date, isDuration: Boolean, format: String): String = js.native
    def formatValue(value: String, decimals: Double, format: js.Any): String = js.native
    def formatValue(value: String, format: js.Any): String = js.native
    def formatValue(value: Double, decimals: Double, format: js.Any): String = js.native
    // ==============================
    // formatting
    def formatValue(value: Double, format: js.Any): String = js.native
    /** Get all states, channels and devices of this adapter */
    def getAdapterObjects(callback: js.Function1[/* objects */ Record[String, Object], Unit]): Unit = js.native
    /** Get all states, channels and devices of this adapter */
    def getAdapterObjectsAsync(): js.Promise[Record[String, Object]] = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
    def getBinaryState(id: String, options: js.Any, callback: GetBinaryStateCallback): Unit = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param options (optional) Some internal options.
      */
    def getBinaryStateAsync(id: String): js.Promise[CallbackReturnTypeOf[GetBinaryStateCallback]] = js.native
    def getBinaryStateAsync(id: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetBinaryStateCallback]] = js.native
    /** Returns SSL certificates by name (private key, public cert and chained certificate) for creation of HTTPS servers */
    def getCertificates(
      publicName: String,
      privateName: String,
      chainedName: String,
      callback: js.Function3[
          /* err */ String | Null, 
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
    def getChannels(parentDevice: String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
    /**
      * Returns a list of all channels in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getChannelsOf(callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
    def getChannelsOf(parentDevice: String, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
    def getChannelsOf(parentDevice: String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
    /**
      * Returns a list of all channels in this adapter instance
      * @param parentDevice (optional) Name of the parent device to filter the channels by
      * @param options (optional) Some internal options.
      */
    def getChannelsOfAsync(): js.Promise[js.Array[ChannelObject]] = js.native
    // tslint:disable-next-line:unified-signatures
    def getChannelsOfAsync(parentDevice: String): js.Promise[js.Array[ChannelObject]] = js.native
    def getChannelsOfAsync(parentDevice: String, options: js.Any): js.Promise[js.Array[ChannelObject]] = js.native
    // tslint:enable:unified-signatures
    /**
      * Returns a list of all devices in this adapter instance
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getDevices(callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
    def getDevices(options: js.Any, callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
    /**
      * Returns a list of all devices in this adapter instance
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getDevicesAsync(): js.Promise[js.Array[DeviceObject]] = js.native
    def getDevicesAsync(options: js.Any): js.Promise[js.Array[DeviceObject]] = js.native
    // ==============================
    // enums
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnum(callback: GetEnumCallback): Unit = js.native
    def getEnum(name: String, callback: GetEnumCallback): Unit = js.native
    def getEnum(name: String, options: js.Any, callback: GetEnumCallback): Unit = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnumAsync(name: String): js.Promise[Anon_RequestEnum] = js.native
    def getEnumAsync(name: String, options: js.Any): js.Promise[Anon_RequestEnum] = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnums(callback: GetEnumsCallback): Unit = js.native
    def getEnums(enumList: EnumList, callback: GetEnumsCallback): Unit = js.native
    def getEnums(enumList: EnumList, options: js.Any, callback: GetEnumsCallback): Unit = js.native
    /** Returns the enum tree, filtered by the optional enum name */
    def getEnumsAsync(enumList: EnumList): js.Promise[NonNullCallbackReturnTypeOf[GetEnumsCallback]] = js.native
    def getEnumsAsync(enumList: EnumList, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[GetEnumsCallback]] = js.native
    // ==============================
    // foreign objects
    /** Reads an object (which might not belong to this adapter) from the object db */
    def getForeignObject(id: String, callback: GetObjectCallback): Unit = js.native
    def getForeignObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
    /** Reads an object (which might not belong to this adapter) from the object db */
    def getForeignObjectAsync(id: String): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    def getForeignObjectAsync(id: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    /** Get foreign objects by pattern, by specific type and resolve their enums. */
    // tslint:disable:unified-signatures
    def getForeignObjects(pattern: String, callback: GetObjectsCallback): Unit = js.native
    def getForeignObjects(pattern: String, options: js.Any, callback: GetObjectsCallback): Unit = js.native
    def getForeignObjects(pattern: String, `type`: ObjectType, callback: GetObjectsCallback): Unit = js.native
    def getForeignObjects(pattern: String, `type`: ObjectType, enums: EnumList, callback: GetObjectsCallback): Unit = js.native
    def getForeignObjects(
      pattern: String,
      `type`: ObjectType,
      enums: EnumList,
      options: js.Any,
      callback: GetObjectsCallback
    ): Unit = js.native
    def getForeignObjects(pattern: String, `type`: ObjectType, options: js.Any, callback: GetObjectsCallback): Unit = js.native
    // tslint:enable:unified-signatures
    /** Get foreign objects by pattern, by specific type and resolve their enums. */
    def getForeignObjectsAsync(pattern: String): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: String, `type`: ObjectType): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: String, `type`: ObjectType, enums: EnumList): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: String, `type`: ObjectType, enums: EnumList, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    def getForeignObjectsAsync(pattern: String, `type`: ObjectType, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectsCallback]] = js.native
    /** Read a value (which might not belong to this adapter) from the states DB. */
    def getForeignState(id: String, callback: GetStateCallback): Unit = js.native
    def getForeignState(id: String, options: js.Any, callback: GetStateCallback): Unit = js.native
    /** Read a value (which might not belong to this adapter) from the states DB. */
    def getForeignStateAsync(id: String): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    def getForeignStateAsync(id: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    /** Read all states (which might not belong to this adapter) which match the given pattern */
    def getForeignStates(pattern: String, callback: GetStatesCallback): Unit = js.native
    def getForeignStates(pattern: String, options: js.Any, callback: GetStatesCallback): Unit = js.native
    /** Read all states (which might not belong to this adapter) which match the given pattern */
    def getForeignStatesAsync(pattern: String): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getForeignStatesAsync(pattern: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getHistory(id: String, options: GetHistoryOptions, callback: GetHistoryCallback): Unit = js.native
    // ==============================
    // own objects
    /** Reads an object from the object db */
    def getObject(id: String, callback: GetObjectCallback): Unit = js.native
    def getObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
    /** Reads an object from the object db */
    def getObjectAsync(id: String): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    def getObjectAsync(id: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetObjectCallback]] = js.native
    /*	===============================
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
    def getState(id: String, options: js.Any, callback: GetStateCallback): Unit = js.native
    /** Read a value from the states DB. */
    def getStateAsync(id: String): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    def getStateAsync(id: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStateCallback]] = js.native
    /** Read all states of this adapter which match the given pattern */
    def getStates(pattern: String, callback: GetStatesCallback): Unit = js.native
    def getStates(pattern: String, options: js.Any, callback: GetStatesCallback): Unit = js.native
    /** Read all states of this adapter which match the given pattern */
    def getStatesAsync(pattern: String): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
    def getStatesAsync(pattern: String, options: js.Any): js.Promise[CallbackReturnTypeOf[GetStatesCallback]] = js.native
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
      options: js.Any,
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
    def getStatesOfAsync(parentDevice: String, parentChannel: String, options: js.Any): js.Promise[js.Array[StateObject]] = js.native
    /** Convert ID to {device: D, channel: C, state: S} */
    def idToDCS(id: String): Anon_Channel = js.native
    def mkDir(adapterName: String, path: String, callback: ErrorCallback): Unit = js.native
    def mkDir(adapterName: String, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def mkDir(adapterName: Null, path: String, callback: ErrorCallback): Unit = js.native
    def mkDir(adapterName: Null, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def mkDirAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
    def mkDirAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
    def mkDirAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
    def mkDirAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
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
    // tslint:enable:unified-signatures
    // ==============================
    // filesystem
    /**
      * reads the content of directory from DB for given adapter and path
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def readDir(adapterName: String, path: String, callback: ReadDirCallback): Unit = js.native
    def readDir(adapterName: String, path: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
    def readDir(adapterName: Null, path: String, callback: ReadDirCallback): Unit = js.native
    def readDir(adapterName: Null, path: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
    /**
      * reads the content of directory from DB for given adapter and path
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def readDirAsync(adapterName: String, path: String): js.Promise[NonNullCallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: String, path: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: Null, path: String): js.Promise[NonNullCallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readDirAsync(adapterName: Null, path: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[ReadDirCallback]] = js.native
    def readFile(adapterName: String, path: String, callback: ReadFileCallback): Unit = js.native
    def readFile(adapterName: String, path: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
    def readFile(adapterName: Null, path: String, callback: ReadFileCallback): Unit = js.native
    def readFile(adapterName: Null, path: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
    def readFileAsync(adapterName: String, path: String): js.Promise[Anon_File] = js.native
    def readFileAsync(adapterName: String, path: String, options: js.Any): js.Promise[Anon_File] = js.native
    def readFileAsync(adapterName: Null, path: String): js.Promise[Anon_File] = js.native
    def readFileAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Anon_File] = js.native
    def removeAllListeners(): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_message(event: message): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_objectChange(event: objectChange): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_ready(event: ready): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_stateChange(event: stateChange): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_unload(event: unload): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, handler: MessageHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_objectChange(event: objectChange, handler: ObjectChangeHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, handler: ReadyHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_stateChange(event: stateChange, handler: StateChangeHandler): this.type = js.native
    @JSName("removeListener")
    def removeListener_unload(event: unload, handler: UnloadHandler): this.type = js.native
    def rename(adapterName: String, oldName: String, newName: String, callback: ErrorCallback): Unit = js.native
    def rename(adapterName: String, oldName: String, newName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def rename(adapterName: Null, oldName: String, newName: String, callback: ErrorCallback): Unit = js.native
    def rename(adapterName: Null, oldName: String, newName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def renameAsync(adapterName: String, oldName: String, newName: String): js.Promise[Unit] = js.native
    def renameAsync(adapterName: String, oldName: String, newName: String, options: js.Any): js.Promise[Unit] = js.native
    def renameAsync(adapterName: Null, oldName: String, newName: String): js.Promise[Unit] = js.native
    def renameAsync(adapterName: Null, oldName: String, newName: String, options: js.Any): js.Promise[Unit] = js.native
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
    def setBinaryState(id: String, binary: Buffer, callback: SetStateCallback): Unit = js.native
    def setBinaryState(id: String, binary: Buffer, options: js.Any, callback: SetStateCallback): Unit = js.native
    /**
      * Writes a binary state into Redis
      * @param id The id of the state
      * @param binary The data to be written
      * @param options (optional) Some internal options.
      */
    def setBinaryStateAsync(id: String, binary: Buffer): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setBinaryStateAsync(id: String, binary: Buffer, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
    def setForeignObject(id: String, obj: SettableObject): Unit = js.native
    def setForeignObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setForeignObject(id: String, obj: SettableObject, options: js.Any): Unit = js.native
    def setForeignObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
    def setForeignObjectAsync(id: String, obj: SettableObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setForeignObjectAsync(id: String, obj: SettableObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
    def setForeignObjectNotExists(id: String, obj: SettableObject): Unit = js.native
    def setForeignObjectNotExists(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setForeignObjectNotExists(id: String, obj: SettableObject, options: js.Any): Unit = js.native
    def setForeignObjectNotExists(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
    def setForeignObjectNotExistsAsync(id: String, obj: SettableObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setForeignObjectNotExistsAsync(id: String, obj: SettableObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB. */
    def setForeignState(id: String, state: String): Unit = js.native
    def setForeignState(id: String, state: String, ack: Boolean): Unit = js.native
    def setForeignState(id: String, state: String, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: String, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: String, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: String, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Boolean): Unit = js.native
    def setForeignState(id: String, state: Boolean, ack: Boolean): Unit = js.native
    def setForeignState(id: String, state: Boolean, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Double): Unit = js.native
    def setForeignState(id: String, state: Double, ack: Boolean): Unit = js.native
    def setForeignState(id: String, state: Double, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Double, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Double, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: State): Unit = js.native
    def setForeignState(id: String, state: State, ack: Boolean): Unit = js.native
    def setForeignState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: State, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: State, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: State, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Partial[State]): Unit = js.native
    def setForeignState(id: String, state: Partial[State], ack: Boolean): Unit = js.native
    def setForeignState(id: String, state: Partial[State], ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Partial[State], ack: Boolean, options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Partial[State], ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Partial[State], callback: SetStateCallback): Unit = js.native
    def setForeignState(id: String, state: Partial[State], options: js.Any): Unit = js.native
    def setForeignState(id: String, state: Partial[State], options: js.Any, callback: SetStateCallback): Unit = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB. */
    def setForeignStateAsync(id: String, state: String): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: String, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: String, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Boolean, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Double): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Double, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Double, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Double, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: State): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: State, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: State, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: State, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Partial[State]): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Partial[State], ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Partial[State], ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setForeignStateAsync(id: String, state: Partial[State], options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
    def setForeignStateChanged(id: String, state: String): Unit = js.native
    def setForeignStateChanged(id: String, state: String, ack: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: String, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: String, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: String, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: String, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, ack: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Double): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, ack: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: Double, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: State): Unit = js.native
    def setForeignStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: State, options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: State, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State]): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], ack: Boolean): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], ack: Boolean, options: js.Any): Unit = js.native
    def setForeignStateChanged(
      id: String,
      state: Partial[State],
      ack: Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], callback: SetStateChangedCallback): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], options: js.Any): Unit = js.native
    def setForeignStateChanged(id: String, state: Partial[State], options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
    def setForeignStateChangedAsync(id: String, state: String): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: String, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: String, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Boolean, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Double): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Double, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Double, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Double, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: State): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: State, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: State, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: State, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Partial[State]): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Partial[State], ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Partial[State], ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setForeignStateChangedAsync(id: String, state: Partial[State], options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Creates or overwrites an object in the object db */
    def setObject(id: String, obj: SettableObject): Unit = js.native
    def setObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setObject(id: String, obj: SettableObject, options: js.Any): Unit = js.native
    def setObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Creates or overwrites an object in the object db */
    def setObjectAsync(id: String, obj: SettableObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setObjectAsync(id: String, obj: SettableObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Creates an object in the object db. Existing objects are not overwritten. */
    def setObjectNotExists(id: String, obj: SettableObject): Unit = js.native
    def setObjectNotExists(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setObjectNotExists(id: String, obj: SettableObject, options: js.Any): Unit = js.native
    def setObjectNotExists(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /** Creates an object in the object db. Existing objects are not overwritten. */
    def setObjectNotExistsAsync(id: String, obj: SettableObject): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    def setObjectNotExistsAsync(id: String, obj: SettableObject, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]] = js.native
    /** Sets a new password for the given user */
    def setPassword(user: String, password: String): Unit = js.native
    def setPassword(user: String, password: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def setPassword(user: String, password: String, options: js.Any): Unit = js.native
    def setPassword(
      user: String,
      password: String,
      options: js.Any,
      callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    /** Sets a new password for the given user */
    def setPasswordAsync(user: String, password: String): js.Promise[Unit] = js.native
    def setPasswordAsync(user: String, password: String, options: js.Any): js.Promise[Unit] = js.native
    // ==============================
    // states
    // Multiple signatures help understanding what the parameters are about
    /** Writes a value into the states DB. */
    // tslint:disable:unified-signatures
    def setState(id: String, state: String): Unit = js.native
    def setState(id: String, state: String, ack: Boolean): Unit = js.native
    def setState(id: String, state: String, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: String, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: String, options: js.Any): Unit = js.native
    def setState(id: String, state: String, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Boolean): Unit = js.native
    def setState(id: String, state: Boolean, ack: Boolean): Unit = js.native
    def setState(id: String, state: Boolean, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Double): Unit = js.native
    def setState(id: String, state: Double, ack: Boolean): Unit = js.native
    def setState(id: String, state: Double, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Double, options: js.Any): Unit = js.native
    def setState(id: String, state: Double, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: State): Unit = js.native
    def setState(id: String, state: State, ack: Boolean): Unit = js.native
    def setState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: State, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: State, options: js.Any): Unit = js.native
    def setState(id: String, state: State, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Partial[State]): Unit = js.native
    def setState(id: String, state: Partial[State], ack: Boolean): Unit = js.native
    def setState(id: String, state: Partial[State], ack: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Partial[State], ack: Boolean, options: js.Any): Unit = js.native
    def setState(id: String, state: Partial[State], ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Partial[State], callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Partial[State], options: js.Any): Unit = js.native
    def setState(id: String, state: Partial[State], options: js.Any, callback: SetStateCallback): Unit = js.native
    /** Writes a value into the states DB. */
    def setStateAsync(id: String, state: String): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: String, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: String, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Boolean, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Double): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Double, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Double, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Double, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: State): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: State, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: State, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: State, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Partial[State]): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Partial[State], ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Partial[State], ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    def setStateAsync(id: String, state: Partial[State], options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]] = js.native
    /** Writes a value into the states DB only if it has changed. */
    def setStateChanged(id: String, state: String): Unit = js.native
    def setStateChanged(id: String, state: String, ack: Boolean): Unit = js.native
    def setStateChanged(id: String, state: String, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: String, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: String, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: String, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Boolean): Unit = js.native
    def setStateChanged(id: String, state: Boolean, ack: Boolean): Unit = js.native
    def setStateChanged(id: String, state: Boolean, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Double): Unit = js.native
    def setStateChanged(id: String, state: Double, ack: Boolean): Unit = js.native
    def setStateChanged(id: String, state: Double, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Double, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Double, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: Double, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: State): Unit = js.native
    def setStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
    def setStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: State, options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: State, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Partial[State]): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], ack: Boolean): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], ack: Boolean, options: js.Any): Unit = js.native
    def setStateChanged(
      id: String,
      state: Partial[State],
      ack: Boolean,
      options: js.Any,
      callback: SetStateChangedCallback
    ): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], callback: SetStateChangedCallback): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], options: js.Any): Unit = js.native
    def setStateChanged(id: String, state: Partial[State], options: js.Any, callback: SetStateChangedCallback): Unit = js.native
    /** Writes a value into the states DB only if it has changed. */
    def setStateChangedAsync(id: String, state: String): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: String, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: String, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: String, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Boolean, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Double): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Double, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Double, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Double, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: State): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: State, ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: State, ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: State, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Partial[State]): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Partial[State], ack: Boolean): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Partial[State], ack: Boolean, options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    def setStateChangedAsync(id: String, state: Partial[State], options: js.Any): js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]] = js.native
    /** Subscribe to changes of objects (which might not belong to this adapter) */
    def subscribeForeignObjects(pattern: String): Unit = js.native
    def subscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
    def subscribeForeignObjects(pattern: String, options: js.Any): Unit = js.native
    def subscribeForeignObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Subscribe to changes of objects (which might not belong to this adapter) */
    def subscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
    def subscribeForeignObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /** Subscribe to changes of states (which might not belong to this adapter) */
    def subscribeForeignStates(pattern: String): Unit = js.native
    def subscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
    def subscribeForeignStates(pattern: String, options: js.Any): Unit = js.native
    def subscribeForeignStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Subscribe to changes of states (which might not belong to this adapter) */
    def subscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
    def subscribeForeignStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    // ==============================
    // subscriptions
    /** Subscribe to changes of objects in this instance */
    def subscribeObjects(pattern: String): Unit = js.native
    def subscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
    def subscribeObjects(pattern: String, options: js.Any): Unit = js.native
    def subscribeObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Subscribe to changes of objects in this instance */
    def subscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
    def subscribeObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /** Subscribe to changes of states in this instance */
    def subscribeStates(pattern: String): Unit = js.native
    def subscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
    def subscribeStates(pattern: String, options: js.Any): Unit = js.native
    def subscribeStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Subscribe to changes of states in this instance */
    def subscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
    def subscribeStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    // TODO: getCertificates cannot be represented with promises right now
    /**
      * Terminates the adapter execution but does not disable the adapter
      * @param reason (optional) A message to print into the log prior to termination
      * @param exitCode (optional) The exit code to use for termination
      */
    def terminate(): scala.Nothing = js.native
    def terminate(exitCode: Double): scala.Nothing = js.native
    def terminate(reason: String): scala.Nothing = js.native
    def terminate(reason: String, exitCode: Double): scala.Nothing = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def unlink(adapterName: String, path: String, callback: ErrorCallback): Unit = js.native
    def unlink(adapterName: String, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def unlink(adapterName: Null, path: String, callback: ErrorCallback): Unit = js.native
    def unlink(adapterName: Null, path: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes a given file
      * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
      * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
      */
    def unlinkAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
    def unlinkAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
    def unlinkAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
    def unlinkAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
    /** Unsubscribe from changes of objects (which might not belong to this adapter) */
    def unsubscribeForeignObjects(pattern: String): Unit = js.native
    def unsubscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
    def unsubscribeForeignObjects(pattern: String, options: js.Any): Unit = js.native
    def unsubscribeForeignObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Unsubscribe from changes of objects (which might not belong to this adapter) */
    def unsubscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
    def unsubscribeForeignObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Subscribe from changes of states (which might not belong to this adapter)
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeForeignStates(pattern: String): Unit = js.native
    def unsubscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
    def unsubscribeForeignStates(pattern: String, options: js.Any): Unit = js.native
    def unsubscribeForeignStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Subscribe from changes of states (which might not belong to this adapter)
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
    def unsubscribeForeignStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /** Unsubscribe from changes of objects in this instance */
    def unsubscribeObjects(pattern: String): Unit = js.native
    def unsubscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
    def unsubscribeObjects(pattern: String, options: js.Any): Unit = js.native
    def unsubscribeObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /** Unsubscribe from changes of objects in this instance */
    def unsubscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
    def unsubscribeObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Subscribe from changes of states in this instance
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeStates(pattern: String): Unit = js.native
    def unsubscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
    def unsubscribeStates(pattern: String, options: js.Any): Unit = js.native
    def unsubscribeStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Subscribe from changes of states in this instance
      * @param pattern - Must match the pattern used to subscribe
      */
    def unsubscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
    def unsubscribeStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Updates the adapter config with new values. Only a subset of the configuration has to be provided,
      * since merging with the existing config is done automatically.
      *
      * After updating the configuration, the adapter is automatically restarted. It is recommended that you
      * leave the current method (e.g. by using `return`) after calling this.
      *
      * @param newConfig The new config values to be stored
      */
    def updateConfig(newConfig: Partial[AdapterConfig]): Unit = js.native
    def writeFile(adapterName: String, path: String, data: String, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: String, path: String, data: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: String, path: String, data: Buffer, callback: ErrorCallback): Unit = js.native
    // options see https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/objects/objectsInMemServer.js#L599
    def writeFile(adapterName: String, path: String, data: Buffer, options: js.Any, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: Null, path: String, data: String, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: Null, path: String, data: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: Null, path: String, data: Buffer, callback: ErrorCallback): Unit = js.native
    def writeFile(adapterName: Null, path: String, data: Buffer, options: js.Any, callback: ErrorCallback): Unit = js.native
    def writeFileAsync(adapterName: String, path: String, data: String): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: String, path: String, data: String, options: js.Any): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: String, path: String, data: Buffer): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: String, path: String, data: Buffer, options: js.Any): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: Null, path: String, data: String): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: Null, path: String, data: String, options: js.Any): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: Null, path: String, data: Buffer): js.Promise[Unit] = js.native
    def writeFileAsync(adapterName: Null, path: String, data: Buffer, options: js.Any): js.Promise[Unit] = js.native
  }
  
  // end interface AdapterOptions
  // tslint:disable-next-line:no-empty-interface
  trait AdapterConfig extends js.Object
  
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
    /** Will be called when the adapter is intialized */
    var ready: js.UndefOr[ReadyHandler] = js.undefined
    /** Handler for changes of subscribed states */
    var stateChange: js.UndefOr[StateChangeHandler] = js.undefined
    /** if the global system config should be included in the created object. Default: false */
    var systemConfig: js.UndefOr[Boolean] = js.undefined
    /** Will be called on adapter termination */
    var unload: js.UndefOr[UnloadHandler] = js.undefined
    /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
    var useFormatDate: js.UndefOr[Boolean] = js.undefined
  }
  
  trait BaseObject extends js.Object {
    /** The ID of this object */
    var _id: String
    var acl: js.UndefOr[ObjectACL] = js.undefined
     // specified in the derived interfaces
    var common: StateCommon | ChannelCommon | DeviceCommon | OtherCommon
    var enums: js.UndefOr[Record[String, String]] = js.undefined
    var native: Record[String, _]
    var `type`: String
  }
  
  trait Certificates extends js.Object {
    /** chained CA certificates */
    var ca: js.Array[String | Buffer]
    /** public certificate */
    var cert: String | Buffer
    /** private key file */
    var key: String | Buffer
  }
  
  trait ChannelCommon extends ObjectCommon {
    // Only states can have common.custom
    var custom: js.UndefOr[scala.Nothing] = js.undefined
    /** description of this channel */
    var desc: js.UndefOr[String] = js.undefined
  }
  
  trait ChannelObject
    extends BaseObject
       with Object {
    @JSName("common")
    var common_ChannelObject: ChannelCommon
    @JSName("type")
    var type_ChannelObject: channel
  }
  
  /** Contains the return values of chownFile */
  trait ChownFileResult extends js.Object {
    /** Access rights */
    var acl: FileACL
    /** Date of creation */
    var createdAt: Double
    /** Name of the file or directory */
    var file: String
    /** Whether this is a directory or a file */
    var isDir: Boolean
    /** Date of last modification */
    var modifiedAt: Double
    /** The parent directory of the processed file or directory */
    var path: String
    /** File system stats */
    var stats: Stats
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.number
    - typings.iobroker.iobrokerStrings.string
    - typings.iobroker.iobrokerStrings.boolean
    - typings.iobroker.iobrokerStrings.array
    - typings.iobroker.iobrokerStrings.`object`
    - typings.iobroker.iobrokerStrings.mixed
    - typings.iobroker.iobrokerStrings.file
  */
  trait CommonType extends js.Object
  
  trait DeviceCommon extends ObjectCommon {
    // Only states can have common.custom
    var custom: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait DeviceObject
    extends BaseObject
       with Object {
    @JSName("common")
    var common_DeviceObject: DeviceCommon
    @JSName("type")
    var type_DeviceObject: device
  }
  
  trait DirectoryEntry extends js.Object {
    var acl: js.Any
    var createdAt: Double
    var file: String
    var isDir: Boolean
     // access control list object
    var modifiedAt: Double
    var stats: Stats
  }
  
  /** Defines access rights for a single file, applied to a user or group */
  trait EvaluatedFileACL extends FileACL {
    /** Whether the user may read the file */
    var read: Boolean
    /** Whether the user may write the file */
    var write: Boolean
  }
  
  /** Defines access rights for a single file */
  trait FileACL extends js.Object {
    /** Full name of the user who owns this file, e.g. "system.user.admin" */
    var owner: String
    /** Full name of the group who owns this file, e.g. "system.group.administrator" */
    var ownerGroup: String
    /** Linux-type permissions defining access to this file */
    var permissions: Double
  }
  
  trait GetHistoryOptions extends js.Object {
    var ack: js.UndefOr[Boolean] = js.undefined
    var addID: js.UndefOr[Boolean] = js.undefined
    var aggregate: js.UndefOr[minmax | min | max | average | total | count | none] = js.undefined
    var count: js.UndefOr[Double] = js.undefined
    var end: js.UndefOr[Double] = js.undefined
    var from: js.UndefOr[Boolean] = js.undefined
    var ignoreNull: js.UndefOr[Boolean] = js.undefined
    var instance: js.UndefOr[String] = js.undefined
    var limit: js.UndefOr[Double] = js.undefined
    var q: js.UndefOr[Boolean] = js.undefined
    var sessionId: js.UndefOr[js.Any] = js.undefined
    var start: js.UndefOr[Double] = js.undefined
    var step: js.UndefOr[Double] = js.undefined
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
    var include_docs: Boolean
  }
  
  trait GetObjectViewItem extends js.Object {
    /** The ID of this object */
    var id: String
    /** A copy of the object from the DB or some aggregation result */
    var value: Object | js.Any
  }
  
  /** Parameters for @link{Objects.getObjectView} */
  trait GetObjectViewParams extends js.Object {
    /** Last id to include in the return list */
    var endkey: String
    /** First id to include in the return list */
    var startkey: String
  }
  
  trait GetObjectsItem[T /* <: BaseObject */] extends js.Object {
    /** The ID of this object */
    var id: String
    /** A copy of the object from the DB */
    var value: T
  }
  
  // end interface Objects
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.silly
    - typings.iobroker.iobrokerStrings.debug
    - typings.iobroker.iobrokerStrings.info
    - typings.iobroker.iobrokerStrings.warn
    - typings.iobroker.iobrokerStrings.error
  */
  trait LogLevel extends js.Object
  
  trait Logger extends js.Object {
    /** Verbosity of the log output */
    var level: LogLevel
    /** log message with debug level */
    def debug(message: String): Unit
    /** log message with error severity */
    def error(message: String): Unit
    /** log message with info level (default output level for all adapters) */
    def info(message: String): Unit
    /** log message with silly level */
    def silly(message: String): Unit
    /** log message with warning severity */
    def warn(message: String): Unit
  }
  
  /** A message being passed between adapter instances */
  trait Message extends js.Object {
    /** ID of this message */
    var _id: Double
    /** Callback information. This is set when the source expects a response */
    var callback: MessageCallbackInfo
    /** The command to be executed */
    var command: String
    /** The source of this message */
    var from: String
    /** The message payload */
    var message: MessagePayload
  }
  
  /** Callback information for a passed message */
  trait MessageCallbackInfo extends js.Object {
    // ???
    var ack: Boolean
    /** ID of this callback */
    var id: Double
    /** The original message payload */
    var message: MessagePayload
    /** Timestamp of this message */
    var time: Double
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.ChannelObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.DeviceObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.OtherObject
  */
  trait Object extends js.Object
  
  /** Defines access rights for a single object */
  trait ObjectACL extends js.Object {
    /** Linux-type permissions defining access to this object */
    var `object`: Double
    /** Full name of the user who owns this object, e.g. "system.user.admin" */
    var owner: String
    /** Full name of the group who owns this object, e.g. "system.group.administrator" */
    var ownerGroup: String
  }
  
  // Maybe this should extend Record<string, any>,
  // but the extra properties aren't defined anywhere,
  // so I'd rather force the user to explicitly state
  // he knows what he's doing by casting to any
  trait ObjectCommon extends js.Object {
    // Icon and role aren't defined in SCHEMA.md,
    // but they are being used by some adapters
    /** Icon for this object */
    var icon: js.UndefOr[String] = js.undefined
    /** name of this object */
    var name: String
    /** role of the object */
    var role: js.UndefOr[String] = js.undefined
  }
  
  /** Defines access rights for a single object type */
  trait ObjectOperationPermissions extends js.Object {
    /** Whether a user may create objects of this type */
    var create: Boolean
    /** Whether a user may delete objects of this type */
    var delete: Boolean
    /** Whether a user may enumerate objects of this type */
    var list: Boolean
    /** Whether a user may read objects of this type */
    var read: Boolean
    /** Whether a user may write objects of this type */
    var write: Boolean
  }
  
  trait ObjectOrStatePermission extends Permission {
    @JSName("operation")
    var operation_ObjectOrStatePermission: list | read | write | create | delete
    @JSName("type")
    var type_ObjectOrStatePermission: `object` | file | users | state
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.state
    - typings.iobroker.iobrokerStrings.channel
    - typings.iobroker.iobrokerStrings.device
  */
  trait ObjectType extends js.Object
  
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
    def chmodFile(id: String, name: String, options: Anon_Mode, callback: ChownFileCallback): Unit = js.native
    def chmodFile(id: String, name: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
    /**
      * Changes access rights of all objects matching <pattern>
      * @param pattern Pattern to match against
      * @param options Mode of the access change as a number or hexadecimal string
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chmodObject(pattern: String, callback: ChownObjectCallback): Unit = js.native
    def chmodObject(pattern: String, options: js.Any, callback: ChownObjectCallback): Unit = js.native
    /**
      * Takes possession all files in the root directory matching <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chownFile(id: String, name: String, callback: ChownFileCallback): Unit = js.native
    def chownFile(id: String, name: String, options: js.Any, callback: ChownFileCallback): Unit = js.native
    /**
      * Takes possession of all objects matching <pattern>
      * @param pattern Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def chownObject(pattern: String, callback: ChownObjectCallback): Unit = js.native
    def chownObject(pattern: String, options: js.Any, callback: ChownObjectCallback): Unit = js.native
    /**
      * Deletes an object in the object db
      * @param id ID of the object
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delConfig(id: String, callback: ErrorCallback): Unit = js.native
    def delConfig(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delFile(id: String, name: String, callback: ErrorCallback): Unit = js.native
    def delFile(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes an object in the object db
      * @param id ID of the object
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delObject(id: String, callback: ErrorCallback): Unit = js.native
    def delObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    // I'd rather not document a function with the name "destroyDB"
    /** Destructor of the class. Call this before shutting down. */
    def destroy(): Unit = js.native
    /**
      * Extends an object in the object db with new properties
      * @param id ID of the object
      * @param obj Object to extend the original one with. May be just parts of an object.
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def extendObject(id: String, obj: PartialObject, callback: ExtendObjectCallback): Unit = js.native
    def extendObject(id: String, obj: PartialObject, options: js.Any, callback: ExtendObjectCallback): Unit = js.native
    def findObject(idOrName: String, `type`: Null, callback: FindObjectCallback): Unit = js.native
    def findObject(idOrName: String, `type`: Null, options: js.Any, callback: FindObjectCallback): Unit = js.native
    /**
      * Finds an object by ID or name. If multiple objects were found, return the first one
      * @param idOrName ID or name of the object
      * @param type If != null, only return an object with a common.type equal to this
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def findObject(idOrName: String, `type`: CommonType, callback: FindObjectCallback): Unit = js.native
    def findObject(idOrName: String, `type`: CommonType, options: js.Any, callback: FindObjectCallback): Unit = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getConfig(id: String, callback: GetObjectCallback): Unit = js.native
    def getConfig(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
    /**
      * Returns a list of config keys matching <pattern>
      * @param pattern Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
    def getConfigKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
    def getConfigKeys(pattern: String, options: js.Any, callback: GetConfigKeysCallback): Unit = js.native
    def getConfigKeys(pattern: String, options: js.Any, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
    def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
    def getConfigs(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2): Unit = js.native
    def getConfigs(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
    /**
      * Determines the mime type for a given file extension
      * @param ext File extension, including the leading dot, e.g. ".zip"
      */
    def getMimeType(ext: String): Anon_IsBinary = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getObject(id: String, callback: GetObjectCallback): Unit = js.native
    def getObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
    def getObjectList(params: Null, callback: GetObjectListCallback): Unit = js.native
    def getObjectList(params: Null, options: Anon_Sorted, callback: GetObjectListCallback): Unit = js.native
    def getObjectList(params: Null, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
    /**
      * Returns a list of objects with id between params.startkey and params.endkey
      * @param params Parameters determining the objects included in the return list. Null to include all objects
      * @param options (optional) If the returned list should be sorted. And some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getObjectList(params: GetObjectListParams, callback: GetObjectListCallback): Unit = js.native
    def getObjectList(params: GetObjectListParams, options: Anon_Sorted, callback: GetObjectListCallback): Unit = js.native
    def getObjectList(params: GetObjectListParams, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
    def getObjectView(design: String, search: String, params: Null, callback: GetObjectViewCallback): Unit = js.native
    def getObjectView(design: String, search: String, params: Null, options: js.Any, callback: GetObjectViewCallback): Unit = js.native
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
    def getObjectView(design: String, search: String, params: GetObjectViewParams, callback: GetObjectViewCallback): Unit = js.native
    def getObjectView(
      design: String,
      search: String,
      params: GetObjectViewParams,
      options: js.Any,
      callback: GetObjectViewCallback
    ): Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getObjects(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
    def getObjects(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
    def getObjects(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2): Unit = js.native
    def getObjects(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
    /**
      * For a given user, returns the groups he belongs to, and his access rights
      * @param user Name of the user. Has to start with "system.user."
      * @param callback The callback function to be invoked with the return values
      */
    def getUserGroup(user: String, callback: GetUserGroupCallback): Unit = js.native
    /**
      * Creates an empty directory with the given name
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Directory name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def mkDir(id: String, name: String, callback: ErrorCallback): Unit = js.native
    def mkDir(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Finds all files and directories starting with <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File or directory name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def readDir(id: String, name: String, callback: ReadDirCallback): Unit = js.native
    def readDir(id: String, name: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
    /**
      * Reads a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def readFile(id: String, name: String, callback: ReadFileCallback): Unit = js.native
    def readFile(id: String, name: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
    /**
      * Renames a file or directory
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param oldName Old file or directory name
      * @param newName Name to rename to
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def rename(id: String, oldName: String, newName: String, callback: ErrorCallback): Unit = js.native
    def rename(id: String, oldName: String, newName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes all files in the root directory matching <name>
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name Pattern to match against
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def rm(id: String, name: String, callback: RmCallback): Unit = js.native
    def rm(id: String, name: String, options: js.Any, callback: RmCallback): Unit = js.native
    /**
      * Creates or overwrites an object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setConfig(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setConfig(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /**
      * Creates or overwrites an object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
    def setObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
    /**
      * Subscribe to object changes
      * @param pattern The pattern to match against
      */
    def subscribe(pattern: String, callback: EmptyCallback): Unit = js.native
    def subscribe(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
    // not documented. enabled = true seems to disable the cache
    // enableFileCache(enabled, options, callback)
    /**
      * Subscribe to object changes
      * @param pattern The pattern to match against
      */
    def subscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
    def subscribeConfig(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
    /**
      * Creates an empty file with the given name
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def touch(id: String, name: String, callback: ErrorCallback): Unit = js.native
    def touch(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param options (optional) Some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def unlink(id: String, name: String, callback: ErrorCallback): Unit = js.native
    def unlink(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Unsubscribe from object changes
      * @param pattern The pattern to match against
      */
    def unsubscribe(pattern: String, callback: EmptyCallback): Unit = js.native
    def unsubscribe(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
    /**
      * Unsubscribe from object changes
      * @param pattern The pattern to match against
      */
    def unsubscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
    def unsubscribeConfig(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
    def writeFile(id: String, name: String, data: String, callback: ErrorCallback): Unit = js.native
    def writeFile(id: String, name: String, data: String, options: String, callback: ErrorCallback): Unit = js.native
    def writeFile(id: String, name: String, data: String, options: js.Any, callback: ErrorCallback): Unit = js.native
    /**
      * Writes a file.
      * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
      * @param name File name
      * @param data Contents of the file
      * @param options (optional) MIME type of the file (string). Or some internal options.
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def writeFile(id: String, name: String, data: Buffer, callback: ErrorCallback): Unit = js.native
    def writeFile(id: String, name: String, data: Buffer, options: String, callback: ErrorCallback): Unit = js.native
    def writeFile(id: String, name: String, data: Buffer, options: js.Any, callback: ErrorCallback): Unit = js.native
  }
  
  trait OtherCommon
    extends ObjectCommon
       with /* propName */ StringDictionary[js.Any] {
    // Only states can have common.custom
    var custom: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait OtherObject
    extends BaseObject
       with Object {
    @JSName("common")
    var common_OtherObject: OtherCommon
    @JSName("type")
    var type_OtherObject: adapter | config | enum | group | host | info | instance | meta | script | user
  }
  
  trait OtherPermission extends Permission {
    @JSName("operation")
    var operation_OtherPermission: execute | http | sendto
    @JSName("type")
    var type_OtherPermission: other
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialChannelObject extends PartialObject {
    var common: js.UndefOr[Partial[ChannelCommon]] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialDeviceObject extends PartialObject {
    var common: js.UndefOr[Partial[DeviceCommon]] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.PartialStateObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.PartialChannelObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.PartialDeviceObject
    - typings.iobroker.iobrokerMod.Global.ioBrokerNs.PartialOtherObject
  */
  trait PartialObject extends js.Object
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialOtherObject extends PartialObject {
    var common: js.UndefOr[Partial[ObjectCommon]] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'>[P]} */ trait PartialStateObject extends PartialObject {
    var acl: js.UndefOr[Partial[StateACL]] = js.undefined
    var common: js.UndefOr[Partial[StateCommon]] = js.undefined
  }
  
  trait Permission extends js.Object {
    /** Which kind of operation is required */
    var operation: String
    /** The type of the permission */
    var `type`: String
  }
  
  /** Defined the complete set of access rights a user has */
  trait PermissionSet extends ObjectPermissions {
    /** The name of the groups this ACL was merged from */
    var groups: js.Array[String]
    /** The access rights for certain commands */
    var other: Anon_Execute
    /** The name of the user this ACL is for */
    var user: String
  }
  
  /** Contains the return values of readDir */
  trait ReadDirResult extends js.Object {
    /** Access rights */
    var acl: EvaluatedFileACL
    /** Date of creation */
    var createdAt: Double
    /** Name of the file or directory */
    var file: String
    /** Whether this is a directory or a file */
    var isDir: Boolean
    /** Date of last modification */
    var modifiedAt: Double
    /** File system stats */
    var stats: Stats
  }
  
  /** Contains the return values of rm */
  trait RmResult extends js.Object {
    /** The name of the deleted file or directory */
    var file: String
    /** Whether the deleted object was a directory or a file */
    var isDir: Boolean
    /** The parent directory of the deleted file or directory */
    var path: String
  }
  
  trait State extends js.Object {
    /** Direction flag: false for desired value and true for actual value. Default: false. */
    var ack: Boolean
    /** Optional comment */
    var c: js.UndefOr[String] = js.undefined
    /** Optional time in seconds after which the state is reset to null */
    var expire: js.UndefOr[Double] = js.undefined
    /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
    var from: String
    /** Unix timestamp of the last time the value changed */
    var lc: Double
    /** Optional quality of the state value */
    var q: js.UndefOr[StateQuality] = js.undefined
    /** Unix timestamp. Default: current time */
    var ts: Double
    /** The value of the state. */
    var `val`: js.Any
  }
  
  /** Defines access rights for a single state object */
  trait StateACL extends ObjectACL {
    /** Linux-type permissions defining access to this state */
    var state: Double
  }
  
  trait StateCommon extends ObjectCommon {
    /** Custom settings for this state */
    var custom: js.UndefOr[Record[String, _]] = js.undefined
    /** the default value */
    var `def`: js.UndefOr[js.Any] = js.undefined
    /** description of this state */
    var desc: js.UndefOr[String] = js.undefined
    /** attached history information */
    var history: js.UndefOr[js.Any] = js.undefined
    /** maximum value */
    var max: js.UndefOr[Double] = js.undefined
    /** minimum value */
    var min: js.UndefOr[Double] = js.undefined
    /** if this state is readable */
    var read: Boolean
    /** role of the state (used in user interfaces to indicate which widget to choose) */
    @JSName("role")
    var role_StateCommon: String
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
    var states: js.UndefOr[(Record[String, String]) | String] = js.undefined
    /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
    var `type`: js.UndefOr[CommonType] = js.undefined
    /** unit of the value */
    var unit: js.UndefOr[String] = js.undefined
    /** ID of a helper state indicating if the handler of this state is working */
    var workingID: js.UndefOr[String] = js.undefined
    /** if this state is writable */
    var write: Boolean
  }
  
  trait StateObject
    extends BaseObject
       with Object {
    @JSName("acl")
    var acl_StateObject: js.UndefOr[StateACL] = js.undefined
    @JSName("common")
    var common_StateObject: StateCommon
    @JSName("type")
    var type_StateObject: state
  }
  
  @js.native
  sealed trait StateQuality extends js.Object
  
  /** Provides low-level access to the ioBroker states DB */
  @js.native
  trait States extends js.Object {
    def clearAllLogs(): Unit = js.native
    def clearAllLogs(callback: EmptyCallback): Unit = js.native
    def clearAllMessages(): Unit = js.native
    def clearAllMessages(callback: EmptyCallback): Unit = js.native
    /**
      * Deletes a binary state from Redis
      * @param id The id of the state to be deleted
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delBinaryState(id: String, callback: DeleteStateCallback): Unit = js.native
    /**
      * Deletes a config object in the object db
      * @param id ID of the object
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delConfig(id: String, callback: ErrorCallback): Unit = js.native
    def delLog(id: String, logId: String, callback: ErrorCallback): Unit = js.native
    def delMessage(id: String, messageId: Double, callback: ErrorCallback): Unit = js.native
    /**
      * Deletes a state
      * @param id ID of the state to be stored
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def delState(id: String, callback: DeleteStateCallback): Unit = js.native
    /** Destructor of the class. Call this before shutting down */
    def destroy(): Unit = js.native
    def destroySession(id: String): Unit = js.native
    def destroySession(id: String, callback: EmptyCallback): Unit = js.native
    /**
      * Reads a binary state from Redis
      * @param id The id of the state
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
    /**
      * Retrieves a copy of the object with the given ID
      * @param id Id of the object to find
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getConfig(id: String, callback: GetObjectCallback): Unit = js.native
    /**
      * Returns a list of config keys matching <pattern>
      * @param pattern Pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
    def getConfigKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
    /**
      * Returns a list of objects with the given ids
      * @param keys IDs of the objects to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
    def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
    /**
      * Retrieves all ids of states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
    def getKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
    def getLog(id: String, callback: GenericCallback[Log]): Unit = js.native
    def getMessage(id: String, callback: GenericCallback[Message]): Unit = js.native
    def getSession(id: String, callback: GetSessionCallback): Unit = js.native
    /**
      * Returns the state with the given id
      * @param id ID of the state to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def getState(id: String, callback: GetStateCallback): Unit = js.native
    /**
      * Returns a list of states with the given ids
      * @param keys IDs of the states to be retrieved
      * @param callback Is called when the operation has finished (successfully or not)
      * @param dontModify unused
      */
    def getStates(keys: js.Array[String], callback: GetStatesCallback2): Unit = js.native
    def getStates(keys: js.Array[String], callback: GetStatesCallback2, dontModify: js.Any): Unit = js.native
    def lenLog(id: String, callback: GenericCallback[Double]): Unit = js.native
    def lenMessage(id: String, callback: GenericCallback[Double]): Unit = js.native
    /**
      * EDUCATED GUESS: Notify all clients about changes to an object
      * @param type object type
      * @param id State/object id
      * @param obj The changed object
      */
    def publishAll(`type`: String, id: String, obj: Message): Unit = js.native
    def pushLog(id: String, log: Log, callback: SetStateCallback): Unit = js.native
    // TODO: Documentation for these functions is missing
    def pushMessage(id: String, state: Message, callback: SetStateCallback): Unit = js.native
    /**
      * Register an adapter instance as subscribable.
      * This means that the instance can read information about all subscriptions to its states
      * and will be notified of changes.
      * @param instance Adapter instance to register, e.g. "admin.0"
      * @param cb Is called when the operation has finished (successfully or not)
      */
    def registerAdapterSubs(instance: String): Unit = js.native
    def registerAdapterSubs(instance: String, cb: js.Function2[/* error */ Null, /* success */ Boolean, Unit]): Unit = js.native
    /**
      * Writes a binary state into Redis
      * @param id The id of the state
      * @param data The data to be written
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setBinaryState(id: String, data: Buffer, callback: SetStateCallback): Unit = js.native
    /**
      * Creates or overwrites a config object in the object db
      * @param id ID of the object
      * @param obj Object to store
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setConfig(id: String, obj: Object, callback: SetObjectCallback): Unit = js.native
    /**
      * Updates a state in memory without triggering a save
      * @param id ID of the state to be stored
      * @param state The state to be updated
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setRawState(id: String, state: State): Unit = js.native
    def setRawState(id: String, state: State, callback: SetStateCallback): Unit = js.native
    def setSession(id: String, expire: Double): Unit = js.native
    def setSession(id: String, expire: Double, callback: EmptyCallback): Unit = js.native
    def setSession(id: String, expire: Double, obj: Session): Unit = js.native
    def setSession(id: String, expire: Double, obj: Session, callback: EmptyCallback): Unit = js.native
    /**
      * Stores a state in the db
      * @param id ID of the state to be stored
      * @param state The state to be stored in the db
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def setState(id: String): Unit = js.native
    def setState(id: String, state: String): Unit = js.native
    def setState(id: String, state: String, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Boolean): Unit = js.native
    def setState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Double): Unit = js.native
    def setState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: State): Unit = js.native
    def setState(id: String, state: State, callback: SetStateCallback): Unit = js.native
    def setState(id: String, state: Partial[State]): Unit = js.native
    def setState(id: String, state: Partial[State], callback: SetStateCallback): Unit = js.native
    /**
      * Subscribe to changes of all states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def subscribe(pattern: String, cb: EmptyCallback): Unit = js.native
    /**
      * Subscribe to config object changes
      * @param pattern The pattern to match against
      */
    def subscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
    def subscribeLog(id: String, cb: EmptyCallback): Unit = js.native
    def subscribeMessage(id: String, cb: EmptyCallback): Unit = js.native
    /**
      * Unregister an adapter instance as subscribable.
      * @param instance Adapter instance to unregister, e.g. "admin.0"
      * @param cb Is called when the operation has finished (successfully or not)
      */
    def unregisterAdapterSubs(instance: String): Unit = js.native
    def unregisterAdapterSubs(instance: String, cb: js.Function2[/* error */ Null, /* success */ Boolean, Unit]): Unit = js.native
    /**
      * Unsubscribe from changes of all states matching @link{pattern}
      * @param pattern The pattern to match against
      * @param callback Is called when the operation has finished (successfully or not)
      */
    def unsubscribe(pattern: String, cb: EmptyCallback): Unit = js.native
    /**
      * Unsubscribe from config object changes
      * @param pattern The pattern to match against
      */
    def unsubscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
    def unsubscribeLog(id: String, cb: EmptyCallback): Unit = js.native
    def unsubscribeMessage(id: String, cb: EmptyCallback): Unit = js.native
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
    sealed trait bad extends StateQuality
    
    @js.native
    sealed trait device_not_connected extends StateQuality
    
    @js.native
    sealed trait device_reports_error extends StateQuality
    
    @js.native
    sealed trait general_device_problem extends StateQuality
    
    @js.native
    sealed trait general_problem extends StateQuality
    
    @js.native
    sealed trait general_sensor_problem extends StateQuality
    
     // or undefined or null
    @js.native
    sealed trait good extends StateQuality
    
    @js.native
    sealed trait sensor_not_connected extends StateQuality
    
    @js.native
    sealed trait sensor_reports_error extends StateQuality
    
    /* 0x01 */ val bad: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.bad with Double = js.native
    /* 0x42 */ val device_not_connected: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.device_not_connected with Double = js.native
    /* 0x44 */ val device_reports_error: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.device_reports_error with Double = js.native
    /* 0x41 */ val general_device_problem: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.general_device_problem with Double = js.native
    /* 0x01 */ val general_problem: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.general_problem with Double = js.native
    /* 0x81 */ val general_sensor_problem: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.general_sensor_problem with Double = js.native
    /* 0x00 */ val good: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.good with Double = js.native
    /* 0x82 */ val sensor_not_connected: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.sensor_not_connected with Double = js.native
    /* 0x84 */ val sensor_reports_error: typings.iobroker.iobrokerMod.Global.ioBrokerNs.StateQuality.sensor_reports_error with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateQuality with Double] = js.native
  }
  
  /** Infers the return type from a callback-style API and and leaves null and undefined in */
  type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = SecondParameterOf[T]
  type ChownFileCallback = js.Function3[
    /* err */ String | Null, 
    /* entries */ js.UndefOr[js.Array[ChownFileResult]], 
    /* id */ js.UndefOr[String], 
    Unit
  ]
  type ChownObjectCallback = js.Function2[/* err */ String | Null, /* list */ js.UndefOr[js.Array[Object]], Unit]
  type DeleteStateCallback = js.Function2[/* err */ String | Null, /* id */ js.UndefOr[String], Unit]
  type EmptyCallback = js.Function0[Unit]
  type Enum = js.Any
  type EnumList = String | js.Array[String]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[String], Unit]
  type ExtendObjectCallback = js.Function3[
    /* err */ String | Null, 
    /* result */ js.UndefOr[Anon_IdValue], 
    /* id */ js.UndefOr[String], 
    Unit
  ]
  type FindObjectCallback = js.Function3[
    /* err */ String | Null, 
    /* id */ js.UndefOr[String], 
    /* name */ js.UndefOr[String], 
    Unit
  ]
  // TODO: Redefine callbacks as subclass of GenericCallback
  type GenericCallback[T] = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[T], Unit]
  type GetBinaryStateCallback = js.Function2[/* err */ String | Null, /* state */ js.UndefOr[Buffer], Unit]
  type GetConfigKeysCallback = js.Function2[/* err */ String | Null, /* list */ js.UndefOr[js.Array[String]], Unit]
  type GetEnumCallback = js.Function3[
    /* err */ String | Null, 
    /* enums */ Record[String, Enum], 
    /* requestedEnum */ String, 
    Unit
  ]
  type GetEnumsCallback = js.Function2[/* err */ String | Null, /* result */ StringDictionary[Record[String, Enum]], Unit]
  type GetHistoryCallback = js.Function4[
    /* err */ String | Null, 
    /* result */ GetHistoryResult, 
    /* step */ Double, 
    /* sessionId */ js.UndefOr[String], 
    Unit
  ]
  type GetHistoryResult = js.Array[State with Anon_IdStringOptional]
  type GetObjectCallback = js.Function2[/* err */ String | Null, /* obj */ js.UndefOr[Object | Null], Unit]
  type GetObjectListCallback = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[Anon_RowsArray], Unit]
  type GetObjectViewCallback = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[Anon_Rows], Unit]
  type GetObjectsCallback = js.Function2[/* err */ String | Null, /* objects */ Record[String, Object], Unit]
  // this is a version of the callback used by Objects.getObjects
  type GetObjectsCallback2 = js.Function2[/* err */ String | Null, /* objects */ js.UndefOr[js.Array[Object | Anon_Err]], Unit]
  // This is a version used by GetDevices/GetChannelsOf/GetStatesOf
  type GetObjectsCallback3[T /* <: BaseObject */] = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[js.Array[T]], Unit]
  type GetSessionCallback = js.Function1[/* session */ Session, Unit]
  type GetStateCallback = js.Function2[/* err */ String | Null, /* state */ js.UndefOr[State | Null], Unit]
  type GetStatesCallback = js.Function2[/* err */ String | Null, /* states */ Record[String, State], Unit]
  /** Version of the callback used by States.getStates */
  type GetStatesCallback2 = js.Function2[/* err */ String | Null, /* states */ js.Array[State], Unit]
  type GetUserGroupCallback = js.Function4[
    /* objectsInstance */ Objects, 
    /* user */ User, 
    /* groups */ js.Array[UserGroup], 
    /* acl */ ObjectPermissions, 
    Unit
  ]
  type Log = js.Any
  type MessageCallback = js.Function1[/* response */ js.UndefOr[Message], Unit]
  type MessageHandler = js.Function1[/* obj */ Message, Unit | js.Promise[Unit]]
  type MessagePayload = String | (Record[String, js.Any])
  /** Infers the return type from a callback-style API and strips out null and undefined */
  type NonNullCallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = Exclude[SecondParameterOf[T], js.UndefOr[Null]]
  type ObjectChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[Object | Null], Unit | js.Promise[Unit]]
  type ReadDirCallback = js.Function2[/* err */ String | Null, /* entries */ js.UndefOr[js.Array[ReadDirResult]], Unit]
  type ReadFileCallback = js.Function3[
    /* err */ String | Null, 
    /* file */ js.UndefOr[Buffer | String], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  // end interface Adapter
  type ReadyHandler = js.Function0[Unit | js.Promise[Unit]]
  type RmCallback = js.Function2[/* err */ String | Null, /* entries */ js.UndefOr[js.Array[RmResult]], Unit]
  type SecondParameterOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  // end interface States
  type Session = js.Any
  type SetObjectCallback = js.Function2[/* err */ String | Null, /* obj */ Anon_IdString, Unit]
  type SetStateCallback = js.Function2[/* err */ String | Null, /* id */ js.UndefOr[String], Unit]
  type SetStateChangedCallback = js.Function3[/* err */ String | Null, /* id */ String, /* notChanged */ Boolean, Unit]
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  type SettableObject = SettableObjectWorker[Object]
  type SettableObjectWorker[T /* <: Object */] = (Pick[T, Exclude[String, _id | acl]]) with Anon_Acl[T]
  type StateChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[State | Null], Unit | js.Promise[Unit]]
  type UnloadHandler = js.Function1[/* callback */ EmptyCallback, Unit | js.Promise[Unit]]
  type UserGroup = js.Any
}

