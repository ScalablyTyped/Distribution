package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorSettings extends StObject {
  
  /*This is an HTML snippet that will be inserted at the location of the mathematics for any formula that causes
    * MathJax to produce an internal error (i.e., an error in the MathJax code itself). See the description of HTML
    * snippets for details on how to represent HTML code in this way.
    */
  var message: js.UndefOr[js.Array[String]] = js.undefined
  
  /*This is the CSS style description to use for the error messages produced by internal MathJax errors. See the
    * section on CSS style objects for details on how these are specified in JavaScript.
    */
  var style: js.UndefOr[Any] = js.undefined
}
object ErrorSettings {
  
  inline def apply(): ErrorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSettings]
  }
  
  extension [Self <: ErrorSettings](x: Self) {
    
    inline def setMessage(value: js.Array[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: String*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
