package typings.hyperformula.anon

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsDependencyGraphMod.RangeVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestRange extends StObject {
  
  var restRange: AbsoluteCellRange
  
  var smallerRangeVertex: js.UndefOr[RangeVertex] = js.undefined
}
object RestRange {
  
  inline def apply(restRange: AbsoluteCellRange): RestRange = {
    val __obj = js.Dynamic.literal(restRange = restRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestRange]
  }
  
  extension [Self <: RestRange](x: Self) {
    
    inline def setRestRange(value: AbsoluteCellRange): Self = StObject.set(x, "restRange", value.asInstanceOf[js.Any])
    
    inline def setSmallerRangeVertex(value: RangeVertex): Self = StObject.set(x, "smallerRangeVertex", value.asInstanceOf[js.Any])
    
    inline def setSmallerRangeVertexUndefined: Self = StObject.set(x, "smallerRangeVertex", js.undefined)
  }
}
