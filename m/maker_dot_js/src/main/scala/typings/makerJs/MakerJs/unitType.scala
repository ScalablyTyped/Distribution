package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String-based enumeration of unit types: imperial, metric or otherwise.
  * A model may specify the unit system it is using, if any. When importing a model, it may have different units.
  * Unit conversion function is makerjs.units.conversionScale().
  * Important: If you add to this, you must also add a corresponding conversion ratio in the unit.ts file!
  */
@JSGlobal("MakerJs.unitType")
@js.native
object unitType extends js.Object {
  var Centimeter: String = js.native
  var Foot: String = js.native
  var Inch: String = js.native
  var Meter: String = js.native
  var Millimeter: String = js.native
}

