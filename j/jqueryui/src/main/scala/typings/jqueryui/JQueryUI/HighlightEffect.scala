package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightEffect extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object HighlightEffect {
  
  @scala.inline
  def apply(): HighlightEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightEffect]
  }
  
  @scala.inline
  implicit class HighlightEffectMutableBuilder[Self <: HighlightEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
