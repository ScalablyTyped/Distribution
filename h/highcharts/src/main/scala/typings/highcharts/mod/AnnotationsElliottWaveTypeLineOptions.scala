package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsElliottWaveTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object AnnotationsElliottWaveTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsElliottWaveTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsElliottWaveTypeLineOptionsMutableBuilder[Self <: AnnotationsElliottWaveTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
