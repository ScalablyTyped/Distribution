package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Networkinfo extends StObject {
  
  var network_info: String
}
object Networkinfo {
  
  inline def apply(network_info: String): Networkinfo = {
    val __obj = js.Dynamic.literal(network_info = network_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networkinfo]
  }
  
  extension [Self <: Networkinfo](x: Self) {
    
    inline def setNetwork_info(value: String): Self = StObject.set(x, "network_info", value.asInstanceOf[js.Any])
  }
}
