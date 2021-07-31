package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializationMethod(value: String): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    @scala.inline
    def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
  }
}
