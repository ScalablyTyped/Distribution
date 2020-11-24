package typings.makerJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for an XML tag.
  * @private
  */
@js.native
trait XmlTag extends js.Object {
  
  var attrs: IXmlTagAttrs = js.native
  
  /**
    * Get the closing tag.
    */
  def getClosingTag(): String = js.native
  
  /**
    * Get the inner text.
    */
  def getInnerText(): String = js.native
  
  /**
    * Get the opening tag.
    *
    * @param selfClose Flag to determine if opening tag should be self closing.
    */
  def getOpeningTag(selfClose: Boolean): String = js.native
  
  /**
    * Text between the opening and closing tags.
    */
  var innerText: String = js.native
  
  /**
    * Boolean to indicate that the innerText has been escaped.
    */
  var innerTextEscaped: Boolean = js.native
  
  var name: String = js.native
}
object XmlTag {
  
  @scala.inline
  def apply(
    attrs: IXmlTagAttrs,
    getClosingTag: () => String,
    getInnerText: () => String,
    getOpeningTag: Boolean => String,
    innerText: String,
    innerTextEscaped: Boolean,
    name: String
  ): XmlTag = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], getClosingTag = js.Any.fromFunction0(getClosingTag), getInnerText = js.Any.fromFunction0(getInnerText), getOpeningTag = js.Any.fromFunction1(getOpeningTag), innerText = innerText.asInstanceOf[js.Any], innerTextEscaped = innerTextEscaped.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlTag]
  }
  
  @scala.inline
  implicit class XmlTagOps[Self <: XmlTag] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: IXmlTagAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClosingTag(value: () => String): Self = this.set("getClosingTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInnerText(value: () => String): Self = this.set("getInnerText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpeningTag(value: Boolean => String): Self = this.set("getOpeningTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTextEscaped(value: Boolean): Self = this.set("innerTextEscaped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
