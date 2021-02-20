package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundRadius extends StObject {
  
  var background: js.UndefOr[`3`] = js.native
  
  var radius: js.UndefOr[String] = js.native
}
object BackgroundRadius {
  
  @scala.inline
  def apply(): BackgroundRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRadius]
  }
  
  @scala.inline
  implicit class BackgroundRadiusMutableBuilder[Self <: BackgroundRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: `3`): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
