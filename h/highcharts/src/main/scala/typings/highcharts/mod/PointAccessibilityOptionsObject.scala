package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Provide a description of the data point,
    * announced to screen readers.
    */
  /**
    * Provide a description of the data point, announced to screen readers.
    */
  var description: js.UndefOr[String] = js.native
}
object PointAccessibilityOptionsObject {
  
  @scala.inline
  def apply(): PointAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointAccessibilityOptionsObject]
  }
  
  @scala.inline
  implicit class PointAccessibilityOptionsObjectMutableBuilder[Self <: PointAccessibilityOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
