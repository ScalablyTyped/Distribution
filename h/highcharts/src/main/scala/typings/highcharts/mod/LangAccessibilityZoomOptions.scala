package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityZoomOptions extends StObject {
  
  var mapZoomIn: js.UndefOr[String] = js.native
  
  var mapZoomOut: js.UndefOr[String] = js.native
  
  var resetZoomButton: js.UndefOr[String] = js.native
}
object LangAccessibilityZoomOptions {
  
  @scala.inline
  def apply(): LangAccessibilityZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityZoomOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityZoomOptionsMutableBuilder[Self <: LangAccessibilityZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapZoomIn(value: String): Self = StObject.set(x, "mapZoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapZoomInUndefined: Self = StObject.set(x, "mapZoomIn", js.undefined)
    
    @scala.inline
    def setMapZoomOut(value: String): Self = StObject.set(x, "mapZoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapZoomOutUndefined: Self = StObject.set(x, "mapZoomOut", js.undefined)
    
    @scala.inline
    def setResetZoomButton(value: String): Self = StObject.set(x, "resetZoomButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetZoomButtonUndefined: Self = StObject.set(x, "resetZoomButton", js.undefined)
  }
}
