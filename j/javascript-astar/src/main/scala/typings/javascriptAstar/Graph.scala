package typings.javascriptAstar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph extends StObject {
  
  var grid: js.Array[js.Array[GridNode]]
}
object Graph {
  
  inline def apply(grid: js.Array[js.Array[GridNode]]): Graph = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
    
    inline def setGrid(value: js.Array[js.Array[GridNode]]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridVarargs(value: js.Array[GridNode]*): Self = StObject.set(x, "grid", js.Array(value*))
  }
}
