package typings.lokijs.anon

import typings.lokijs.lokijsStrings.destructured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var serializationMethod: destructured
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal(serializationMethod = "destructured")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializationMethod(value: destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
  }
}
