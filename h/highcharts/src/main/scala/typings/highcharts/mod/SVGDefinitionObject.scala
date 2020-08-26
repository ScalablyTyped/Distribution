package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGDefinitionObject
  extends /* key */ StringDictionary[js.UndefOr[Boolean | Double | String | js.Array[SVGDefinitionObject]]] {
  var children: js.UndefOr[js.Array[SVGDefinitionObject]] = js.native
  var tagName: js.UndefOr[String] = js.native
  var textContent: js.UndefOr[String] = js.native
}

object SVGDefinitionObject {
  @scala.inline
  def apply(): SVGDefinitionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGDefinitionObject]
  }
  @scala.inline
  implicit class SVGDefinitionObjectOps[Self <: SVGDefinitionObject] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: SVGDefinitionObject*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[SVGDefinitionObject]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
  }
  
}

