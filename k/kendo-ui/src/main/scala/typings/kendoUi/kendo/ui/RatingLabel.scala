package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatingLabel extends StObject {
  
  var template: String | js.Function
}
object RatingLabel {
  
  @scala.inline
  def apply(template: String | js.Function): RatingLabel = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingLabel]
  }
  
  @scala.inline
  implicit class RatingLabelMutableBuilder[Self <: RatingLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
