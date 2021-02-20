package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsPitchforkTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
}
object AnnotationsPitchforkTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsPitchforkTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsPitchforkTypeLineOptionsMutableBuilder[Self <: AnnotationsPitchforkTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
