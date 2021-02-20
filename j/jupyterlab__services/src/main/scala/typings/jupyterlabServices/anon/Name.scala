package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.stderr
import typings.jupyterlabServices.jupyterlabServicesStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var name: stdout | stderr = js.native
  
  var text: String = js.native
}
object Name {
  
  @scala.inline
  def apply(name: stdout | stderr, text: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: stdout | stderr): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
