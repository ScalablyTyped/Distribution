package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolsScopedList extends js.Object {
  
  /** A list of target pools contained in this scope. */
  var targetPools: js.UndefOr[js.Array[TargetPool]] = js.native
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetPoolsScopedList {
  
  @scala.inline
  def apply(): TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsScopedList]
  }
  
  @scala.inline
  implicit class TargetPoolsScopedListOps[Self <: TargetPoolsScopedList] (val x: Self) extends AnyVal {
    
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
    def setTargetPoolsVarargs(value: TargetPool*): Self = this.set("targetPools", js.Array(value :_*))
    
    @scala.inline
    def setTargetPools(value: js.Array[TargetPool]): Self = this.set("targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPools: Self = this.set("targetPools", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
