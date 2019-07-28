package typings.libxslt.libxsltMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.libxmljs.libxmljsMod.Document
import typings.libxmljs.libxmljsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in libxmljsNs */
@JSImport("libxslt", "libxmljs")
@js.native
object libxmljs extends js.Object {
  var Attribute: Instantiable0[typings.libxmljs.libxmljsMod.Attribute] = js.native
  var Document: Instantiable0[typings.libxmljs.libxmljsMod.Document] = js.native
  var Element: Instantiable2[/* doc */ Document, /* name */ String, typings.libxmljs.libxmljsMod.Element] = js.native
  var Namespace: Instantiable0[typings.libxmljs.libxmljsMod.Namespace] = js.native
  var Node: Instantiable0[typings.libxmljs.libxmljsMod.Node] = js.native
  var SaxParser: Instantiable0[typings.libxmljs.libxmljsMod.SaxParser] = js.native
  var SaxPushParser: Instantiable0[typings.libxmljs.libxmljsMod.SaxPushParser] = js.native
  val libxml_parser_version: String = js.native
  val libxml_version: String = js.native
  val version: String = js.native
  def memoryUsage(): Double = js.native
  def nodeCount(): Double = js.native
  def parseHtml(source: String): Document = js.native
  def parseHtml(source: String, options: ParserOptions): Document = js.native
  def parseHtmlFragment(source: String): Document = js.native
  def parseHtmlFragment(source: String, options: ParserOptions): Document = js.native
  def parseHtmlString(source: String): Document = js.native
  def parseHtmlString(source: String, options: ParserOptions): Document = js.native
  def parseXml(source: String): Document = js.native
  def parseXml(source: String, options: ParserOptions): Document = js.native
  def parseXmlString(source: String): Document = js.native
  def parseXmlString(source: String, options: ParserOptions): Document = js.native
}

