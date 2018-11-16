package typings
package makerDotJsLib.MakerJsNs.exporterNs

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
  def this(name: java.lang.String) = this()
  /**
           * @param name Name of the XML tag.
           * @param attrs Optional attributes for the tag.
           */
  def this(name: java.lang.String, attrs: IXmlTagAttrs) = this()
  var attrs: IXmlTagAttrs = js.native
  /**
           * Text between the opening and closing tags.
           */
  var innerText: java.lang.String = js.native
  /**
           * Boolean to indicate that the innerText has been escaped.
           */
  var innerTextEscaped: scala.Boolean = js.native
  var name: java.lang.String = js.native
  /**
           * Get the closing tag.
           */
  def getClosingTag(): java.lang.String = js.native
  /**
           * Get the inner text.
           */
  def getInnerText(): java.lang.String = js.native
  /**
           * Get the opening tag.
           *
           * @param selfClose Flag to determine if opening tag should be self closing.
           */
  def getOpeningTag(selfClose: scala.Boolean): java.lang.String = js.native
}

/**
     * Class for an XML tag.
     * @private
     */
@JSGlobal("MakerJs.exporter.XmlTag")
@js.native
object XmlTag extends js.Object {
  /**
           * Escapes certain characters within a string so that it can appear in a tag or its attribute.
           *
           * @returns Escaped string.
           */
  def escapeString(value: java.lang.String): java.lang.String = js.native
}

