package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoadError extends StObject {
  
  /** Error object if an error occurs. */
  var error: Any
}
object FileLoadError {
  
  inline def apply(error: Any): FileLoadError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLoadError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileLoadError] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
