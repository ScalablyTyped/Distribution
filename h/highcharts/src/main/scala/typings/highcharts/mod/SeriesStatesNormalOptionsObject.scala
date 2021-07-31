package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesStatesNormalOptionsObject extends StObject {
  
  /**
    * (Highstock) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
}
object SeriesStatesNormalOptionsObject {
  
  @scala.inline
  def apply(): SeriesStatesNormalOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesNormalOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesStatesNormalOptionsObjectMutableBuilder[Self <: SeriesStatesNormalOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
