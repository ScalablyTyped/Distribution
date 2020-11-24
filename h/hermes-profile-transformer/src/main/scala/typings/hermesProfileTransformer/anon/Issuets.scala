package typings.hermesProfileTransformer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Issuets extends js.Object {
  
  var issue_ts: js.UndefOr[Double] = js.native
  
  var sync_id: String = js.native
}
object Issuets {
  
  @scala.inline
  def apply(sync_id: String): Issuets = {
    val __obj = js.Dynamic.literal(sync_id = sync_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuets]
  }
  
  @scala.inline
  implicit class IssuetsOps[Self <: Issuets] (val x: Self) extends AnyVal {
    
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
    def setSync_id(value: String): Self = this.set("sync_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_ts(value: Double): Self = this.set("issue_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssue_ts: Self = this.set("issue_ts", js.undefined)
  }
}
