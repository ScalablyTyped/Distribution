package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSelectedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the color object.
    */
  var color: js.UndefOr[js.Any] = js.native
}
object ColorSelectedEventUIParam {
  
  @scala.inline
  def apply(): ColorSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSelectedEventUIParam]
  }
  
  @scala.inline
  implicit class ColorSelectedEventUIParamMutableBuilder[Self <: ColorSelectedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
