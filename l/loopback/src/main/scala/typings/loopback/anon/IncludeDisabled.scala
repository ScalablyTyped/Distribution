package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDisabled extends StObject {
  
  var includeDisabled: Boolean
}
object IncludeDisabled {
  
  inline def apply(includeDisabled: Boolean): IncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeDisabled] (val x: Self) extends AnyVal {
    
    inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
  }
}
