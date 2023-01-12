package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TileLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTileLayout extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TileLayout
  
  /* static member */
  var fn: TileLayout
}
object TypeofTileLayout {
  
  inline def apply(extend: js.Object => TileLayout, fn: TileLayout): TypeofTileLayout = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTileLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTileLayout] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TileLayout): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TileLayout): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
