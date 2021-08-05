package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A magnitude in a single direction in the specified units.
  */
trait SchemaDimension extends StObject {
  
  /**
    * The magnitude.
    */
  var magnitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The units for magnitude.
    */
  var unit: js.UndefOr[String] = js.undefined
}
object SchemaDimension {
  
  inline def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  extension [Self <: SchemaDimension](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
