package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsPermissions extends js.Object {
  
  var authEnabled: Permission = js.native
  
  var chmodFile: ObjectOrStatePermission = js.native
  
  var disconnect: Permission = js.native
  
  // TODO: Are all properties required or is a partial object ok?
  var getObject: ObjectOrStatePermission = js.native
  
  var getObjectView: ObjectOrStatePermission = js.native
  
  var getObjects: ObjectOrStatePermission = js.native
  
  var getState: ObjectOrStatePermission = js.native
  
  var getStateHistory: ObjectOrStatePermission = js.native
  
  var getStates: ObjectOrStatePermission = js.native
  
  var getUserPermissions: ObjectOrStatePermission = js.native
  
  var getVersion: Permission = js.native
  
  var httpGet: OtherPermission = js.native
  
  var listPermissions: Permission = js.native
  
  var mkdir: ObjectOrStatePermission = js.native
  
  var readDir: ObjectOrStatePermission = js.native
  
  var readFile: ObjectOrStatePermission = js.native
  
  var readFile64: ObjectOrStatePermission = js.native
  
  var rename: ObjectOrStatePermission = js.native
  
  var sendTo: OtherPermission = js.native
  
  var sendToHost: OtherPermission = js.native
  
  var setObject: ObjectOrStatePermission = js.native
  
  var setState: ObjectOrStatePermission = js.native
  
  var subscribe: ObjectOrStatePermission = js.native
  
  var subscribeObjects: ObjectOrStatePermission = js.native
  
  var unlink: ObjectOrStatePermission = js.native
  
  var unsubscribe: ObjectOrStatePermission = js.native
  
  var unsubscribeObjects: ObjectOrStatePermission = js.native
  
  var writeFile: ObjectOrStatePermission = js.native
  
  var writeFile64: ObjectOrStatePermission = js.native
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
  
  @scala.inline
  implicit class CommandsPermissionsOps[Self <: CommandsPermissions] (val x: Self) extends AnyVal {
    
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
    def setAuthEnabled(value: Permission): Self = this.set("authEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChmodFile(value: ObjectOrStatePermission): Self = this.set("chmodFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(value: Permission): Self = this.set("disconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObject(value: ObjectOrStatePermission): Self = this.set("getObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectView(value: ObjectOrStatePermission): Self = this.set("getObjectView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjects(value: ObjectOrStatePermission): Self = this.set("getObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: ObjectOrStatePermission): Self = this.set("getState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStateHistory(value: ObjectOrStatePermission): Self = this.set("getStateHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStates(value: ObjectOrStatePermission): Self = this.set("getStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserPermissions(value: ObjectOrStatePermission): Self = this.set("getUserPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVersion(value: Permission): Self = this.set("getVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGet(value: OtherPermission): Self = this.set("httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPermissions(value: Permission): Self = this.set("listPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkdir(value: ObjectOrStatePermission): Self = this.set("mkdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDir(value: ObjectOrStatePermission): Self = this.set("readDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFile(value: ObjectOrStatePermission): Self = this.set("readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFile64(value: ObjectOrStatePermission): Self = this.set("readFile64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRename(value: ObjectOrStatePermission): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendTo(value: OtherPermission): Self = this.set("sendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToHost(value: OtherPermission): Self = this.set("sendToHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetObject(value: ObjectOrStatePermission): Self = this.set("setObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetState(value: ObjectOrStatePermission): Self = this.set("setState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribe(value: ObjectOrStatePermission): Self = this.set("subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeObjects(value: ObjectOrStatePermission): Self = this.set("subscribeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlink(value: ObjectOrStatePermission): Self = this.set("unlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: ObjectOrStatePermission): Self = this.set("unsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribeObjects(value: ObjectOrStatePermission): Self = this.set("unsubscribeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFile(value: ObjectOrStatePermission): Self = this.set("writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFile64(value: ObjectOrStatePermission): Self = this.set("writeFile64", value.asInstanceOf[js.Any])
  }
}
