package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ename extends StObject {
  
  var ename: String
  
  var evalue: String
  
  var traceback: js.Array[String]
}
object Ename {
  
  inline def apply(ename: String, evalue: String, traceback: js.Array[String]): Ename = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ename] (val x: Self) extends AnyVal {
    
    inline def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    inline def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    inline def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    inline def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value*))
  }
}
