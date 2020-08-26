package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.NativeSVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkupNodeJSON extends js.Object {
  var attributes: js.UndefOr[NativeSVGAttributes] = js.native
  var children: js.UndefOr[MarkupJSON] = js.native
  var className: js.UndefOr[String] = js.native
  var groupSelector: js.UndefOr[String] = js.native
  var namespaceUri: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  var tagName: String = js.native
  var textContent: js.UndefOr[String] = js.native
}

object MarkupNodeJSON {
  @scala.inline
  def apply(tagName: String): MarkupNodeJSON = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupNodeJSON]
  }
  @scala.inline
  implicit class MarkupNodeJSONOps[Self <: MarkupNodeJSON] (val x: Self) extends AnyVal {
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
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: NativeSVGAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: MarkupNodeJSON*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: MarkupJSON): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGroupSelector(value: String): Self = this.set("groupSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSelector: Self = this.set("groupSelector", js.undefined)
    @scala.inline
    def setNamespaceUri(value: String): Self = this.set("namespaceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceUri: Self = this.set("namespaceUri", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
  }
  
}

