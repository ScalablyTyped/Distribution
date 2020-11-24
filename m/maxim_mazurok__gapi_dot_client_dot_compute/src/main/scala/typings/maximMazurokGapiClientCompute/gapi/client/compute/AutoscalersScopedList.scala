package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalersScopedList extends js.Object {
  
  /** [Output Only] A list of autoscalers contained in this scope. */
  var autoscalers: js.UndefOr[js.Array[Autoscaler]] = js.native
  
  /** [Output Only] Informational warning which replaces the list of autoscalers when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object AutoscalersScopedList {
  
  @scala.inline
  def apply(): AutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalersScopedList]
  }
  
  @scala.inline
  implicit class AutoscalersScopedListOps[Self <: AutoscalersScopedList] (val x: Self) extends AnyVal {
    
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
    def setAutoscalersVarargs(value: Autoscaler*): Self = this.set("autoscalers", js.Array(value :_*))
    
    @scala.inline
    def setAutoscalers(value: js.Array[Autoscaler]): Self = this.set("autoscalers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalers: Self = this.set("autoscalers", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
