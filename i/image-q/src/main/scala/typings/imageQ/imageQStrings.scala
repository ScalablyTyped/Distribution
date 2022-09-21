package typings.imageQ

import typings.imageQ.basicAPIMod.ColorDistanceFormula
import typings.imageQ.basicAPIMod.ImageQuantization
import typings.imageQ.basicAPIMod.PaletteQuantization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageQStrings {
  
  @js.native
  sealed trait atkinson
    extends StObject
       with ImageQuantization
  inline def atkinson: atkinson = "atkinson".asInstanceOf[atkinson]
  
  @js.native
  sealed trait burkes
    extends StObject
       with ImageQuantization
  inline def burkes: burkes = "burkes".asInstanceOf[burkes]
  
  @js.native
  sealed trait `cie94-graphic-arts`
    extends StObject
       with ColorDistanceFormula
  inline def `cie94-graphic-arts`: `cie94-graphic-arts` = "cie94-graphic-arts".asInstanceOf[`cie94-graphic-arts`]
  
  @js.native
  sealed trait `cie94-textiles`
    extends StObject
       with ColorDistanceFormula
  inline def `cie94-textiles`: `cie94-textiles` = "cie94-textiles".asInstanceOf[`cie94-textiles`]
  
  @js.native
  sealed trait ciede2000
    extends StObject
       with ColorDistanceFormula
  inline def ciede2000: ciede2000 = "ciede2000".asInstanceOf[ciede2000]
  
  @js.native
  sealed trait `color-metric`
    extends StObject
       with ColorDistanceFormula
  inline def `color-metric`: `color-metric` = "color-metric".asInstanceOf[`color-metric`]
  
  @js.native
  sealed trait euclidean
    extends StObject
       with ColorDistanceFormula
  inline def euclidean: euclidean = "euclidean".asInstanceOf[euclidean]
  
  @js.native
  sealed trait `euclidean-bt709`
    extends StObject
       with ColorDistanceFormula
  inline def `euclidean-bt709`: `euclidean-bt709` = "euclidean-bt709".asInstanceOf[`euclidean-bt709`]
  
  @js.native
  sealed trait `euclidean-bt709-noalpha`
    extends StObject
       with ColorDistanceFormula
  inline def `euclidean-bt709-noalpha`: `euclidean-bt709-noalpha` = "euclidean-bt709-noalpha".asInstanceOf[`euclidean-bt709-noalpha`]
  
  @js.native
  sealed trait `false-floyd-steinberg`
    extends StObject
       with ImageQuantization
  inline def `false-floyd-steinberg`: `false-floyd-steinberg` = "false-floyd-steinberg".asInstanceOf[`false-floyd-steinberg`]
  
  @js.native
  sealed trait `floyd-steinberg`
    extends StObject
       with ImageQuantization
  inline def `floyd-steinberg`: `floyd-steinberg` = "floyd-steinberg".asInstanceOf[`floyd-steinberg`]
  
  @js.native
  sealed trait jarvis
    extends StObject
       with ImageQuantization
  inline def jarvis: jarvis = "jarvis".asInstanceOf[jarvis]
  
  @js.native
  sealed trait manhattan
    extends StObject
       with ColorDistanceFormula
  inline def manhattan: manhattan = "manhattan".asInstanceOf[manhattan]
  
  @js.native
  sealed trait `manhattan-bt709`
    extends StObject
       with ColorDistanceFormula
  inline def `manhattan-bt709`: `manhattan-bt709` = "manhattan-bt709".asInstanceOf[`manhattan-bt709`]
  
  @js.native
  sealed trait `manhattan-nommyde`
    extends StObject
       with ColorDistanceFormula
  inline def `manhattan-nommyde`: `manhattan-nommyde` = "manhattan-nommyde".asInstanceOf[`manhattan-nommyde`]
  
  @js.native
  sealed trait nearest
    extends StObject
       with ImageQuantization
  inline def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait neuquant
    extends StObject
       with PaletteQuantization
  inline def neuquant: neuquant = "neuquant".asInstanceOf[neuquant]
  
  @js.native
  sealed trait `neuquant-float`
    extends StObject
       with PaletteQuantization
  inline def `neuquant-float`: `neuquant-float` = "neuquant-float".asInstanceOf[`neuquant-float`]
  
  @js.native
  sealed trait pngquant
    extends StObject
       with ColorDistanceFormula
  inline def pngquant: pngquant = "pngquant".asInstanceOf[pngquant]
  
  @js.native
  sealed trait rgbquant
    extends StObject
       with PaletteQuantization
  inline def rgbquant: rgbquant = "rgbquant".asInstanceOf[rgbquant]
  
  @js.native
  sealed trait riemersma
    extends StObject
       with ImageQuantization
  inline def riemersma: riemersma = "riemersma".asInstanceOf[riemersma]
  
  @js.native
  sealed trait sierra
    extends StObject
       with ImageQuantization
  inline def sierra: sierra = "sierra".asInstanceOf[sierra]
  
  @js.native
  sealed trait `sierra-lite`
    extends StObject
       with ImageQuantization
  inline def `sierra-lite`: `sierra-lite` = "sierra-lite".asInstanceOf[`sierra-lite`]
  
  @js.native
  sealed trait stucki
    extends StObject
       with ImageQuantization
  inline def stucki: stucki = "stucki".asInstanceOf[stucki]
  
  @js.native
  sealed trait `two-sierra`
    extends StObject
       with ImageQuantization
  inline def `two-sierra`: `two-sierra` = "two-sierra".asInstanceOf[`two-sierra`]
  
  @js.native
  sealed trait wuquant
    extends StObject
       with PaletteQuantization
  inline def wuquant: wuquant = "wuquant".asInstanceOf[wuquant]
}
