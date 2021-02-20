package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeBackground> */
@js.native
trait PartialTypeBackground extends StObject {
  
  var default: js.UndefOr[String] = js.native
  
  var paper: js.UndefOr[String] = js.native
}
object PartialTypeBackground {
  
  @scala.inline
  def apply(): PartialTypeBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeBackground]
  }
  
  @scala.inline
  implicit class PartialTypeBackgroundMutableBuilder[Self <: PartialTypeBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
