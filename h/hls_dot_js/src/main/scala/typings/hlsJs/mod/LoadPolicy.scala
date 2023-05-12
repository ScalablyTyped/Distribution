package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPolicy extends StObject {
  
  var default: LoaderConfig
}
object LoadPolicy {
  
  inline def apply(default: LoaderConfig): LoadPolicy = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadPolicy] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: LoaderConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
