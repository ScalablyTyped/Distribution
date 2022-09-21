package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip
  extends StObject
     with _GeneralName {
  
  var ip: String
}
object Ip {
  
  inline def apply(ip: String): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  extension [Self <: Ip](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
