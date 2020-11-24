package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlTagObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyTags extends js.Object {
  
  var bodyTags: js.Array[HtmlTagObject] = js.native
  
  var headTags: js.Array[HtmlTagObject] = js.native
}
object BodyTags {
  
  @scala.inline
  def apply(bodyTags: js.Array[HtmlTagObject], headTags: js.Array[HtmlTagObject]): BodyTags = {
    val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTags]
  }
  
  @scala.inline
  implicit class BodyTagsOps[Self <: BodyTags] (val x: Self) extends AnyVal {
    
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
    def setBodyTagsVarargs(value: HtmlTagObject*): Self = this.set("bodyTags", js.Array(value :_*))
    
    @scala.inline
    def setBodyTags(value: js.Array[HtmlTagObject]): Self = this.set("bodyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadTagsVarargs(value: HtmlTagObject*): Self = this.set("headTags", js.Array(value :_*))
    
    @scala.inline
    def setHeadTags(value: js.Array[HtmlTagObject]): Self = this.set("headTags", value.asInstanceOf[js.Any])
  }
}
