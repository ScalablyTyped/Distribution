package typings.jimpPluginColor

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Color]
  
  @js.native
  sealed trait ColorActionName extends StObject
  @JSImport("@jimp/plugin-color", "ColorActionName")
  @js.native
  object ColorActionName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorActionName & String] = js.native
    
    @js.native
    sealed trait BLUE
      extends StObject
         with ColorActionName
    /* "blue" */ val BLUE: typings.jimpPluginColor.mod.ColorActionName.BLUE & String = js.native
    
    @js.native
    sealed trait BRIGHTEN
      extends StObject
         with ColorActionName
    /* "brighten" */ val BRIGHTEN: typings.jimpPluginColor.mod.ColorActionName.BRIGHTEN & String = js.native
    
    @js.native
    sealed trait DARKEN
      extends StObject
         with ColorActionName
    /* "darken" */ val DARKEN: typings.jimpPluginColor.mod.ColorActionName.DARKEN & String = js.native
    
    @js.native
    sealed trait DESATURATE
      extends StObject
         with ColorActionName
    /* "desaturate" */ val DESATURATE: typings.jimpPluginColor.mod.ColorActionName.DESATURATE & String = js.native
    
    @js.native
    sealed trait GREEN
      extends StObject
         with ColorActionName
    /* "green" */ val GREEN: typings.jimpPluginColor.mod.ColorActionName.GREEN & String = js.native
    
    @js.native
    sealed trait GREYSCALE
      extends StObject
         with ColorActionName
    /* "greyscale" */ val GREYSCALE: typings.jimpPluginColor.mod.ColorActionName.GREYSCALE & String = js.native
    
    @js.native
    sealed trait HUE
      extends StObject
         with ColorActionName
    /* "hue" */ val HUE: typings.jimpPluginColor.mod.ColorActionName.HUE & String = js.native
    
    @js.native
    sealed trait LIGHTEN
      extends StObject
         with ColorActionName
    /* "lighten" */ val LIGHTEN: typings.jimpPluginColor.mod.ColorActionName.LIGHTEN & String = js.native
    
    @js.native
    sealed trait MIX
      extends StObject
         with ColorActionName
    /* "mix" */ val MIX: typings.jimpPluginColor.mod.ColorActionName.MIX & String = js.native
    
    @js.native
    sealed trait RED
      extends StObject
         with ColorActionName
    /* "red" */ val RED: typings.jimpPluginColor.mod.ColorActionName.RED & String = js.native
    
    @js.native
    sealed trait SATURATE
      extends StObject
         with ColorActionName
    /* "saturate" */ val SATURATE: typings.jimpPluginColor.mod.ColorActionName.SATURATE & String = js.native
    
    @js.native
    sealed trait SHADE
      extends StObject
         with ColorActionName
    /* "shade" */ val SHADE: typings.jimpPluginColor.mod.ColorActionName.SHADE & String = js.native
    
    @js.native
    sealed trait SPIN
      extends StObject
         with ColorActionName
    /* "spin" */ val SPIN: typings.jimpPluginColor.mod.ColorActionName.SPIN & String = js.native
    
    @js.native
    sealed trait TINT
      extends StObject
         with ColorActionName
    /* "tint" */ val TINT: typings.jimpPluginColor.mod.ColorActionName.TINT & String = js.native
    
    @js.native
    sealed trait XOR
      extends StObject
         with ColorActionName
    /* "xor" */ val XOR: typings.jimpPluginColor.mod.ColorActionName.XOR & String = js.native
  }
  
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
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: Double): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: Double, cb: ImageCallback[this.type]): this.type = js.native
    
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
    
    var params: Any
  }
  object ColorAction {
    
    inline def apply(apply: ColorActionName, params: Any): ColorAction = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorAction] (val x: Self) extends AnyVal {
      
      inline def setApply(value: ColorActionName): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
