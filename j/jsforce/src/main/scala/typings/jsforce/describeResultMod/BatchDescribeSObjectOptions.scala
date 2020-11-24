package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDescribeSObjectOptions extends js.Object {
  
  var autofetch: js.UndefOr[Boolean] = js.native
  
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  
  var types: js.Array[String] = js.native
}
object BatchDescribeSObjectOptions {
  
  @scala.inline
  def apply(types: js.Array[String]): BatchDescribeSObjectOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSObjectOptions]
  }
  
  @scala.inline
  implicit class BatchDescribeSObjectOptionsOps[Self <: BatchDescribeSObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofetch(value: Boolean): Self = this.set("autofetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofetch: Self = this.set("autofetch", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = this.set("maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentRequests: Self = this.set("maxConcurrentRequests", js.undefined)
  }
}
