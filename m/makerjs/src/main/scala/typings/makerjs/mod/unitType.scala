package typings.makerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * String-based enumeration of unit types: imperial, metric or otherwise.
  * A model may specify the unit system it is using, if any. When importing a model, it may have different units.
  * Unit conversion function is makerjs.units.conversionScale().
  * Important: If you add to this, you must also add a corresponding conversion ratio in the unit.ts file!
  */
object unitType {
  
  @JSImport("makerjs", "unitType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("makerjs", "unitType.Centimeter")
  @js.native
  def Centimeter: String = js.native
  inline def Centimeter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Centimeter")(x.asInstanceOf[js.Any])
  
  @JSImport("makerjs", "unitType.Foot")
  @js.native
  def Foot: String = js.native
  inline def Foot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Foot")(x.asInstanceOf[js.Any])
  
  @JSImport("makerjs", "unitType.Inch")
  @js.native
  def Inch: String = js.native
  inline def Inch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inch")(x.asInstanceOf[js.Any])
  
  @JSImport("makerjs", "unitType.Meter")
  @js.native
  def Meter: String = js.native
  inline def Meter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Meter")(x.asInstanceOf[js.Any])
  
  @JSImport("makerjs", "unitType.Millimeter")
  @js.native
  def Millimeter: String = js.native
  inline def Millimeter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Millimeter")(x.asInstanceOf[js.Any])
}
