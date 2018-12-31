package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "Document")
@js.native
/**
  * Create a new XML Document
  * @param version XML document version, defaults to 1.0
  * @param encoding Encoding, defaults to utf8
  */
class Document () extends js.Object {
  def this(version: scala.Double) = this()
  def this(version: scala.Double, encoding: java.lang.String) = this()
  var errors: js.Array[SyntaxError] = js.native
  var validationErrors: js.Array[ValidationError] = js.native
  def child(idx: scala.Double): Element | scala.Null = js.native
  def childNodes(): js.Array[Element] = js.native
  def encoding(): java.lang.String = js.native
  def encoding(enc: java.lang.String): this.type = js.native
  def find(xpath: java.lang.String): js.Array[Element] = js.native
  def get(xpath: java.lang.String): Element | scala.Null = js.native
  def get(xpath: java.lang.String, namespaces: StringMap): Element | scala.Null = js.native
  def getDtd(): libxmljsLib.Anon_ExternalId = js.native
  def node(name: java.lang.String): Element = js.native
  def node(name: java.lang.String, content: java.lang.String): Element = js.native
  def root(): Element | scala.Null = js.native
  def root(newRoot: Node): Node = js.native
  def setDtd(name: java.lang.String, ext: java.lang.String, sys: java.lang.String): scala.Unit = js.native
  def toString(formatted: scala.Boolean): java.lang.String = js.native
  def `type`(): libxmljsLib.libxmljsLibStrings.document = js.native
  def validate(xsdDoc: Document): scala.Boolean = js.native
  def version(): java.lang.String = js.native
}

