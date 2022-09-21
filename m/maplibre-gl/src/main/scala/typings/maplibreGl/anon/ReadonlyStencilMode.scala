package typings.maplibreGl.anon

import typings.maplibreGl.mod.StencilOpConstant
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<maplibre-gl.maplibre-gl.StencilMode> */
trait ReadonlyStencilMode extends StObject {
  
  val depthFail: StencilOpConstant
  
  val disabled: js.UndefOr[Any] = js.undefined
  
  val fail: StencilOpConstant
  
  val mask: Double
  
  val pass: StencilOpConstant
  
  val ref: Double
  
  val test: StencilTestGL
}
object ReadonlyStencilMode {
  
  inline def apply(
    depthFail: StencilOpConstant,
    fail: StencilOpConstant,
    mask: Double,
    pass: StencilOpConstant,
    ref: Double,
    test: StencilTestGL
  ): ReadonlyStencilMode = {
    val __obj = js.Dynamic.literal(depthFail = depthFail.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyStencilMode]
  }
  
  extension [Self <: ReadonlyStencilMode](x: Self) {
    
    inline def setDepthFail(value: StencilOpConstant): Self = StObject.set(x, "depthFail", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFail(value: StencilOpConstant): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setPass(value: StencilOpConstant): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setTest(value: StencilTestGL): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
