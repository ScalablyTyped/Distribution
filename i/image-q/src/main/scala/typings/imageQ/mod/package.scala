package typings.imageQ.mod

import typings.imageQ.distTypesSrcBasicAPIMod.ApplyPaletteOptions
import typings.imageQ.distTypesSrcBasicAPIMod.BuildPaletteOptions
import typings.imageQ.distTypesSrcBasicAPIMod.ProgressOptions
import typings.imageQ.distTypesSrcUtilsPaletteMod.Palette
import typings.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import typings.imageQ.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def applyPalette(image: PointContainer, palette: Palette): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
inline def applyPalette(image: PointContainer, palette: Palette, param2: ApplyPaletteOptions & ProgressOptions): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]

inline def applyPaletteSync(image: PointContainer, palette: Palette): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
inline def applyPaletteSync(image: PointContainer, palette: Palette, param2: ApplyPaletteOptions): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[PointContainer]

inline def buildPalette(images: js.Array[PointContainer]): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
inline def buildPalette(images: js.Array[PointContainer], param1: BuildPaletteOptions & ProgressOptions): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]

inline def buildPaletteSync(images: js.Array[PointContainer]): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any]).asInstanceOf[Palette]
inline def buildPaletteSync(images: js.Array[PointContainer], param1: BuildPaletteOptions): Palette = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Palette]
