package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsCrookedLineTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
}
object AnnotationsCrookedLineTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsCrookedLineTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsCrookedLineTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsCrookedLineTypeLineOptionsMutableBuilder[Self <: AnnotationsCrookedLineTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
