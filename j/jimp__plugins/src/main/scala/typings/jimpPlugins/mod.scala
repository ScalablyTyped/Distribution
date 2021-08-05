package typings.jimpPlugins

import typings.jimpPluginBlit.mod.Blit
import typings.jimpPluginBlur.mod.Blur
import typings.jimpPluginCircle.mod.Circle
import typings.jimpPluginColor.mod.Color
import typings.jimpPluginContain.mod.Contain
import typings.jimpPluginCover.mod.Cover
import typings.jimpPluginCrop.mod.Crop
import typings.jimpPluginDisplace.mod.Displace
import typings.jimpPluginDither.mod.Dither
import typings.jimpPluginFisheye.mod.Fisheye
import typings.jimpPluginFlip.mod.Flip
import typings.jimpPluginGaussian.mod.Gaussian
import typings.jimpPluginInvert.mod.Invert
import typings.jimpPluginMask.mod.Mask
import typings.jimpPluginNormalize.mod.Normalize
import typings.jimpPluginPrint.mod.Print
import typings.jimpPluginResize.mod.Resize
import typings.jimpPluginRotate.mod.Rotate
import typings.jimpPluginScale.mod.Scale
import typings.jimpPluginShadow.mod.Shadow
import typings.jimpPluginThreshold.mod.Threshold
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugins = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugins]
  
  type BlitRet = ReturnType[js.Function0[Blit]]
  
  type BlurRet = ReturnType[js.Function0[Blur]]
  
  type CircleRet = ReturnType[js.Function0[Circle]]
  
  type ColorRet = ReturnType[js.Function0[Color]]
  
  type ContainRet = ReturnType[js.Function0[Contain]]
  
  type CoverRet = ReturnType[js.Function0[Cover]]
  
  type CropRet = ReturnType[js.Function0[Crop]]
  
  type DisplaceRet = ReturnType[js.Function0[Displace]]
  
  type DitherRet = ReturnType[js.Function0[Dither]]
  
  type FisheyeRet = ReturnType[js.Function0[Fisheye]]
  
  type FlipRet = ReturnType[js.Function0[Flip]]
  
  type GaussianRet = ReturnType[js.Function0[Gaussian]]
  
  type InvertRet = ReturnType[js.Function0[Invert]]
  
  type MaskRet = ReturnType[js.Function0[Mask]]
  
  type NormalizeRet = ReturnType[js.Function0[Normalize]]
  
  /**
    * This is made union and not intersection to avoid issues with
    * `IllformedPlugin` and `WellFormedPlugin` when using typings with Jimp
    * generic
    *
    * In reality, this should be an intersection but our type data isn't
    * clever enough to figure out what's a class and what's not/etc
    */
  type Plugins = BlitRet | BlurRet | CircleRet | ColorRet | ContainRet | CoverRet | CropRet | DisplaceRet | DitherRet | FlipRet | FisheyeRet | GaussianRet | InvertRet | MaskRet | NormalizeRet | PrintRet | ResizeRet | RotateRet | ScaleRet | ShadowRet | ThresholdRet
  
  type PrintRet = ReturnType[js.Function0[Print]]
  
  type ResizeRet = ReturnType[js.Function0[Resize]]
  
  type RotateRet = ReturnType[js.Function0[Rotate]]
  
  type ScaleRet = ReturnType[js.Function0[Scale]]
  
  type ShadowRet = ReturnType[js.Function0[Shadow]]
  
  type ThresholdRet = ReturnType[js.Function0[Threshold]]
}
