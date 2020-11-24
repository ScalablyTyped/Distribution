package typings.makerJs.global.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.units")
@js.native
object units extends js.Object {
  
  /**
    * Get a conversion ratio between a source unit and a destination unit.
    *
    * @param srcUnitType unitType converting from.
    * @param destUnitType unitType converting to.
    * @returns Numeric ratio of the conversion.
    */
  def conversionScale(srcUnitType: String, destUnitType: String): Double = js.native
}
