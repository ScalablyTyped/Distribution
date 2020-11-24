package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultAxis extends js.Object {
  
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
  implicit class OlapResultAxisOps[Self <: OlapResultAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTupleSize(value: () => Double): Self = this.set("tupleSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTuples(value: () => js.Array[_]): Self = this.set("tuples", js.Any.fromFunction0(value))
  }
}
