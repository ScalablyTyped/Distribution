package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAccountSummaryUnit extends js.Object {
  
  var posts_count: Double = js.native
}
object InsightsServiceAccountResponseAccountSummaryUnit {
  
  @scala.inline
  def apply(posts_count: Double): InsightsServiceAccountResponseAccountSummaryUnit = {
    val __obj = js.Dynamic.literal(posts_count = posts_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountSummaryUnit]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountSummaryUnitOps[Self <: InsightsServiceAccountResponseAccountSummaryUnit] (val x: Self) extends AnyVal {
    
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
    def setPosts_count(value: Double): Self = this.set("posts_count", value.asInstanceOf[js.Any])
  }
}
