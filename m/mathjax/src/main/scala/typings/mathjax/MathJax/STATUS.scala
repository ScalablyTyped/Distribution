package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATUS extends StObject {
  
  /*The value used to indicate that a file load has caused an error or a timeout to occur.*/
  var ERROR: String
  
  /*The value used to indicate that a file load has occurred successfully.*/
  var OK: String
}
object STATUS {
  
  inline def apply(ERROR: String, OK: String): STATUS = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATUS]
  }
  
  extension [Self <: STATUS](x: Self) {
    
    inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
  }
}
