package typings.maplibreGl.anon

import typings.maplibreGl.mod.DepthFuncType
import typings.maplibreGl.mod.DepthMaskType
import typings.maplibreGl.mod.DepthRangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<maplibre-gl.maplibre-gl.DepthMode> */
trait ReadonlyDepthMode extends StObject {
  
  val ReadOnly: js.UndefOr[Any] = js.undefined
  
  val ReadWrite: js.UndefOr[Any] = js.undefined
  
  val disabled: js.UndefOr[Any] = js.undefined
  
  val func: DepthFuncType
  
  val mask: DepthMaskType
  
  val range: DepthRangeType
}
object ReadonlyDepthMode {
  
  inline def apply(func: DepthFuncType, mask: DepthMaskType, range: DepthRangeType): ReadonlyDepthMode = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDepthMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyDepthMode] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFunc(value: DepthFuncType): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: DepthMaskType): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setRange(value: DepthRangeType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Any): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setReadWrite(value: Any): Self = StObject.set(x, "ReadWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "ReadWrite", js.undefined)
  }
}
