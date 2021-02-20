package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RStyle extends StObject {
  
  var r: Double = js.native
  
  var style: Left = js.native
}
object RStyle {
  
  @scala.inline
  def apply(r: Double, style: Left): RStyle = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RStyle]
  }
  
  @scala.inline
  implicit class RStyleMutableBuilder[Self <: RStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Left): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
