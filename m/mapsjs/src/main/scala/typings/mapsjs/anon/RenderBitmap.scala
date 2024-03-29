package typings.mapsjs.anon

import typings.mapsjs.mod.geometry
import typings.mapsjs.mod.point
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderBitmap extends StObject {
  
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
  
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
}
object RenderBitmap {
  
  inline def apply(): RenderBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderBitmap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderBitmap] (val x: Self) extends AnyVal {
    
    inline def setRenderBitmap(
      value: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Unit
    ): Self = StObject.set(x, "renderBitmap", js.Any.fromFunction4(value))
    
    inline def setRenderBitmapUndefined: Self = StObject.set(x, "renderBitmap", js.undefined)
    
    inline def setRenderGeometry(value: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "renderGeometry", js.Any.fromFunction2(value))
    
    inline def setRenderGeometryUndefined: Self = StObject.set(x, "renderGeometry", js.undefined)
    
    inline def setRenderPoint(value: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "renderPoint", js.Any.fromFunction2(value))
    
    inline def setRenderPointUndefined: Self = StObject.set(x, "renderPoint", js.undefined)
  }
}
