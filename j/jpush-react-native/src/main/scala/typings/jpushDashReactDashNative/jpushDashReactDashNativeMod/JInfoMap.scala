package typings.jpushDashReactDashNative.jpushDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JInfoMap extends js.Object {
  var myAppKey: String
  var myDeviceId: String
  var myImei: String
  var myPackageName: String
  var myVersion: String
}

object JInfoMap {
  @scala.inline
  def apply(myAppKey: String, myDeviceId: String, myImei: String, myPackageName: String, myVersion: String): JInfoMap = {
    val __obj = js.Dynamic.literal(myAppKey = myAppKey, myDeviceId = myDeviceId, myImei = myImei, myPackageName = myPackageName, myVersion = myVersion)
  
    __obj.asInstanceOf[JInfoMap]
  }
}

