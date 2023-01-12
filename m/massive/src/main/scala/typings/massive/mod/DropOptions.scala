package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropOptions extends StObject {
  
  var cascade: js.UndefOr[Boolean] = js.undefined
}
object DropOptions {
  
  inline def apply(): DropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropOptions] (val x: Self) extends AnyVal {
    
    inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
  }
}
