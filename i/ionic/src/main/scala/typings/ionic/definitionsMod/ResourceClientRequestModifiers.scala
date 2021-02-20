package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceClientRequestModifiers extends StObject {
  
  var fields: js.UndefOr[js.Array[String]] = js.native
}
object ResourceClientRequestModifiers {
  
  @scala.inline
  def apply(): ResourceClientRequestModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceClientRequestModifiers]
  }
  
  @scala.inline
  implicit class ResourceClientRequestModifiersMutableBuilder[Self <: ResourceClientRequestModifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
