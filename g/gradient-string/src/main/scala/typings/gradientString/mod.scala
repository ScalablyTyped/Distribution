package typings.gradientString

import typings.tinycolor2.mod.ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gradient-string", JSImport.Namespace)
  @js.native
  def apply(colors: (ColorInput | PositionedColorInput)*): Gradient = js.native
  @JSImport("gradient-string", JSImport.Namespace)
  @js.native
  def apply(colors: js.Array[ColorInput | PositionedColorInput]): Gradient = js.native
  
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
    def apply(message: js.UndefOr[scala.Nothing], opt: Options): String = js.native
    def apply(message: String): String = js.native
    def apply(message: String, opt: Options): String = js.native
    
    def multiline(): String = js.native
    def multiline(message: js.UndefOr[scala.Nothing], opt: Options): String = js.native
    def multiline(message: String): String = js.native
    def multiline(message: String, opt: Options): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var hsvSpin: js.UndefOr[String] = js.native
    
    var interpolation: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHsvSpin(value: String): Self = StObject.set(x, "hsvSpin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsvSpinUndefined: Self = StObject.set(x, "hsvSpin", js.undefined)
      
      @scala.inline
      def setInterpolation(value: String): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
  
  @js.native
  trait PositionedColorInput extends StObject {
    
    var color: ColorInput = js.native
    
    var pos: Double = js.native
  }
  object PositionedColorInput {
    
    @scala.inline
    def apply(color: ColorInput, pos: Double): PositionedColorInput = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionedColorInput]
    }
    
    @scala.inline
    implicit class PositionedColorInputMutableBuilder[Self <: PositionedColorInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorInput): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
