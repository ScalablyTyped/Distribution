package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerBackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var containerBackgroundColor: js.UndefOr[String] = js.native
}
object ContainerBackgroundColor {
  
  @scala.inline
  def apply(): ContainerBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerBackgroundColor]
  }
  
  @scala.inline
  implicit class ContainerBackgroundColorMutableBuilder[Self <: ContainerBackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
  }
}
