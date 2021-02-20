package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsPermissions extends StObject {
  
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
  implicit class CommandsPermissionsMutableBuilder[Self <: CommandsPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthEnabled(value: Permission): Self = StObject.set(x, "authEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChmodFile(value: ObjectOrStatePermission): Self = StObject.set(x, "chmodFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(value: Permission): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObject(value: ObjectOrStatePermission): Self = StObject.set(x, "getObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectView(value: ObjectOrStatePermission): Self = StObject.set(x, "getObjectView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjects(value: ObjectOrStatePermission): Self = StObject.set(x, "getObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: ObjectOrStatePermission): Self = StObject.set(x, "getState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStateHistory(value: ObjectOrStatePermission): Self = StObject.set(x, "getStateHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStates(value: ObjectOrStatePermission): Self = StObject.set(x, "getStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserPermissions(value: ObjectOrStatePermission): Self = StObject.set(x, "getUserPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVersion(value: Permission): Self = StObject.set(x, "getVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGet(value: OtherPermission): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPermissions(value: Permission): Self = StObject.set(x, "listPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkdir(value: ObjectOrStatePermission): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDir(value: ObjectOrStatePermission): Self = StObject.set(x, "readDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFile(value: ObjectOrStatePermission): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFile64(value: ObjectOrStatePermission): Self = StObject.set(x, "readFile64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRename(value: ObjectOrStatePermission): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendTo(value: OtherPermission): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToHost(value: OtherPermission): Self = StObject.set(x, "sendToHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetObject(value: ObjectOrStatePermission): Self = StObject.set(x, "setObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetState(value: ObjectOrStatePermission): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribe(value: ObjectOrStatePermission): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeObjects(value: ObjectOrStatePermission): Self = StObject.set(x, "subscribeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlink(value: ObjectOrStatePermission): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: ObjectOrStatePermission): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribeObjects(value: ObjectOrStatePermission): Self = StObject.set(x, "unsubscribeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFile(value: ObjectOrStatePermission): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFile64(value: ObjectOrStatePermission): Self = StObject.set(x, "writeFile64", value.asInstanceOf[js.Any])
  }
}
