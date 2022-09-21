package typings.maplibreGl.anon

import typings.maplibreGl.mod.BlendFuncType
import typings.maplibreGl.mod.Color
import typings.maplibreGl.mod.ColorMaskType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<maplibre-gl.maplibre-gl.ColorMode> */
trait ReadonlyColorMode extends StObject {
  
  val Replace: js.UndefOr[Any] = js.undefined
  
  val alphaBlended: js.UndefOr[Any] = js.undefined
  
  val blendColor: Color
  
  val blendFunction: BlendFuncType
  
  val disabled: js.UndefOr[Any] = js.undefined
  
  val mask: ColorMaskType
  
  val unblended: js.UndefOr[Any] = js.undefined
}
object ReadonlyColorMode {
  
  inline def apply(blendColor: Color, blendFunction: BlendFuncType, mask: ColorMaskType): ReadonlyColorMode = {
    val __obj = js.Dynamic.literal(blendColor = blendColor.asInstanceOf[js.Any], blendFunction = blendFunction.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyColorMode]
  }
  
  extension [Self <: ReadonlyColorMode](x: Self) {
    
    inline def setAlphaBlended(value: Any): Self = StObject.set(x, "alphaBlended", value.asInstanceOf[js.Any])
    
    inline def setAlphaBlendedUndefined: Self = StObject.set(x, "alphaBlended", js.undefined)
    
    inline def setBlendColor(value: Color): Self = StObject.set(x, "blendColor", value.asInstanceOf[js.Any])
    
    inline def setBlendFunction(value: BlendFuncType): Self = StObject.set(x, "blendFunction", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMask(value: ColorMaskType): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Any): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    inline def setUnblended(value: Any): Self = StObject.set(x, "unblended", value.asInstanceOf[js.Any])
    
    inline def setUnblendedUndefined: Self = StObject.set(x, "unblended", js.undefined)
  }
}
