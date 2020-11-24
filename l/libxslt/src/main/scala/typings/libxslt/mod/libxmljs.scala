package typings.libxslt.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.libxmljs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljs extends js.Object {
  
  val libxml_parser_version: String = js.native
  
  val libxml_version: String = js.native
  
  def memoryUsage(): Double = js.native
  
  def nodeCount(): Double = js.native
  
  def parseHtml(source: String): typings.libxmljs.mod.Document = js.native
  def parseHtml(source: String, options: ParserOptions): typings.libxmljs.mod.Document = js.native
  
  def parseHtmlFragment(source: String): typings.libxmljs.mod.Document = js.native
  def parseHtmlFragment(source: String, options: ParserOptions): typings.libxmljs.mod.Document = js.native
  
  def parseHtmlString(source: String): typings.libxmljs.mod.Document = js.native
  def parseHtmlString(source: String, options: ParserOptions): typings.libxmljs.mod.Document = js.native
  
  def parseXml(source: String): typings.libxmljs.mod.Document = js.native
  def parseXml(source: String, options: ParserOptions): typings.libxmljs.mod.Document = js.native
  
  def parseXmlString(source: String): typings.libxmljs.mod.Document = js.native
  def parseXmlString(source: String, options: ParserOptions): typings.libxmljs.mod.Document = js.native
  
  val version: String = js.native
  
  @js.native
  class Attribute ()
    extends typings.libxmljs.mod.Attribute
  @js.native
  object Attribute
    extends TopLevel[Instantiable0[typings.libxmljs.mod.Attribute]]
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends typings.libxmljs.mod.Document
  @js.native
  object Document
    extends TopLevel[Instantiable0[typings.libxmljs.mod.Document]]
  
  @js.native
  class Element protected ()
    extends typings.libxmljs.mod.Element {
    def this(doc: typings.libxmljs.mod.Document, name: String) = this()
  }
  @js.native
  object Element
    extends TopLevel[
          Instantiable2[
            /* doc */ typings.libxmljs.mod.Document, 
            /* name */ String, 
            typings.libxmljs.mod.Element
          ]
        ]
  
  @js.native
  class Namespace ()
    extends typings.libxmljs.mod.Namespace
  @js.native
  object Namespace
    extends TopLevel[Instantiable0[typings.libxmljs.mod.Namespace]]
  
  @js.native
  class Node ()
    extends typings.libxmljs.mod.Node
  @js.native
  object Node
    extends TopLevel[Instantiable0[typings.libxmljs.mod.Node]]
  
  @js.native
  class SaxParser ()
    extends typings.libxmljs.mod.SaxParser
  @js.native
  object SaxParser
    extends TopLevel[Instantiable0[typings.libxmljs.mod.SaxParser]]
  
  @js.native
  class SaxPushParser ()
    extends typings.libxmljs.mod.SaxPushParser
  @js.native
  object SaxPushParser
    extends TopLevel[Instantiable0[typings.libxmljs.mod.SaxPushParser]]
}
