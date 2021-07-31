package typings.lokijs.anon

import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationMethod extends StObject {
  
  var serializationMethod: js.UndefOr[normal | pretty] = js.undefined
}
object SerializationMethod {
  
  @scala.inline
  def apply(): SerializationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationMethod]
  }
  
  @scala.inline
  implicit class SerializationMethodMutableBuilder[Self <: SerializationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializationMethod(value: normal | pretty): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
  }
}
