package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationLabelAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
    * label for screen readers and other assistive technology.
    */
  var description: js.UndefOr[String] = js.undefined
}
object AnnotationLabelAccessibilityOptionsObject {
  
  inline def apply(): AnnotationLabelAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationLabelAccessibilityOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationLabelAccessibilityOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
