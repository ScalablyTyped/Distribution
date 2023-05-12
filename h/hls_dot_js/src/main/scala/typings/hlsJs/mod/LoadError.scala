package typings.hlsJs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadError
  extends StObject
     with Error {
  
  val data: FragLoadFailResult
}
object LoadError {
  
  inline def apply(data: FragLoadFailResult, message: String, name: String): LoadError = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadError] (val x: Self) extends AnyVal {
    
    inline def setData(value: FragLoadFailResult): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
