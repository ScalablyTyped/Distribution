package typings.indySdk.mod

import typings.indySdk.anon.AccumString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocReg extends StObject {
  
  var value: AccumString
  
  var ver: String
}
object RevocReg {
  
  inline def apply(value: AccumString, ver: String): RevocReg = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocReg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevocReg] (val x: Self) extends AnyVal {
    
    inline def setValue(value: AccumString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
