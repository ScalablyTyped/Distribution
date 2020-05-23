package typings.makerJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for an XML tag.
  * @private
  */
trait XmlTag extends js.Object {
  var attrs: IXmlTagAttrs
  /**
    * Text between the opening and closing tags.
    */
  var innerText: String
  /**
    * Boolean to indicate that the innerText has been escaped.
    */
  var innerTextEscaped: Boolean
  var name: String
  /**
    * Get the closing tag.
    */
  def getClosingTag(): String
  /**
    * Get the inner text.
    */
  def getInnerText(): String
  /**
    * Get the opening tag.
    *
    * @param selfClose Flag to determine if opening tag should be self closing.
    */
  def getOpeningTag(selfClose: Boolean): String
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
}

