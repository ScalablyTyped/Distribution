package typings.instagramPrivateApi.mediaRepositoryConfigureVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryConfigureVideoResponseImageVersions2 extends js.Object {
  
  var candidates: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem] = js.native
}
object MediaRepositoryConfigureVideoResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem]): MediaRepositoryConfigureVideoResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseImageVersions2]
  }
  
  @scala.inline
  implicit class MediaRepositoryConfigureVideoResponseImageVersions2Ops[Self <: MediaRepositoryConfigureVideoResponseImageVersions2] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: MediaRepositoryConfigureVideoResponseCandidatesItem*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem]): Self = this.set("candidates", value.asInstanceOf[js.Any])
  }
}
