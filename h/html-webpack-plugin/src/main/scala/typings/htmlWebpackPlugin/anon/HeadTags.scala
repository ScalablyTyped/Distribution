package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlTagObject
import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadTags extends js.Object {
  var bodyTags: js.Array[HtmlTagObject] = js.native
  var headTags: js.Array[HtmlTagObject] = js.native
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object HeadTags {
  @scala.inline
  def apply(
    bodyTags: js.Array[HtmlTagObject],
    headTags: js.Array[HtmlTagObject],
    outputName: String,
    plugin: HtmlWebpackPlugin
  ): HeadTags = {
    val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadTags]
  }
  @scala.inline
  implicit class HeadTagsOps[Self <: HeadTags] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOutputName(value: String): Self = this.set("outputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: HtmlWebpackPlugin): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
  
}

