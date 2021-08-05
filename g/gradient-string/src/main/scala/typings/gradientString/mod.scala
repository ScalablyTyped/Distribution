package typings.gradientString

import typings.tinycolor2.mod.ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(colors: (ColorInput | PositionedColorInput)*): Gradient = ^.asInstanceOf[js.Dynamic].apply(colors.asInstanceOf[js.Any]).asInstanceOf[Gradient]
  inline def apply(colors: js.Array[ColorInput | PositionedColorInput]): Gradient = ^.asInstanceOf[js.Dynamic].apply(colors.asInstanceOf[js.Any]).asInstanceOf[Gradient]
  
  @JSImport("gradient-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gradient-string", "atlas")
  @js.native
  val atlas: Gradient = js.native
  
  @JSImport("gradient-string", "cristal")
  @js.native
  val cristal: Gradient = js.native
  
  @JSImport("gradient-string", "fruit")
  @js.native
  val fruit: Gradient = js.native
  
  @JSImport("gradient-string", "instagram")
  @js.native
  val instagram: Gradient = js.native
  
  @JSImport("gradient-string", "mind")
  @js.native
  val mind: Gradient = js.native
  
  @JSImport("gradient-string", "morning")
  @js.native
  val morning: Gradient = js.native
  
  @JSImport("gradient-string", "passion")
  @js.native
  val passion: Gradient = js.native
  
  @JSImport("gradient-string", "pastel")
  @js.native
  val pastel: Gradient = js.native
  
  @JSImport("gradient-string", "rainbow")
  @js.native
  val rainbow: Gradient = js.native
  
  @JSImport("gradient-string", "retro")
  @js.native
  val retro: Gradient = js.native
  
  @JSImport("gradient-string", "summer")
  @js.native
  val summer: Gradient = js.native
  
  @JSImport("gradient-string", "teen")
  @js.native
  val teen: Gradient = js.native
  
  @JSImport("gradient-string", "vice")
  @js.native
  val vice: Gradient = js.native
  
  @js.native
  trait Gradient extends StObject {
    
    def apply(): String = js.native
    def apply(message: String): String = js.native
    def apply(message: String, opt: Options): String = js.native
    def apply(message: Unit, opt: Options): String = js.native
    
    def multiline(): String = js.native
    def multiline(message: String): String = js.native
    def multiline(message: String, opt: Options): String = js.native
    def multiline(message: Unit, opt: Options): String = js.native
  }
  
  trait Options extends StObject {
    
    var hsvSpin: js.UndefOr[String] = js.undefined
    
    var interpolation: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHsvSpin(value: String): Self = StObject.set(x, "hsvSpin", value.asInstanceOf[js.Any])
      
      inline def setHsvSpinUndefined: Self = StObject.set(x, "hsvSpin", js.undefined)
      
      inline def setInterpolation(value: String): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
  
  trait PositionedColorInput extends StObject {
    
    var color: ColorInput
    
    var pos: Double
  }
  object PositionedColorInput {
    
    inline def apply(color: ColorInput, pos: Double): PositionedColorInput = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionedColorInput]
    }
    
    extension [Self <: PositionedColorInput](x: Self) {
      
      inline def setColor(value: ColorInput): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
