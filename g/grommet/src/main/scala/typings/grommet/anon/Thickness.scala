package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thickness extends StObject {
  
  var color: js.UndefOr[String | Transform] = js.native
  
  var thickness: js.UndefOr[String | Transform] = js.native
  
  var x: js.UndefOr[String] = js.native
  
  var y: js.UndefOr[String] = js.native
}
object Thickness {
  
  @scala.inline
  def apply(): Thickness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thickness]
  }
  
  @scala.inline
  implicit class ThicknessMutableBuilder[Self <: Thickness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Transform): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setThickness(value: String | Transform): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
