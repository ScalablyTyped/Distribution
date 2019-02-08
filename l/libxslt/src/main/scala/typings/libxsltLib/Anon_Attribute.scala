package typings
package libxsltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attribute extends js.Object {
  var Attribute: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.Attribute] = js.native
  var Document: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.Document] = js.native
  var Element: org.scalablytyped.runtime.Instantiable2[
    /* doc */ libxmljsLib.libxmljsMod.Document, 
    /* name */ java.lang.String, 
    libxmljsLib.libxmljsMod.Element
  ] = js.native
  var Namespace: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.Namespace] = js.native
  var Node: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.Node] = js.native
  var SaxParser: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.SaxParser] = js.native
  var SaxPushParser: org.scalablytyped.runtime.Instantiable0[libxmljsLib.libxmljsMod.SaxPushParser] = js.native
  val libxml_parser_version: java.lang.String = js.native
  val libxml_version: java.lang.String = js.native
  val version: java.lang.String = js.native
  def memoryUsage(): scala.Double = js.native
  def nodeCount(): scala.Double = js.native
  def parseHtml(source: java.lang.String): libxmljsLib.libxmljsMod.Document = js.native
  def parseHtml(source: java.lang.String, options: libxmljsLib.libxmljsMod.ParserOptions): libxmljsLib.libxmljsMod.Document = js.native
  def parseHtmlFragment(source: java.lang.String): libxmljsLib.libxmljsMod.Document = js.native
  def parseHtmlFragment(source: java.lang.String, options: libxmljsLib.libxmljsMod.ParserOptions): libxmljsLib.libxmljsMod.Document = js.native
  def parseHtmlString(source: java.lang.String): libxmljsLib.libxmljsMod.Document = js.native
  def parseHtmlString(source: java.lang.String, options: libxmljsLib.libxmljsMod.ParserOptions): libxmljsLib.libxmljsMod.Document = js.native
  def parseXml(source: java.lang.String): libxmljsLib.libxmljsMod.Document = js.native
  def parseXml(source: java.lang.String, options: libxmljsLib.libxmljsMod.ParserOptions): libxmljsLib.libxmljsMod.Document = js.native
  def parseXmlString(source: java.lang.String): libxmljsLib.libxmljsMod.Document = js.native
  def parseXmlString(source: java.lang.String, options: libxmljsLib.libxmljsMod.ParserOptions): libxmljsLib.libxmljsMod.Document = js.native
}

