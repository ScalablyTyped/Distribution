package typings
package jpushDashReactDashNativeLib.jpushDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JInfoMap extends js.Object {
  var myAppKey: java.lang.String
  var myDeviceId: java.lang.String
  var myImei: java.lang.String
  var myPackageName: java.lang.String
  var myVersion: java.lang.String
}

object JInfoMap {
  @scala.inline
  def apply(
    myAppKey: java.lang.String,
    myDeviceId: java.lang.String,
    myImei: java.lang.String,
    myPackageName: java.lang.String,
    myVersion: java.lang.String
  ): JInfoMap = {
    val __obj = js.Dynamic.literal(myAppKey = myAppKey, myDeviceId = myDeviceId, myImei = myImei, myPackageName = myPackageName, myVersion = myVersion)
  
    __obj.asInstanceOf[JInfoMap]
  }
}

