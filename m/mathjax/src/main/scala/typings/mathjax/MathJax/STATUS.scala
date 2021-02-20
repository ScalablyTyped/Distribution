package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait STATUS extends StObject {
  
  /*The value used to indicate that a file load has caused an error or a timeout to occur.*/
  var ERROR: String = js.native
  
  /*The value used to indicate that a file load has occurred successfully.*/
  var OK: String = js.native
}
object STATUS {
  
  @scala.inline
  def apply(ERROR: String, OK: String): STATUS = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATUS]
  }
  
  @scala.inline
  implicit class STATUSMutableBuilder[Self <: STATUS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
  }
}
