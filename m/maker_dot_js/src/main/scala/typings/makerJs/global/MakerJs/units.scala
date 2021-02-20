package typings.makerJs.global.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object units {
  
  /**
    * Get a conversion ratio between a source unit and a destination unit.
    *
    * @param srcUnitType unitType converting from.
    * @param destUnitType unitType converting to.
    * @returns Numeric ratio of the conversion.
    */
  @JSGlobal("MakerJs.units.conversionScale")
  @js.native
  def conversionScale(srcUnitType: String, destUnitType: String): Double = js.native
}
