package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotHlcSonificationContextTracksMappingFrequencyOptions extends StObject {
  
  /**
    * (Highstock) How to perform the mapping.
    */
  var mapFunction: js.UndefOr[OptionsMapFunctionValue] = js.undefined
  
  /**
    * (Highstock) A point property to map the mapping parameter to.
    *
    * A negative sign `-` can be placed before the property name to make
    * mapping inverted.
    */
  var mapTo: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The maximum value for the audio parameter. This is the
    * highest value the audio parameter will be mapped to.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The minimum value for the audio parameter. This is the lowest
    * value the audio parameter will be mapped to.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) A fixed value to use for the prop when mapping.
    *
    * For example, if mapping to `y`, setting value to `4` will map as if all
    * points had a y value of 4.
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) What data values to map the parameter within.
    *
    * Mapping within `"series"` will make the lowest value point in the series
    * map to the min audio parameter value, and the highest value will map to
    * the max audio parameter.
    *
    * Mapping within `"chart"` will make the lowest value point in the whole
    * chart map to the min audio parameter value, and the highest value in the
    * whole chart will map to the max audio parameter.
    *
    * You can also map within the X or Y axis of each series.
    */
  var within: js.UndefOr[OptionsWithinValue] = js.undefined
}
object PlotHlcSonificationContextTracksMappingFrequencyOptions {
  
  inline def apply(): PlotHlcSonificationContextTracksMappingFrequencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotHlcSonificationContextTracksMappingFrequencyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotHlcSonificationContextTracksMappingFrequencyOptions] (val x: Self) extends AnyVal {
    
    inline def setMapFunction(value: OptionsMapFunctionValue): Self = StObject.set(x, "mapFunction", value.asInstanceOf[js.Any])
    
    inline def setMapFunctionUndefined: Self = StObject.set(x, "mapFunction", js.undefined)
    
    inline def setMapTo(value: String): Self = StObject.set(x, "mapTo", value.asInstanceOf[js.Any])
    
    inline def setMapToUndefined: Self = StObject.set(x, "mapTo", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWithin(value: OptionsWithinValue): Self = StObject.set(x, "within", value.asInstanceOf[js.Any])
    
    inline def setWithinUndefined: Self = StObject.set(x, "within", js.undefined)
  }
}
