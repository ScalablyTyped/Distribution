package typings.indySdk.mod

import typings.indySdk.anon.Accum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocRegDelta extends StObject {
  
  var value: Accum
  
  var ver: String
}
object RevocRegDelta {
  
  inline def apply(value: Accum, ver: String): RevocRegDelta = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocRegDelta]
  }
  
  extension [Self <: RevocRegDelta](x: Self) {
    
    inline def setValue(value: Accum): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
