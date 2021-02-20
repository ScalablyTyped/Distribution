package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightSpacing extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
}
object HeightSpacing {
  
  @scala.inline
  def apply(): HeightSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSpacing]
  }
  
  @scala.inline
  implicit class HeightSpacingMutableBuilder[Self <: HeightSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
