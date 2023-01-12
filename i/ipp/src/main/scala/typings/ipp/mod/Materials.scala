package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Materials extends StObject {
  
  var `material-amount`: js.UndefOr[Double] = js.undefined
  
  var `material-amount-units`: js.UndefOr[MaterialAmountUnits] = js.undefined
  
  var `material-color`: js.UndefOr[String] = js.undefined
  
  var `material-diameter`: js.UndefOr[Double] = js.undefined
  
  var `material-diameter-tolerance`: js.UndefOr[Double] = js.undefined
  
  var `material-fill-density`: js.UndefOr[Double] = js.undefined
  
  var `material-key`: js.UndefOr[String] = js.undefined
  
  var `material-name`: js.UndefOr[String] = js.undefined
  
  var `material-nozzle-diameter`: js.UndefOr[Double] = js.undefined
  
  var `material-purpose`: js.UndefOr[js.Array[MaterialPurpose]] = js.undefined
  
  var `material-rate`: js.UndefOr[Double] = js.undefined
  
  var `material-rate-units`: js.UndefOr[MaterialRateUnits] = js.undefined
  
  var `material-retraction`: js.UndefOr[Boolean] = js.undefined
  
  var `material-shell-thickness`: js.UndefOr[Double] = js.undefined
  
  var `material-temperature`: js.UndefOr[Double] = js.undefined
  
  var `material-type`: js.UndefOr[MaterialType] = js.undefined
}
object Materials {
  
  inline def apply(): Materials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Materials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Materials] (val x: Self) extends AnyVal {
    
    inline def `setMaterial-amount`(value: Double): Self = StObject.set(x, "material-amount", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-amount-units`(value: MaterialAmountUnits): Self = StObject.set(x, "material-amount-units", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-amount-unitsUndefined`: Self = StObject.set(x, "material-amount-units", js.undefined)
    
    inline def `setMaterial-amountUndefined`: Self = StObject.set(x, "material-amount", js.undefined)
    
    inline def `setMaterial-color`(value: String): Self = StObject.set(x, "material-color", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-colorUndefined`: Self = StObject.set(x, "material-color", js.undefined)
    
    inline def `setMaterial-diameter`(value: Double): Self = StObject.set(x, "material-diameter", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-diameter-tolerance`(value: Double): Self = StObject.set(x, "material-diameter-tolerance", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-diameter-toleranceUndefined`: Self = StObject.set(x, "material-diameter-tolerance", js.undefined)
    
    inline def `setMaterial-diameterUndefined`: Self = StObject.set(x, "material-diameter", js.undefined)
    
    inline def `setMaterial-fill-density`(value: Double): Self = StObject.set(x, "material-fill-density", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-fill-densityUndefined`: Self = StObject.set(x, "material-fill-density", js.undefined)
    
    inline def `setMaterial-key`(value: String): Self = StObject.set(x, "material-key", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-keyUndefined`: Self = StObject.set(x, "material-key", js.undefined)
    
    inline def `setMaterial-name`(value: String): Self = StObject.set(x, "material-name", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-nameUndefined`: Self = StObject.set(x, "material-name", js.undefined)
    
    inline def `setMaterial-nozzle-diameter`(value: Double): Self = StObject.set(x, "material-nozzle-diameter", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-nozzle-diameterUndefined`: Self = StObject.set(x, "material-nozzle-diameter", js.undefined)
    
    inline def `setMaterial-purpose`(value: js.Array[MaterialPurpose]): Self = StObject.set(x, "material-purpose", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-purposeUndefined`: Self = StObject.set(x, "material-purpose", js.undefined)
    
    inline def `setMaterial-purposeVarargs`(value: MaterialPurpose*): Self = StObject.set(x, "material-purpose", js.Array(value*))
    
    inline def `setMaterial-rate`(value: Double): Self = StObject.set(x, "material-rate", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-rate-units`(value: MaterialRateUnits): Self = StObject.set(x, "material-rate-units", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-rate-unitsUndefined`: Self = StObject.set(x, "material-rate-units", js.undefined)
    
    inline def `setMaterial-rateUndefined`: Self = StObject.set(x, "material-rate", js.undefined)
    
    inline def `setMaterial-retraction`(value: Boolean): Self = StObject.set(x, "material-retraction", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-retractionUndefined`: Self = StObject.set(x, "material-retraction", js.undefined)
    
    inline def `setMaterial-shell-thickness`(value: Double): Self = StObject.set(x, "material-shell-thickness", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-shell-thicknessUndefined`: Self = StObject.set(x, "material-shell-thickness", js.undefined)
    
    inline def `setMaterial-temperature`(value: Double): Self = StObject.set(x, "material-temperature", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-temperatureUndefined`: Self = StObject.set(x, "material-temperature", js.undefined)
    
    inline def `setMaterial-type`(value: MaterialType): Self = StObject.set(x, "material-type", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-typeUndefined`: Self = StObject.set(x, "material-type", js.undefined)
  }
}
