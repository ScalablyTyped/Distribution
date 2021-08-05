package typings.javascriptAstar

import typings.javascriptAstar.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heuristics extends StObject {
  
  def diagonal(pos0: X, pos1: X): Double
  @JSName("diagonal")
  var diagonal_Original: Heuristic
  
  def manhattan(pos0: X, pos1: X): Double
  @JSName("manhattan")
  var manhattan_Original: Heuristic
}
object Heuristics {
  
  inline def apply(
    diagonal: (/* pos0 */ X, /* pos1 */ X) => Double,
    manhattan: (/* pos0 */ X, /* pos1 */ X) => Double
  ): Heuristics = {
    val __obj = js.Dynamic.literal(diagonal = js.Any.fromFunction2(diagonal), manhattan = js.Any.fromFunction2(manhattan))
    __obj.asInstanceOf[Heuristics]
  }
  
  extension [Self <: Heuristics](x: Self) {
    
    inline def setDiagonal(value: (/* pos0 */ X, /* pos1 */ X) => Double): Self = StObject.set(x, "diagonal", js.Any.fromFunction2(value))
    
    inline def setManhattan(value: (/* pos0 */ X, /* pos1 */ X) => Double): Self = StObject.set(x, "manhattan", js.Any.fromFunction2(value))
  }
}
