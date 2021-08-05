package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotWordcloudRotationOptions extends StObject {
  
  /**
    * (Highcharts) The smallest degree of rotation for a word.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The number of possible orientations for a word, within the
    * range of `rotation.from` and `rotation.to`. Must be a number larger than
    * 0.
    */
  var orientations: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The largest degree of rotation for a word.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object PlotWordcloudRotationOptions {
  
  inline def apply(): PlotWordcloudRotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudRotationOptions]
  }
  
  extension [Self <: PlotWordcloudRotationOptions](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setOrientations(value: Double): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    inline def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
