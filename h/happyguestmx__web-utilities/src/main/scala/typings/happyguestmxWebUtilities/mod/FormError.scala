package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StringDictionary
import typings.happyguestmxWebUtilities.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormError extends StObject {
  
  var fields: StringDictionary[Fields]
}
object FormError {
  
  inline def apply(fields: StringDictionary[Fields]): FormError = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormError] (val x: Self) extends AnyVal {
    
    inline def setFields(value: StringDictionary[Fields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
