package typings.leafletDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecisionOptions extends StObject {
  
  var ac: js.UndefOr[Double] = js.undefined
  
  var ft: js.UndefOr[Double] = js.undefined
  
  var ha: js.UndefOr[Double] = js.undefined
  
  var km: js.UndefOr[Double] = js.undefined
  
  var m: js.UndefOr[Double] = js.undefined
  
  var mi: js.UndefOr[Double] = js.undefined
  
  var nm: js.UndefOr[Double] = js.undefined
  
  var yd: js.UndefOr[Double] = js.undefined
}
object PrecisionOptions {
  
  @scala.inline
  def apply(): PrecisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOptions]
  }
  
  @scala.inline
  implicit class PrecisionOptionsMutableBuilder[Self <: PrecisionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAc(value: Double): Self = StObject.set(x, "ac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcUndefined: Self = StObject.set(x, "ac", js.undefined)
    
    @scala.inline
    def setFt(value: Double): Self = StObject.set(x, "ft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtUndefined: Self = StObject.set(x, "ft", js.undefined)
    
    @scala.inline
    def setHa(value: Double): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    @scala.inline
    def setKm(value: Double): Self = StObject.set(x, "km", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmUndefined: Self = StObject.set(x, "km", js.undefined)
    
    @scala.inline
    def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    @scala.inline
    def setMi(value: Double): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiUndefined: Self = StObject.set(x, "mi", js.undefined)
    
    @scala.inline
    def setNm(value: Double): Self = StObject.set(x, "nm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNmUndefined: Self = StObject.set(x, "nm", js.undefined)
    
    @scala.inline
    def setYd(value: Double): Self = StObject.set(x, "yd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYdUndefined: Self = StObject.set(x, "yd", js.undefined)
  }
}
