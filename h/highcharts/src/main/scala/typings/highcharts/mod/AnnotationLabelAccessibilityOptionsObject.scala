package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationLabelAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
    * label for screen readers and other assistive technology.
    */
  var description: js.UndefOr[String] = js.native
}
object AnnotationLabelAccessibilityOptionsObject {
  
  @scala.inline
  def apply(): AnnotationLabelAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationLabelAccessibilityOptionsObject]
  }
  
  @scala.inline
  implicit class AnnotationLabelAccessibilityOptionsObjectMutableBuilder[Self <: AnnotationLabelAccessibilityOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
