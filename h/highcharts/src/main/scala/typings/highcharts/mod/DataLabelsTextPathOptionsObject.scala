package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLabelsTextPathOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Enable or disable `textPath` option for
    * link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object DataLabelsTextPathOptionsObject {
  
  @scala.inline
  def apply(): DataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsTextPathOptionsObject]
  }
  
  @scala.inline
  implicit class DataLabelsTextPathOptionsObjectMutableBuilder[Self <: DataLabelsTextPathOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
