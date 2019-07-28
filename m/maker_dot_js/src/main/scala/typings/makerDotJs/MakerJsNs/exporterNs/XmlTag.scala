package typings.makerDotJs.MakerJsNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for an XML tag.
  * @private
  */
@JSGlobal("MakerJs.exporter.XmlTag")
@js.native
class XmlTag protected () extends js.Object {
  /**
    * @param name Name of the XML tag.
    * @param attrs Optional attributes for the tag.
    */
  def this(name: String) = this()
  def this(name: String, attrs: IXmlTagAttrs) = this()
  var attrs: IXmlTagAttrs = js.native
  /**
    * Text between the opening and closing tags.
    */
  var innerText: String = js.native
  /**
    * Boolean to indicate that the innerText has been escaped.
    */
  var innerTextEscaped: Boolean = js.native
  var name: String = js.native
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
}

/* static members */
@JSGlobal("MakerJs.exporter.XmlTag")
@js.native
object XmlTag extends js.Object {
  /**
    * Escapes certain characters within a string so that it can appear in a tag or its attribute.
    *
    * @returns Escaped string.
    */
  def escapeString(value: String): String = js.native
}

