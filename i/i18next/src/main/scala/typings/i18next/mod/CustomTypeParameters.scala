package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checks if user has enabled `returnEmptyString` and `returnNull` options to retrieve correct values.
  */
trait CustomTypeParameters extends StObject {
  
  var returnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var returnNull: js.UndefOr[Boolean] = js.undefined
}
object CustomTypeParameters {
  
  inline def apply(): CustomTypeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTypeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTypeParameters] (val x: Self) extends AnyVal {
    
    inline def setReturnEmptyString(value: Boolean): Self = StObject.set(x, "returnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setReturnEmptyStringUndefined: Self = StObject.set(x, "returnEmptyString", js.undefined)
    
    inline def setReturnNull(value: Boolean): Self = StObject.set(x, "returnNull", value.asInstanceOf[js.Any])
    
    inline def setReturnNullUndefined: Self = StObject.set(x, "returnNull", js.undefined)
  }
}
