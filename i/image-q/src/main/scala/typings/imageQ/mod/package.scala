package typings.imageQ.mod

import typings.imageQ.basicAPIMod.ApplyPaletteOptions
import typings.imageQ.basicAPIMod.BuildPaletteOptions
import typings.imageQ.basicAPIMod.ProgressOptions
import typings.imageQ.mod.^
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def applyPalette(image: PointContainer, palette: Palette): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
inline def applyPalette(
  image: PointContainer,
  palette: Palette,
  hasColorDistanceFormulaImageQuantizationOnProgress: ApplyPaletteOptions & ProgressOptions
): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], hasColorDistanceFormulaImageQuantizationOnProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]

inline def applyPaletteSync(image: PointContainer, palette: Palette): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
inline def applyPaletteSync(
  image: PointContainer,
  palette: Palette,
  hasColorDistanceFormulaImageQuantization: ApplyPaletteOptions
): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], hasColorDistanceFormulaImageQuantization.asInstanceOf[js.Any])).asInstanceOf[PointContainer]

inline def buildPalette(images: js.Array[PointContainer]): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
inline def buildPalette(
  images: js.Array[PointContainer],
  hasColorDistanceFormulaPaletteQuantizationColorsOnProgress: BuildPaletteOptions & ProgressOptions
): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any], hasColorDistanceFormulaPaletteQuantizationColorsOnProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]

inline def buildPaletteSync(images: js.Array[PointContainer]): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any]).asInstanceOf[Palette]
inline def buildPaletteSync(
  images: js.Array[PointContainer],
  hasColorDistanceFormulaPaletteQuantizationColors: BuildPaletteOptions
): Palette = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any], hasColorDistanceFormulaPaletteQuantizationColors.asInstanceOf[js.Any])).asInstanceOf[Palette]
