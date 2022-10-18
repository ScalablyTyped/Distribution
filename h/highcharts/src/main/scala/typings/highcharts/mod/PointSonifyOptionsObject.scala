package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a point.
  */
trait PointSonifyOptionsObject extends StObject {
  
  /**
    * Optionally provide the minimum/maximum values for the points. If this
    * is not supplied, it is calculated from the points in the chart on
    * demand. This option is supplied in the following format, as a map of
    * point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The instrument definitions for this point.
    */
  var instruments: js.Array[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentObject
  ]
  
  /**
    * Callback called when the sonification has finished.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
}
object PointSonifyOptionsObject {
  
  inline def apply(
    instruments: js.Array[
      typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentObject
    ]
  ): PointSonifyOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSonifyOptionsObject]
  }
  
  extension [Self <: PointSonifyOptionsObject](x: Self) {
    
    inline def setDataExtremes(value: js.Object): Self = StObject.set(x, "dataExtremes", value.asInstanceOf[js.Any])
    
    inline def setDataExtremesUndefined: Self = StObject.set(x, "dataExtremes", js.undefined)
    
    inline def setInstruments(
      value: js.Array[
          typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentObject
        ]
    ): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    inline def setInstrumentsVarargs(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentObject*): Self = StObject.set(x, "instruments", js.Array(value*))
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
  }
}
