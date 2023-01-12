package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  */
trait IExportOptions extends StObject {
  
  /**
    * Optional exemplar of number of decimal places.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional unit system to embed in exported file, if the export format allows alternate unit systems.
    */
  var units: js.UndefOr[String] = js.undefined
}
object IExportOptions {
  
  inline def apply(): IExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
