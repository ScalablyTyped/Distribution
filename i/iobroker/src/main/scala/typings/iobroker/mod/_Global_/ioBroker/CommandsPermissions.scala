package typings.iobroker.mod._Global_.ioBroker

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
    val __obj = js.Dynamic.literal(authEnabled = authEnabled.asInstanceOf[js.Any], chmodFile = chmodFile.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], getObject = getObject.asInstanceOf[js.Any], getObjectView = getObjectView.asInstanceOf[js.Any], getObjects = getObjects.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any], getStateHistory = getStateHistory.asInstanceOf[js.Any], getStates = getStates.asInstanceOf[js.Any], getUserPermissions = getUserPermissions.asInstanceOf[js.Any], getVersion = getVersion.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], listPermissions = listPermissions.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], readDir = readDir.asInstanceOf[js.Any], readFile = readFile.asInstanceOf[js.Any], readFile64 = readFile64.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], sendTo = sendTo.asInstanceOf[js.Any], sendToHost = sendToHost.asInstanceOf[js.Any], setObject = setObject.asInstanceOf[js.Any], setState = setState.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any], subscribeObjects = subscribeObjects.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], unsubscribe = unsubscribe.asInstanceOf[js.Any], unsubscribeObjects = unsubscribeObjects.asInstanceOf[js.Any], writeFile = writeFile.asInstanceOf[js.Any], writeFile64 = writeFile64.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsPermissions]
  }
}

