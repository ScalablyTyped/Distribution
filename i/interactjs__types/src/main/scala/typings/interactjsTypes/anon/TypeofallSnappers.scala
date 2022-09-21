package typings.interactjsTypes.anon

import typings.interactjsTypes.gridMod.GridOptions
import typings.interactjsTypes.snapPointerMod.SnapFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofallSnappers extends StObject {
  
  def edgeTarget(): Unit
  
  def elements(): Unit
  
  def grid(grid: GridOptions): SnapFunction & CoordFields
}
object TypeofallSnappers {
  
  inline def apply(edgeTarget: () => Unit, elements: () => Unit, grid: GridOptions => SnapFunction & CoordFields): TypeofallSnappers = {
    val __obj = js.Dynamic.literal(edgeTarget = js.Any.fromFunction0(edgeTarget), elements = js.Any.fromFunction0(elements), grid = js.Any.fromFunction1(grid))
    __obj.asInstanceOf[TypeofallSnappers]
  }
  
  extension [Self <: TypeofallSnappers](x: Self) {
    
    inline def setEdgeTarget(value: () => Unit): Self = StObject.set(x, "edgeTarget", js.Any.fromFunction0(value))
    
    inline def setElements(value: () => Unit): Self = StObject.set(x, "elements", js.Any.fromFunction0(value))
    
    inline def setGrid(value: GridOptions => SnapFunction & CoordFields): Self = StObject.set(x, "grid", js.Any.fromFunction1(value))
  }
}
