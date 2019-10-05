package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object CommandsPermissions {
  @scala.inline
  def apply(
    authEnabled: Permission,
    chmodFile: ObjectOrStatePermission,
    disconnect: Permission,
    getObject: ObjectOrStatePermission,
    getObjectView: ObjectOrStatePermission,
    getObjects: ObjectOrStatePermission,
    getState: ObjectOrStatePermission,
    getStateHistory: ObjectOrStatePermission,
    getStates: ObjectOrStatePermission,
    getUserPermissions: ObjectOrStatePermission,
    getVersion: Permission,
    httpGet: OtherPermission,
    listPermissions: Permission,
    mkdir: ObjectOrStatePermission,
    readDir: ObjectOrStatePermission,
    readFile: ObjectOrStatePermission,
    readFile64: ObjectOrStatePermission,
    rename: ObjectOrStatePermission,
    sendTo: OtherPermission,
    sendToHost: OtherPermission,
    setObject: ObjectOrStatePermission,
    setState: ObjectOrStatePermission,
    subscribe: ObjectOrStatePermission,
    subscribeObjects: ObjectOrStatePermission,
    unlink: ObjectOrStatePermission,
    unsubscribe: ObjectOrStatePermission,
    unsubscribeObjects: ObjectOrStatePermission,
    writeFile: ObjectOrStatePermission,
    writeFile64: ObjectOrStatePermission
  ): CommandsPermissions = {
    val __obj = js.Dynamic.literal(authEnabled = authEnabled, chmodFile = chmodFile, disconnect = disconnect, getObject = getObject, getObjectView = getObjectView, getObjects = getObjects, getState = getState, getStateHistory = getStateHistory, getStates = getStates, getUserPermissions = getUserPermissions, getVersion = getVersion, httpGet = httpGet, listPermissions = listPermissions, mkdir = mkdir, readDir = readDir, readFile = readFile, readFile64 = readFile64, rename = rename, sendTo = sendTo, sendToHost = sendToHost, setObject = setObject, setState = setState, subscribe = subscribe, subscribeObjects = subscribeObjects, unlink = unlink, unsubscribe = unsubscribe, unsubscribeObjects = unsubscribeObjects, writeFile = writeFile, writeFile64 = writeFile64)
  
    __obj.asInstanceOf[CommandsPermissions]
  }
}

