package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.extKeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtExtKeyUsage
  extends StObject
     with ExtParam {
  
  var array: js.Array[String]
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: extKeyUsage
}
object ExtExtKeyUsage {
  
  inline def apply(array: js.Array[String]): ExtExtKeyUsage = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "extKeyUsage")
    __obj.asInstanceOf[ExtExtKeyUsage]
  }
  
  extension [Self <: ExtExtKeyUsage](x: Self) {
    
    inline def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: extKeyUsage): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
