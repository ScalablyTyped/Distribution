package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectEnable extends StObject {
  
  var connectEnable: Boolean
}
object ConnectEnable {
  
  inline def apply(connectEnable: Boolean): ConnectEnable = {
    val __obj = js.Dynamic.literal(connectEnable = connectEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectEnable]
  }
  
  extension [Self <: ConnectEnable](x: Self) {
    
    inline def setConnectEnable(value: Boolean): Self = StObject.set(x, "connectEnable", value.asInstanceOf[js.Any])
  }
}
