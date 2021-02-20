package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.paletteCommonMod.IPaletteQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbquantMod {
  
  @JSImport("image-q/dist/palette/rgbquant/rgbquant", "RGBQuant")
  @js.native
  class RGBQuant protected () extends IPaletteQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: js.UndefOr[scala.Nothing],
      method: Double
    ) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
    
    /* private */ def _buildPalette(idxi32: js.Any): js.Any = js.native
    
    val _colors: js.Any = js.native
    
    val _distance: js.Any = js.native
    
    val _distanceIncrement: js.Any = js.native
    
    val _histogram: js.Any = js.native
    
    val _initialDistance: js.Any = js.native
  }
}
