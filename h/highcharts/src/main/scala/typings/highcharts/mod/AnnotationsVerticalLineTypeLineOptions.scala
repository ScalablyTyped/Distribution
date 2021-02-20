package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsVerticalLineTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
}
object AnnotationsVerticalLineTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsVerticalLineTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsVerticalLineTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsVerticalLineTypeLineOptionsMutableBuilder[Self <: AnnotationsVerticalLineTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
