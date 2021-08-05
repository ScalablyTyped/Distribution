package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadthFirst extends StObject {
  
  var breadthFirst: js.UndefOr[Boolean] = js.undefined
  
  var deep: js.UndefOr[Boolean] = js.undefined
}
object BreadthFirst {
  
  inline def apply(): BreadthFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadthFirst]
  }
  
  extension [Self <: BreadthFirst](x: Self) {
    
    inline def setBreadthFirst(value: Boolean): Self = StObject.set(x, "breadthFirst", value.asInstanceOf[js.Any])
    
    inline def setBreadthFirstUndefined: Self = StObject.set(x, "breadthFirst", js.undefined)
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
  }
}
