package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeparatorObject extends StObject {
  
  var name: String = js.native
}
object SeparatorObject {
  
  @scala.inline
  def apply(name: String): SeparatorObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorObject]
  }
  
  @scala.inline
  implicit class SeparatorObjectMutableBuilder[Self <: SeparatorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
