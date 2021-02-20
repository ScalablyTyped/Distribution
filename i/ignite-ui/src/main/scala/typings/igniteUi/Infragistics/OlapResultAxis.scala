package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultAxis extends StObject {
  
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  def tupleSize(): Double = js.native
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def tuples(): js.Array[_] = js.native
}
object OlapResultAxis {
  
  @scala.inline
  def apply(tupleSize: () => Double, tuples: () => js.Array[_]): OlapResultAxis = {
    val __obj = js.Dynamic.literal(tupleSize = js.Any.fromFunction0(tupleSize), tuples = js.Any.fromFunction0(tuples))
    __obj.asInstanceOf[OlapResultAxis]
  }
  
  @scala.inline
  implicit class OlapResultAxisMutableBuilder[Self <: OlapResultAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTupleSize(value: () => Double): Self = StObject.set(x, "tupleSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTuples(value: () => js.Array[_]): Self = StObject.set(x, "tuples", js.Any.fromFunction0(value))
  }
}
