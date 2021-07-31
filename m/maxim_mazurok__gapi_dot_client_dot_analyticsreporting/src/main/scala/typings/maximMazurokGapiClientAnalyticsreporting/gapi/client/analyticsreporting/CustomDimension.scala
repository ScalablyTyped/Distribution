package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDimension extends StObject {
  
  /** Slot number of custom dimension. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Value of the custom dimension. Default value (i.e. empty string) indicates clearing sesion/visitor scope custom dimension value. */
  var value: js.UndefOr[String] = js.undefined
}
object CustomDimension {
  
  @scala.inline
  def apply(): CustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDimension]
  }
  
  @scala.inline
  implicit class CustomDimensionMutableBuilder[Self <: CustomDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
