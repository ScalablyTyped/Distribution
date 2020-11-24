package typings.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRequestResults extends js.Object {
  
  var hasError: Boolean = js.native
  
  var results: js.Array[BatchRequestResult] = js.native
}
object BatchRequestResults {
  
  @scala.inline
  def apply(hasError: Boolean, results: js.Array[BatchRequestResult]): BatchRequestResults = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestResults]
  }
  
  @scala.inline
  implicit class BatchRequestResultsOps[Self <: BatchRequestResults] (val x: Self) extends AnyVal {
    
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
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: BatchRequestResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[BatchRequestResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
