package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Elements in the array returned by serializeArray()
  */
@js.native
trait JQuerySerializeArrayElement extends StObject {
  
  var name: String = js.native
  
  var value: String = js.native
}
object JQuerySerializeArrayElement {
  
  @scala.inline
  def apply(name: String, value: String): JQuerySerializeArrayElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySerializeArrayElement]
  }
  
  @scala.inline
  implicit class JQuerySerializeArrayElementMutableBuilder[Self <: JQuerySerializeArrayElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
