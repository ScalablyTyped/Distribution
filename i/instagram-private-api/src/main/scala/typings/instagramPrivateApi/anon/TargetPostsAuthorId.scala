package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPostsAuthorId extends js.Object {
  
  var targetPostsAuthorId: js.UndefOr[String] = js.native
  
  var targetReelAuthorId: js.UndefOr[String] = js.native
}
object TargetPostsAuthorId {
  
  @scala.inline
  def apply(): TargetPostsAuthorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPostsAuthorId]
  }
  
  @scala.inline
  implicit class TargetPostsAuthorIdOps[Self <: TargetPostsAuthorId] (val x: Self) extends AnyVal {
    
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
    def setTargetPostsAuthorId(value: String): Self = this.set("targetPostsAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPostsAuthorId: Self = this.set("targetPostsAuthorId", js.undefined)
    
    @scala.inline
    def setTargetReelAuthorId(value: String): Self = this.set("targetReelAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReelAuthorId: Self = this.set("targetReelAuthorId", js.undefined)
  }
}
