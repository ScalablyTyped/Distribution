package typings.maplibreGl.anon

import typings.maplibreGl.mod.CullFaceModeType
import typings.maplibreGl.mod.FrontFaceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<maplibre-gl.maplibre-gl.CullFaceMode> */
trait ReadonlyCullFaceMode extends StObject {
  
  val backCCW: js.UndefOr[Any] = js.undefined
  
  val disabled: js.UndefOr[Any] = js.undefined
  
  val enable: Boolean
  
  val frontFace: FrontFaceType
  
  val mode: CullFaceModeType
}
object ReadonlyCullFaceMode {
  
  inline def apply(enable: Boolean, frontFace: FrontFaceType, mode: CullFaceModeType): ReadonlyCullFaceMode = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], frontFace = frontFace.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCullFaceMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyCullFaceMode] (val x: Self) extends AnyVal {
    
    inline def setBackCCW(value: Any): Self = StObject.set(x, "backCCW", value.asInstanceOf[js.Any])
    
    inline def setBackCCWUndefined: Self = StObject.set(x, "backCCW", js.undefined)
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setFrontFace(value: FrontFaceType): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    inline def setMode(value: CullFaceModeType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
