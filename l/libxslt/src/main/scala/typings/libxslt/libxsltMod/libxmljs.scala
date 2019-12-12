package typings.libxslt.libxsltMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.libxmljs.libxmljsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljs extends js.Object {
  @js.native
  class Attribute ()
    extends typings.libxmljs.libxmljsMod.Attribute
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends typings.libxmljs.libxmljsMod.Document
  
  @js.native
  class Element protected ()
    extends typings.libxmljs.libxmljsMod.Element {
    def this(doc: typings.libxmljs.libxmljsMod.Document, name: String) = this()
  }
  
  @js.native
  class Namespace ()
    extends typings.libxmljs.libxmljsMod.Namespace
  
  @js.native
  class Node ()
    extends typings.libxmljs.libxmljsMod.Node
  
  @js.native
  class SaxParser ()
    extends typings.libxmljs.libxmljsMod.SaxParser
  
  @js.native
  class SaxPushParser ()
    extends typings.libxmljs.libxmljsMod.SaxPushParser
  
  val libxml_parser_version: String = js.native
  val libxml_version: String = js.native
  val version: String = js.native
  def memoryUsage(): Double = js.native
  def nodeCount(): Double = js.native
  def parseHtml(source: String): typings.libxmljs.libxmljsMod.Document = js.native
  def parseHtml(source: String, options: ParserOptions): typings.libxmljs.libxmljsMod.Document = js.native
  def parseHtmlFragment(source: String): typings.libxmljs.libxmljsMod.Document = js.native
  def parseHtmlFragment(source: String, options: ParserOptions): typings.libxmljs.libxmljsMod.Document = js.native
  def parseHtmlString(source: String): typings.libxmljs.libxmljsMod.Document = js.native
  def parseHtmlString(source: String, options: ParserOptions): typings.libxmljs.libxmljsMod.Document = js.native
  def parseXml(source: String): typings.libxmljs.libxmljsMod.Document = js.native
  def parseXml(source: String, options: ParserOptions): typings.libxmljs.libxmljsMod.Document = js.native
  def parseXmlString(source: String): typings.libxmljs.libxmljsMod.Document = js.native
  def parseXmlString(source: String, options: ParserOptions): typings.libxmljs.libxmljsMod.Document = js.native
  @js.native
  object Attribute
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.Attribute]]
  
  @js.native
  object Document
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.Document]]
  
  @js.native
  object Element
    extends TopLevel[
          Instantiable2[
            /* doc */ typings.libxmljs.libxmljsMod.Document, 
            /* name */ String, 
            typings.libxmljs.libxmljsMod.Element
          ]
        ]
  
  @js.native
  object Namespace
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.Namespace]]
  
  @js.native
  object Node
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.Node]]
  
  @js.native
  object SaxParser
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.SaxParser]]
  
  @js.native
  object SaxPushParser
    extends TopLevel[Instantiable0[typings.libxmljs.libxmljsMod.SaxPushParser]]
  
}

