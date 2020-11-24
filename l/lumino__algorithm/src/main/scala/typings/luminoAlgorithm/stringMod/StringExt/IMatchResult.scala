package typings.luminoAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a string match function.
  */
@js.native
trait IMatchResult extends js.Object {
  
  /**
    * The indices of the matched characters in the source text.
    *
    * The indices will appear in increasing order.
    */
  var indices: js.Array[Double] = js.native
  
  /**
    * A score which indicates the strength of the match.
    *
    * The documentation of a given match function should specify
    * whether a lower or higher score is a stronger match.
    */
  var score: Double = js.native
}
object IMatchResult {
  
  @scala.inline
  def apply(indices: js.Array[Double], score: Double): IMatchResult = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatchResult]
  }
  
  @scala.inline
  implicit class IMatchResultOps[Self <: IMatchResult] (val x: Self) extends AnyVal {
    
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
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
