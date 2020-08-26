package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.Lists.LabelDescriptorHtml
  - typings.inboxsdk.mod.Lists.LabelDescriptorUrl
*/
trait LabelDescriptor extends js.Object

object LabelDescriptor {
  @scala.inline
  def LabelDescriptorHtml(iconHtml: String, title: String): LabelDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptor]
  }
  @scala.inline
  def LabelDescriptorUrl(iconUrl: String, title: String): LabelDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptor]
  }
}

