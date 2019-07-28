package typings.libxmljs.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

