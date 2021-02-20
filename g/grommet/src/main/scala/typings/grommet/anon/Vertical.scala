package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertical extends StObject {
  
  var horizontal: js.UndefOr[EdgeSizeType] = js.native
  
  var vertical: js.UndefOr[EdgeSizeType] = js.native
}
object Vertical {
  
  @scala.inline
  def apply(): Vertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertical]
  }
  
  @scala.inline
  implicit class VerticalMutableBuilder[Self <: Vertical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: EdgeSizeType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: EdgeSizeType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
