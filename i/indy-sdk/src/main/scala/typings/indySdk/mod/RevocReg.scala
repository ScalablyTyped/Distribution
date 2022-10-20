package typings.indySdk.mod

import typings.indySdk.anon.Accum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocReg extends StObject {
  
  var value: Accum
  
  var ver: String
}
object RevocReg {
  
  inline def apply(value: Accum, ver: String): RevocReg = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocReg]
  }
  
  extension [Self <: RevocReg](x: Self) {
    
    inline def setValue(value: Accum): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
