package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxiesScopedList extends js.Object {
  
  /** A list of TargetHttpsProxies contained in this scope. */
  var targetHttpsProxies: js.UndefOr[js.Array[TargetHttpsProxy]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetHttpsProxiesScopedList {
  
  @scala.inline
  def apply(): TargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesScopedList]
  }
  
  @scala.inline
  implicit class TargetHttpsProxiesScopedListOps[Self <: TargetHttpsProxiesScopedList] (val x: Self) extends AnyVal {
    
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
    def setTargetHttpsProxiesVarargs(value: TargetHttpsProxy*): Self = this.set("targetHttpsProxies", js.Array(value :_*))
    
    @scala.inline
    def setTargetHttpsProxies(value: js.Array[TargetHttpsProxy]): Self = this.set("targetHttpsProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetHttpsProxies: Self = this.set("targetHttpsProxies", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
