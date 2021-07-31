package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  var `object`: js.Any
}
object Object {
  
  @scala.inline
  def apply(`object`: js.Any): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
