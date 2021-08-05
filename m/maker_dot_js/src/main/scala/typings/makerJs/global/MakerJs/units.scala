package typings.makerJs.global.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object units {
  
  @JSGlobal("MakerJs.units")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a conversion ratio between a source unit and a destination unit.
    *
    * @param srcUnitType unitType converting from.
    * @param destUnitType unitType converting to.
    * @returns Numeric ratio of the conversion.
    */
  inline def conversionScale(srcUnitType: String, destUnitType: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionScale")(srcUnitType.asInstanceOf[js.Any], destUnitType.asInstanceOf[js.Any])).asInstanceOf[Double]
}
