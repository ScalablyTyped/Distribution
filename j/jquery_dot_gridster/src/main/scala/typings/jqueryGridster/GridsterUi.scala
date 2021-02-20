package typings.jqueryGridster

import typings.jqueryGridster.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterUi extends StObject {
  
  var position: Left = js.native
}
object GridsterUi {
  
  @scala.inline
  def apply(position: Left): GridsterUi = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterUi]
  }
  
  @scala.inline
  implicit class GridsterUiMutableBuilder[Self <: GridsterUi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
