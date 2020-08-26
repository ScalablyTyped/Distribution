package typings.htmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tag element according to the htmlWebpackPlugin object notation
  */
@js.native
trait HtmlTagObject extends js.Object {
  /**
    * Attributes of the html tag
    * E.g. `{'disabled': true, 'value': 'demo'}`
    */
  var attributes: StringDictionary[String | Boolean] = js.native
  /**
    * The inner HTML
    */
  var innerHTML: js.UndefOr[String] = js.native
  /**
    * The tag name e.g. `'div'`
    */
  var tagName: String = js.native
  /**
    * Whether this html must not contain innerHTML
    * @see https://www.w3.org/TR/html5/syntax.html#void-elements
    */
  var voidTag: Boolean = js.native
}

object HtmlTagObject {
  @scala.inline
  def apply(attributes: StringDictionary[String | Boolean], tagName: String, voidTag: Boolean): HtmlTagObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], voidTag = voidTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagObject]
  }
  @scala.inline
  implicit class HtmlTagObjectOps[Self <: HtmlTagObject] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[String | Boolean]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoidTag(value: Boolean): Self = this.set("voidTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
  }
  
}

