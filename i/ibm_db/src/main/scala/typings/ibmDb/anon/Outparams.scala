package typings.ibmDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outparams extends js.Object {
  
  var outparams: js.Any = js.native
  
  var result: js.Array[_] = js.native
}
object Outparams {
  
  @scala.inline
  def apply(outparams: js.Any, result: js.Array[_]): Outparams = {
    val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outparams]
  }
  
  @scala.inline
  implicit class OutparamsOps[Self <: Outparams] (val x: Self) extends AnyVal {
    
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
    def setOutparams(value: js.Any): Self = this.set("outparams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: js.Any*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[_]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
