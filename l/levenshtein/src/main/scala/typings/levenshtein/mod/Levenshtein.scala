package typings.levenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levenshtein extends js.Object {
  
  /**
    * Distance between strings
    */
  var distance: Double = js.native
  
  /**
    * Return the Levenshtein table.
    */
  def getMatrix(): js.Array[js.Array[Double]] = js.native
  
  /**
    * Pretty print Levenshtein table.
    */
  def inspect(): String = js.native
}
object Levenshtein {
  
  @scala.inline
  def apply(distance: Double, getMatrix: () => js.Array[js.Array[Double]], inspect: () => String): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect))
    __obj.asInstanceOf[Levenshtein]
  }
  
  @scala.inline
  implicit class LevenshteinOps[Self <: Levenshtein] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMatrix(value: () => js.Array[js.Array[Double]]): Self = this.set("getMatrix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
  }
}
