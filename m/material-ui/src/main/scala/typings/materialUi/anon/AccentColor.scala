package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccentColor extends StObject {
  
  var accentColor: js.UndefOr[String] = js.native
}
object AccentColor {
  
  @scala.inline
  def apply(): AccentColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccentColor]
  }
  
  @scala.inline
  implicit class AccentColorMutableBuilder[Self <: AccentColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
  }
}
