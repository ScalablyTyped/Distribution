package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultAxis extends StObject {
  
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  def tupleSize(): Double
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def tuples(): js.Array[Any]
}
object OlapResultAxis {
  
  inline def apply(tupleSize: () => Double, tuples: () => js.Array[Any]): OlapResultAxis = {
    val __obj = js.Dynamic.literal(tupleSize = js.Any.fromFunction0(tupleSize), tuples = js.Any.fromFunction0(tuples))
    __obj.asInstanceOf[OlapResultAxis]
  }
  
  extension [Self <: OlapResultAxis](x: Self) {
    
    inline def setTupleSize(value: () => Double): Self = StObject.set(x, "tupleSize", js.Any.fromFunction0(value))
    
    inline def setTuples(value: () => js.Array[Any]): Self = StObject.set(x, "tuples", js.Any.fromFunction0(value))
  }
}
