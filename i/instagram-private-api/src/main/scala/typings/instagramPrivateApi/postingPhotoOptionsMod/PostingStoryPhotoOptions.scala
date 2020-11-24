package typings.instagramPrivateApi.postingPhotoOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingStoryPhotoOptions extends PostingStoryOptions {
  
  var file: Buffer = js.native
}
object PostingStoryPhotoOptions {
  
  @scala.inline
  def apply(file: Buffer): PostingStoryPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryPhotoOptions]
  }
  
  @scala.inline
  implicit class PostingStoryPhotoOptionsOps[Self <: PostingStoryPhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
  }
}
