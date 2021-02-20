package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderError extends StObject {
  
  /**
    * error code
    */
  var code: Double = js.native
  
  /**
    *  error description
    */
  var text: String = js.native
}
object LoaderError {
  
  @scala.inline
  def apply(code: Double, text: String): LoaderError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderError]
  }
  
  @scala.inline
  implicit class LoaderErrorMutableBuilder[Self <: LoaderError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
