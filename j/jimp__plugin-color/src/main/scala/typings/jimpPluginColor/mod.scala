package typings.jimpPluginColor

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Color]
  
  @js.native
  trait Color extends StObject {
    
    def brightness(`val`: Double): this.type = js.native
    def brightness(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def color(actions: js.Array[ColorAction]): this.type = js.native
    def color(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
    
    def colour(actions: js.Array[ColorAction]): this.type = js.native
    def colour(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
    
    def contrast(`val`: Double): this.type = js.native
    def contrast(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def convolute(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def convolute(
      kernel: js.Array[js.Array[Double]],
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    
    def convolution(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolution(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String, cb: ImageCallback[this.type]): this.type = js.native
    
    def fade(f: Double): this.type = js.native
    def fade(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def grayscale(): this.type = js.native
    def grayscale(cb: ImageCallback[this.type]): this.type = js.native
    
    def greyscale(): this.type = js.native
    def greyscale(cb: ImageCallback[this.type]): this.type = js.native
    
    def opacity(f: Double): this.type = js.native
    def opacity(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def opaque(): this.type = js.native
    def opaque(cb: ImageCallback[this.type]): this.type = js.native
    
    def pixelate(size: Double): this.type = js.native
    def pixelate(size: Double, cb: ImageCallback[this.type]): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def posterize(n: Double): this.type = js.native
    def posterize(n: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def sepia(): this.type = js.native
    def sepia(cb: ImageCallback[this.type]): this.type = js.native
  }
  
  trait ColorAction extends StObject {
    
    @JSName("apply")
    var apply: ColorActionName
    
    var params: js.Any
  }
  object ColorAction {
    
    @scala.inline
    def apply(apply: ColorActionName, params: js.Any): ColorAction = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorAction]
    }
    
    @scala.inline
    implicit class ColorActionMutableBuilder[Self <: ColorAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: ColorActionName): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimpPluginColor.jimpPluginColorStrings.mix
    - typings.jimpPluginColor.jimpPluginColorStrings.tint
    - typings.jimpPluginColor.jimpPluginColorStrings.shade
    - typings.jimpPluginColor.jimpPluginColorStrings.xor
    - typings.jimpPluginColor.jimpPluginColorStrings.red
    - typings.jimpPluginColor.jimpPluginColorStrings.green
    - typings.jimpPluginColor.jimpPluginColorStrings.blue
    - typings.jimpPluginColor.jimpPluginColorStrings.hue
  */
  trait ColorActionName extends StObject
  object ColorActionName {
    
    @scala.inline
    def blue: typings.jimpPluginColor.jimpPluginColorStrings.blue = "blue".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.blue]
    
    @scala.inline
    def green: typings.jimpPluginColor.jimpPluginColorStrings.green = "green".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.green]
    
    @scala.inline
    def hue: typings.jimpPluginColor.jimpPluginColorStrings.hue = "hue".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.hue]
    
    @scala.inline
    def mix: typings.jimpPluginColor.jimpPluginColorStrings.mix = "mix".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.mix]
    
    @scala.inline
    def red: typings.jimpPluginColor.jimpPluginColorStrings.red = "red".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.red]
    
    @scala.inline
    def shade: typings.jimpPluginColor.jimpPluginColorStrings.shade = "shade".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.shade]
    
    @scala.inline
    def tint: typings.jimpPluginColor.jimpPluginColorStrings.tint = "tint".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.tint]
    
    @scala.inline
    def xor: typings.jimpPluginColor.jimpPluginColorStrings.xor = "xor".asInstanceOf[typings.jimpPluginColor.jimpPluginColorStrings.xor]
  }
}
