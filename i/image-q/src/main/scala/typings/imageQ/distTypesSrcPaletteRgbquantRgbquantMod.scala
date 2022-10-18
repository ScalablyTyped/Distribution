package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcPalettePaletteQuantizerMod.AbstractPaletteQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPaletteRgbquantRgbquantMod {
  
  @JSImport("image-q/dist/types/src/palette/rgbquant/rgbquant", "RGBQuant")
  @js.native
  open class RGBQuant protected () extends AbstractPaletteQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Unit, method: Double) = this()
    
    /* private */ var _buildPalette: Any = js.native
    
    /* private */ val _colors: Any = js.native
    
    /* private */ val _distance: Any = js.native
    
    /* private */ val _distanceIncrement: Any = js.native
    
    /* private */ val _histogram: Any = js.native
    
    /* private */ val _initialDistance: Any = js.native
  }
}
