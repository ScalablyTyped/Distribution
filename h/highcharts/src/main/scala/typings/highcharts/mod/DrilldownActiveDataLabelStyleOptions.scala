package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrilldownActiveDataLabelStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var fontWeight: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object DrilldownActiveDataLabelStyleOptions {
  
  @scala.inline
  def apply(): DrilldownActiveDataLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownActiveDataLabelStyleOptions]
  }
  
  @scala.inline
  implicit class DrilldownActiveDataLabelStyleOptionsMutableBuilder[Self <: DrilldownActiveDataLabelStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
