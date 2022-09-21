package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.keyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtKeyUsage
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: keyUsage
  
  var names: js.Array[String]
}
object ExtKeyUsage {
  
  inline def apply(names: js.Array[String]): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(extname = "keyUsage", names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtKeyUsage]
  }
  
  extension [Self <: ExtKeyUsage](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: keyUsage): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
