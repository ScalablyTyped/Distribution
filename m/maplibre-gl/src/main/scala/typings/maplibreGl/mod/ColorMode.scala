package typings.maplibreGl.mod

import typings.maplibreGl.anon.ReadonlyColorMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ColorMode")
@js.native
open class ColorMode protected () extends StObject {
  def this(blendFunction: BlendFuncType, blendColor: Color, mask: ColorMaskType) = this()
  
  var blendColor: Color = js.native
  
  var blendFunction: BlendFuncType = js.native
  
  var mask: ColorMaskType = js.native
}
/* static members */
object ColorMode {
  
  @JSImport("maplibre-gl", "ColorMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "ColorMode.Replace")
  @js.native
  def Replace: BlendFuncType = js.native
  inline def Replace_=(x: BlendFuncType): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Replace")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "ColorMode.alphaBlended")
  @js.native
  def alphaBlended: ReadonlyColorMode = js.native
  inline def alphaBlended_=(x: ReadonlyColorMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphaBlended")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "ColorMode.disabled")
  @js.native
  def disabled: ReadonlyColorMode = js.native
  inline def disabled_=(x: ReadonlyColorMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "ColorMode.unblended")
  @js.native
  def unblended: ReadonlyColorMode = js.native
  inline def unblended_=(x: ReadonlyColorMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unblended")(x.asInstanceOf[js.Any])
}
