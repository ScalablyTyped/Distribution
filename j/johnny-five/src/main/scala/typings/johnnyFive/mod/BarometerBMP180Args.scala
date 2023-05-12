package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveInts.`1`
import typings.johnnyFive.johnnyFiveInts.`2`
import typings.johnnyFive.johnnyFiveInts.`3`
import typings.johnnyFive.johnnyFiveStrings.BMP180
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarometerBMP180Args extends StObject {
  
  var controller: BMP180
  
  var mode: `1` | `2` | `3`
}
object BarometerBMP180Args {
  
  inline def apply(mode: `1` | `2` | `3`): BarometerBMP180Args = {
    val __obj = js.Dynamic.literal(controller = "BMP180", mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerBMP180Args]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarometerBMP180Args] (val x: Self) extends AnyVal {
    
    inline def setController(value: BMP180): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setMode(value: `1` | `2` | `3`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
