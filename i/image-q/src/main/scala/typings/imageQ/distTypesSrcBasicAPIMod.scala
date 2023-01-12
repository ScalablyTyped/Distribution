package typings.imageQ

import typings.imageQ.distTypesSrcUtilsPaletteMod.Palette
import typings.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBasicAPIMod {
  
  @JSImport("image-q/dist/types/src/basicAPI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPalette(image: PointContainer, palette: Palette): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
  inline def applyPalette(image: PointContainer, palette: Palette, param2: ApplyPaletteOptions & ProgressOptions): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
  
  inline def applyPaletteSync(image: PointContainer, palette: Palette): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  inline def applyPaletteSync(image: PointContainer, palette: Palette, param2: ApplyPaletteOptions): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  
  inline def buildPalette(images: js.Array[PointContainer]): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
  inline def buildPalette(images: js.Array[PointContainer], param1: BuildPaletteOptions & ProgressOptions): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]
  
  inline def buildPaletteSync(images: js.Array[PointContainer]): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any]).asInstanceOf[Palette]
  inline def buildPaletteSync(images: js.Array[PointContainer], param1: BuildPaletteOptions): Palette = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Palette]
  
  trait ApplyPaletteOptions extends StObject {
    
    var colorDistanceFormula: js.UndefOr[ColorDistanceFormula] = js.undefined
    
    var imageQuantization: js.UndefOr[ImageQuantization] = js.undefined
  }
  object ApplyPaletteOptions {
    
    inline def apply(): ApplyPaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyPaletteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyPaletteOptions] (val x: Self) extends AnyVal {
      
      inline def setColorDistanceFormula(value: ColorDistanceFormula): Self = StObject.set(x, "colorDistanceFormula", value.asInstanceOf[js.Any])
      
      inline def setColorDistanceFormulaUndefined: Self = StObject.set(x, "colorDistanceFormula", js.undefined)
      
      inline def setImageQuantization(value: ImageQuantization): Self = StObject.set(x, "imageQuantization", value.asInstanceOf[js.Any])
      
      inline def setImageQuantizationUndefined: Self = StObject.set(x, "imageQuantization", js.undefined)
    }
  }
  
  trait BuildPaletteOptions extends StObject {
    
    var colorDistanceFormula: js.UndefOr[ColorDistanceFormula] = js.undefined
    
    var colors: js.UndefOr[Double] = js.undefined
    
    var paletteQuantization: js.UndefOr[PaletteQuantization] = js.undefined
  }
  object BuildPaletteOptions {
    
    inline def apply(): BuildPaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildPaletteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildPaletteOptions] (val x: Self) extends AnyVal {
      
      inline def setColorDistanceFormula(value: ColorDistanceFormula): Self = StObject.set(x, "colorDistanceFormula", value.asInstanceOf[js.Any])
      
      inline def setColorDistanceFormulaUndefined: Self = StObject.set(x, "colorDistanceFormula", js.undefined)
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setPaletteQuantization(value: PaletteQuantization): Self = StObject.set(x, "paletteQuantization", value.asInstanceOf[js.Any])
      
      inline def setPaletteQuantizationUndefined: Self = StObject.set(x, "paletteQuantization", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageQ.imageQStrings.`cie94-textiles`
    - typings.imageQ.imageQStrings.`cie94-graphic-arts`
    - typings.imageQ.imageQStrings.ciede2000
    - typings.imageQ.imageQStrings.`color-metric`
    - typings.imageQ.imageQStrings.euclidean
    - typings.imageQ.imageQStrings.`euclidean-bt709-noalpha`
    - typings.imageQ.imageQStrings.`euclidean-bt709`
    - typings.imageQ.imageQStrings.manhattan
    - typings.imageQ.imageQStrings.`manhattan-bt709`
    - typings.imageQ.imageQStrings.`manhattan-nommyde`
    - typings.imageQ.imageQStrings.pngquant
  */
  trait ColorDistanceFormula extends StObject
  object ColorDistanceFormula {
    
    inline def `cie94-graphic-arts`: typings.imageQ.imageQStrings.`cie94-graphic-arts` = "cie94-graphic-arts".asInstanceOf[typings.imageQ.imageQStrings.`cie94-graphic-arts`]
    
    inline def `cie94-textiles`: typings.imageQ.imageQStrings.`cie94-textiles` = "cie94-textiles".asInstanceOf[typings.imageQ.imageQStrings.`cie94-textiles`]
    
    inline def ciede2000: typings.imageQ.imageQStrings.ciede2000 = "ciede2000".asInstanceOf[typings.imageQ.imageQStrings.ciede2000]
    
    inline def `color-metric`: typings.imageQ.imageQStrings.`color-metric` = "color-metric".asInstanceOf[typings.imageQ.imageQStrings.`color-metric`]
    
    inline def euclidean: typings.imageQ.imageQStrings.euclidean = "euclidean".asInstanceOf[typings.imageQ.imageQStrings.euclidean]
    
    inline def `euclidean-bt709`: typings.imageQ.imageQStrings.`euclidean-bt709` = "euclidean-bt709".asInstanceOf[typings.imageQ.imageQStrings.`euclidean-bt709`]
    
    inline def `euclidean-bt709-noalpha`: typings.imageQ.imageQStrings.`euclidean-bt709-noalpha` = "euclidean-bt709-noalpha".asInstanceOf[typings.imageQ.imageQStrings.`euclidean-bt709-noalpha`]
    
    inline def manhattan: typings.imageQ.imageQStrings.manhattan = "manhattan".asInstanceOf[typings.imageQ.imageQStrings.manhattan]
    
    inline def `manhattan-bt709`: typings.imageQ.imageQStrings.`manhattan-bt709` = "manhattan-bt709".asInstanceOf[typings.imageQ.imageQStrings.`manhattan-bt709`]
    
    inline def `manhattan-nommyde`: typings.imageQ.imageQStrings.`manhattan-nommyde` = "manhattan-nommyde".asInstanceOf[typings.imageQ.imageQStrings.`manhattan-nommyde`]
    
    inline def pngquant: typings.imageQ.imageQStrings.pngquant = "pngquant".asInstanceOf[typings.imageQ.imageQStrings.pngquant]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageQ.imageQStrings.nearest
    - typings.imageQ.imageQStrings.riemersma
    - typings.imageQ.imageQStrings.`floyd-steinberg`
    - typings.imageQ.imageQStrings.`false-floyd-steinberg`
    - typings.imageQ.imageQStrings.stucki
    - typings.imageQ.imageQStrings.atkinson
    - typings.imageQ.imageQStrings.jarvis
    - typings.imageQ.imageQStrings.burkes
    - typings.imageQ.imageQStrings.sierra
    - typings.imageQ.imageQStrings.`two-sierra`
    - typings.imageQ.imageQStrings.`sierra-lite`
  */
  trait ImageQuantization extends StObject
  object ImageQuantization {
    
    inline def atkinson: typings.imageQ.imageQStrings.atkinson = "atkinson".asInstanceOf[typings.imageQ.imageQStrings.atkinson]
    
    inline def burkes: typings.imageQ.imageQStrings.burkes = "burkes".asInstanceOf[typings.imageQ.imageQStrings.burkes]
    
    inline def `false-floyd-steinberg`: typings.imageQ.imageQStrings.`false-floyd-steinberg` = "false-floyd-steinberg".asInstanceOf[typings.imageQ.imageQStrings.`false-floyd-steinberg`]
    
    inline def `floyd-steinberg`: typings.imageQ.imageQStrings.`floyd-steinberg` = "floyd-steinberg".asInstanceOf[typings.imageQ.imageQStrings.`floyd-steinberg`]
    
    inline def jarvis: typings.imageQ.imageQStrings.jarvis = "jarvis".asInstanceOf[typings.imageQ.imageQStrings.jarvis]
    
    inline def nearest: typings.imageQ.imageQStrings.nearest = "nearest".asInstanceOf[typings.imageQ.imageQStrings.nearest]
    
    inline def riemersma: typings.imageQ.imageQStrings.riemersma = "riemersma".asInstanceOf[typings.imageQ.imageQStrings.riemersma]
    
    inline def sierra: typings.imageQ.imageQStrings.sierra = "sierra".asInstanceOf[typings.imageQ.imageQStrings.sierra]
    
    inline def `sierra-lite`: typings.imageQ.imageQStrings.`sierra-lite` = "sierra-lite".asInstanceOf[typings.imageQ.imageQStrings.`sierra-lite`]
    
    inline def stucki: typings.imageQ.imageQStrings.stucki = "stucki".asInstanceOf[typings.imageQ.imageQStrings.stucki]
    
    inline def `two-sierra`: typings.imageQ.imageQStrings.`two-sierra` = "two-sierra".asInstanceOf[typings.imageQ.imageQStrings.`two-sierra`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageQ.imageQStrings.neuquant
    - typings.imageQ.imageQStrings.`neuquant-float`
    - typings.imageQ.imageQStrings.rgbquant
    - typings.imageQ.imageQStrings.wuquant
  */
  trait PaletteQuantization extends StObject
  object PaletteQuantization {
    
    inline def neuquant: typings.imageQ.imageQStrings.neuquant = "neuquant".asInstanceOf[typings.imageQ.imageQStrings.neuquant]
    
    inline def `neuquant-float`: typings.imageQ.imageQStrings.`neuquant-float` = "neuquant-float".asInstanceOf[typings.imageQ.imageQStrings.`neuquant-float`]
    
    inline def rgbquant: typings.imageQ.imageQStrings.rgbquant = "rgbquant".asInstanceOf[typings.imageQ.imageQStrings.rgbquant]
    
    inline def wuquant: typings.imageQ.imageQStrings.wuquant = "wuquant".asInstanceOf[typings.imageQ.imageQStrings.wuquant]
  }
  
  trait ProgressOptions extends StObject {
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  }
  object ProgressOptions {
    
    inline def apply(): ProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressOptions] (val x: Self) extends AnyVal {
      
      inline def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
}
